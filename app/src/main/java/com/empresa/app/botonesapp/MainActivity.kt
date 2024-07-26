package com.empresa.app.botonesapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.empresa.app.botonesapp.ui.theme.BotonesAppTheme
import com.empresa.app.botonesapp.components.*;


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {

            val darkMode = remember {

                mutableStateOf(false)

            }

            BotonesAppTheme(
                darkTheme = darkMode.value

            ) {

                Scaffold(modifier = Modifier.fillMaxSize()) {
                    Content(darkMode = darkMode)
                }
            }
        }
    }
}

@Preview
@Composable
fun Content(darkMode: MutableState<Boolean>) {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .wrapContentSize(Alignment.Center),
        horizontalAlignment = Alignment.CenterHorizontally

    ) {

        BotonNormal()
        Space()
        BotonNormal2()
        Space()
        BotonTexto()
        Space()
        BotonOutLine()
        Space()
        BotonIcon()
        Space()
        BotonSwitch()
        Space()
        DarkMode()
        Space()
        FloatingAction()
        Space()
        DarkMode_2(darkMode)

    }

}


