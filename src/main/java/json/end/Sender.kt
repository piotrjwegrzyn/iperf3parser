package json.end

data class Sender(

    val socket: Int,
    val start: Double,
    val end: Double,
    val seconds: Double,
    val bytes: Long,
    val bits_per_second: Double,    // or Float, not sure
    val retransmits: Int,
    val max_snd_cwnd: Int,
    val max_rtt: Int,
    val min_rtt: Int,
    val mean_rtt: Int,
    val sender:	Boolean

)