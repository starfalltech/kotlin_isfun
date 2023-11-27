package com.example.compose_quadrant

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScopeInstance.weight
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.compose_quadrant.ui.theme.ComposequadrantTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposequadrantTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun CardItemRow(title: String, desc: String, color: Color, modifier: Modifier) {
    Box(
        modifier = modifier
            .background(color = color)
            .fillMaxSize()
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            Arrangement.Center,
            Alignment.CenterHorizontally
        ) {
            Text(text = title, fontWeight = FontWeight.Bold)
            Text(text = desc,)
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Column(modifier = Modifier
        .fillMaxHeight()
        .fillMaxWidth()) {
        Row (modifier = Modifier.weight(2f)){
            CardItemRow(
                title = "Text composable",
                desc = "Displays text and follows the recommended Material Design guidelines.",
                color = Color(0xFFEADDFF),
                modifier = Modifier.weight(2f)
            )
            CardItemRow(
                title = "Text composable",
                desc = "Displays text and follows the recommended Material Design guidelines.",
                color = Color(0xFFEADDFF),
                modifier = Modifier.weight(2f)
            )
        }
        Row (modifier = Modifier.weight(2f)){
            CardItemRow(
                title = "Text composable",
                desc = "Displays text and follows the recommended Material Design guidelines.",
                color = Color(0xFFEADDFF),
                modifier = Modifier.weight(2f)
            )
            CardItemRow(
                title = "Text composable",
                desc = "Displays text and follows the recommended Material Design guidelines.",
                color = Color(0xFFEADDFF),
                modifier = Modifier.weight(2f)
            )
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    ComposequadrantTheme {
        Greeting("Android")
    }
}