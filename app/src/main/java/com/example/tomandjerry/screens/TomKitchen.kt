package com.example.tomandjerry.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.clipToBounds
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.PreviewScreenSizes
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tomandjerry.R
import com.example.tomandjerry.ui.theme.ibmPlex
import com.example.tomandjerry.ui.theme.ibmPlexMedium

@Composable
fun TomKitchen() {
    val width = LocalConfiguration.current.screenWidthDp
    Scaffold(
        modifier = Modifier.fillMaxSize(),
        bottomBar = { TomKitchenBottomBar() }) { innerPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
                .verticalScroll(state = ScrollState(0), enabled = true)
                .background(Color(0xFFEEF4F6))
        ) {
            Box(
                Modifier
                    .fillMaxWidth()
                    .height(218.dp)
                    .clipToBounds(),
            ) {
                Image(
                    painter = painterResource(R.drawable.back_ground_tom_kitchen),
                    null,
                    Modifier
                        .fillMaxSize()
                        .scale(1.12f)
                        .clipToBounds(),
                    contentScale = ContentScale.Crop
                )
                Column(
                    Modifier
                        .fillMaxHeight()
                        .padding(start = 16.dp, top = 40.dp, bottom = 50.dp)
                ) {
                    Row {
                        Image(
                            painter = painterResource(R.drawable.brach_icon),
                            null,
                            Modifier.size(responsiveDp(width, 24)),
                        )
                        Spacer(Modifier.width(8.dp))
                        Text(
                            "High tension",
                            fontSize = responsiveFontSize(width, 16),
                            fontFamily = ibmPlexMedium,
                            lineHeight = responsiveFontSize(width, 16),
                            letterSpacing = 0.5.sp,
                            color = Color(0xDEFFFFFF)
                        )
                    }
                    Spacer(Modifier.height(16.dp))
                    Row {
                        Image(
                            painter = painterResource(R.drawable.cheef_icon),
                            null,
                            Modifier.size(responsiveDp(width, 24)),
                        )
                        Spacer(Modifier.width(4.dp))
                        Text(
                            "Shocking foods",
                            fontSize = responsiveFontSize(width, 16),
                            fontFamily = ibmPlexMedium,
                            lineHeight = responsiveFontSize(width, 16),
                            letterSpacing = 0.5.sp,
                            color = Color(0xDEFFFFFF)
                        )
                    }
                }
            }

            Box(
                Modifier.fillMaxWidth()
            ) {
                Column(
                    Modifier
                        .fillMaxWidth()
                        .height(3000.dp)
                        .offset(y = (-30).dp)
                        .clip(RoundedCornerShape(16.dp))
                        .background(Color(0xFFEEF4F6))
                        .padding(vertical = 32.dp, horizontal = 16.dp)
                ) {

                    Row(Modifier.fillMaxWidth()) {
                        Column(Modifier.weight(1f)) {
                            Text(
                                "Electric Tom pasta",
                                fontSize = responsiveFontSize(width, 20),
                                fontFamily = ibmPlexMedium,
                                lineHeight = 32.sp,
                                letterSpacing = 0.sp,
                                color = Color(0xDE1F1F1E)
                            )
                            Spacer(Modifier.height(12.dp))
                            Row(
                                modifier = Modifier
                                    .height(responsiveDp(width, 30))
                                    .background(
                                        color = Color(0xFFD0E5F0),
                                        shape = RoundedCornerShape(responsiveDp(width, 8))
                                    )
                                    .padding(horizontal = 8.dp)

                            ) {
                                Icon(
                                    painter = painterResource(R.drawable.money_bag_01),
                                    contentDescription = null,
                                    tint = Color(0xFF03578A),
                                    modifier = Modifier
                                        .align(Alignment.CenterVertically)
                                        .size(
                                            responsiveDp(width, 16)
                                        )
                                )
                                Spacer(Modifier.width(4.dp))
                                Text(
                                    "5 cheeses",
                                    fontSize = responsiveFontSize(width, 12),
                                    fontFamily = ibmPlexMedium,
                                    lineHeight = responsiveFontSize(width, 12),
                                    letterSpacing = 0.sp,
                                    color = Color(0xFF03578A),
                                    modifier = Modifier.align(Alignment.CenterVertically)
                                )
                            }
                        }
                        Image(
                            painter = painterResource(R.drawable.favorite_icon),
                            null,
                            Modifier
                                .size(responsiveDp(width, 24))
                                .align(Alignment.CenterVertically),
                        )
                    }
                    Spacer(Modifier.height(8.dp))
                    Text(
                        "Pasta cooked with a charger cable and\nsprinkled with questionable cheese. Make sure\nto unplug it before eating (or not, you decide).",
                        fontSize = responsiveFontSize(width, 14),
                        fontFamily = ibmPlexMedium,
                        lineHeight = responsiveFontSize(width, 20),
                        letterSpacing = 0.5.sp,
                        color = Color(0x99121212),
                        modifier = Modifier.height(responsiveDp(width, 60))
                    )
                    Spacer(Modifier.height(24.dp))
                    Row {
                        Text(
                            "Details",
                            fontSize = responsiveFontSize(width, 18),
                            fontFamily = ibmPlexMedium,
                            lineHeight = responsiveFontSize(width, 32),
                            letterSpacing = 0.5.sp,
                            color = Color(0xDE1F1F1E)
                        )
                    }
                    Spacer(Modifier.height(8.dp))
                    Row(Modifier.fillMaxWidth()) {
                        Box(Modifier.weight(1f)) {
                            DetailsItem(
                                img = R.drawable.temp_icon,
                                title = "1000 V",
                                description = "Temperature"
                            )
                        }

                        Spacer(Modifier.width(8.dp))
                        Box(Modifier.weight(1f)) {
                            DetailsItem(
                                img = R.drawable.timer_icon,
                                title = "3 sparks",
                                description = "Time"
                            )
                        }

                        Spacer(Modifier.width(8.dp))
                        Box(Modifier.weight(1f)) {
                            DetailsItem(
                                img = R.drawable.deveil_imo_ico,
                                title = "1M 12K",
                                description = "No. of deaths"
                            )
                        }

                    }
                    Spacer(Modifier.height(24.dp))
                    Row(Modifier.fillMaxWidth()) {
                        Column(Modifier.fillMaxSize()) {
                            Text(
                                "Preparation method",
                                fontSize = responsiveFontSize(width, 18),
                                fontFamily = ibmPlexMedium,
                                lineHeight = responsiveFontSize(width, 32),
                                letterSpacing = 0.5.sp,
                                color = Color(0xDE1F1F1E)
                            )
                            Spacer(Modifier.height(8.dp))
                            StepItem(1, "Put the pasta in a toaster.")
                            Spacer(Modifier.height(8.dp))
                            StepItem(2, "Pour battery juice over it.")
                            Spacer(Modifier.height(8.dp))
                            StepItem(3, "Wait for the spark to ignite.")
                            Spacer(Modifier.height(8.dp))
                            StepItem(4, "Serve with an insulating glove.")
                        }
                    }
                }


                Box(
                    Modifier
                        .size(220.dp, 168.dp)
                        .align(Alignment.TopEnd)
                ) {
                    Image(
                        painter = painterResource(R.drawable.dish),
                        null,
                        Modifier
                            .size(187.dp, 168.dp)

                            .offset(y = -170.dp)
                            .clipToBounds(),
                    )
                }

            }
        }
    }

}

