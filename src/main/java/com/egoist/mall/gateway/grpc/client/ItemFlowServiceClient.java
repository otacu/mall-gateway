package com.egoist.mall.gateway.grpc.client;

import com.egoist.mall.grpc.generated.item.flow.ItemFlowProto;
import com.egoist.mall.grpc.generated.item.flow.ItemFlowServiceGrpc;
import com.egoist.mall.parent.pojo.EgoistResult;
import com.googlecode.protobuf.format.JsonFormat;
import io.grpc.Channel;
import lombok.extern.slf4j.Slf4j;
import net.devh.springboot.autoconfigure.grpc.client.GrpcClient;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class ItemFlowServiceClient {

    @GrpcClient("item-flow")
    private Channel serverChannel;

    public EgoistResult querySpuById(String id) {
        ItemFlowServiceGrpc.ItemFlowServiceBlockingStub stub = ItemFlowServiceGrpc.newBlockingStub(serverChannel);
        ItemFlowProto.QuerySpuByIdResponse response = stub.querySpuById(ItemFlowProto.QuerySpuByIdRequest.newBuilder().setId(id).build());
        return new EgoistResult(response.getStatus(), response.getMsg(), new JsonFormat().printToString(response.getData()));
    }

}
