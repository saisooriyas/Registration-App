package com.saiso.bond007

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.saiso.bond007.ui.theme.Bond007Theme

class MainPage: ComponentActivity() {
    override fun onCreate(SavedInstanceState: Bundle?) {
        super.onCreate(SavedInstanceState)
        setContent {
            Bond007Theme {
                MainPageUI(
                    name = "Sai",
                    modifier = Modifier
                )
            }
        }
    }
}

@Composable
fun MainPageUI(name: String, modifier: Modifier) {
    Column {
        Text(text = "Hello $name")
    }
}