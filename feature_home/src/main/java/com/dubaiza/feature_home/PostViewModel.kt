package com.dubaiza.feature_home

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
//import androidx.lifecycle.viewModelScope
import com.dubaiza.domain.model.Post
import com.dubaiza.domain.usecase.GetPostsUseCase
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class PostViewModel(private val getPostsUseCase: GetPostsUseCase) : ViewModel() {
    private val _posts = MutableStateFlow<List<Post>>(emptyList())
    val posts: StateFlow<List<Post>> = _posts

    init { fetchPosts() }

    private fun fetchPosts() {
        viewModelScope.launch { _posts.value = getPostsUseCase() }
    }
}