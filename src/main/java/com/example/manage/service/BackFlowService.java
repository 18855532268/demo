package com.example.manage.service;

import com.example.manage.constant.ConstantsForDomain;
import com.example.manage.domain.Backflow;
import com.example.manage.domain.other.OrderFuzzyQuery;
import com.example.manage.mapper.BackflowMapper;
import com.example.manage.mapper.PayorderMapper;
import com.example.manage.util.CommonUtil;
import com.example.manage.util.Page;
import com.example.manage.util.PageRequest;
import com.example.manage.vo.backFlow.BackFlowPageVo;
import com.example.manage.vo.backFlow.BackFlowVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@Service
public class BackFlowService {
    @Autowired
    private BackflowMapper backflowMapper;
    @Autowired
    private PayorderMapper payorderMapper;

    /**
     * 添加回款
     * @param backFlowVo
     */
    public void addBackFlow(BackFlowVo backFlowVo) {
        Backflow backflow = new Backflow();
        backflow.setPayorderid(backFlowVo.getPayorderid());
        backflow.setMoney(backFlowVo.getMoney());
        backflow.setDate(CommonUtil.stringToDate(backFlowVo.getDate()));
        backflow.setType(backFlowVo.getType());
        backflow.setRemark(backFlowVo.getRemark());
        backflow.setIsinvoice(backFlowVo.getIsinvoice());
        if (backFlowVo.getInvoiceimgurl() == null){
            backflow.setInvoiceimgurl("");
        }else {
            backflow.setInvoiceimgurl(backFlowVo.getInvoiceimgurl());
        }
        if (backFlowVo.getInvoicetype() == null){
            backflow.setInvoicetype("");
        }else {
            backflow.setInvoicetype(backFlowVo.getInvoicetype());
        }
        if (backFlowVo.getInvoicetitle() == null){
            backflow.setInvoicetitle("");
        }else {
            backflow.setInvoicetitle(backFlowVo.getInvoicetitle());
        }
        if (backFlowVo.getInvoicemoney() == null){
            backflow.setInvoicemoney("");
        }else {
            backflow.setInvoicemoney(backFlowVo.getInvoicemoney());
        }
        log.info("添加回款记录：{}", backflow);
        backflow.setStatus(ConstantsForDomain.NORMAL);
        backflowMapper.insert(backflow);
    }

    /**
     * 查询回款表分页
     * @param page
     * @param pageSize
     * @return
     */
    public Page<BackFlowPageVo> getBackFlowPage(Integer page, Integer pageSize){
        PageRequest request = new PageRequest(page, pageSize);
        List<BackFlowPageVo> vos = new ArrayList<>();
        Long count = backflowMapper.findBackFlowPageCount();
        log.info("回款数：{}",count);
        if (count > 0){
            List<Backflow> backFlowPage = backflowMapper.findBackFlowPage(request);
            for (Backflow backflow: backFlowPage) {
                OrderFuzzyQuery query = payorderMapper.findOrderCustomerById(backflow.getPayorderid());
                vos.add(BackFlowPageVo.of(backflow, query));
            }
        }
        return new Page<>(request, vos, count);
    }
}
