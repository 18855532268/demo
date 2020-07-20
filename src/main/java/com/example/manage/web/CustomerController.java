package com.example.manage.web;


import com.example.manage.constant.Constants;
import com.example.manage.service.CustomerService;
import com.example.manage.vo.customer.CustomerVo;
import com.example.manage.vo.ReturnVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author yaoby
 * @auth
 */
@RestController
@Slf4j
@RequestMapping("/customer")
public class CustomerController  {
    @Autowired
    private CustomerService customerService;
    @GetMapping("/getCustomerPage")
    public ReturnVO getCustomerPage( @RequestParam(defaultValue = Constants.PAGE_DEFAULT_START) Integer page,
                             @RequestParam(defaultValue = Constants.PAGE_DEFAULT_SIZE) Integer pageSize) {
        return ReturnVO.getSuccess(customerService.getPage(page, pageSize));
    }

    /**
     * 根据客户id获取信息
     * @param id
     * @return
     */
    @GetMapping("/getCustomer")
    public ReturnVO getCustomer(Long id){
        return ReturnVO.getSuccess(customerService.getCustomerById(id));
    }
    @PostMapping("/addCustomer")
    public ReturnVO addCustomer(@RequestBody  CustomerVo customerVo) {
        customerService.addCustomer(customerVo);
        return ReturnVO.getSuccess();
    }

    @PostMapping("/modifiedCustomer")
    public ReturnVO modifiedCustomer (@RequestBody  CustomerVo customerVo){
        customerService.modifiedCustomer(customerVo);
        return ReturnVO.getSuccess();
    }
    @PostMapping("/deleteCustomer")
    public ReturnVO deleteCustomer (String id){
        customerService.deleteCustomer(id);
        return ReturnVO.getSuccess();
    }
    @GetMapping("/getType")
    public ReturnVO getType( @RequestParam(defaultValue = Constants.PAGE_DEFAULT_START) Integer page,
                                       @RequestParam(defaultValue = Constants.PAGE_DEFAULT_SIZE) Integer pageSize){
        return ReturnVO.getSuccess(customerService.getTypePage(page, pageSize));
    }
    @PostMapping("/addCustomerType")
    public ReturnVO addCustomerType(String type) {
        customerService.addCustomerType(type);
        return ReturnVO.getSuccess();
    }
    @PostMapping("/modifiedType")
    public ReturnVO modifiedType(String id, String type) {
        customerService.modifiedType(id, type);
        return ReturnVO.getSuccess();
    }
    @PostMapping("/deleteType")
    public ReturnVO deleteType(String id) {
        customerService.deleteType(id);
        return ReturnVO.getSuccess();
    }


}
