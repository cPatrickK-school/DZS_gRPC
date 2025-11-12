import io.grpc.stub.StreamObserver;

public class gRPC_WarehouseConnector extends WarehouseConnectorGrpc.WarehouseConnectorImplBase {

    @Override
    public void data(Warehouse.WarehouseRequest request, StreamObserver<Warehouse.WarehouseResponse> responseObserver ) {
        WarehouseSimulation simulation = new WarehouseSimulation();

        System.out.println("\u001B[34m[SRV] Received request for Warehouse ID: " + request.getWarehouseID() + "\u001B[0m");

        WarehouseData w = simulation.getData(String.valueOf(request.getWarehouseID()));
        Warehouse.WarehouseResponse.Builder response = Warehouse.WarehouseResponse.newBuilder()
                .setWarehouseID(Integer.parseInt(w.getWarehouseID()))
                .setWarehouseAddress(w.getWarehouseAddress())
                .setWarehouseCity(w.getWarehouseCity())
                .setWarehouseCountry(w.getWarehouseCountry())
                .setWarehouseName(w.getWarehouseName())
                .setWarehousePostalcode(w.getWarehousePostalcode());


        for (Product p : w.getProducts()) {
            response.addProducts(Warehouse.Product.newBuilder()
                    .setProductID(p.getProductID())
                    .setProductName(p.getProductName())
                    .setProductCategory(p.getProductCategory())
                    .setProductUnit(p.getProductUnit())
                    .build()
            );
        }

        responseObserver.onNext(response.build());
        responseObserver.onCompleted();
    }



}
