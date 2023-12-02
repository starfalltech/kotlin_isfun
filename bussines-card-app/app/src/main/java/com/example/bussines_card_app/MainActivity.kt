package com.example.bussines_card_app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.sharp.AccountBox
import androidx.compose.material.icons.sharp.Email
import androidx.compose.material.icons.sharp.Phone
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.bussines_card_app.ui.theme.BussinescardappTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BussinescardappTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ComposablePersonCardBussines()
                }
            }
        }
    }
}

@Composable
fun ComposablePersonDesc(name: String, title: String, modifier: Modifier = Modifier) {
    Column(
        modifier = modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Icon(
            painter = painterResource(id = R.drawable.ic_launcher_foreground),
            contentDescription = null
        )
        Text(text = name, fontSize = 24.sp, fontWeight = FontWeight.Bold)
        Text(text = title, fontWeight = FontWeight.Bold)
    }
}

@Composable
fun ComposablePersonContact(
    number: String,
    sosialMedia: String,
    email: String,
    modifier: Modifier = Modifier
) {
    Column(

    ) {
        Row(modifier = Modifier.padding(bottom = 10.dp)) {
            Icon(Icons.Sharp.Phone, contentDescription = null)
            Text(text = number, modifier = Modifier.padding(start = 6.dp))
        }
        Row(
            modifier = Modifier.padding(bottom = 10.dp),
        ) {
            Icon(Icons.Sharp.AccountBox, contentDescription = null)
            Text(text = sosialMedia, modifier = Modifier.padding(start = 6.dp))
        }
        Row(modifier = Modifier.padding(bottom = 16.dp)) {
            Icon(Icons.Sharp.Email, contentDescription = null)
            Text(text = email, modifier = Modifier.padding(start = 6.dp))
        }
    }
}

@Composable
fun ComposablePersonCardBussines() {
    Column(Modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally) {
        ComposablePersonDesc(
            name = "Yanuar",
            title = "Android Developer",
            modifier = Modifier.weight(2f)
        )
        ComposablePersonContact(
            number = "+62 (08) 88111111",
            sosialMedia = "@yanuardev",
            email = "yanuarnauval@yahoo.com",
            modifier = Modifier
                .weight(1f)
        )
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    ComposablePersonCardBussines()
}