package com.example.manage.service;

import com.example.manage.constant.ConstantsForDomain;
import com.example.manage.domain.Manageuser;
import com.example.manage.domain.Role;
import com.example.manage.mapper.ManageuserMapper;
import com.example.manage.mapper.RoleMapper;
import com.example.manage.util.CommonUtil;
import com.example.manage.util.Page;
import com.example.manage.util.PageRequest;
import com.example.manage.vo.manage.ManageUserVo;
import com.example.manage.vo.manage.RoleVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Slf4j
@Service
public class ManageService {
    @Autowired
    private ManageuserMapper manageuserMapper;
    @Autowired
    private RoleMapper roleMapper;

    /**
     * 新增管理人员
     *
     * @param manageUserVo
     */
    public void addManageUser(ManageUserVo manageUserVo) {
        Manageuser manageuser = new Manageuser();
//        manageuser.setId(CommonUtil.getUUID());
        manageuser.setUsername(manageuser.getUsername());
        manageuser.setPassword(manageUserVo.getPassword());
        manageuser.setName(manageUserVo.getName());
        manageuser.setTellphone(manageUserVo.getTellphone());
        manageuser.setEmail(manageUserVo.getEmail());
        manageuser.setWechat(manageUserVo.getWechat());
        manageuser.setCreatetime(new Date());
        manageuser.setStatus(ConstantsForDomain.MANAGEUSER_STATUS_NORMAL);
        manageuserMapper.insert(manageuser);


    }

public Page<ManageUserVo> getManageUserPage(Integer page, Integer pageSize){
    PageRequest pageRequest = new PageRequest(page, pageSize);
    List<ManageUserVo> vos = new ArrayList<>();
    Long count = manageuserMapper.findCountByStatus();
    if (count > 0){
        List<Manageuser> list = manageuserMapper.findPage(pageRequest);
        for (Manageuser manageuser:list){
            List<Role> roles = roleMapper.selectByUserId(String.valueOf(manageuser.getId()));
            vos.add(ManageUserVo.of(manageuser, roles));
        }
    }
    return new Page<>(pageRequest, vos, count);
}


    /**
     * 添加用户权限
     * @param roles
     */
    public void addUserRoles(List<RoleVo> roles) {
        for (RoleVo roleVo : roles){
            Role role = new Role();
//            role.setId(CommonUtil.getUUID());
            role.setManageuserid(roleVo.getManageuserid());
            role.setRole(roleVo.getRole());
            role.setUrl(roleVo.getUrl());
            roleMapper.insert(role);
        }
    }

    /**
     * 获得权限列表
     * @param page
     * @param pageSize
     * @return
     */
    public Page<RoleVo> getRolesPage(Integer page, Integer pageSize){
        PageRequest pageRequest = new PageRequest(page, pageSize);
        List<RoleVo> vos = new ArrayList<>();
        Long count = roleMapper.countByExample(null);
        if (count > 0){
            List<Role> list = roleMapper.findPage(pageRequest);
            for (Role role:list){
                vos.add(RoleVo.of(role));
            }
        }
        return new Page<>(pageRequest, vos, count);
    }
}
