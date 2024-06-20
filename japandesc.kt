package com.mukti.projekakhir

import android.os.Build
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.RequiresApi
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.mukti.projekakhir.ui.theme.ProjekakhirTheme
import java.time.format.TextStyle

class japandesc : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ProjekakhirTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Store7()
                }
            }
        }
    }
}

@Composable
fun Store7(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .requiredWidth(width = 360.dp)
            .requiredHeight(height = 800.dp)
            .background(color = Color(0xffedf0f5))
    ) {
        Box(
            modifier = Modifier
                .requiredWidth(width = 360.dp)
                .requiredHeight(height = 379.dp)
                .background(color = Color(0xfffcfcfc)))
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(
                    x = (-1).dp,
                    y = 388.dp
                )
                .requiredWidth(width = 360.dp)
                .requiredHeight(height = 337.dp)
                .background(color = Color(0xfffcfcfc)))
        Image(
            painter = painterResource(id = R.drawable.rectangle_3249),
            contentDescription = "Rectangle 3249",
            modifier = Modifier
                .requiredWidth(width = 360.dp)
                .requiredHeight(height = 269.dp)
                .scale(1.5f)
                .padding(bottom = 29.dp))
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(
                    x = 23.dp,
                    y = 33.dp
                )
                .requiredSize(size = 40.dp)
        ) {
            Box(
                modifier = Modifier
                    .requiredSize(size = 40.dp)
                    .clip(shape = RoundedCornerShape(20.dp))
                    .background(color = Color(0xffedf0f5))
                    .border(
                        border = BorderStroke(2.dp, Color(0xff081f5c)),
                        shape = RoundedCornerShape(20.dp)
                    ))
            Image(
                painter = painterResource(id = R.drawable.line),
                contentDescription = "Line",
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(
                        x = 10.666557312011719.dp,
                        y = 1.5555419921875.dp
                    )
                    .requiredWidth(width = 18.dp)
                    .size(40.dp))
        }
        Column(
            verticalArrangement = Arrangement.spacedBy(10.dp, Alignment.Top),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(
                    x = 16.dp,
                    y = 302.dp
                )
        ) {
            Text(
                text = "Japan In Vision",
                color = Color(0xff101010),
                textAlign = TextAlign.Center,
                style = androidx.compose.ui.text.TextStyle(
                    fontSize = 24.sp,
                    fontWeight = FontWeight.Medium,
                    letterSpacing = (-0.28).sp
                ),
                modifier = Modifier
                    .wrapContentHeight(align = Alignment.CenterVertically))
            Text(
                text = "Maulana Malik",
                color = Color(0xff101010),
                textAlign = TextAlign.Center,
                style = androidx.compose.ui.text.TextStyle(
                    fontSize = 16.sp,
                    letterSpacing = (-0.28).sp
                ),
                modifier = Modifier
                    .wrapContentHeight(align = Alignment.CenterVertically))
        }
        Text(
            text = "Rp1.000.000",
            color = Color(0xff101010),
            textAlign = TextAlign.Center,
            style = androidx.compose.ui.text.TextStyle(
                fontSize = 15.sp,
                fontWeight = FontWeight.Light,
                letterSpacing = (-0.28).sp
            ),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(
                    x = 266.dp,
                    y = 355.dp
                )
                .wrapContentHeight(align = Alignment.CenterVertically))
        Text(
            text = "Japan In Vision Adalah Sebuah Lukisan Karya Maulana Malik, Seorang Seniman Berbakat Asal Wonosobo, Indonesia. Dalam Karyanya Ini, Maulana Menggambarkan Kecintaannya Yang Mendalam Terhadap Budaya Jepang. Lukisan Ini Menampilkan Pemandangan Yang Indah Dan Kaya Akan Elemen-elemen Khas Jepang, Seperti Bunga Sakura Yang Mekar, Kuil-kuil Tradisional, Serta Pegunungan Yang Megah.",
            color = Color.Black,
            style = androidx.compose.ui.text.TextStyle(
                fontSize = 15.sp,
                fontWeight = FontWeight.Light,
                letterSpacing = (-0.28).sp
            ),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(
                    x = 17.dp,
                    y = 455.dp
                )
                .requiredWidth(width = 303.dp)
                .wrapContentHeight(align = Alignment.CenterVertically))
        Text(
            text = "Description",
            color = Color(0xff101010),
            textAlign = TextAlign.Center,
            style = androidx.compose.ui.text.TextStyle(
                fontSize = 15.sp,
                fontWeight = FontWeight.Medium,
                letterSpacing = (-0.28).sp
            ),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(
                    x = 16.dp,
                    y = 416.dp
                )
                .wrapContentHeight(align = Alignment.CenterVertically))
        Property1Default(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(
                    x = 121.dp,
                    y = 677.dp
                )
        )
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
                painter = painterResource(id = R.drawable.group),
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
fun Property1Default(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .requiredWidth(width = 116.dp)
            .requiredHeight(height = 32.dp)
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .clip(shape = RoundedCornerShape(30.dp))
                .background(color = Color(0xff081f5c)))
        Text(
            text = "Buy",
            color = Color(0xffedf0f5),
            textAlign = TextAlign.Center,
            style = androidx.compose.ui.text.TextStyle(
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold
            ),
            modifier = Modifier
                .fillMaxSize()
                .wrapContentHeight(align = Alignment.CenterVertically))
    }
}

@Preview(widthDp = 360, heightDp = 800)
@Composable
private fun Store7Preview() {
    Store7(Modifier)
}