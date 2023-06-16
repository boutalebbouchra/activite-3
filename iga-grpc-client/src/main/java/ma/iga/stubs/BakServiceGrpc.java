package ma.iga.stubs;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: Bank.proto")
public final class BakServiceGrpc {

  private BakServiceGrpc() {}

  public static final String SERVICE_NAME = "BakService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<ma.iga.stubs.Bank.ConvertCurrencyRequest,
      ma.iga.stubs.Bank.ConvertCurrencyResponse> getConvertMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "convert",
      requestType = ma.iga.stubs.Bank.ConvertCurrencyRequest.class,
      responseType = ma.iga.stubs.Bank.ConvertCurrencyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ma.iga.stubs.Bank.ConvertCurrencyRequest,
      ma.iga.stubs.Bank.ConvertCurrencyResponse> getConvertMethod() {
    io.grpc.MethodDescriptor<ma.iga.stubs.Bank.ConvertCurrencyRequest, ma.iga.stubs.Bank.ConvertCurrencyResponse> getConvertMethod;
    if ((getConvertMethod = BakServiceGrpc.getConvertMethod) == null) {
      synchronized (BakServiceGrpc.class) {
        if ((getConvertMethod = BakServiceGrpc.getConvertMethod) == null) {
          BakServiceGrpc.getConvertMethod = getConvertMethod = 
              io.grpc.MethodDescriptor.<ma.iga.stubs.Bank.ConvertCurrencyRequest, ma.iga.stubs.Bank.ConvertCurrencyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "BakService", "convert"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.iga.stubs.Bank.ConvertCurrencyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.iga.stubs.Bank.ConvertCurrencyResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new BakServiceMethodDescriptorSupplier("convert"))
                  .build();
          }
        }
     }
     return getConvertMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ma.iga.stubs.Bank.ConvertCurrencyRequest,
      ma.iga.stubs.Bank.ConvertCurrencyResponse> getGetCurrencyStreamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getCurrencyStream",
      requestType = ma.iga.stubs.Bank.ConvertCurrencyRequest.class,
      responseType = ma.iga.stubs.Bank.ConvertCurrencyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<ma.iga.stubs.Bank.ConvertCurrencyRequest,
      ma.iga.stubs.Bank.ConvertCurrencyResponse> getGetCurrencyStreamMethod() {
    io.grpc.MethodDescriptor<ma.iga.stubs.Bank.ConvertCurrencyRequest, ma.iga.stubs.Bank.ConvertCurrencyResponse> getGetCurrencyStreamMethod;
    if ((getGetCurrencyStreamMethod = BakServiceGrpc.getGetCurrencyStreamMethod) == null) {
      synchronized (BakServiceGrpc.class) {
        if ((getGetCurrencyStreamMethod = BakServiceGrpc.getGetCurrencyStreamMethod) == null) {
          BakServiceGrpc.getGetCurrencyStreamMethod = getGetCurrencyStreamMethod = 
              io.grpc.MethodDescriptor.<ma.iga.stubs.Bank.ConvertCurrencyRequest, ma.iga.stubs.Bank.ConvertCurrencyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "BakService", "getCurrencyStream"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.iga.stubs.Bank.ConvertCurrencyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.iga.stubs.Bank.ConvertCurrencyResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new BakServiceMethodDescriptorSupplier("getCurrencyStream"))
                  .build();
          }
        }
     }
     return getGetCurrencyStreamMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ma.iga.stubs.Bank.ConvertCurrencyRequest,
      ma.iga.stubs.Bank.ConvertCurrencyResponse> getPerformStreamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "performStream",
      requestType = ma.iga.stubs.Bank.ConvertCurrencyRequest.class,
      responseType = ma.iga.stubs.Bank.ConvertCurrencyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<ma.iga.stubs.Bank.ConvertCurrencyRequest,
      ma.iga.stubs.Bank.ConvertCurrencyResponse> getPerformStreamMethod() {
    io.grpc.MethodDescriptor<ma.iga.stubs.Bank.ConvertCurrencyRequest, ma.iga.stubs.Bank.ConvertCurrencyResponse> getPerformStreamMethod;
    if ((getPerformStreamMethod = BakServiceGrpc.getPerformStreamMethod) == null) {
      synchronized (BakServiceGrpc.class) {
        if ((getPerformStreamMethod = BakServiceGrpc.getPerformStreamMethod) == null) {
          BakServiceGrpc.getPerformStreamMethod = getPerformStreamMethod = 
              io.grpc.MethodDescriptor.<ma.iga.stubs.Bank.ConvertCurrencyRequest, ma.iga.stubs.Bank.ConvertCurrencyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "BakService", "performStream"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.iga.stubs.Bank.ConvertCurrencyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.iga.stubs.Bank.ConvertCurrencyResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new BakServiceMethodDescriptorSupplier("performStream"))
                  .build();
          }
        }
     }
     return getPerformStreamMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ma.iga.stubs.Bank.ConvertCurrencyRequest,
      ma.iga.stubs.Bank.ConvertCurrencyResponse> getFullCurrencyStreamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "fullCurrencyStream",
      requestType = ma.iga.stubs.Bank.ConvertCurrencyRequest.class,
      responseType = ma.iga.stubs.Bank.ConvertCurrencyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<ma.iga.stubs.Bank.ConvertCurrencyRequest,
      ma.iga.stubs.Bank.ConvertCurrencyResponse> getFullCurrencyStreamMethod() {
    io.grpc.MethodDescriptor<ma.iga.stubs.Bank.ConvertCurrencyRequest, ma.iga.stubs.Bank.ConvertCurrencyResponse> getFullCurrencyStreamMethod;
    if ((getFullCurrencyStreamMethod = BakServiceGrpc.getFullCurrencyStreamMethod) == null) {
      synchronized (BakServiceGrpc.class) {
        if ((getFullCurrencyStreamMethod = BakServiceGrpc.getFullCurrencyStreamMethod) == null) {
          BakServiceGrpc.getFullCurrencyStreamMethod = getFullCurrencyStreamMethod = 
              io.grpc.MethodDescriptor.<ma.iga.stubs.Bank.ConvertCurrencyRequest, ma.iga.stubs.Bank.ConvertCurrencyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "BakService", "fullCurrencyStream"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.iga.stubs.Bank.ConvertCurrencyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.iga.stubs.Bank.ConvertCurrencyResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new BakServiceMethodDescriptorSupplier("fullCurrencyStream"))
                  .build();
          }
        }
     }
     return getFullCurrencyStreamMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static BakServiceStub newStub(io.grpc.Channel channel) {
    return new BakServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static BakServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new BakServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static BakServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new BakServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class BakServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void convert(ma.iga.stubs.Bank.ConvertCurrencyRequest request,
        io.grpc.stub.StreamObserver<ma.iga.stubs.Bank.ConvertCurrencyResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getConvertMethod(), responseObserver);
    }

