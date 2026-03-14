package com.dubaiza.clean_demo

import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.dubaiza.clean_demo.ui.theme.CleanDemoTheme

import com.dubaiza.feature_home.PostScreen
import android.os.Bundle
import androidx.activity.ComponentActivity
import com.dubaiza.data.api.RetrofitClient
import com.dubaiza.data.repository.PostRepositoryImpl
import com.dubaiza.domain.usecase.GetPostsUseCase
import com.dubaiza.feature_home.PostViewModel


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val api = RetrofitClient.apiService
        val repository = PostRepositoryImpl(api)
        val useCase = GetPostsUseCase(repository)
        val viewModel = PostViewModel(useCase)

//        setContent { PostScreen(viewModel) }

        setContent {
            CleanDemoTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    PostScreen(viewModel)
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    CleanDemoTheme {
        Greeting("Android")
    }
}