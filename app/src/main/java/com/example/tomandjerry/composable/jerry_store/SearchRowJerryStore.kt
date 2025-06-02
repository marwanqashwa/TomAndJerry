package com.example.tomandjerry.composable.jerry_store

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tomandjerry.R
import com.example.tomandjerry.ui.theme.ibmPlex

@Composable
fun SearchRowJerryStore() {
    Row {
        Row(
            modifier = Modifier
                .size(272.dp, 48.dp)
                .clip(RoundedCornerShape(8.dp))
                .border(width = 1.dp, color = Color(0X14A5A6A4), shape =RoundedCornerShape(8.dp) )
                .background(
                    color = Color(0xFFFFFFFF)
                )

                .padding(12.dp)
        ) {
            Icon(
                painter = painterResource(R.drawable.search_1),
                contentDescription = null,
                modifier = Modifier.size(24.dp, 24.dp),
                tint = Color(0XFF969799)
            )
            Spacer(Modifier.width(8.dp))
            Text(
                "Search about tom ...",
                modifier = Modifier.size(216.dp, 21.dp),
                fontFamily = ibmPlex,
                fontWeight = FontWeight(400),
                fontSize = 14.sp,
                color = Color(0XFF969799)
            )

        }
        Spacer(Modifier.width(8.dp))
        Box(
            Modifier
                .size(48.dp)
                .background(color = Color(0XFF03578A), shape = RoundedCornerShape(12.dp))
        ) {
            Icon(
                painter = painterResource(R.drawable.filter_horizontal),
                contentDescription = null,
                modifier = Modifier
                    .size(24.dp, 24.dp)
                    .align(Alignment.Center),
                tint = Color(0XFFFFFFFF)
            )
        }

    }
}

@Preview(showBackground = true)
@Composable
fun PreviewSearchRowJerryStore() {
    SearchRowJerryStore()
}