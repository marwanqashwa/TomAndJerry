package com.example.tomandjerry.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.background
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
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.clipToBounds
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewScreenSizes
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tomandjerry.R
import com.example.tomandjerry.ui.theme.ibmPlex
import com.example.tomandjerry.ui.theme.ibmPlexBold
import com.example.tomandjerry.ui.theme.ibmPlexMedium
import com.example.tomandjerry.ui.theme.ibmPlexSemiBold

@Composable
fun TomAccount() {


    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(state = ScrollState(0), enabled = true)
            .background(Color(0xFFEEF4F6))
    ) {
        Box(
            Modifier
                .fillMaxWidth()
                .height(202.dp)
                .clipToBounds(),
        ) {
            Image(
                painter = painterResource(R.drawable.back_ground_tom_account_top_bar),
                null,
                Modifier
                    .offset(y = (-13).dp)
                    .fillMaxSize()
                    .clipToBounds(),
                contentScale = ContentScale.Crop
            )

            Box(
                modifier = Modifier
                    .fillMaxHeight()
                    .padding(top = 16.dp, bottom = 38.dp)
                    .align(Alignment.Center)

            ) {
                Column(
                    Modifier
                        .width(113.dp)
                        .height(142.dp)
                        .align(Alignment.BottomEnd)
                ) {
                    Box(
                        Modifier
                            .size(64.dp)
                            .clip(RoundedCornerShape(12.dp))
                            .align(Alignment.CenterHorizontally)
                    ) {
                        Image(
                            painter = painterResource(R.drawable.tom_img),
                            null,
                            contentScale = ContentScale.Crop,
                            modifier = Modifier.fillMaxSize()
                        )
                    }
                    Spacer(Modifier.height(4.dp))
                    Column(
                        modifier = Modifier
                            .height(74.dp)
                            .align(Alignment.CenterHorizontally)
                    ) {
                        Text(
                            "Tom",
                            modifier = Modifier
                                .height(27.dp)
                                .align(Alignment.CenterHorizontally),
                            fontFamily = ibmPlexMedium,
                            fontSize = 18.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color(0xFFFFFFFF),
                            lineHeight = 18.sp,
                            letterSpacing = 0.sp
                        )
                        Text(
                            "specializes in failure!",
                            modifier = Modifier
                                .height(18.dp)
                                .align(Alignment.CenterHorizontally),
                            fontFamily = ibmPlex,
                            fontSize = 12.sp,
                            fontWeight = FontWeight.W400,
                            color = Color(0xCCFFFFFF),
                            textAlign = TextAlign.Center,
                            lineHeight = 12.sp,
                            letterSpacing = 0.sp
                        )
                        Spacer(Modifier.height(4.dp))
                        Box(
                            Modifier
                                .size(97.dp, 25.dp)
                                .clip(RoundedCornerShape(40.dp))
                                .background(Color(0x1FFFFFFF))
                                .align(Alignment.CenterHorizontally)
                        ) {
                            Text(
                                "Edit foolishness",
                                modifier = Modifier
                                    .height(15.dp)
                                    .align(Alignment.Center),
                                fontFamily = ibmPlexMedium,
                                fontSize = 10.sp,
                                fontWeight = FontWeight.Medium,
                                color = Color(0xFFFFFFFF),
                                textAlign = TextAlign.Center,
                                lineHeight = 10.sp,
                                letterSpacing = 0.sp
                            )
                        }

                    }

                }
            }

        }

        Column(
            Modifier
                .fillMaxWidth()
                .offset(y = (-30).dp)
                .clip(RoundedCornerShape(20.dp))
                .background(Color(0xFFEEF4F6))
                .padding(vertical = 23.dp)

        ) {
            Row(
                Modifier
                    .fillMaxWidth()
                    .height(126.dp)
                    .padding(horizontal = 16.dp)

            ) {

                Column(
                    Modifier
                        .fillMaxHeight()
                        .weight(1f)
                ) {
                    EmoCard(
                        R.drawable.deveil_icon, "2M 12K", "No. of quarrels", Color(0xFFD0E5F0)
                    )
                    Spacer(Modifier.height(8.dp))
                    EmoCard(
                        R.drawable.sad_icon, "2M 12K", "Hunting times", Color(0xFFF2D9E7)
                    )

                }
                Spacer(Modifier.width(8.dp))
                Column(
                    Modifier
                        .fillMaxHeight()
                        .width(160.dp)
                        .weight(1f)

                ) {
                    EmoCard(
                        R.drawable.run_icon, "+500 h", "Chase time", Color(0xFFDEEECD)
                    )
                    Spacer(Modifier.height(8.dp))
                    EmoCard(
                        R.drawable.broken_icon, "3M 7K", "Heartbroken", Color(0xFFFAEDCF)
                    )

                }

            }
            Spacer(Modifier.height(24.dp))
            Column(
                Modifier
                    .fillMaxWidth()
                    .height(388.dp)

            ) {
                Column(
                    Modifier
                        .height(182.dp)
                        .fillMaxWidth()
                        .padding(horizontal = 16.dp)) {
                    Text(
                        "Tom settings",
                        fontFamily = ibmPlexBold,
                        fontSize = 20.sp,
                        fontWeight = FontWeight(700),
                        color = Color(0xDE1F1F1E),
                        lineHeight = 20.sp,
                        letterSpacing = 0.sp
                    )
                    Spacer(Modifier.height(8.dp))
                    IconLabelCard(R.drawable.biano_icon, "Change sleeping place")
                    Spacer(Modifier.height(12.dp))
                    IconLabelCard(R.drawable.cat_icon, "Meow settings")
                    Spacer(Modifier.height(12.dp))
                    IconLabelCard(R.drawable.phone_icon, "Password to open the fridge")
                }
                Box(Modifier.height(24.dp)) {
                    Box(
                        Modifier
                            .height(1.dp)
                            .fillMaxWidth()
                            .background(Color(0x14001A1F))
                            .align(Alignment.Center)
                    )

                }
                Column(
                    Modifier
                        .height(182.dp)
                        .fillMaxWidth()
                        .padding(horizontal = 16.dp)) {
                    Text(
                        "His favorite foods",
                        fontFamily = ibmPlexBold,
                        fontSize = 20.sp,
                        fontWeight = FontWeight(700),
                        color = Color(0xDE1F1F1E),
                        lineHeight = 20.sp,
                        letterSpacing = 0.sp
                    )
                    Spacer(Modifier.height(8.dp))
                    IconLabelCard(R.drawable.triangle_icon, "Mouses")
                    Spacer(Modifier.height(12.dp))
                    IconLabelCard(R.drawable.icon22, "Last stolen meal")
                    Spacer(Modifier.height(12.dp))
                    IconLabelCard(R.drawable.sleeping_icon, "Change sleep mood")
                }
            }



            Row(
                Modifier.padding(top = 24.dp)
            ) {
                Text(
                    "v.TomBeta",
                    Modifier.fillMaxWidth(),
                    textAlign = TextAlign.Center,
                    fontSize = 12.sp,
                    fontWeight = FontWeight.Normal,
                    fontFamily = ibmPlex,
                    color = Color(0x99121212)

                )


            }
        }
    }
}


