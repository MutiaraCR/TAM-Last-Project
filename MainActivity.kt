package com.example.chat

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
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
import com.example.chat.ui.theme.ChatTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ChatTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Tampilan()
                }
            }
        }
    }
}

fun Color.Companion.customColor(): Color {
    return Color(0xFFEDF0F5)
}
fun Color.Companion.customColor2(): Color {
    return Color(0xFF081F5C)
}

@Composable
fun Tampilan(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .fillMaxSize()
            .background(color = Color.customColor())
    ) {
        // Box at the top with two images in a row
        Box(
            modifier = Modifier
                .padding(top = 12.dp, start = 10.dp)
                .size(300.dp, 100.dp)
                .background(color = Color.customColor(), shape = RoundedCornerShape(5.dp))
        ) {
            Row(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(16.dp),
                horizontalArrangement = Arrangement.Start, // Mengatur ke posisi Start
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    painter = painterResource(id = R.drawable.back), // Replace with your image resource ID
                    contentDescription = "Image 1",
                    modifier = Modifier.size(54.dp)
                )
                Spacer(modifier = Modifier.width(90.dp)) // Spacer untuk memberikan jarak antar gambar, bisa disesuaikan
                Image(
                    painter = painterResource(id = R.drawable.ellipse), // Replace with your image resource ID
                    contentDescription = "Image 2",
                    modifier = Modifier
                        .size(64.dp)
                        .padding(2.dp)
                )
            }
        }



        Box(
            modifier = Modifier
                .align(Alignment.TopCenter)
                .padding(top = 100.dp)
                .size(320.dp, 160.dp)
                .wrapContentHeight()
                .background(color = Color.customColor(), shape = RoundedCornerShape(5.dp))
        ) {
            Column(
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.Top
            ) {
                Text(
                    modifier = Modifier
                        .padding(start = 110.dp, top = 10.dp),
                    text = "Ayesha Takiya",
                    textAlign = TextAlign.Center,
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.customColor2() // Change color if needed
                )
                Spacer(modifier = Modifier.height(40.dp)) // Spacer untuk memberikan jarak di atas
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.Start
                ) {
                    Spacer(modifier = Modifier.width(110.dp)) // Spacer untuk memberikan jarak di kiri
                    Box(
                        modifier = Modifier
                            .padding(start = 80.dp)
                            .size(130.dp, 50.dp) // Mengubah ukuran Box menjadi lebih kecil
                            .background(color = Color.White, shape = RoundedCornerShape(5.dp))
                            .border(
                                width = 1.dp,
                                color = Color.customColor2(),
                                shape = RoundedCornerShape(5.dp)
                            )
                    ) {
                        Text(
                            text = "Hi!",
                            modifier = Modifier.padding(top = 15.dp, start = 25.dp),
                            fontSize = 15.sp,
                            fontWeight = FontWeight.SemiBold
                        )
                    }
                }

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.End
                ) {
                    Text(
                        text = "14:15",
                        modifier = Modifier.padding(top = 8.dp, end = 8.dp),
                        fontWeight = FontWeight.SemiBold,
                        color = Color.customColor2(),
                        fontSize = 14.sp
                    )
                }
            }
        }

        Box(
            modifier = Modifier
                .padding(top = 200.dp)
                .size(320.dp, 160.dp)
                .fillMaxWidth()
                .wrapContentHeight()
        ) {
            Column(
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.Top
            ) {
                Spacer(modifier = Modifier.height(70.dp)) // Spacer untuk memberikan jarak di atas
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.Start // Mengubah horizontalArrangement menjadi Start
                ) {
                    Box(
                        modifier = Modifier
                            .padding(start = 40.dp) // Mengubah padding start untuk menggeser Box ke kiri
                            .size(200.dp, 70.dp) // Mengubah ukuran Box menjadi lebih kecil
                            .background(color = Color.White, shape = RoundedCornerShape(5.dp))
                            .border(
                                width = 1.dp,
                                color = Color.customColor2(),
                                shape = RoundedCornerShape(5.dp)
                            )
                    ) {
                        Text(
                            text = "Hi! Ada yang bisa saya bantu?",
                            modifier = Modifier.padding(top = 15.dp, start = 25.dp),
                            fontSize = 15.sp,
                            fontWeight = FontWeight.SemiBold
                        )
                    }
                }
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.End
                ) {
                    Text(
                        text = "14:17",
                        modifier = Modifier.padding(top = 5.dp, end = 230.dp),
                        fontWeight = FontWeight.SemiBold,
                        color = Color.customColor2(),
                        fontSize = 14.sp
                    )
                }
            }
        }

        Box(
            modifier = Modifier
                .align(Alignment.TopCenter)
                .padding(top = 360.dp)
                .size(320.dp, 200.dp)
                .background(color = Color.customColor(), shape = RoundedCornerShape(5.dp))
        ) {
            Column(
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.Top
            ) {
                Spacer(modifier = Modifier.height(30.dp)) // Spacer untuk memberikan jarak di atas
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.End
                ) {
                    Spacer(modifier = Modifier.width(50.dp)) // Spacer untuk memberikan jarak di kiri
                    Box(
                        modifier = Modifier
                            .padding(start = 10.dp, bottom = 15.dp)
                            .size(300.dp, 115.dp) // Mengubah tinggi Box menjadi lebih kecil
                            .background(color = Color.White, shape = RoundedCornerShape(5.dp))
                            .border(
                                width = 1.dp,
                                color = Color.customColor2(),
                                shape = RoundedCornerShape(5.dp)
                            )
                    ) {
                        Text(
                            text = "Saya suka lukisan abstrak yang dominan warna biru dan hijau. Bisa beritahu lebih detail tentang lukisan itu?",
                            modifier = Modifier.padding(top = 15.dp, start = 25.dp),
                            fontSize = 13.sp,
                            fontWeight = FontWeight.SemiBold
                        )
                    }
                }
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.End
                ) {
                    Text(
                        text = "14:18",
                        modifier = Modifier.padding(end = 10.dp),
                        color = Color.customColor2(),
                        fontWeight = FontWeight.SemiBold,
                        fontSize = 14.sp
                    )
                }
            }
        }

        Box(
            modifier = Modifier
                .padding(top = 520.dp)
                .size(320.dp, 160.dp)
                .fillMaxWidth()
                .wrapContentHeight()
        ) {
            Column(
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.Top
            ) {
                Spacer(modifier = Modifier.height(50.dp)) // Spacer untuk memberikan jarak di atas
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.Start // Mengubah horizontalArrangement menjadi Start
                ) {
                    Box(
                        modifier = Modifier
                            .padding(start = 50.dp) // Mengubah padding start untuk menggeser Box ke kiri
                            .size(245.dp, 80.dp) // Mengubah ukuran Box menjadi lebih kecil
                            .background(color = Color.White, shape = RoundedCornerShape(5.dp))
                            .border(
                                width = 1.dp,
                                color = Color.customColor2(),
                                shape = RoundedCornerShape(5.dp)
                            )
                    ) {
                        Text(
                            text = "Tentu! Lukisan tersebut adalah karya seniman lokal dan berjudul \"Ombak Tenang\".",
                            modifier = Modifier.padding(top = 8.dp, start = 25.dp),
                            fontSize = 13.sp,
                            fontWeight = FontWeight.SemiBold
                        )
                    }
                }
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.End
                ) {
                    Text(
                        text = "14:20",
                        modifier = Modifier.padding(top = 2.dp, end = 225.dp), // Mengubah padding top menjadi lebih kecil
                        fontWeight = FontWeight.SemiBold,
                        color = Color.customColor2(),
                        fontSize = 14.sp
                    )
                }
            }
        }

        Box(
            modifier = Modifier
                .align(Alignment.TopCenter)
                .padding(top = 680.dp)
                .size(320.dp, 200.dp)
                .background(color = Color.customColor(), shape = RoundedCornerShape(5.dp))
        ) {
            Column(
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.Top
            ) {
                Spacer(modifier = Modifier.height(20.dp)) // Spacer untuk memberikan jarak di atas
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.End
                ) {
                    Spacer(modifier = Modifier.width(50.dp)) // Spacer untuk memberikan jarak di kiri
                    Box(
                        modifier = Modifier
                            .padding(start = 10.dp, bottom = 15.dp)
                            .size(240.dp, 90.dp) // Mengubah tinggi Box menjadi lebih kecil
                            .background(color = Color.White, shape = RoundedCornerShape(5.dp))
                            .border(
                                width = 1.dp,
                                color = Color.customColor2(),
                                shape = RoundedCornerShape(5.dp)
                            )
                    ) {
                        Text(
                            text = "Terima kasih banyak! Saya tidak sabar untuk melihatnya.",
                            modifier = Modifier.padding(top = 15.dp, start = 25.dp),
                            fontSize = 13.sp,
                            fontWeight = FontWeight.SemiBold
                        )
                    }
                }
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.End
                ) {
                    Text(
                        text = "14:18",
                        modifier = Modifier.padding(end = 10.dp),
                        fontWeight = FontWeight.SemiBold,
                        color = Color.customColor2(),
                        fontSize = 14.sp
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ChatTheme {
        Tampilan()
    }
}