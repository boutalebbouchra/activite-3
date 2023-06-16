package ma.iga.stubs.service;
import io.grpc.stub.StreamObserver;
import ma.iga.stubs.BakServiceGrpc;
import ma.iga.stubs.Bank;

public class BankGrpcService extends BakServiceGrpc.BakServiceImplBase {
    @Override
    public void convert(Bank.ConvertCurrencyRequest request, StreamObserver<Bank.ConvertCurrencyResponse> responseObserver) {
        String currencyFrom= request.getCurrencyFrom();
        String currencyTo= request.getCurrencyTo();
        double amount= request.getAmount();
        Bank.ConvertCurrencyResponse response= Bank.ConvertCurrencyResponse.newBuilder()
                .setCurrencyFrom(currencyFrom)
                .setCurrencyTo(currencyTo)
                .setAmount(amount)
                .setResult(amount*11.4)
                .build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void getCurrencyStream(Bank.ConvertCurrencyRequest request, StreamObserver<Bank.ConvertCurrencyResponse> responseObserver) {
        super.getCurrencyStream(request, responseObserver);
    }

    @Override
    public StreamObserver<Bank.ConvertCurrencyRequest> performStream(StreamObserver<Bank.ConvertCurrencyResponse> responseObserver) {
        return super.performStream(responseObserver);
    }

    @Override
    public StreamObserver<Bank.ConvertCurrencyRequest> fullCurrencyStream(StreamObserver<Bank.ConvertCurrencyResponse> responseObserver) {
        return super.fullCurrencyStream(responseObserver);
    }
}
