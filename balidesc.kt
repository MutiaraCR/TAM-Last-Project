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
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
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
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.mukti.projekakhir.ui.theme.ProjekakhirTheme
import java.time.format.TextStyle

class balidesc : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ProjekakhirTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    val navController = rememberNavController()
                    NavHost(navController, startDestination = "balidesc") {
                        composable("balidesc") { balidesc(navController) }
                        composable("success") { Success() }
                    }
                }
            }
        }
    }
}

@Composable
fun balidesc(navController: NavController, modifier: Modifier = Modifier) {
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
            painter = painterResource(id = R.drawable.balii),
            contentDescription = "nstalgia",
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
                text = "Bali And People",
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
                text = "I Gede Ketut Dewana",
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
            text = "Rp1.500.000",
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
            text = "Lukisan Bali and People karya I Gede Ketut Dewana menggambarkan kehidupan sehari-hari masyarakat Bali di tengah sawah dengan keindahan yang khas. Latar belakangnya menampilkan pemandangan sawah yang hijau dan subur, di mana para petani sibuk dengan berbagai aktivitas seperti menanam padi, membajak sawah dengan kerbau, dan memanen hasil bumi.",
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

        Property2Default(
            navController = navController,
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 121.dp, y = 677.dp)
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
fun Property2Default(navController: NavController, modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .requiredWidth(116.dp)
            .requiredHeight(32.dp)
    ) {
        Button(
            onClick = { navController.navigate("success") },
            modifier = Modifier
                .fillMaxSize()
                .clip(RoundedCornerShape(30.dp)),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xff081f5c)
            )
        ) {
            Text(
                text = "Buy",
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
private fun balidescPreview() {
    balidesc(rememberNavController())
}

@Preview(widthDp = 360, heightDp = 800)
@Composable
private fun successPreview() {
    Success()
}