@Composable
private fun TomKitchenBottomBar() {
    Box(
        Modifier
            .height(responsiveDp(360, 72))
            .fillMaxWidth()
            .padding(horizontal = 16.dp, vertical = 15.dp)
            .clip(RoundedCornerShape(16.dp))
            .background(Color(0xFF226993))

    ) {
        Row(
            Modifier.align(Alignment.Center)
        ) {
            Text(
                "Add to cart",
                fontSize = responsiveFontSize(360, 16),
                fontFamily = ibmPlexMedium,
                lineHeight = responsiveFontSize(360, 16),
                letterSpacing = 0.5.sp,
                color = Color(0xDEFFFFFF),
                modifier = Modifier.align(Alignment.CenterVertically)
            )
            Spacer(Modifier.width(8.dp))
            Image(
                painter = painterResource(R.drawable.point),
                null,
                Modifier.size(responsiveDp(360, 4)).align(Alignment.CenterVertically),
            )
            Spacer(Modifier.width(8.dp))
            Column(modifier = Modifier.align(Alignment.CenterVertically)) {
                Text(
                    "3 cheeses",
                    fontSize = responsiveFontSize(360, 14),
                    fontFamily = ibmPlexMedium,
                    lineHeight = responsiveFontSize(360, 14),
                    letterSpacing = 0.5.sp,
                    color = Color(0xDEFFFFFF),modifier = Modifier.align(Alignment.CenterHorizontally)
                )
                Text(
                    "3 cheeses",
                    fontSize = responsiveFontSize(360, 12),
                    fontFamily = ibmPlexMedium,
                    lineHeight = responsiveFontSize(360, 12),
                    letterSpacing = 0.5.sp,
                    color = Color(0xCCFFFFFF),modifier = Modifier.align(Alignment.CenterHorizontally),
                    textDecoration = TextDecoration.LineThrough
                )
            }
        }
    }
}


