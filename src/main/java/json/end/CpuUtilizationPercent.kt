package json.end

data class CpuUtilizationPercent(

    val host_total: Double,
    val host_user: Double,
    val host_system: Double,
    val remote_total: Double,
    val remote_user: Double,
    val remote_system: Double,

)
