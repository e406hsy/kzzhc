package com.e406hsy.kzzhc

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.absoluteOffset
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.currentCompositionLocalContext
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.e406hsy.kzzhc.ui.theme.KzzhcTheme
import java.time.Duration

class MainActivity : ComponentActivity() {
    private lateinit var navController: NavController
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            KzzhcTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Column(
                        Modifier
                            .padding(all = 8.dp)
                            .fillMaxSize()) {
                        Row (Modifier.fillMaxWidth()) {
                            Text(text = "Kzzhc")
                            Button(onClick = {
                                Toast.makeText(applicationContext, "", Toast.LENGTH_SHORT).show()
                            }) {
                                Text(text = "Setting")
                            }

                        }
                        Column {
                            Button(onClick = {
                            }) {
                                Text(text = "to view")
                            }
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    KzzhcTheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
            Column(
                Modifier
                    .padding(all = 8.dp)
                    .fillMaxSize()) {
                Row (Modifier.fillMaxWidth()) {
                    Text(text = "Kzzhc")
                    Button(onClick = {
                           }) {
                        Text(text = "Setting")
                    }

                }
                Column {
                    Greeting("Android")
                }
            }
        }
    }
}