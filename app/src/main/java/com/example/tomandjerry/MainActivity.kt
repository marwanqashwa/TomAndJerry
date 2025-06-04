package com.example.tomandjerry

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.tomandjerry.screens.JerryStore
import com.example.tomandjerry.screens.TomAccount
import com.example.tomandjerry.screens.TomKitchen
import com.example.tomandjerry.ui.theme.TomAndJerryTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TomAndJerryTheme {
              TomKitchen()
            }
        }
    }
}

@Preview
@Composable
fun PrevText() {
    JerryStore()
}


