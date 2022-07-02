package com.vppanchalofficial.buttonjetpack

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Card
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight.Companion.Bold
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.vppanchalofficial.buttonjetpack.ui.theme.ButtonJetpackTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ButtonJetpackTheme {
                // A surface container using the 'background' color from the theme
               MainView()
            }
        }
    }


}

@Composable
fun MainView() {
    var counter by remember {
        mutableStateOf(0)
    }
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = Color.LightGray
    ) {
        Column(verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally) {
            Text( text = "$counter", style = TextStyle(color = Color.White,
                fontSize = 20.sp,
                fontWeight = Bold),
                color = Color.White)
            Spacer(modifier = Modifier.size(40.dp))
            CreateButton(counter){ newValue->
                counter = newValue
            }
        }
    }
}

@Composable
private fun CreateButton( counter: Int, updateCounter: (Int)-> Unit) {

    Card(
        modifier = Modifier
            .size(120.dp)
            .padding(10.dp)
            .clickable { updateCounter(counter+1) },
        shape = CircleShape
    ) {
        Box(contentAlignment = Alignment.Center) {
            Text(text = "Tap", color = Color.Black)
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
        MainView()
    }
}