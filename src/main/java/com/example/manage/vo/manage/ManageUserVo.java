package com.example.manage.vo.manage;

import com.example.manage.domain.Manageuser;
import com.example.manage.domain.Role;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.util.Date;
import java.util.List;

@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@Builder
public class ManageUserVo {
    private Long id;

    private String username;

    private String password;

    private String name;

    private String tellphone;

    private String email;

    private String wechat;

    private List<Role> roles;

    private Date createtime;

    public static ManageUserVo of(Manageuser manageuser, List<Role> roles) {
        return ManageUserVo.builder()
                .id(manageuser.getId())
                .username(manageuser.getUsername())
                .password(manageuser.getPassword())
                .name(manageuser.getName())
                .tellphone(manageuser.getTellphone())
                .email(manageuser.getEmail())
                .wechat(manageuser.getWechat())
                .roles(roles)
                .createtime(manageuser.getCreatetime())
                .build();

    }
}
