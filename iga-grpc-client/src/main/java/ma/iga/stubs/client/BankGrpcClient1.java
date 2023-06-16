package ma.iga.stubs.client;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import ma.iga.stubs.BakServiceGrpc;
import ma.iga.stubs.Bank;

public class BankGrpcClient1 {
    ManagedChannel managedChannel= ManagedChannelBuilder.forAddress("localhost",5555)
            .usePlaintext()
            .build();
    BakServiceGrpc.BakServiceBlockingStub blockingStub= BakServiceGrpc.newBlockingStub(managedChannel);
    Bank.ConvertCurrencyRequest request= Bank.ConvertCurrencyRequest.newBuilder()
            .setCurrencyFrom("MAD")
            .setCurrencyTo("USD")
            .setAmount(6500)
            .build();
    Bank.ConvertCurrencyResponse currencyResponse=blockingStub.convert(request);
}
