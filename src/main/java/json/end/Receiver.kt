package json.end

data class Receiver(

    val socket: Int,
    val start: Double,
    val end: Double,
    val seconds: Double,
    val bytes:	Long,
    val bits_per_second: Double,    // not sure, may be Float
    val sender:	Boolean

)
