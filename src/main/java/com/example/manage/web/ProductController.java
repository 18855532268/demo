package com.example.manage.web;

import com.example.manage.config.myinterface.RequestJson;
import com.example.manage.constant.Constants;
import com.example.manage.exception.ErrorMessageException;
import com.example.manage.service.ProductService;
import com.example.manage.util.CommonUtil;
import com.example.manage.vo.ReturnVO;
import com.example.manage.vo.product.ProductVo;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

@RestController
@Slf4j
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private ProductService productService;


    @PostMapping("/addProduct")
    public ReturnVO addProduct(@RequestBody ProductVo productVo) {
        productService.addProduct(productVo);
        return ReturnVO.getSuccess();
    }
    @GetMapping("/getProductPage")
    public ReturnVO getProductPage( @RequestParam(defaultValue = Constants.PAGE_DEFAULT_START) Integer page,
                                       @RequestParam(defaultValue = Constants.PAGE_DEFAULT_SIZE) Integer pageSize){
        return ReturnVO.getSuccess(productService.getProductPage(page, pageSize));
    }
    @PostMapping("/addProductType")
    public ReturnVO addProductType(String type) {
        productService.addProductType(type);
        return ReturnVO.getSuccess();
    }
    @GetMapping("/getProductTypePage")
    public ReturnVO getProductTypePage( @RequestParam(defaultValue = Constants.PAGE_DEFAULT_START) Integer page,
                                    @RequestParam(defaultValue = Constants.PAGE_DEFAULT_SIZE) Integer pageSize){
        return ReturnVO.getSuccess(productService.getProductType(page, pageSize));
    }

}
