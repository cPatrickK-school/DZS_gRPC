import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

public class gRPC_WareHouseServer {

    private static final int PORT = 50051;
    private Server server;

    public void start() throws IOException {
        server = ServerBuilder.forPort(PORT)
                .addService(new gRPC_WarehouseConnector())
                .build()
                .start();
    }


    public void blockUntilShutdown() throws InterruptedException {
        if (server == null) {
            return;
        }
        server.awaitTermination();
    }

    public static void main(String[] args) throws InterruptedException, IOException {
        gRPC_WareHouseServer server = new gRPC_WareHouseServer();
        System.out.println("\n\n");
        System.out.println("\u001B[32m[SRV]Warehouse Service is running!\u001B[0m");
        System.out.println("\n\n");
        server.start();
        server.blockUntilShutdown();
    }


}