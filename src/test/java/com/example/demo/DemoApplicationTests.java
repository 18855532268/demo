//package com.example.demo;
//
//
//import com.example.manage.DemoApplication;
//import com.example.manage.constant.Constants;
//import com.example.manage.domain.Payorder;
//import com.example.manage.domain.Payorderrecord;
//import com.example.manage.domain.Product;
//import com.example.manage.domain.Producttype;
//import com.example.manage.mapper.PayorderrecordMapper;
//import com.example.manage.service.CustomerService;
//import com.example.manage.service.PayOrderService;
//import com.example.manage.util.Page;
//import com.example.manage.vo.customer.CustomerVo;
//import com.example.manage.vo.payOrder.OrderFuzzyQueryVo;
//import com.example.manage.vo.product.ProductVo;
//import lombok.extern.slf4j.Slf4j;
//import org.junit.Test;
//import com.alibaba.fastjson.JSONObject;
//
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit4.SpringRunner;
//
//import java.util.ArrayList;
//import java.util.List;
//
//
//@RunWith(SpringRunner.class)
//@SpringBootTest(classes = {DemoApplication.class})
//@Slf4j
//public class DemoApplicationTests {
//    @Autowired
//    private CustomerService customerService;
//    @Autowired
//    private PayOrderService payOrderService;
//    @Autowired
//    private PayorderrecordMapper payorderrecordMapper;
//
//    @Test
//    public void test() {
//        List<Payorderrecord> payOrderRecordList;
//
////        payOrderRecordList = payorderrecordMapper.findListByPayOrderId(String.valueOf(1));
//        List<OrderFuzzyQueryVo> vos = payOrderService.findOrderFuzzyQuery("-");
//        log.info("返回：{}", JSONObject.toJSONString(vos));
//
//    }
//
//    @Test
//    public void Test1() {
//        ArrayList<String> list = new ArrayList<>();
//        list.add("定型");
//        list.add("刷毛");
//        list.add("压毛");
//        log.info("返回：{}", JSONObject.toJSONString(list));
//
//    }
//
//    @Test
//    public void Test2() {
//        Page<CustomerVo> page = customerService.getPage(1, 10);
//        log.info("返回{}", JSONObject.toJSONString(page));
//    }
//
//}
