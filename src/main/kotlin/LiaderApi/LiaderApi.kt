package LiaderApi

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface LiaderApi {
    @GET("api/v4/events/search")
    fun searchEvents(@Query("paginationSize") count: Int, @Query("placeIds[]") placeId: Int): Call<SearchResponse>
}