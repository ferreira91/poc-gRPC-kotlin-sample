import demo.HelloRequest
import demo.HelloResponse
import demo.HelloWorldServiceGrpc
import io.grpc.stub.StreamObserver


class HelloService : HelloWorldServiceGrpc.HelloWorldServiceImplBase() {
    override fun hello(request: HelloRequest?, responseObserver: StreamObserver<HelloResponse>?) {
        println("Request: $request");
        var response = HelloResponse.newBuilder().setText("Hi").build()

        responseObserver?.onNext(response)
        responseObserver?.onCompleted()
    }
}

