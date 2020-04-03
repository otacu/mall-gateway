package com.egoist.mall.gateway.grpc.client;

import com.egoist.mall.parent.pojo.EgoistResult;
import com.egoist.mall.parent.util.json.EgoistJsonUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestItemFlowServiceClient {
    @Autowired
    private ItemFlowServiceClient itemFlowServiceClient;

    @Test
    public void testQuerySpuById() throws Exception {
        EgoistResult result = itemFlowServiceClient.querySpuById("1");
        System.out.println(EgoistJsonUtil.objectToJson(result));
    }
}