@Composable
fun responsiveDp(screenWidth: Int, baseSize: Int, figmaWidth: Int = 360): Dp {
    val screenWidth = screenWidth
    val ratio = baseSize.toFloat() / figmaWidth
    return (screenWidth * ratio).dp
}

@Composable
fun responsiveFontSize(screenWidth: Int, baseSize: Int, figmaWidth: Int = 360): TextUnit {
    val screenWidth = screenWidth
    val ratio = baseSize.toFloat() / figmaWidth
    return (screenWidth * ratio).sp
}

@Composable
private fun StepItem(num: Int, title: String) {
    val width = LocalConfiguration.current.screenWidthDp
    Box(Modifier.fillMaxWidth()) {
        Row(
            Modifier
                .height(responsiveDp(width, 39))
                .fillMaxWidth()
                .padding(start = responsiveDp(width, 20))
                .clip(RoundedCornerShape(topEnd = 12.dp, bottomEnd = 12.dp))
                .background(Color.White)
                .align(Alignment.CenterStart)
                .padding(start = responsiveDp(width, 25))
        ) {
            Spacer(Modifier.width(8.dp))
            Text(
                title,
                fontSize = responsiveFontSize(width, 14),
                fontFamily = ibmPlex,
                lineHeight = responsiveFontSize(width, 14),
                letterSpacing = 0.5.sp,
                color = Color(0x99121212),
                textAlign = TextAlign.Start,
                modifier = Modifier.align(Alignment.CenterVertically)
            )
        }
        Box(
            modifier = Modifier
                .size(responsiveDp(width, 39))
                .border(
                    width = 1.dp, color = Color(0xFFD0E5F0), shape = RoundedCornerShape(100.dp)
                )
                .clip(RoundedCornerShape(100.dp))
                .align(Alignment.CenterStart)
        ) {
            Box(
                Modifier
                    .fillMaxSize()
                    .background(Color.White)
            ) {
                Text(
                    num.toString(),
                    fontSize = responsiveFontSize(width, 12),
                    fontFamily = ibmPlexMedium,
                    lineHeight = responsiveFontSize(width, 12),
                    letterSpacing = 0.5.sp,
                    color = Color(0xFF035587),
                    modifier = Modifier
                        .fillMaxWidth()
                        .align(Alignment.Center),
                    textAlign = TextAlign.Center,
                )
            }

        }
    }

}

@Composable
private fun DetailsItem(img: Int, title: String, description: String) {
    val width = LocalConfiguration.current.screenWidthDp

    Box(
        Modifier
            .height(responsiveDp(width, 109))
            .clip(RoundedCornerShape(12.dp))
            .background(Color(0xFFD0E5F0))
            .padding(12.dp)

    ) {

        Column(Modifier.fillMaxSize()) {
            Image(
                painter = painterResource(img),
                null,
                Modifier
                    .size(responsiveDp(width, 32))
                    .align(Alignment.CenterHorizontally)
            )
            Spacer(Modifier.height(12.dp))
            Text(
                title,
                fontSize = responsiveFontSize(width, 14),
                fontFamily = ibmPlexMedium,
                lineHeight = responsiveFontSize(width, 14),
                letterSpacing = 0.5.sp,
                color = Color(0x99121212),
                modifier = Modifier.fillMaxWidth(),
                textAlign = TextAlign.Center

            )
            Spacer(Modifier.height(2.dp))
            Text(
                description,
                fontSize = responsiveFontSize(width, 14),
                fontFamily = ibmPlexMedium,
                lineHeight = responsiveFontSize(width, 14),
                letterSpacing = 0.5.sp,
                color = Color(0x5E121212),
                modifier = Modifier.fillMaxWidth(),
                textAlign = TextAlign.Center
            )
        }
    }
}

@PreviewScreenSizes
@Composable
fun TomKitchenPreview() {
    TomKitchen()
}