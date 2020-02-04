package com.atlas.grpchelloworld.server;

import io.grpc.ServerBuilder;

import java.io.IOException;

public class Server {

    public static void main(String[] args) throws InterruptedException, IOException {
        io.grpc.Server server = ServerBuilder.forPort(1312).addService(new HelloServiceImpl()).build();

        server.start();

        System.out.println("Server started");

        server.awaitTermination();
    }
}
