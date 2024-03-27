package com.example.p7_menus

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AddCircle
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.p7_menus.ui.theme.P7menusTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            P7menusTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    MainScreen()
                }
            }
        }
    }
}

@Composable
fun MainScreen() {
    var isConExp by remember {
        mutableStateOf(false)
    }
    var isAppExp by remember {
        mutableStateOf(false)
    }

    Column(modifier = Modifier
        .fillMaxSize()
        .background(Color.Black)) {

    Row(modifier = Modifier
        .fillMaxWidth()
        .background(Color.Black)
        .padding(5.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween) {
        IconButton(onClick = { isConExp = true }) {
            androidx.compose.material3.Icon(imageVector = Icons.Filled.Menu, contentDescription = "context", tint = Color.White)
        }
        IconButton(onClick = { /*TODO*/ }) {
            androidx.compose.material3.Icon(imageVector = Icons.Filled.MoreVert, contentDescription = "app bar", tint = Color.White)
        }
    }
    Column(modifier = Modifier
        .fillMaxSize()
        .background(Color.Black),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally) {

        IconButton(onClick = { isAppExp = true }) {
        androidx.compose.material3.Icon(imageVector = Icons.Filled.AddCircle, contentDescription = "pop up", tint = Color.White,
            modifier = Modifier.size(90.dp))
        }

    }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    P7menusTheme {
        MainScreen()
    }
}