package com.example.walktheme

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.walktheme.ui.theme.WalkThemeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            WalkThemeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    MyTheme()
                }
            }
        }
    }
}

@Composable
fun MyTheme() {
    val appmodifier = Modifier
        .fillMaxWidth()
        .padding(8.dp)
    Column(
        verticalArrangement = Arrangement.spacedBy(30.dp)
    ) {
        Text(
            text = "My Title",
            style = MaterialTheme.typography.headlineLarge,
            modifier = appmodifier
        )
        OutlinedTextField(
            value = "",
            onValueChange = {},
            modifier = appmodifier
        )
        Button(
            onClick = { /*TODO*/ },
            modifier = Modifier
                .fillMaxWidth()
                .padding(9.dp),
            shape = RoundedCornerShape(topStart = 10.dp, bottomEnd = 10.dp),
        ) {
            Text(text = "Submit")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    WalkThemeTheme {
        MyTheme()
    }
}