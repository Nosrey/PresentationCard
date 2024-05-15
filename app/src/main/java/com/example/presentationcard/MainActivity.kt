package com.example.presentationcard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
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
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.presentationcard.ui.theme.PresentationCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PresentationCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background
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
        // pongo de fondo el color #f2f5f3
        modifier = modifier.background(Color(0xFFF2F5F3)),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceBetween,
    ) {
        Spacer(Modifier.weight(0.5f))
        PresentationHeader()
        Spacer(Modifier.weight(0.5f))
        PresentationFooter()
    }
}

@Composable
fun PresentationHeader(modifier: Modifier = Modifier) {
    Column(modifier = modifier.padding(top = 32.dp)) {
        val image = painterResource(id = R.drawable.android_icon)
        Image(
            painter = image, contentDescription = "Android Icon",
            // width del 30% del ancho de la pantalla
            modifier = Modifier
                .fillMaxWidth(0.3f)
                .padding(top = 2.dp, bottom = 2.dp, start = 0.dp, end = 0.dp)
                .align(Alignment.CenterHorizontally)
        )
        Text(
            text = "Yerson Rico",
            modifier = modifier.align(Alignment.CenterHorizontally),
            fontSize = 40.sp,
            fontWeight = FontWeight.Bold
        )
        Text(
            text = "Android Developer",
            modifier = modifier.align(Alignment.CenterHorizontally),
            fontSize = 20.sp,
            textAlign = TextAlign.Center,
            // el color del texto debe ser: #071f00
            color = Color(0xFF071F00)
        )
    }
}

@Composable
fun PresentationFooter(modifier: Modifier = Modifier) {
    Column(modifier = modifier.padding(bottom = 32.dp).fillMaxWidth(0.6f)) {
        val phoneIcon = painterResource(R.drawable.phone_icon)
        val emailIcon = painterResource(R.drawable.email_icon)
        val socialIcon = painterResource(R.drawable.social_icon)

        Row(modifier = modifier.fillMaxWidth().padding(bottom = 8.dp), horizontalArrangement = Arrangement.Start) {
            Icon(
                painter = phoneIcon,
                contentDescription = "Phone Icon",
                tint = Color.Black,
                modifier = Modifier
                    .width(32.dp)
                    .align(Alignment.CenterVertically)
                    .padding(end = 12.dp)
            )
            Text(
                text = "+58 412 541 0165",
                modifier = Modifier.align(Alignment.CenterVertically),
                fontSize = 18.sp
            )
        }
        Row(modifier = modifier.fillMaxWidth().padding(bottom = 8.dp), horizontalArrangement = Arrangement.Start) {
            Icon(
                painter = emailIcon,
                contentDescription = "Email Icon",
                tint = Color.Black,
                modifier = Modifier
                    .width(32.dp)
                    .align(Alignment.CenterVertically)
                    .padding(end = 12.dp)
            )
            Text(
                text = "nosrey135@gmail.com",
                modifier = Modifier.align(Alignment.CenterVertically),
                fontSize = 18.sp
            )
        }
        Row(modifier = modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Start) {
            Icon(
                painter = socialIcon,
                contentDescription = "Social Icon",
                tint = Color.Black,
                modifier = Modifier
                    .width(32.dp)
                    .align(Alignment.CenterVertically)
                    .padding(end = 12.dp)
            )
            Text(
                text = "@YersonRicoDev",
                modifier = Modifier.align(Alignment.CenterVertically),
                fontSize = 18.sp
            )
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