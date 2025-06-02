package com.example.tomandjerry.composable.jerry_store

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
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
import com.example.tomandjerry.R
import com.example.tomandjerry.ui.theme.ibmPlex
import com.example.tomandjerry.ui.theme.ibmPlexBold

@Composable
fun JerryStoreTopBar() {
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.Top,
            modifier = Modifier
                .fillMaxWidth()
                .height(56.dp)
                .background(color = Color(0xFFEEF4F6))
                .padding(top = 4.dp, bottom = 4.dp, start = 16.dp, end = 16.dp)
        ) {
            Row(Modifier.size(226.dp, 48.dp)) {
                Image(
                    painter = painterResource(R.drawable.jerry_profile_img),
                    contentDescription = "jerry img",
                    modifier = Modifier.size(48.dp,48.dp).clip(
                        RoundedCornerShape(12.dp)
                    )
                )
                Spacer(
                    modifier = Modifier.width(4.dp)
                )
                Column(
                    verticalArrangement = Arrangement.SpaceBetween,
                    horizontalAlignment = Alignment.Start,
                ) {
                    Text(
                        "Hi, Jerry\uD83D\uDC4B\uD83C\uDFFB",
                        modifier = Modifier.height(21.dp),
                        fontFamily = ibmPlexBold,
                        fontSize = 14.sp,
                        fontWeight = FontWeight(500),
                        color = Color(0xFF1F1F1E),
                        textAlign = TextAlign.Start,
                    )
                    Text(
                        "Which Tom do you want to buy?",
                        fontFamily = ibmPlex,
                        color = Color(0xFFA5A6A4),
                        fontSize = 12.sp,
                        fontWeight = FontWeight(400),
                        textAlign = TextAlign.Start,
                        lineHeight = 12.sp,
                        letterSpacing = 0.sp

                    )
                }
            }

            Box(modifier = Modifier.padding(top = 4.dp, bottom = 4.dp)) {
                Box(
                    modifier = Modifier
                        .border(
                            1.dp, color = Color(0x261F1F1E), shape = RoundedCornerShape(12.dp)
                        )
                        .size(40.dp, 40.dp)
                        .padding(2.dp)
                ) {
                    Icon(
                        painter = painterResource(R.drawable.bell),
                        contentDescription = null,
                        modifier = Modifier
                            .align(Alignment.Center)
                            .size(19.5.dp, 21.5.dp),
                    )
                }
                Box(
                    modifier = Modifier
                        .offset(1.dp, (-4).dp)
                        .size(14.dp)
                        .background(Color(0xFF03578A), shape = RoundedCornerShape(100.dp))
                        .align(Alignment.TopEnd), contentAlignment = Alignment.Center
                ) {
                    Text(
                        "3",
                        fontSize = 10.sp,
                        fontFamily = ibmPlex,
                        lineHeight = 10.sp,
                        modifier = Modifier.align(Alignment.Center),
                        textAlign = TextAlign.Center,
                        color = Color.White,

                        )
                }


            }

        }
}

@Preview
@Composable
fun PreviewJerryTopBar() {
    JerryStoreTopBar()
}