package com.example.mytestapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.mytestapp.ui.theme.MyTestAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyTestAppTheme {
                MyFun()
            }
        }
    }
}

@Composable 
fun MyFun(){
    Column (
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = R.drawable.r), contentDescription = "White tiger",
            modifier = Modifier
                .size(100.dp)
                .clip(CircleShape)
                .border(width = 2.dp, color = Color.Magenta, shape = CircleShape),
            contentScale = ContentScale.Crop
        )
        Text(text = "IceTiger")
        Text(text = "google")
        Text(text = "snapchat")
        Row (modifier = Modifier.fillMaxWidth().padding(16.dp),
            horizontalArrangement = Arrangement.Absolute.SpaceAround){
            ProfileState("Post", "67")
            ProfileState("Following", "202")
            ProfileState("Followers", "10k")
        }
    }
}

@Composable
fun ProfileState(cont: String, text: String){
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Text(text = text, fontWeight = FontWeight.Bold)
        Text(text = cont)
    }
}

//@Preview(showBackground = true)
//@Composable
//fun DefaultPreview() {
//    MyTestAppTheme {
//        MyFun()
//    }
//}
