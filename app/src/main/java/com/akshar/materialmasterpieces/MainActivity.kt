package com.akshar.materialmasterpieces

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.akshar.materialmasterpieces.ui.theme.MaterialMasterpiecesTheme
import com.akshar.materialmasterpieces.ui.widgets.GlassmorphicBottomNavigation

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MaterialMasterpiecesTheme {
                MainScreen()
            }
        }
    }
}

@Composable
fun MainScreen() {

    val selectedTab = remember { mutableIntStateOf(0) }

    Scaffold(
        bottomBar = {
            GlassmorphicBottomNavigation{
                selectedTab.intValue = it
            }
        },
        modifier = Modifier.fillMaxSize()
    ) { innerPadding ->
        Text(
            text = "Selected Tab: ${selectedTab.intValue}",
            modifier = Modifier.padding(innerPadding)
        )
    }
}

@Preview
@Composable
private fun MainScreenPreview() {
    MaterialMasterpiecesTheme {
        MainScreen()
    }
}