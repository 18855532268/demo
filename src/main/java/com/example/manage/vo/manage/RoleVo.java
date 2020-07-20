package com.example.manage.vo.manage;

import com.example.manage.domain.Role;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@Builder
public class RoleVo {
    private Long id;

    private String manageuserid;

    private String role;

    private String url;

    public static RoleVo of(Role role) {
        return RoleVo.builder()
                .id(role.getId())
                .manageuserid(role.getManageuserid())
                .role(role.getRole())
                .url(role.getUrl())
                .build();
    }
}
