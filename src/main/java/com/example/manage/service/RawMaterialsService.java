package com.example.manage.service;

import com.alibaba.fastjson.JSONObject;
import com.example.manage.constant.Constants;
import com.example.manage.constant.ConstantsForDomain;
import com.example.manage.domain.*;
import com.example.manage.exception.ErrorRollbackException;
import com.example.manage.mapper.*;
import com.example.manage.util.CommonUtil;
import com.example.manage.util.Page;
import com.example.manage.util.PageRequest;
import com.example.manage.vo.rawMaterialsStore.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@Service
public class RawMaterialsService {

    @Autowired
    private RawmaterialsstoreMapper rawmaterialsStoreMapper;
    @Autowired
    private PurchaseMapper purchaseMapper;
    @Autowired
    private PurchaserecordMapper purchaserecordMapper;
    @Autowired
    private ManageuserMapper manageuserMapper;
    @Autowired
    private PayorderMapper payorderMapper;

    /**
     * 新增原材料
     *
     * @param rawMaterialsStoreVo
     */
    public void addRawMaterial(RawMaterialsStoreVo rawMaterialsStoreVo) {
        Rawmaterialsstore rawmaterialsstore = new Rawmaterialsstore();
        rawmaterialsstore.setNum(rawMaterialsStoreVo.getNum());
        rawmaterialsstore.setName(rawMaterialsStoreVo.getName());
        rawmaterialsstore.setImgurl(rawMaterialsStoreVo.getImgurl());
        rawmaterialsstore.setColor(rawMaterialsStoreVo.getColor());
        rawmaterialsstore.setWeight(rawMaterialsStoreVo.getWeight());
        rawmaterialsstore.setVatnum(rawMaterialsStoreVo.getVatnum());
        rawmaterialsstore.setLarghezza(rawMaterialsStoreVo.getLarghezza());
        rawmaterialsstore.setReelnum(rawMaterialsStoreVo.getReelnum());
//        rawmaterialsstore.setCount();
        rawmaterialsstore.setRemark(rawMaterialsStoreVo.getRemark());
        rawmaterialsstore.setStatus(ConstantsForDomain.NORMAL);
        log.info("添加原材料:{}", JSONObject.toJSONString(rawmaterialsstore));
        rawmaterialsStoreMapper.insert(rawmaterialsstore);
    }

    /**
     * 分页查询
     *
     * @param page
     * @param pageSize
     * @return
     */
    public Page<RawMaterialsStoreVo> getRawMaterialsPage(Integer page, Integer pageSize, Integer status) {
        PageRequest pageRequest = new PageRequest(page, pageSize);
        Long count = rawmaterialsStoreMapper.findRawMaterialsStatusCount(status);
        List<RawMaterialsStoreVo> vos = new ArrayList<>();
        if (count > 0) {
            List<Rawmaterialsstore> list = rawmaterialsStoreMapper.findRawMaterialsStatusPage(pageRequest, status);
            for (Rawmaterialsstore rawmaterialsstore : list) {
                vos.add(RawMaterialsStoreVo.of(rawmaterialsstore));
            }
        }
        return new Page<>(pageRequest, vos, count);
    }

    /**
     * 添加采购记录
     *
     * @param purchaseVo
     */
    public void addPurchaseRecord(PurchaseVo purchaseVo) {
        // 税金
        double tax = 0;
        // 单据总额
        double rental = 0;
        for (PurchaseRecordVo purchaseRecordVo : purchaseVo.getPurchaseRecordVos()) {
            double taxSubTotal = purchaseRecordVo.getUnitprice()
                    * purchaseRecordVo.getTaxpoint() * Constants.PERCENTAGE
                    * purchaseRecordVo.getCount();
            double totalMoney = purchaseRecordVo.getUnitprice()
                    * purchaseRecordVo.getCount()
                    + taxSubTotal;
            tax += taxSubTotal;
            rental += totalMoney;
        }
        Purchase purchase = new Purchase();
        purchase.setProcuretype(purchaseVo.getProcuretype());
        purchase.setBuyerid(purchaseVo.getBuyerid());
        purchase.setSuppliername(purchaseVo.getSuppliername());
        purchase.setSupplierlinkman(purchaseVo.getSupplierlinkman());
        purchase.setSuppliertellphone(purchaseVo.getSuppliertellphone());
        purchase.setSupperlierpaytype(purchaseVo.getSupperlierpaytype());
        purchase.setSupperliercard(purchaseVo.getSupperliercard());
        if (purchaseVo.getPayid() != null) {
            purchase.setPayid(purchaseVo.getPayid());
        }
        purchase.setSettletype(purchaseVo.getSettletype());
        purchase.setPlanpaydate(CommonUtil.stringToDate(purchaseVo.getPlanpaydate()));
        purchase.setPlandeliverydate(CommonUtil.stringToDate(purchaseVo.getPlandeliverydate()));
        purchase.setBuydate(CommonUtil.stringToDate(purchaseVo.getBuydate()));
        purchase.setTax(String.valueOf(tax));
        purchase.setRental(String.valueOf(rental));
        purchase.setRemark(purchaseVo.getRemark());
        log.info("添加采购记录：{}", JSONObject.toJSONString(purchase));

        purchaseMapper.insert(purchase);

        for (PurchaseRecordVo purchaseRecordVo : purchaseVo.getPurchaseRecordVos()) {
            Purchaserecord pur = new Purchaserecord();
            pur.setRawmaterialsid(purchaseRecordVo.getRawmaterialsid());
            pur.setPurchaseid(purchase.getId());
            pur.setUnitprice(String.valueOf(purchaseRecordVo.getUnitprice()));
            pur.setTaxpoint(String.valueOf(purchaseRecordVo.getTaxpoint()));
            pur.setCount(purchaseRecordVo.getCount());
            // 税额小计
            double taxSubTotal = purchaseRecordVo.getUnitprice()
                    * purchaseRecordVo.getTaxpoint() * Constants.PERCENTAGE
                    * purchaseRecordVo.getCount();
            pur.setTaxsubtotal(Double.toString(taxSubTotal));
            log.info("单价：{}", purchaseRecordVo.getUnitprice());
            log.info("税额小计：{}", taxSubTotal);
            // 价格合计
            double totalMoney = purchaseRecordVo.getUnitprice()
                    * purchaseRecordVo.getCount()
                    + taxSubTotal;
            pur.setTotalmoney(Double.toString(totalMoney));
            log.info("价格合计：{}", totalMoney);
            purchaserecordMapper.insert(pur);

//            Rawmaterialsstore rawmaterialsstore = rawmaterialsStoreMapper.selectByPrimaryKey(purchaseRecordVo.getRawmaterialsid());
//            if (rawmaterialsstore != null){
//                rawmaterialsstore.setCount(purchaseRecordVo.getCount());
//            }
//            rawmaterialsStoreMapper.updateByPrimaryKey(rawmaterialsstore);
        }
    }

