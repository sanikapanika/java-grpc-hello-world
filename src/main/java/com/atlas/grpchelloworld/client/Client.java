package com.atlas.grpchelloworld.client;

import com.atlas.grpchelloworld.HelloReply;
import com.atlas.grpchelloworld.HelloRequest;
import com.atlas.grpchelloworld.HelloServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class Client {

    public static void main(String[] args) {
        final ManagedChannel channel = ManagedChannelBuilder.forTarget("localhost:1312").usePlaintext().build();

        HelloServiceGrpc.HelloServiceBlockingStub stub = HelloServiceGrpc.newBlockingStub(channel);
        HelloRequest request = HelloRequest.newBuilder().setName("Dibu danbu").build();

        HelloReply response = stub.sayHello(request);

        System.out.println(response);

        channel.shutdown();
    }
}
