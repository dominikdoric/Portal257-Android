package com.doric.portal257.application

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import com.doric.portal257.presentation.theme.Portal257Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Portal257Theme {

                val scaffoldState = rememberScaffoldState()
                Scaffold(
                    scaffoldState = scaffoldState,
                    topBar = {
                        TopAppBar(
                            title = { Text(text = "Portal 257") },
                            navigationIcon = {
                                IconButton(onClick = { /* Open navigation drawer */ }) {
                                    Icon(
                                        imageVector = Icons.Default.Menu,
                                        contentDescription = ""
                                    )
                                }
                            }
                        )
                    },
                    content = {}
                )
            }
        }
    }
}