    public Page<PurchasePageVo> getPurchaseRecordPage(Integer page, Integer pageSize) {
        PageRequest pageRequest = new PageRequest(page, pageSize);
        Long count = purchaseMapper.countByExample(null);
        List<PurchasePageVo> vos = new ArrayList<>();
        if (count > 0) {
            List<Purchase> list = purchaseMapper.findPurchasePage(pageRequest);
            for (Purchase purchase : list) {
                List<PurchaseRecordPageVo> purchaseRecordPageVos = new ArrayList<>();
                // 后台销售人员
                Manageuser manageuser = manageuserMapper.selectByPrimaryKey(purchase.getBuyerid());
                // 订单编号
                Payorder payorder = payorderMapper.selectByPrimaryKey(purchase.getPayid());
                // 购买记录
                List<Purchaserecord> purchaserecords = purchaserecordMapper.findPurchaseRecordByPurchaseIdAndFinshed(purchase.getId());
                for (Purchaserecord purchaserecord : purchaserecords) {
                    Rawmaterialsstore rawmaterialsstore = rawmaterialsStoreMapper.selectByPrimaryKey(purchaserecord.getRawmaterialsid());
                    purchaseRecordPageVos.add(PurchaseRecordPageVo.of(purchaserecord, rawmaterialsstore));
                }
                vos.add(PurchasePageVo.of(purchase, manageuser, payorder.getOrdernum(), purchaseRecordPageVos));
            }
        }
        return new Page<>(pageRequest, vos, count);
    }

    // 单个添加
    public void addRawMaterial(Long purchaseRecordId) {
        Purchaserecord purchaserecord = purchaserecordMapper.selectByPrimaryKey(purchaseRecordId);
        if (purchaserecord == null || purchaserecord.getStatus() != ConstantsForDomain.PURCHASERECORD_STATUS_UNAUDIT) {
            throw new ErrorRollbackException("采购记录不存在或不符合添加条件");
        }
        purchaserecord.setStatus(ConstantsForDomain.PURCHASERECORD_STATUS_AUDIT);

        Rawmaterialsstore rawmaterials = rawmaterialsStoreMapper.selectByPrimaryKey(purchaserecord.getRawmaterialsid());
        rawmaterials.setCount(rawmaterials.getCount() + purchaserecord.getCount());
        rawmaterialsStoreMapper.updateByPrimaryKey(rawmaterials);

        purchaserecordMapper.updateByPrimaryKey(purchaserecord);
    }

    // 多个添加   根据采购单添加多个
    public void addRawMaterials(Long purchaseId) {
        Purchase purchase = purchaseMapper.selectByPrimaryKey(purchaseId);
        if (purchaseId == null){
            throw new ErrorRollbackException("该采购单不存在");
        }
        List<Purchaserecord> list = purchaserecordMapper.findPurchaseRecordByPurchaseIdAndFinshed(purchase.getId());
        for (Purchaserecord purchaserecord : list){
            purchaserecord.setStatus(ConstantsForDomain.PURCHASERECORD_STATUS_AUDIT);
            Rawmaterialsstore rawmaterials = rawmaterialsStoreMapper.selectByPrimaryKey(purchaserecord.getRawmaterialsid());
            rawmaterials.setCount(rawmaterials.getCount() + purchaserecord.getCount());
            rawmaterialsStoreMapper.updateByPrimaryKey(rawmaterials);

            purchaserecordMapper.updateByPrimaryKey(purchaserecord);
        }


    }

    public void addInventory(Long rawMaterialsId, Integer count) {
        Rawmaterialsstore rawmaterialsstore = rawmaterialsStoreMapper.selectByPrimaryKey(rawMaterialsId);
        log.info("原材料" + rawmaterialsstore.getName() + "：{}", JSONObject.toJSONString(rawmaterialsstore));
        if (rawmaterialsstore != null) {
            if (rawmaterialsstore.getCount() == null) {
                rawmaterialsstore.setCount(0);
            }
            count += rawmaterialsstore.getCount();
            rawmaterialsstore.setCount(count);
        }
        rawmaterialsStoreMapper.updateByPrimaryKey(rawmaterialsstore);
    }
}
