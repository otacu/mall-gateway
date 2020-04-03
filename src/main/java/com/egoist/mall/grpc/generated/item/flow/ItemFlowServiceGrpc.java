package com.egoist.mall.grpc.generated.item.flow;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.1)",
    comments = "Source: item_flow_proto.proto")
public final class ItemFlowServiceGrpc {

  private ItemFlowServiceGrpc() {}

  public static final String SERVICE_NAME = "com.egoist.mall.grpc.generated.item.flow.ItemFlowService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<ItemFlowProto.QuerySpuByIdRequest,
      ItemFlowProto.QuerySpuByIdResponse> getQuerySpuByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "querySpuById",
      requestType = ItemFlowProto.QuerySpuByIdRequest.class,
      responseType = ItemFlowProto.QuerySpuByIdResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ItemFlowProto.QuerySpuByIdRequest,
      ItemFlowProto.QuerySpuByIdResponse> getQuerySpuByIdMethod() {
    io.grpc.MethodDescriptor<ItemFlowProto.QuerySpuByIdRequest, ItemFlowProto.QuerySpuByIdResponse> getQuerySpuByIdMethod;
    if ((getQuerySpuByIdMethod = ItemFlowServiceGrpc.getQuerySpuByIdMethod) == null) {
      synchronized (ItemFlowServiceGrpc.class) {
        if ((getQuerySpuByIdMethod = ItemFlowServiceGrpc.getQuerySpuByIdMethod) == null) {
          ItemFlowServiceGrpc.getQuerySpuByIdMethod = getQuerySpuByIdMethod =
              io.grpc.MethodDescriptor.<ItemFlowProto.QuerySpuByIdRequest, ItemFlowProto.QuerySpuByIdResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.egoist.mall.grpc.generated.item.flow.ItemFlowService", "querySpuById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ItemFlowProto.QuerySpuByIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ItemFlowProto.QuerySpuByIdResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ItemFlowServiceMethodDescriptorSupplier("querySpuById"))
                  .build();
          }
        }
     }
     return getQuerySpuByIdMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ItemFlowServiceStub newStub(io.grpc.Channel channel) {
    return new ItemFlowServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ItemFlowServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ItemFlowServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ItemFlowServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ItemFlowServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class ItemFlowServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void querySpuById(ItemFlowProto.QuerySpuByIdRequest request,
                             io.grpc.stub.StreamObserver<ItemFlowProto.QuerySpuByIdResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getQuerySpuByIdMethod(), responseObserver);
    }

    @Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getQuerySpuByIdMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ItemFlowProto.QuerySpuByIdRequest,
                ItemFlowProto.QuerySpuByIdResponse>(
                  this, METHODID_QUERY_SPU_BY_ID)))
          .build();
    }
  }

  /**
   */
  public static final class ItemFlowServiceStub extends io.grpc.stub.AbstractStub<ItemFlowServiceStub> {
    private ItemFlowServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ItemFlowServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected ItemFlowServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ItemFlowServiceStub(channel, callOptions);
    }

    /**
     */
    public void querySpuById(ItemFlowProto.QuerySpuByIdRequest request,
                             io.grpc.stub.StreamObserver<ItemFlowProto.QuerySpuByIdResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getQuerySpuByIdMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ItemFlowServiceBlockingStub extends io.grpc.stub.AbstractStub<ItemFlowServiceBlockingStub> {
    private ItemFlowServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ItemFlowServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected ItemFlowServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ItemFlowServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public ItemFlowProto.QuerySpuByIdResponse querySpuById(ItemFlowProto.QuerySpuByIdRequest request) {
      return blockingUnaryCall(
          getChannel(), getQuerySpuByIdMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ItemFlowServiceFutureStub extends io.grpc.stub.AbstractStub<ItemFlowServiceFutureStub> {
    private ItemFlowServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ItemFlowServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected ItemFlowServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ItemFlowServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ItemFlowProto.QuerySpuByIdResponse> querySpuById(
        ItemFlowProto.QuerySpuByIdRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getQuerySpuByIdMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_QUERY_SPU_BY_ID = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ItemFlowServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ItemFlowServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @Override
    @SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_QUERY_SPU_BY_ID:
          serviceImpl.querySpuById((ItemFlowProto.QuerySpuByIdRequest) request,
              (io.grpc.stub.StreamObserver<ItemFlowProto.QuerySpuByIdResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @Override
    @SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class ItemFlowServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ItemFlowServiceBaseDescriptorSupplier() {}

    @Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return ItemFlowProto.getDescriptor();
    }

    @Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ItemFlowService");
    }
  }

  private static final class ItemFlowServiceFileDescriptorSupplier
      extends ItemFlowServiceBaseDescriptorSupplier {
    ItemFlowServiceFileDescriptorSupplier() {}
  }

  private static final class ItemFlowServiceMethodDescriptorSupplier
      extends ItemFlowServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ItemFlowServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (ItemFlowServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ItemFlowServiceFileDescriptorSupplier())
              .addMethod(getQuerySpuByIdMethod())
              .build();
        }
      }
    }
    return result;
  }
}
