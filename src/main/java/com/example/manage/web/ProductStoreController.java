package com.example.manage.web;

import com.example.manage.constant.Constants;
import com.example.manage.service.ProductService;
import com.example.manage.service.ProductionService;
import com.example.manage.vo.ReturnVO;
import com.example.manage.vo.product.ProductStoreVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
@RequestMapping("/productStore")
public class ProductStoreController {
    @Autowired
    private ProductService productService;

    @GetMapping("/getProductStorePage")
    public ReturnVO getProductStorePage(@RequestParam(defaultValue = Constants.PAGE_DEFAULT_START) Integer page,
                                        @RequestParam(defaultValue = Constants.PAGE_DEFAULT_SIZE) Integer pageSize) {
        return ReturnVO.getSuccess(productService.getProductStorePage(page, pageSize));
    }
    // 增加产品库存
    @PostMapping("/addProduct")
    public ReturnVO addProduct(@RequestBody ProductStoreVo productStoreVo){
        productService.addProduct(productStoreVo);
        return ReturnVO.getSuccess();
    }
}
