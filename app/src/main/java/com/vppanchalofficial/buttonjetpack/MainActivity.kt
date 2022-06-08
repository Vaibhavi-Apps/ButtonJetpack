package com.vppanchalofficial.buttonjetpack

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import com.vppanchalofficial.buttonjetpack.ui.theme.ButtonJetpackTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ButtonJetpackTheme {
                // A surface container using the 'background' color from the theme
               CreateCircle()
            }
        }
    }


}

@Composable
fun CreateCircle() {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = Color.LightGray
    ) {
        Card(
            modifier = Modifier
                .width(80.dp).height(30.dp)
                .padding(10.dp),
            shape = CircleShape
        ) {
            Box(contentAlignment = Alignment.Center) {
                Text(text = "Hello", color = Color.Black)
            }
        }
    }
}
@Composable
fun Greeting(name: String) {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = Color.LightGray
    ) {
     Text( text = "Hello", color = Color.White)
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ButtonJetpackTheme {
        //Greeting("Android")
        CreateCircle()
    }
}