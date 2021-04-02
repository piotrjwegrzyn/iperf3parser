package json.end

data class End(

    val streams: List<EndStream>,
    val sum_sent: SumSent,
    val sum_received: SumReceived,
    val cpu_utilization_percent: CpuUtilizationPercent,
    val sender_tcp_congestion: String,
    val receiver_tcp_congestion: String

)
