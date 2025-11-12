import grpc
import warehouse_pb2
import warehouse_pb2_grpc

def main():
    # Create a channel to connect to the gRPC server
    channel = grpc.insecure_channel('localhost:50051')

    # Create a stub (client) to interact with the server
    stub = warehouse_pb2_grpc.WarehouseConnectorStub(channel)

    # Create a request message
    request = warehouse_pb2.WarehouseRequest(warehouseID=14)

    # Call the remote procedure and get the response
    response = stub.data(request)

    # Build the output string
    sb = f"{response.warehouseName}\n" \
         f"{response.warehouseAddress}\n" \
         f"{response.warehousePostalcode} {response.warehouseCity}\n" \
         f"{response.warehouseCountry}\n" \
         f"Products:\n" \
         f"---------------------\n"

    for product in response.products:
        sb += f"ID: {product.productID}, Name: {product.productName}, " \
              f"Category: {product.productCategory}, Unit: {product.productUnit}\n"

    # Print the received data
    print(f"\033[34m[CLIENT] DATA RECEIVED:\n{sb}\033[0m")

    # Close the channel
    channel.close()

if __name__ == "__main__":
    main()
