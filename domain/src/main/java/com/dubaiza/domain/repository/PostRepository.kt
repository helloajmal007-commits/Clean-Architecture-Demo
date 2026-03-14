package com.dubaiza.domain.repository

import com.dubaiza.domain.model.Post

interface PostRepository {
    suspend fun getPosts(): List<Post>
}