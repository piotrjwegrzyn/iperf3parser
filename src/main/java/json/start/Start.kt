package json.start

data class Start(

    val connected: List<ConnectedElement>,
    val version: String,
    val system_info: String,
    val timestamp: Timestamp,
    val connecting_to: ConnectingTo,
    val cookie: String,
    val tcp_mss_default: Int,
    val sock_bufsize: Int,
    val sndbuf_actual: Int,
    val rcvbuf_actual: Int,
    val test_start: TestStart

)
