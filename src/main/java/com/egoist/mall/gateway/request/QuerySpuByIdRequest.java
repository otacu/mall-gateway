package com.egoist.mall.gateway.request;

import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class QuerySpuByIdRequest extends MallRequest {
    @NotBlank(message = "id不能为空")
    private String id;
}
