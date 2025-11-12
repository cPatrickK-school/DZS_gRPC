import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

import java.util.List;

public class gRPC_WareHouseClient {

    public static void main(String[] args) {

        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50051)
                .usePlaintext()
                .build();

        WarehouseConnectorGrpc.WarehouseConnectorBlockingStub stub = WarehouseConnectorGrpc.newBlockingStub(channel);

        Warehouse.WarehouseResponse response = stub.data(Warehouse.WarehouseRequest.newBuilder().setWarehouseID(14).build());
        StringBuilder sb = new StringBuilder(response.getWarehouseName()+"\n"
                +response.getWarehouseAddress()+"\n"
                +response.getWarehousePostalcode()+" "
                +response.getWarehouseCity()+"\n"
                +response.getWarehouseCountry()+"\n"
                +"Products:\n"
                +"---------------------\n");
                List<Warehouse.Product> products = response.getProductsList();
                for (Warehouse.Product p : products) {
                    sb.append("ID: ").append(p.getProductID())
                        .append(", Name: ").append(p.getProductName())
                        .append(", Category: ").append(p.getProductCategory())
                        .append(", Unit: ").append(p.getProductUnit())
                        .append("\n");
                }
        System.out.println("\u001B[34m[CLIENT] DATA RECEIVED\n:"+ sb+"\u001B[0m");
        channel.shutdown();

    }


}
