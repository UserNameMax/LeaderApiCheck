package LiderApi

import LiderApi.JsonElements.Photo
import LiderApi.JsonElements.PhotoUrl
import LiderApi.JsonElements.Theme
import com.google.gson.Gson
import com.google.gson.JsonDeserializationContext
import com.google.gson.JsonDeserializer
import com.google.gson.JsonElement
import java.lang.reflect.Type

class ThemePhotoJsonDeserializer: JsonDeserializer<Photo?> {
    override fun deserialize(
        json: JsonElement?,
        typeOfT: Type?,
        context: JsonDeserializationContext?
    ): Photo? =if (json!!.isJsonArray) null else Gson().fromJson(json.toString(),Photo::class.java)
/*{
        val photo: Photo? = if (json!!.getAsJsonObject().get("freeVal").isJsonArray) null else Photo()
        val theme = Theme(
            id = json!!.getAsJsonObject().get("freeVal").toString().toInt(),
            name = json!!.getAsJsonObject().get("freeVal").toString(),
            visible = json!!.getAsJsonObject().get("freeVal").toString().toBoolean(),
            updated_at = json!!.getAsJsonObject().get("freeVal").toString(),//
            createdBy = json!!.getAsJsonObject().get("freeVal").toString().toInt(),
            priority = json!!.getAsJsonObject().get("freeVal").toString().toInt(),
            status = json!!.getAsJsonObject().get("freeVal").toString().toInt(),
            keywords = json!!.getAsJsonObject().get("freeVal"),
            photos = null,//
            old_type = json!!.getAsJsonObject().get("freeVal").toString(),//
            gid = json!!.getAsJsonObject().get("freeVal").toString().toInt(),
            code = json!!.getAsJsonObject().get("freeVal").toString().toIntOrNull(),
            parentId = json!!.getAsJsonObject().get("freeVal").toString().toIntOrNull(),
            childCount = json!!.getAsJsonObject().get("freeVal").toString().toInt(),
            moderatedBy = json!!.getAsJsonObject().get("freeVal").toString().toIntOrNull(),
            moderatedAt = json!!.getAsJsonObject().get("freeVal").toString(),//
            photo = json!!.getAsJsonObject().get("freeVal").toString()
        )
        return theme
    }*/

}