package com.gph.tst.giphytestapp.data.network.api

import com.gph.tst.giphytestapp.data.network.model.GiphyApiResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface GiphyApi {

    @GET("search")
    suspend fun search(
        @Query("q") query: String,
        @Query("limit") limit: Int = 25,
        @Query("offset") offset: Int = 0,
        @Query("rating") rating: String = "pg",
        @Query("lang") language: String = "en",
    ): Response<GiphyApiResponse>

    @GET("trending")
    suspend fun fetchTrending(
        @Query("limit") limit: Int = 25,
        @Query("rating") rating: String = "g",
    ): Response<GiphyApiResponse>

}