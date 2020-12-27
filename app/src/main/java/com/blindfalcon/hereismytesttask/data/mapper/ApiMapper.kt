package com.blindfalcon.hereismytesttask.data.mapper

import com.blindfalcon.hereismytesttask.data.api.response.PostResponse
import com.blindfalcon.hereismytesttask.data.model.PostEntity

interface ApiMapper {
    fun restToPost(response: PostResponse): PostEntity
}

class ApiMapperImpl : ApiMapper {
    override fun restToPost(response: PostResponse): PostEntity =
        with(response) {
            PostEntity(
                id = id,
                userId = userId,
                title = title,
                body = body
            )
        }
}