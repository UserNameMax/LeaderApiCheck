package LiaderApi.JsonElements

data class Hall(
    val id: Int,
    val name: String,
    val capacity: Int,
    val type:String,
    val square:Int,
    val tags:List<String>,
    val preparePeriod: Int,
    val photos:List<Photo>
)
