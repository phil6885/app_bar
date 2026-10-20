@file:OptIn(ExperimentalMaterial3Api::class)

package com.hongphil.topappbar

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.hongphil.topappbar.ui.theme.TopAppBarTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TopAppBarTheme {
                Scaffold(
                    modifier = Modifier.fillMaxSize(),
                    topBar = {
                        TopAppBar(
                            navigationIcon = {
                                IconButton(
                                    onClick = { })
                                {
                                    Icon(Icons.Filled.Menu, contentDescription = null)
                                }
                            },
                            title = {
                                Column {
                                    Text(
                                        text = stringResource(R.string.appbar_title),
                                        color = Color.White,
                                        fontSize = 20.sp
                                    )
                                    Text(text = "Subtitle", color = Color.White, fontSize = 16.sp)
                                }
                            },
                            actions = {
                                IconButton(onClick = { }) {
                                    Icon(Icons.Filled.Share, contentDescription = "Share Icon")
                                }

                                IconButton(onClick = { }) {
                                    Icon(Icons.Filled.Search, contentDescription = "Search Icon")
                                }

                                IconButton(onClick = { }) {
                                    Icon(Icons.Filled.MoreVert, contentDescription = "More Icon")
                                }

                            },
                            colors = TopAppBarDefaults.topAppBarColors(
                                containerColor = colorResource(
                                    R.color.purple_700
                                ),
                                actionIconContentColor = Color.White,
                                navigationIconContentColor = Color.White
                            )
                        )

                    }) { innerPadding ->
                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(innerPadding),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center
                    ) {
                        Text("Hello World")

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
fun GreetingPreview() {
    TopAppBarTheme {
        Greeting("Android")
    }
}

@Preview(showBackground = true)
@Composable
fun TopAppBarPreview() {
    TopAppBar(
        navigationIcon = {
            IconButton(
                onClick = { })
            {
                Icon(Icons.Filled.Menu, contentDescription = null)
            }
        },
        title = {
            Column {
                Text(
                    text = stringResource(R.string.appbar_title),
                    color = Color.White,
                    fontSize = 20.sp
                )
                Text(text = "Subtitle", color = Color.White, fontSize = 16.sp)
            }
        },
        actions = {
            IconButton(onClick = { }) {
                Icon(Icons.Filled.Share, contentDescription = "Share Icon")
            }

            IconButton(onClick = { }) {
                Icon(Icons.Filled.Search, contentDescription = "Search Icon")
            }

            IconButton(onClick = { }) {
                Icon(Icons.Filled.MoreVert, contentDescription = "More Icon")
            }

        },
        colors = TopAppBarDefaults.topAppBarColors(containerColor = colorResource(R.color.purple_700))
    )
}