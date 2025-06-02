package com.example.tomandjerry.composable.jerry_store

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tomandjerry.R
import com.example.tomandjerry.ui.theme.ibmPlex

@Composable
fun TomItemForSaleJerryStore(
    numCheesesBeforeDisc: Int = 0, numCheeses: Int = 0, title: String, description: String, img: Int
) {
    Box(Modifier.size(160.dp, 235.dp)) {
        Box(
            Modifier
                .size(160.dp, 219.dp)
                .background(color = Color.White, RoundedCornerShape(16.dp))
                .align(Alignment.BottomStart)
                .padding(8.dp)
        ) {

            Column(
                modifier = Modifier
                    .size(144.dp, 119.dp)
                    .align(Alignment.BottomEnd),
                verticalArrangement = Arrangement.Bottom,
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {
                Column(
                    modifier = Modifier.size(144.dp, 81.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        title,
                        modifier = Modifier.size(144.dp, 27.dp),
                        fontFamily = ibmPlex,
                        fontSize = 18.sp,
                        fontWeight = FontWeight(600),
                        color = Color(0xFF1F1F1E),
                        letterSpacing = 0.sp,
                        textAlign = TextAlign.Center,
                        lineHeight = 18.sp
                    )
                    Text(
                        description,
                        modifier = Modifier.size(144.dp, 54.dp),
                        fontFamily = ibmPlex,
                        fontSize = 12.sp,
                        fontWeight = FontWeight(400),
                        color = Color(0xFF969799),
                        letterSpacing = 0.sp,
                        textAlign = TextAlign.Center,
                        lineHeight = 18.sp
                    )
                }
                Row(
                    verticalAlignment = Alignment.Bottom,
                    horizontalArrangement = Arrangement.Start,
                    modifier = Modifier.size(144.dp, 30.dp)
                ) {
                    Row(
                        modifier = Modifier
                            .size(106.dp, 30.dp)
                            .background(
                                color = Color(0xFFE9F6FB), shape = RoundedCornerShape(8.dp)
                            )
                            .padding(horizontal = 10.dp, vertical = 6.dp)
                    ) {
                        Box(modifier = Modifier.padding(top = 1.dp)) {
                            Icon(
                                painter = painterResource(R.drawable.money_bag_01),
                                contentDescription = null,
                                tint = Color(0xFF03578A)
                            )
                        }

                        Spacer(Modifier.width(1.dp))

                        if (numCheesesBeforeDisc > 0) {
                            Text(
                                "$numCheesesBeforeDisc",
                                fontFamily = ibmPlex,
                                fontSize = 12.sp,
                                fontWeight = FontWeight(500),
                                color = Color(0xFF03578A),
                                letterSpacing = 0.sp,
                                textAlign = TextAlign.Center,
                                lineHeight = 12.sp,
                                textDecoration = TextDecoration.LineThrough
                            )
                            Text(
                                " $numCheeses cheeses",
                                fontFamily = ibmPlex,
                                fontSize = 12.sp,
                                fontWeight = FontWeight(500),
                                color = Color(0xFF03578A),
                                letterSpacing = 0.sp,
                                textAlign = TextAlign.Center,
                                lineHeight = 12.sp,
                            )
                        } else {
                            Text(
                                "$numCheeses cheeses",
                                fontFamily = ibmPlex,
                                fontSize = 12.sp,
                                fontWeight = FontWeight(500),
                                color = Color(0xFF03578A),
                                letterSpacing = 0.sp,
                                textAlign = TextAlign.Center,
                                lineHeight = 12.sp,
                            )
                        }
                    }

                    Box(modifier = Modifier.fillMaxSize()) {
                        Box(
                            modifier = Modifier
                                .size(30.dp, 30.dp)
                                .border(
                                    width = 1.dp,
                                    color = Color(0xFF03578A),
                                    shape = RoundedCornerShape(8.dp)
                                )
                                .align(Alignment.CenterEnd)
                        ) {
                            Icon(
                                painter = painterResource(R.drawable.add_to_cart_icon),
                                contentDescription = null,
                                tint = Color(0xFF03578A),
                                modifier = Modifier.align(Alignment.Center)
                            )
                        }
                    }

                }
            }
        }

        Image(
            painterResource(img),
            contentDescription = null,
            modifier = Modifier
                .align(Alignment.TopCenter)
                .height(100.dp),
            contentScale = ContentScale.FillHeight

        )
    }

}

@Preview(showBackground = true, backgroundColor = 6)
@Composable
fun PreviewTomItemForSaleJerryStore() {
    TomItemForSaleJerryStore(
        title = "Sport Tom",
        description = "He runs 1 meter... trips over his boot.\n",
        img = R.drawable.tom_1_in_sale
    )

}