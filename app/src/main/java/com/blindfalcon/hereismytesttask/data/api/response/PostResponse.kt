package com.blindfalcon.hereismytesttask.data.api.response

import com.blindfalcon.hereismytesttask.data.api.RESPONSE_BODY
import com.blindfalcon.hereismytesttask.data.api.RESPONSE_ID
import com.blindfalcon.hereismytesttask.data.api.RESPONSE_TITLE
import com.blindfalcon.hereismytesttask.data.api.RESPONSE_USER_ID
import com.google.gson.annotations.SerializedName

data class PostResponse(
    @SerializedName(RESPONSE_ID)
    val id: Int,
    @SerializedName(RESPONSE_USER_ID)
    val userId: Int,
    @SerializedName(RESPONSE_TITLE)
    val title: String,
    @SerializedName(RESPONSE_BODY)
    val body: String
)