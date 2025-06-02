package com.example.tomandjerry.composable.jerry_store

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tomandjerry.R
import com.example.tomandjerry.ui.theme.ibmPlex

@Composable
fun TomOfferBoxJerryStore() {
    Box(Modifier.size(328.dp, 106.dp)) {
        Box(
            Modifier
                .size(328.dp, 92.dp)
                .background(
                    brush = Brush.linearGradient(
                        colors = listOf(Color(0XFF03446A), Color(0XFF0685D0))
                    ), shape = RoundedCornerShape(16.dp)
                )
                .align(Alignment.BottomStart)
        ) {
            Column(
                modifier = Modifier
                    .fillMaxHeight()
                    .padding(top = 12.dp, start = 12.dp)
                    .size(208.dp, 68.dp),
            ) {
                Text(
                    "Buy 1 Tom and get 2 for free",
                    modifier = Modifier.size(208.dp, 24.dp),
                    fontFamily = ibmPlex,
                    fontSize = 16.sp,
                    fontWeight = FontWeight(600),
                    color = Color.White,
                    letterSpacing = 0.sp,
                    lineHeight = 16.sp
                )
                Spacer(modifier = Modifier.height(8.dp))
                Text(
                    "Adopt Tom! (Free Fail-Free Guarantee)",
                    modifier = Modifier.size(177.dp, 36.dp),
                    fontFamily = ibmPlex,
                    fontSize = 12.sp,
                    fontWeight = FontWeight(400),
                    color = Color(0xCCFFFFFF),
                    letterSpacing = 0.sp,
                    textAlign = TextAlign.Start,
                    lineHeight = 20.sp
                )
            }
        }


            Image(
                painter = painterResource(R.drawable.ellipse_1), null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .align(Alignment.BottomEnd)
                    .width(95.dp).height(92.dp)
            )
            Image(
                painter = painterResource(R.drawable.ellipse_2),
                null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .align(Alignment.BottomEnd)
                    .width(88.dp).height(92.dp)
            )




        Box(
            modifier = Modifier
                .size(115.dp, 108.dp)
                .align(Alignment.TopEnd)
        ) {
            Image(
                painter = painterResource(R.drawable.tom), null, modifier = Modifier.fillMaxSize()
            )
        }


    }
}

@Preview(showBackground = true)
@Composable
fun PreviewTomOfferBoxJerryStore() {
    TomOfferBoxJerryStore()
}