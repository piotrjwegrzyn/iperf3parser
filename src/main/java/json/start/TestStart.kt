package json.start

data class TestStart(
    val protocol: String,
    val num_streams: Int,
    val blksize: Int,
    val omit: Int,
    val duration: Int,
    val bytes: Int,
    val blocks: Int,
    val reverse: Int,
    val tos: Int
)
