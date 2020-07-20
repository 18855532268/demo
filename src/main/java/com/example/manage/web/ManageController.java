package com.example.manage.web;

import com.example.manage.constant.Constants;
import com.example.manage.service.ManageService;
import com.example.manage.service.ProductService;
import com.example.manage.vo.ReturnVO;
import com.example.manage.vo.manage.ManageUserVo;
import com.example.manage.vo.manage.RoleVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
@RequestMapping("/manage")
public class ManageController {

    @Autowired
    private ManageService manageService;

    @PostMapping("/addManageUser")
    public ReturnVO addManageUser(@RequestBody ManageUserVo manageUserVo) {
        manageService.addManageUser(manageUserVo);
        return ReturnVO.getSuccess();
    }

    @PostMapping("/addUserRoles")
    public ReturnVO addUserRoles(@RequestBody List<RoleVo> roleVos) {
        manageService.addUserRoles(roleVos);
        return ReturnVO.getSuccess();
    }

    @GetMapping("/getManageUserPage")
    public ReturnVO getManageUserPage(@RequestParam(defaultValue = Constants.PAGE_DEFAULT_START) Integer page,
                                      @RequestParam(defaultValue = Constants.PAGE_DEFAULT_SIZE) Integer pageSize) {
        return ReturnVO.getSuccess(manageService.getManageUserPage(page, pageSize));
    }

    @GetMapping("/getRolesPage")
    public ReturnVO getRolesPage(@RequestParam(defaultValue = Constants.PAGE_DEFAULT_START) Integer page,
                                 @RequestParam(defaultValue = Constants.PAGE_DEFAULT_SIZE) Integer pageSize) {
        return ReturnVO.getSuccess(manageService.getRolesPage(page, pageSize));
    }
}
