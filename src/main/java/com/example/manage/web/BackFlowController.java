package com.example.manage.web;

import com.example.manage.constant.Constants;
import com.example.manage.service.BackFlowService;
import com.example.manage.vo.ReturnVO;
import com.example.manage.vo.backFlow.BackFlowVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
@RequestMapping("/backFlow")
public class BackFlowController {
    @Autowired
    private BackFlowService backFlowService;

    @GetMapping("/getBackFlowPage")
    public ReturnVO getBackFlowPage(@RequestParam(defaultValue = Constants.PAGE_DEFAULT_START) Integer page,
                                    @RequestParam(defaultValue = Constants.PAGE_DEFAULT_SIZE) Integer pageSize) {
        return ReturnVO.getSuccess(backFlowService.getBackFlowPage(page, pageSize));
    }

    @PostMapping("/addBackFlow")
    public ReturnVO addBackFlow(@RequestBody BackFlowVo backFlowVo) {
        backFlowService.addBackFlow(backFlowVo);
        return ReturnVO.getSuccess();
    }


}
