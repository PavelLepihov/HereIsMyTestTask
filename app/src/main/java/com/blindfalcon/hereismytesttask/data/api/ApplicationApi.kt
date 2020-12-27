package com.blindfalcon.hereismytesttask.data.api

import com.blindfalcon.hereismytesttask.data.api.response.PostResponse
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface ApplicationApi {
    @GET(POSTS)
    suspend fun getPosts(
        @Query(START) start: Int,
        @Query(LIMIT) limit: Int
    ): List<PostResponse>

    @GET("$POSTS/{$REQUEST_POST_ID}")
    suspend fun getPost(
        @Path(REQUEST_POST_ID) id: Int
    ): PostResponse
}