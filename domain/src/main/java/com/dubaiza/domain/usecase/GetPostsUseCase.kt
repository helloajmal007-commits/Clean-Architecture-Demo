package com.dubaiza.domain.usecase

import com.dubaiza.domain.model.Post
import com.dubaiza.domain.repository.PostRepository

class GetPostsUseCase(private val repository: PostRepository) {
    suspend operator fun invoke(): List<Post> = repository.getPosts()
}