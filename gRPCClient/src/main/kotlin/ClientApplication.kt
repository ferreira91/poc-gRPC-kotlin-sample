import demo.HelloRequest
import demo.HelloWorldServiceGrpc
import io.grpc.ManagedChannelBuilder

fun main() {
    val channel = ManagedChannelBuilder.forAddress("localhost", 8099).usePlaintext().build()
    val stub = HelloWorldServiceGrpc.newBlockingStub(channel)
    val request = HelloRequest.newBuilder().setText("Hello").build()
    val response = stub.hello(request)
    println("Response: $response");
}