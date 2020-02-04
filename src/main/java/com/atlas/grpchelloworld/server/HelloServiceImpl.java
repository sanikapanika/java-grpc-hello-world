package com.atlas.grpchelloworld.server;

import com.atlas.grpchelloworld.HelloReply;
import com.atlas.grpchelloworld.HelloRequest;
import com.atlas.grpchelloworld.HelloServiceGrpc;
import io.grpc.stub.StreamObserver;

public class HelloServiceImpl extends HelloServiceGrpc.HelloServiceImplBase {

    @Override
    public void sayHello(HelloRequest request, StreamObserver<HelloReply> responseObserver) {
        System.out.println(request);

        HelloReply reply = HelloReply.newBuilder()
                .setMessage("Sidje " + request.getName() + " kume")
                .build();

        responseObserver.onNext(reply);

        responseObserver.onCompleted();
    }
}
