package ru.gov.ps.service;

import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;
import ru.gof.ps.HelloRequest;
import ru.gof.ps.HelloResponse;
import ru.gof.ps.HelloServiceGrpc;

@GrpcService
public class HelloServiceImpl extends HelloServiceGrpc.HelloServiceImplBase {

    @Override
    public void sayHello(HelloRequest req, StreamObserver<HelloResponse> responseObserver) {
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        HelloResponse response = HelloResponse.newBuilder()
                .setMessage("Hello " + req.getName())
                .build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}