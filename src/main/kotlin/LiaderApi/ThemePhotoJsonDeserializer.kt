package LiaderApi

import LiaderApi.JsonElements.Photo
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

}