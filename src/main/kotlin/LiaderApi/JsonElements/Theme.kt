package LiaderApi.JsonElements

data class Theme(
    val id: Int,
    val name: String,
    val visible: Boolean,
    val updated_at: String?,
    val createdBy: Int,
    val priority: Int,
    val status: Int,
    val keywords: List<String>,
    val photos: Photo?,
    val old_type: String?,
    val gid: Int,
    val code: Int?, // всегда null
    val parentId: Int?, // всегда null
    val childCount: Int,
    val moderatedBy: Int?,
    val moderatedAt: String?,
    val photo: PhotoUrl
)