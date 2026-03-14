package com.dubaiza.data.repository

import com.dubaiza.data.api.ApiService
import com.dubaiza.domain.model.Post
import com.dubaiza.domain.repository.PostRepository


class PostRepositoryImpl(private val api: ApiService) : PostRepository {
    override suspend fun getPosts(): List<Post> = api.getPosts()
}