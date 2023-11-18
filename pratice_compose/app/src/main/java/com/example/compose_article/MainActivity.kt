package com.example.compose_article

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.compose_article.ui.theme.Compose_articleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Compose_articleTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    MainContentCard()
                }
            }
        }
    }

}

@Composable
fun ImageCard(imageResouce: Int, modifier: Modifier = Modifier) {
    Image(painter = painterResource(id = imageResouce), contentDescription = null)
}

@Composable
fun ContentCard(
    title: String,
    firstParagraf: String,
    secondParagraf: String,
    modifier: Modifier = Modifier
) {
    Column(modifier = modifier) {
        Text(text = title, fontSize = 24.sp)
        Text(text = firstParagraf)
        Text(text = secondParagraf)

    }

}

@Composable
fun MainContentCard(modifier: Modifier = Modifier) {
    Column {
        ImageCard(imageResouce = R.drawable.bg_compose_background)
        ContentCard(
            title = stringResource(id = R.string.title),
            firstParagraf = stringResource(id = R.string.p1),
            secondParagraf = stringResource(
                id = R.string.p2
            ),
            modifier = Modifier.fillMaxSize().padding(all = 16.dp)
        )
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    Compose_articleTheme {
        MainContentCard()
    }
}