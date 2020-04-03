package com.egoist.mall.gateway.controller;

import com.egoist.mall.gateway.grpc.client.ItemFlowServiceClient;
import com.egoist.mall.gateway.request.QuerySpuByIdRequest;
import com.egoist.mall.parent.pojo.EgoistResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/item")
public class ItemController {

    @Autowired
    private ItemFlowServiceClient itemFlowServiceClient;

    @PostMapping(value="/querySpuById")
    public EgoistResult querySpuById(@RequestBody QuerySpuByIdRequest querySpuByIdRequest) {
        return itemFlowServiceClient.querySpuById(querySpuByIdRequest.getId());
    }
}
