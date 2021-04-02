package json

data class Database(

    val start: json.start.Start,
    val intervals: List<json.intervals.Interval>,
    val end: json.end.End

)
