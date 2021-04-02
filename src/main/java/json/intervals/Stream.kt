package json.intervals

data class Stream(

    val socket: Int,
    val start: Double,
    val end: Double,
    val seconds: Double,
    val bytes: Long,
    val bits_per_second: Double,    // or Float, not sure
    val retransmits: Int,
    val snd_cwnd: Int,
    val rtt: Int,
    val rttvar: Int,
    val pmtu: Int,
    val omitted: Boolean,
    val sender:	Boolean

)