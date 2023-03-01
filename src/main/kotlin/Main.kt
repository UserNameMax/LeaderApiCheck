import LiaderApi.JsonElements.Photo
import LiaderApi.LiaderApi
import LiaderApi.ThemePhotoJsonDeserializer
import com.google.gson.GsonBuilder
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


fun main(args: Array<String>) {
    val builder = GsonBuilder()
    builder.registerTypeAdapter(Photo::class.java,ThemePhotoJsonDeserializer())
    val retrofit = Retrofit.Builder()
        .baseUrl("https://leader-id.ru/")
        .addConverterFactory(GsonConverterFactory.create(builder.create()))
        .build();
    val api = retrofit.create(LiaderApi::class.java)
    val response= api.searchEvents(100,3942).execute()
    for (i in response.body()!!.data._items){
        println(i.full_name)
    }

}