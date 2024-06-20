package com.example.galery

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredSize
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.galery.ui.theme.GaleryTheme

class LocalArtistActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GaleryTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    LocalArtist()
                }
            }
        }
    }
}

@Composable
fun LocalArtist(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .requiredWidth(width = 360.dp)
            .requiredHeight(height = 800.dp)
            .clip(shape = RoundedCornerShape(50.dp))
            .background(color = Color(0xffedf0f5))
    ) {
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 37.dp,
                    y = 48.dp)
                .requiredWidth(width = 148.dp)
                .requiredHeight(height = 40.dp)
        ) {
            Text(
                text = "Explore Arts",
                color = Color(0xff081f5c),
                style = TextStyle(
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold),
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 53.dp,
                        y = 12.dp))
            Image(
                painter = painterResource(id = R.drawable.back),
                contentDescription = "back",
                modifier = Modifier
                    .requiredSize(size = 40.dp))
        }
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 23.188232421875.dp,
                    y = 113.dp)
                .requiredWidth(width = 273.dp)
                .requiredHeight(height = 26.dp)
        ) {
            Text(
                text = "Local Artist",
                color = Color(0xff081f5c),
                textAlign = TextAlign.Center,
                style = TextStyle(
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold,
                    letterSpacing = (-0.28).sp),
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 27.811767578125.dp,
                        y = 0.dp)
                    .wrapContentHeight(align = Alignment.CenterVertically))
            Text(
                text = "Inter Artist",
                color = Color(0xff081f5c),
                textAlign = TextAlign.Center,
                style = TextStyle(
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold,
                    letterSpacing = (-0.28).sp),
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 191.62939453125.dp,
                        y = 0.dp)
                    .wrapContentHeight(align = Alignment.CenterVertically))
            Image(
                painter = painterResource(id = R.drawable.garis),
                contentDescription = "Line 6",
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 0.dp,
                        y = 26.dp)
                    .requiredWidth(width = 142.dp)
                    .border(border = BorderStroke(3.dp, Color(0xff081f5c))))
        }
        LazyColumn(
            verticalArrangement = Arrangement.spacedBy(20.dp, Alignment.Top),
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 32.dp,
                    y = 164.dp)
                .requiredWidth(width = 295.dp)
                .requiredHeight(height = 636.dp)
        ) {
            item {
                Box(
                    modifier = Modifier
                        .requiredWidth(width = 295.dp)
                        .requiredHeight(height = 225.dp)
                ) {
                    Box(
                        modifier = Modifier
                            .fillMaxSize()
                            .clip(shape = RoundedCornerShape(20.dp))
                            .border(border = BorderStroke(2.dp, Color(0xff081f5c)),
                                shape = RoundedCornerShape(20.dp)))
                    Box(
                        modifier = Modifier
                            .requiredWidth(width = 295.dp)
                            .requiredHeight(height = 213.dp)
                    ) {
                        Box(
                            modifier = Modifier
                                .requiredWidth(width = 295.dp)
                                .requiredHeight(height = 150.dp)
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.rectangle5),
                                contentDescription = "Rectangle",
                                modifier = Modifier
                                    .fillMaxSize()
                                    .clip(shape = RoundedCornerShape(topStart = 20.dp, topEnd = 20.dp))
                                    .border(border = BorderStroke(2.dp, Color(0xff9cabc2).copy(alpha = 0.35f)),
                                        shape = RoundedCornerShape(topStart = 20.dp, topEnd = 20.dp)))
                        }
                        Box(
                            modifier = Modifier
                                .align(alignment = Alignment.TopStart)
                                .offset(x = 20.dp,
                                    y = 173.dp)
                                .requiredWidth(width = 261.dp)
                                .requiredHeight(height = 40.dp)
                        ) {
                            Column(
                                verticalArrangement = Arrangement.spacedBy(5.dp, Alignment.Top),
                                modifier = Modifier
                                    .align(alignment = Alignment.TopStart)
                                    .offset(x = 0.dp,
                                        y = 2.dp)
                            ) {
                                Text(
                                    text = "Prosesi Ngaben",
                                    color = Color.Black,
                                    style = TextStyle(
                                        fontSize = 16.sp))
                                Text(
                                    text = "Artist : I Nyoman Ridi",
                                    color = Color.Black,
                                    style = TextStyle(
                                        fontSize = 12.sp))
                            }
                            Icon(
                                painter = painterResource(id = R.drawable.favorite),
                                contentDescription = "Favorite",
                                modifier = Modifier
                                    .align(alignment = Alignment.TopStart)
                                    .offset(x = 237.dp,
                                        y = 0.dp)
                                    .size(22.dp))
                        }
                    }
                }
            }
            item {
                Box(
                    modifier = Modifier
                        .requiredWidth(width = 295.dp)
                        .requiredHeight(height = 225.dp)
                ) {
                    Box(
                        modifier = Modifier
                            .fillMaxSize()
                            .clip(shape = RoundedCornerShape(20.dp))
                            .border(border = BorderStroke(2.dp, Color(0xff081f5c)),
                                shape = RoundedCornerShape(20.dp)))
                    Box(
                        modifier = Modifier
                            .requiredWidth(width = 295.dp)
                            .requiredHeight(height = 213.dp)
                    ) {
                        Box(
                            modifier = Modifier
                                .requiredWidth(width = 295.dp)
                                .requiredHeight(height = 150.dp)
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.rectangle6),
                                contentDescription = "Rectangle",
                                contentScale = ContentScale.Crop,
                                modifier = Modifier
                                    .fillMaxSize()
                                    .clip(shape = RoundedCornerShape(topStart = 20.dp, topEnd = 20.dp))
                                    .border(border = BorderStroke(2.dp, Color(0xff9cabc2).copy(alpha = 0.35f)),
                                        shape = RoundedCornerShape(topStart = 20.dp, topEnd = 20.dp)))
                        }
                        Box(
                            modifier = Modifier
                                .align(alignment = Alignment.TopStart)
                                .offset(x = 20.dp,
                                    y = 173.dp)
                                .requiredWidth(width = 261.dp)
                                .requiredHeight(height = 40.dp)
                        ) {
                            Column(
                                verticalArrangement = Arrangement.spacedBy(5.dp, Alignment.Top),
                                modifier = Modifier
                                    .align(alignment = Alignment.TopStart)
                                    .offset(x = 0.dp,
                                        y = 2.dp)
                            ) {
                                Text(
                                    text = "Gadis Jawa",
                                    color = Color.Black,
                                    style = TextStyle(
                                        fontSize = 16.sp))
                                Text(
                                    text = "Artist : Abraham Agus",
                                    color = Color.Black,
                                    style = TextStyle(
                                        fontSize = 12.sp))
                            }
                            Icon(
                                painter = painterResource(id = R.drawable.favorite),
                                contentDescription = "Favorite",
                                modifier = Modifier
                                    .align(alignment = Alignment.TopStart)
                                    .offset(x = 237.dp,
                                        y = 0.dp)
                                    .size(22.dp))
                        }
                    }
                }
            }
            item {
                Box(
                    modifier = Modifier
                        .requiredWidth(width = 295.dp)
                        .requiredHeight(height = 225.dp)
                ) {
                    Box(
                        modifier = Modifier
                            .fillMaxSize()
                            .clip(shape = RoundedCornerShape(20.dp))
                            .border(border = BorderStroke(2.dp, Color(0xff081f5c)),
                                shape = RoundedCornerShape(20.dp)))
                    Box(
                        modifier = Modifier
                            .requiredWidth(width = 295.dp)
                            .requiredHeight(height = 213.dp)
                    ) {
                        Box(
                            modifier = Modifier
                                .requiredWidth(width = 295.dp)
                                .requiredHeight(height = 150.dp)
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.rectangle7),
                                contentDescription = "Rectangle",
                                modifier = Modifier
                                    .fillMaxSize()
                                    .clip(shape = RoundedCornerShape(topStart = 20.dp, topEnd = 20.dp))
                                    .border(border = BorderStroke(2.dp, Color(0xff9cabc2).copy(alpha = 0.35f)),
                                        shape = RoundedCornerShape(topStart = 20.dp, topEnd = 20.dp)))
                        }
                        Box(
                            modifier = Modifier
                                .align(alignment = Alignment.TopStart)
                                .offset(x = 20.dp,
                                    y = 173.dp)
                                .requiredWidth(width = 261.dp)
                                .requiredHeight(height = 40.dp)
                        ) {
                            Column(
                                verticalArrangement = Arrangement.spacedBy(5.dp, Alignment.Top),
                                modifier = Modifier
                                    .align(alignment = Alignment.TopStart)
                                    .offset(x = 0.dp,
                                        y = 2.dp)
                            ) {
                                Text(
                                    text = "Tiga Anak Kucing",
                                    color = Color.Black,
                                    style = TextStyle(
                                        fontSize = 16.sp))
                                Text(
                                    text = "Artist : Popo Iskandar",
                                    color = Color.Black,
                                    style = TextStyle(
                                        fontSize = 12.sp))
                            }
                            Icon(
                                painter = painterResource(id = R.drawable.favorite),
                                contentDescription = "Favorite",
                                modifier = Modifier
                                    .align(alignment = Alignment.TopStart)
                                    .offset(x = 237.dp,
                                        y = 0.dp)
                                    .size(22.dp))
                        }
                    }
                }
            }
            item {
                Box(
                    modifier = Modifier
                        .requiredWidth(width = 295.dp)
                        .requiredHeight(height = 225.dp)
                ) {
                    Box(
                        modifier = Modifier
                            .fillMaxSize()
                            .clip(shape = RoundedCornerShape(20.dp))
                            .border(border = BorderStroke(2.dp, Color(0xff081f5c)),
                                shape = RoundedCornerShape(20.dp)))
                    Box(
                        modifier = Modifier
                            .requiredWidth(width = 295.dp)
                            .requiredHeight(height = 213.dp)
                    ) {
                        Box(
                            modifier = Modifier
                                .requiredWidth(width = 295.dp)
                                .requiredHeight(height = 150.dp)
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.rectangle8),
                                contentDescription = "Rectangle",
                                modifier = Modifier
                                    .fillMaxSize()
                                    .clip(shape = RoundedCornerShape(topStart = 20.dp, topEnd = 20.dp))
                                    .border(border = BorderStroke(2.dp, Color(0xff9cabc2).copy(alpha = 0.35f)),
                                        shape = RoundedCornerShape(topStart = 20.dp, topEnd = 20.dp)))
                        }
                        Box(
                            modifier = Modifier
                                .align(alignment = Alignment.TopStart)
                                .offset(x = 20.dp,
                                    y = 173.dp)
                                .requiredWidth(width = 261.dp)
                                .requiredHeight(height = 40.dp)
                        ) {
                            Column(
                                verticalArrangement = Arrangement.spacedBy(5.dp, Alignment.Top),
                                modifier = Modifier
                                    .align(alignment = Alignment.TopStart)
                                    .offset(x = 0.dp,
                                        y = 2.dp)
                            ) {
                                Text(
                                    text = "Alam Meditasi",
                                    color = Color.Black,
                                    style = TextStyle(
                                        fontSize = 16.sp))
                                Text(
                                    text = "Artist : Srihadi Soedarsono",
                                    color = Color.Black,
                                    style = TextStyle(
                                        fontSize = 12.sp))
                            }
                            Icon(
                                painter = painterResource(id = R.drawable.favorite),
                                contentDescription = "Favorite",
                                modifier = Modifier
                                    .align(alignment = Alignment.TopStart)
                                    .offset(x = 237.dp,
                                        y = 0.dp)
                                    .size(22.dp))
                        }
                    }
                }
            }
            item {
                Box(
                    modifier = Modifier
                        .requiredWidth(width = 295.dp)
                        .requiredHeight(height = 225.dp)
                ) {
                    Box(
                        modifier = Modifier
                            .fillMaxSize()
                            .clip(shape = RoundedCornerShape(20.dp))
                            .border(border = BorderStroke(2.dp, Color(0xff081f5c)),
                                shape = RoundedCornerShape(20.dp)))
                    Box(
                        modifier = Modifier
                            .requiredWidth(width = 295.dp)
                            .requiredHeight(height = 213.dp)
                    ) {
                        Box(
                            modifier = Modifier
                                .requiredWidth(width = 295.dp)
                                .requiredHeight(height = 150.dp)
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.rectangle9),
                                contentDescription = "Rectangle",
                                modifier = Modifier
                                    .fillMaxSize()
                                    .clip(shape = RoundedCornerShape(topStart = 20.dp, topEnd = 20.dp))
                                    .border(border = BorderStroke(2.dp, Color(0xff9cabc2).copy(alpha = 0.35f)),
                                        shape = RoundedCornerShape(topStart = 20.dp, topEnd = 20.dp)))
                        }
                        Box(
                            modifier = Modifier
                                .align(alignment = Alignment.TopStart)
                                .offset(x = 20.dp,
                                    y = 173.dp)
                                .requiredWidth(width = 261.dp)
                                .requiredHeight(height = 40.dp)
                        ) {
                            Column(
                                verticalArrangement = Arrangement.spacedBy(5.dp, Alignment.Top),
                                modifier = Modifier
                                    .align(alignment = Alignment.TopStart)
                                    .offset(x = 0.dp,
                                        y = 2.dp)
                            ) {
                                Text(
                                    text = "Perahu Kusamba",
                                    color = Color.Black,
                                    style = TextStyle(
                                        fontSize = 16.sp))
                                Text(
                                    text = "Artist : Affandi",
                                    color = Color.Black,
                                    style = TextStyle(
                                        fontSize = 12.sp))
                            }
                            Icon(
                                painter = painterResource(id = R.drawable.favorite),
                                contentDescription = "Favorite",
                                modifier = Modifier
                                    .align(alignment = Alignment.TopStart)
                                    .offset(x = 237.dp,
                                        y = 0.dp)
                                    .size(22.dp))
                        }
                    }
                }
                Spacer(modifier = Modifier.height(80.dp))
            }
        }
    }
}

@Preview(widthDp = 360, heightDp = 800)
@Composable
private fun LocalArtisreview() {
    LocalArtist(Modifier)
}
