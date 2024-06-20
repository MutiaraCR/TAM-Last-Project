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
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredSize
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.galery.ui.theme.GaleryTheme

class DetailArtWorkActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GaleryTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    DetailArtWork()
                }
            }
        }
    }
}

@Composable
fun DetailArtWork(modifier: Modifier = Modifier) {
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
                .offset(x = (0).dp,
                    y = 48.dp)
                .requiredWidth(width = 380.dp)
                .requiredHeight(height = 678.dp)
        ) {
            Box(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 47.dp,
                        y = 0.dp)
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
                    .offset(x = 0.dp,
                        y = 68.dp)
                    .requiredWidth(width = 380.dp)
                    .requiredHeight(height = 306.dp)
            ) {
                Box(
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(x = 10.dp,
                            y = 0.dp)
                        .requiredWidth(width = 360.dp)
                        .requiredHeight(height = 208.dp)
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.rectangle12),
                        contentDescription = "Rectangle",
                        modifier = Modifier
                            .requiredWidth(width = 360.dp)
                            .requiredHeight(height = 208.dp)
                            .border(border = BorderStroke(2.dp, Color(0xff9cabc2).copy(alpha = 0.35f))))
                    Box(
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(x = 175.dp,
                                y = 181.dp)
                            .requiredSize(size = 10.dp)
                            .clip(shape = CircleShape)
                            .background(color = Color.White))
                    Box(
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(x = 193.dp,
                                y = 181.dp)
                            .requiredSize(size = 10.dp)
                            .clip(shape = CircleShape)
                            .background(color = Color.White))
                    Box(
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(x = 157.dp,
                                y = 181.dp)
                            .requiredSize(size = 10.dp)
                            .clip(shape = CircleShape)
                            .background(color = Color.White))
                }
                Box(
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(x = 0.dp,
                            y = 230.dp)
                        .requiredWidth(width = 380.dp)
                        .requiredHeight(height = 76.dp)
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.rectangle11),
                        contentDescription = "Rectangle",
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(x = 269.dp,
                                y = 0.dp)
                            .requiredWidth(width = 111.dp)
                            .requiredHeight(height = 76.dp)
                            .border(border = BorderStroke(2.dp, Color(0xff9cabc2).copy(alpha = 0.35f))))
                    Image(
                        painter = painterResource(id = R.drawable.image1),
                        contentDescription = "image 1",
                        modifier = Modifier
                            .requiredWidth(width = 124.dp)
                            .requiredHeight(height = 76.dp))
                    Image(
                        painter = painterResource(id = R.drawable.image2),
                        contentDescription = "image 2",
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(x = 149.dp,
                                y = 0.dp)
                            .requiredWidth(width = 108.dp)
                            .requiredHeight(height = 76.dp))
                }
            }
            Box(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 40.dp,
                        y = 404.dp)
                    .requiredWidth(width = 300.dp)
                    .requiredHeight(height = 274.dp)
            ) {
                Box(
                    modifier = Modifier
                        .requiredWidth(width = 300.dp)
                        .requiredHeight(height = 70.dp)
                ) {
                    Box(
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(x = 5.dp,
                                y = 0.dp)
                            .requiredWidth(width = 264.dp)
                            .requiredHeight(height = 48.dp)
                    ) {
                        Box(
                            modifier = Modifier
                                .requiredWidth(width = 264.dp)
                                .requiredHeight(height = 48.dp)
                        ) {
                            Box(
                                modifier = Modifier
                                    .requiredWidth(width = 264.dp)
                                    .requiredHeight(height = 68.dp)
                            ) {
                                Column(
                                    verticalArrangement = Arrangement.spacedBy(10.dp, Alignment.Top)
                                ) {
                                    Text(
                                        text = "We'll Always Have Paris",
                                        color = Color.Black,
                                        style = MaterialTheme.typography.headlineSmall)
                                    Text(
                                        text = "by Ilya Volykhine",
                                        color = Color.Black,
                                        style = TextStyle(
                                            fontSize = 14.sp))
                                }
                            }
                        }
                    }
                    Box(
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(x = 0.dp,
                                y = 70.dp)
                            .requiredWidth(width = 300.dp)
                    ) {
                        Divider(
                            color = Color.Black,
                            modifier = Modifier
                                .requiredWidth(width = 300.dp))
                    }
                }
                Box(
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(x = 10.dp,
                            y = 90.dp)
                        .requiredWidth(width = 289.dp)
                        .requiredHeight(height = 184.dp)
                ) {
                    Box(
                        modifier = Modifier
                            .requiredWidth(width = 289.dp)
                            .requiredHeight(height = 184.dp)
                    ) {
                        Text(
                            text = "We'll Always Ave Paris Is An Original Oil & Mixed Media On Canvas Painting By Ilya Volykhine. A Couple Is Shown Lying On A Table In An Intimate Scene. You Can Decide What Is Going On Or What Has Happened Here. Love... \nOriginal Created   : 2023\nSubjects                : Love\nMaterials              : Canvas\nStyles                   : Figurative, Expressionism\nMediums              : Oilpaper",
                            color = Color.Black,
                            style = TextStyle(
                                fontSize = 11.sp,
                                fontWeight = FontWeight.Light,
                                letterSpacing = (-0.28).sp),
                            modifier = Modifier
                                .align(alignment = Alignment.TopStart)
                                .offset(x = 0.dp,
                                    y = 33.dp)
                                .requiredWidth(width = 289.dp)
                                .requiredHeight(height = 151.dp)
                                .wrapContentHeight(align = Alignment.CenterVertically))
                        Text(
                            text = "About The Artwork",
                            color = Color(0xff101010),
                            textAlign = TextAlign.Center,
                            style = TextStyle(
                                fontSize = 15.sp,
                                fontWeight = FontWeight.Medium,
                                letterSpacing = (-0.28).sp),
                            modifier = Modifier
                                .requiredWidth(width = 128.dp)
                                .wrapContentHeight(align = Alignment.CenterVertically))
                    }
                }
            }
        }
    }
}
@Preview(widthDp = 360, heightDp = 800)
@Composable
private fun DetailArtWorkPreview() {
    DetailArtWork(Modifier)
}