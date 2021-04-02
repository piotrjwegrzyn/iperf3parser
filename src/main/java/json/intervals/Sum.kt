package json.intervals

data class Sum(
    val start: Double,
    val end: Double,
    val seconds: Double,
    val bytes:	Int,
    val bits_per_second: Double,    // not sure, may be Float
    val retransmits: Int,
    val omitted: Boolean,
    val sender:	Boolean

)
