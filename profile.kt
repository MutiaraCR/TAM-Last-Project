package com.example.projekakhir

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredSize
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.mukti.projekakhir.ui.theme.ProjekakhirTheme
import com.mukti.projekakhir.R

class home : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ProjekakhirTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ProfilPage()
                }
            }
        }
    }
}

@Composable
fun ProfilPage(modifier: Modifier = Modifier) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color(0xffedf0f5))
    ) {
        Column(
            modifier = Modifier
                .padding(20.dp)
                .fillMaxSize()
        ) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Image(
                    painter = painterResource(id = R.drawable.backpage),
                    contentDescription = "Back",
                    colorFilter = ColorFilter.tint(Color(0xff081f5c)),
                    modifier = Modifier
                        .size(40.dp)
                )
                Text(
                    text = "Profile",
                    color = Color(0xff081f5c),
                    style = TextStyle(
                        fontSize = 24.sp,
                        fontWeight = FontWeight.Bold
                    ),
                    modifier = Modifier.padding(start = 8.dp)
                )
            }

            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 16.dp),
                contentAlignment = Alignment.Center
            ) {
                Image(
                    painter = painterResource(id = R.drawable.ellipse),
                    contentDescription = "Profile Picture",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .size(100.dp)
                        .clip(CircleShape)
                        .border(BorderStroke(2.dp, Color(0xff081f5c)), CircleShape)
                )
            }

            ProfileField(label = "Full Name:", value = "Elzafran")
            ProfileField(label = "Address", value = "St. Maju Mundur")
            ProfileField(label = "Work E-mail", value = "bellthreex@mail.com")
            ProfileField(label = "Description", value = "User description will be available in these lines!")

            Spacer(modifier = Modifier.weight(1f))
        }
        Box(
            modifier = modifier
                .requiredWidth(360.dp)
                .requiredHeight(65.dp)
                .align(Alignment.BottomStart)
                .background(Color(0xffedf0f5))
        ) {
            Image(
                painter = painterResource(id = R.drawable.homeee),
                contentDescription = "Group",
                modifier = Modifier
                    .align(Alignment.CenterStart)
                    .padding(start = 50.dp)
                    .requiredSize(45.dp)
            )
            Image(
                painter = painterResource(id = R.drawable.store),
                contentDescription = "Group",
                modifier = Modifier
                    .align(Alignment.Center)
                    .requiredSize(45.dp)
            )
            Image(
                painter = painterResource(id = R.drawable.profil),
                contentDescription = "Group",
                modifier = Modifier
                    .align(Alignment.CenterEnd)
                    .padding(end = 50.dp)
                    .requiredSize(45.dp)
            )
        }
    }
}

@Composable
fun ProfileField(label: String, value: String) {
    Column(
        modifier = Modifier
            .padding(top = 16.dp)
            .fillMaxWidth()
            .border(BorderStroke(2.dp, Color(0xff081f5c)), shape = RoundedCornerShape(10.dp))
            .padding(8.dp)
    ) {
        Text(
            text = label,
            color = Color(0xff081f5c),
            style = TextStyle(
                fontSize = 16.sp,
                fontWeight = FontWeight.Medium
            )
        )
        Text(
            text = value,
            color = Color(0xff081f5c),
            style = TextStyle(
                fontSize = 16.sp,
                fontWeight = FontWeight.Light
            ),
            modifier = Modifier.padding(top = 4.dp)
        )
    }
}

@Preview(widthDp = 360, heightDp = 800)
@Composable
private fun ProfilPagePreview() {
    ProjekakhirTheme {
        ProfilPage()
    }
}
