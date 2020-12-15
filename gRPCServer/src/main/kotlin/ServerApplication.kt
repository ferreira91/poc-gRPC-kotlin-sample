import io.grpc.Server
import io.grpc.ServerBuilder

fun main() {
    val server: Server = ServerBuilder.forPort(8099).addService(HelloService()).build()
    println("Server ready")
    server.start()
    println("Server started")
    server.awaitTermination()
    println("Server await")
}
