package com.example.presentationcard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import com.example.presentationcard.ui.theme.PresentationCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PresentationCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Presentation()
                }
            }
        }
    }
}

@Composable
fun Presentation(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        PresentationHeader()
        PresentationFooter()
    }
}

@Composable
fun PresentationHeader(modifier: Modifier = Modifier) {
    Text(
        text = "Yerson Rico",
        modifier = modifier,
        textAlign = TextAlign.Center,
    )
    val image = painterResource(id = R.drawable.android_icon)
    Image(
        painter = image,
        contentDescription = "Android Icon",
        // width del 30% del ancho de la pantalla
        modifier = Modifier.fillMaxWidth(0.3f)
    )
    Text(
        text = "Android Developer",
        modifier = modifier
    )
}

@Composable
fun PresentationFooter(modifier: Modifier = Modifier) {
    Column {
        val phoneIcon = painterResource(R.drawable.phone_icon)
        val emailIcon = painterResource(R.drawable.email_icon)
        val socialIcon = painterResource(R.drawable.social_icon)

        Row {
            Icon(
                painter = phoneIcon,
                contentDescription = "Phone Icon",
                tint = Color.Black,
                modifier = Modifier.fillMaxWidth(0.07f)
            )
            Text(text = "+58 412 541 0165")
        }
        Row {
            Icon(
                painter = emailIcon,
                contentDescription = "Email Icon",
                tint = Color.Black,
                modifier = Modifier.fillMaxWidth(0.06f)
            )
            Text(text = "nosrey135@gmail.com")
        }
        Row {
            Icon(
                painter = socialIcon,
                contentDescription = "Social Icon",
                tint = Color.Black,
                modifier = Modifier.fillMaxWidth(0.07f)
            )
            Text(text = "@YersonRicoDev")
        }

    }
}

@Preview(showBackground = true)
@Composable
fun PresentationPreview() {
    PresentationCardTheme {
        Presentation()
    }
}