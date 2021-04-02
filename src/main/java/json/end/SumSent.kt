package json.end

data class SumSent(

    val start: Double,
    val end: Double,
    val seconds: Double,
    val bytes: Long,
    val bits_per_second: Double,    // may be Float, I don't know
    val retransmits: Int,
    val sender:	Boolean

)
