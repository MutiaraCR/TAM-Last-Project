package com.mukti.projekakhir

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.mukti.projekakhir.ui.theme.ProjekakhirTheme

class nostalgic : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ProjekakhirTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Success(Modifier)
                }
            }
        }
    }
}

@Composable
fun Success(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .requiredWidth(width = 360.dp)
            .requiredHeight(height = 800.dp)
            .background(color = Color(0xffedf0f5))
    ) {
        Text(
            text = "Transaction Successful",
            color = Color(0xff081f5c),
            textAlign = TextAlign.Center,
            style = androidx.compose.ui.text.TextStyle(
                fontSize = 32.sp,
                fontWeight = FontWeight.Bold
            ),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 37.dp,
                    y = 216.dp)
                .requiredWidth(width = 285.dp))
        Image(
            painter = painterResource(id = R.drawable.shield_tick),
            contentDescription = "Shield tick",
            modifier = Modifier
                .fillMaxSize()
                .padding(start = 117.dp,
                    end = 123.dp,
                    top = 329.dp,
                    bottom = 351.dp))
        Property5Default()
    }
}

@Composable
fun Property5Default(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .fillMaxSize()
            .padding(start = 52.dp, end = 53.dp, top = 600.dp, bottom = 48.dp)
    )  {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(60.dp)
                .clip(shape = RoundedCornerShape(30.dp))
                .background(color = Color(0xff081f5c)),
            contentAlignment = Alignment.Center
        ){
            Text(
                text = "Back To Home",
                color = Color(0xffedf0f5),
                textAlign = TextAlign.Center,
                style = androidx.compose.ui.text.TextStyle(
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold
                )
            )
        }

    }
}

@Preview(widthDp = 360, heightDp = 800)
@Composable
private fun SuccessPreview() {
    Success(Modifier)
}