package ru.gov.ps.service;

import io.grpc.stub.StreamObserver;
import lombok.extern.slf4j.Slf4j;
import net.devh.boot.grpc.server.service.GrpcService;
import ru.gof.ps.HelloRequest;
import ru.gof.ps.HelloResponse;
import ru.gof.ps.HelloServiceGrpc;

import java.text.SimpleDateFormat;
import java.util.Date;

@GrpcService
@Slf4j
public class HelloServiceImpl extends HelloServiceGrpc.HelloServiceImplBase {

    private final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");

    @Override
    public void sayHello(HelloRequest req, StreamObserver<HelloResponse> responseObserver) {
        try {
            Thread.sleep(50);
            System.out.println(dateFormat.format(new Date()) + " Done");
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