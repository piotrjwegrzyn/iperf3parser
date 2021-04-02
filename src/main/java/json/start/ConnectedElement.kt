package json.start

data class ConnectedElement(

    val socket: Int,
    val local_host: String,
    val local_port: Int,
    val remote_host: String,
    val remote_port: Int

)
