package com.blindfalcon.hereismytesttask.data.repo

import com.blindfalcon.hereismytesttask.data.api.ApplicationApi
import com.blindfalcon.hereismytesttask.data.mapper.ApiMapper
import com.blindfalcon.hereismytesttask.data.model.PostEntity

interface PostsRepo {
    suspend fun getPosts(start: Int, limit: Int): List<PostEntity>
    suspend fun getPost(postId: Int): PostEntity
}

class PostsRepoImpl(
    private val api: ApplicationApi,
    private val mapper: ApiMapper
) : PostsRepo {
    override suspend fun getPosts(start: Int, limit: Int): List<PostEntity> =
        api.getPosts(start, limit)
            .map(mapper::restToPost)

    override suspend fun getPost(postId: Int): PostEntity =
        api.getPost(postId).let(mapper::restToPost)
}