@Composable
fun IconLabelCard(icon: Int, title: String) {
    Row {

        Box(
            modifier = Modifier
                .size(40.dp)
                .clip(RoundedCornerShape(8.dp))
                .background(Color(0xFFFFFFFF))
        ) {
            Image(
                painter = painterResource(icon),
                null,
                modifier = Modifier
                    .size(24.dp, 24.dp)
                    .align(Alignment.Center)
            )
        }

        Spacer(Modifier.width(8.dp))

        Text(
            title,
            fontFamily = ibmPlexMedium,
            fontSize = 16.sp,
            fontWeight = FontWeight.Medium,
            color = Color(0xDE1F1F1E),
            letterSpacing = 0.sp,
            modifier = Modifier.align(Alignment.CenterVertically)
        )

    }
}

@Composable
fun EmoCard(img: Int, title: String, description: String, backGroundColor: Color) {

    Row(
        Modifier
            .height(58.dp)
            .clip(RoundedCornerShape(12.dp))
            .background(backGroundColor)
            .padding(vertical = 8.dp)
            .padding(start = 12.dp, end = 10.dp)
    ) {
        Image(
            painter = painterResource(img), null,
            modifier = Modifier.size(40.dp),

            )
        Spacer(Modifier.width(10.dp))
        Column(Modifier.width(88.dp)) {
            Text(
                title,
                fontFamily = ibmPlexSemiBold,
                fontSize = 16.sp,
                fontWeight = FontWeight.SemiBold,
                color = Color(0x99121212),
                lineHeight = 16.sp,
                letterSpacing = 0.sp
            )
            Text(
                description,
                fontFamily = ibmPlexMedium,
                fontSize = 10.sp,
                fontWeight = FontWeight(500),
                color = Color(0x5E121212),
                lineHeight = 10.sp,
                letterSpacing = 0.5.sp,
                textAlign = TextAlign.Start,
                minLines = 1
            )
        }
    }

}


@PreviewScreenSizes
@Composable
fun TomAccountPreview() {
    TomAccount()
}