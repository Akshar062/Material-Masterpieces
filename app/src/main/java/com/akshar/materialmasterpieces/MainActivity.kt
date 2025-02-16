package com.akshar.materialmasterpieces

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import com.akshar.materialmasterpieces.ui.theme.MaterialMasterpiecesTheme
import com.akshar.materialmasterpieces.ui.widgets.GlassmorphicBottomNavigation
import dev.chrisbanes.haze.HazeState

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

    val context = LocalContext.current

    Scaffold(
        bottomBar = {
            GlassmorphicBottomNavigation(
                selectedTabIndex = 0,
                onTabSelected = {
                    Toast.makeText(

                        context,
                        "Tab $it selected",
                        Toast.LENGTH_SHORT
                    ).show()
                },
            )
        },
        modifier = Modifier.fillMaxSize()
    ) { innerPadding ->

    }
}

@Preview
@Composable
private fun MainScreenPreview() {
    MaterialMasterpiecesTheme {
        MainScreen()
    }
}