    /**
     */
    public void getCurrencyStream(ma.iga.stubs.Bank.ConvertCurrencyRequest request,
        io.grpc.stub.StreamObserver<ma.iga.stubs.Bank.ConvertCurrencyResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetCurrencyStreamMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<ma.iga.stubs.Bank.ConvertCurrencyRequest> performStream(
        io.grpc.stub.StreamObserver<ma.iga.stubs.Bank.ConvertCurrencyResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getPerformStreamMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<ma.iga.stubs.Bank.ConvertCurrencyRequest> fullCurrencyStream(
        io.grpc.stub.StreamObserver<ma.iga.stubs.Bank.ConvertCurrencyResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getFullCurrencyStreamMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getConvertMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ma.iga.stubs.Bank.ConvertCurrencyRequest,
                ma.iga.stubs.Bank.ConvertCurrencyResponse>(
                  this, METHODID_CONVERT)))
          .addMethod(
            getGetCurrencyStreamMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                ma.iga.stubs.Bank.ConvertCurrencyRequest,
                ma.iga.stubs.Bank.ConvertCurrencyResponse>(
                  this, METHODID_GET_CURRENCY_STREAM)))
          .addMethod(
            getPerformStreamMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                ma.iga.stubs.Bank.ConvertCurrencyRequest,
                ma.iga.stubs.Bank.ConvertCurrencyResponse>(
                  this, METHODID_PERFORM_STREAM)))
          .addMethod(
            getFullCurrencyStreamMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                ma.iga.stubs.Bank.ConvertCurrencyRequest,
                ma.iga.stubs.Bank.ConvertCurrencyResponse>(
                  this, METHODID_FULL_CURRENCY_STREAM)))
          .build();
    }
  }

  /**
   */
  public static final class BakServiceStub extends io.grpc.stub.AbstractStub<BakServiceStub> {
    private BakServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BakServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BakServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BakServiceStub(channel, callOptions);
    }

    /**
     */
    public void convert(ma.iga.stubs.Bank.ConvertCurrencyRequest request,
        io.grpc.stub.StreamObserver<ma.iga.stubs.Bank.ConvertCurrencyResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getConvertMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getCurrencyStream(ma.iga.stubs.Bank.ConvertCurrencyRequest request,
        io.grpc.stub.StreamObserver<ma.iga.stubs.Bank.ConvertCurrencyResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getGetCurrencyStreamMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<ma.iga.stubs.Bank.ConvertCurrencyRequest> performStream(
        io.grpc.stub.StreamObserver<ma.iga.stubs.Bank.ConvertCurrencyResponse> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getPerformStreamMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<ma.iga.stubs.Bank.ConvertCurrencyRequest> fullCurrencyStream(
        io.grpc.stub.StreamObserver<ma.iga.stubs.Bank.ConvertCurrencyResponse> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getFullCurrencyStreamMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class BakServiceBlockingStub extends io.grpc.stub.AbstractStub<BakServiceBlockingStub> {
    private BakServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BakServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BakServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BakServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public ma.iga.stubs.Bank.ConvertCurrencyResponse convert(ma.iga.stubs.Bank.ConvertCurrencyRequest request) {
      return blockingUnaryCall(
          getChannel(), getConvertMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<ma.iga.stubs.Bank.ConvertCurrencyResponse> getCurrencyStream(
        ma.iga.stubs.Bank.ConvertCurrencyRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getGetCurrencyStreamMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class BakServiceFutureStub extends io.grpc.stub.AbstractStub<BakServiceFutureStub> {
    private BakServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BakServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BakServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BakServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ma.iga.stubs.Bank.ConvertCurrencyResponse> convert(
        ma.iga.stubs.Bank.ConvertCurrencyRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getConvertMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CONVERT = 0;
  private static final int METHODID_GET_CURRENCY_STREAM = 1;
  private static final int METHODID_PERFORM_STREAM = 2;
  private static final int METHODID_FULL_CURRENCY_STREAM = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final BakServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(BakServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CONVERT:
          serviceImpl.convert((ma.iga.stubs.Bank.ConvertCurrencyRequest) request,
              (io.grpc.stub.StreamObserver<ma.iga.stubs.Bank.ConvertCurrencyResponse>) responseObserver);
          break;
        case METHODID_GET_CURRENCY_STREAM:
          serviceImpl.getCurrencyStream((ma.iga.stubs.Bank.ConvertCurrencyRequest) request,
              (io.grpc.stub.StreamObserver<ma.iga.stubs.Bank.ConvertCurrencyResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_PERFORM_STREAM:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.performStream(
              (io.grpc.stub.StreamObserver<ma.iga.stubs.Bank.ConvertCurrencyResponse>) responseObserver);
        case METHODID_FULL_CURRENCY_STREAM:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.fullCurrencyStream(
              (io.grpc.stub.StreamObserver<ma.iga.stubs.Bank.ConvertCurrencyResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class BakServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    BakServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return ma.iga.stubs.Bank.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("BakService");
    }
  }

  private static final class BakServiceFileDescriptorSupplier
      extends BakServiceBaseDescriptorSupplier {
    BakServiceFileDescriptorSupplier() {}
  }

  private static final class BakServiceMethodDescriptorSupplier
      extends BakServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    BakServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (BakServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new BakServiceFileDescriptorSupplier())
              .addMethod(getConvertMethod())
              .addMethod(getGetCurrencyStreamMethod())
              .addMethod(getPerformStreamMethod())
              .addMethod(getFullCurrencyStreamMethod())
              .build();
        }
      }
    }
    return result;
  }
}
