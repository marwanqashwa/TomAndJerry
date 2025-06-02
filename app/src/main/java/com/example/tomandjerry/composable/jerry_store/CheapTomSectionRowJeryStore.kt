package com.example.tomandjerry.composable.jerry_store

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tomandjerry.R
import com.example.tomandjerry.ui.theme.ibmPlex

@Composable
fun CheapTomSectionRowJerryStore() {
    Row(
        horizontalArrangement = Arrangement.Start, verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            "Cheap tom section",
            modifier = Modifier.size(173.dp, 30.dp),
            fontFamily = ibmPlex,
            fontSize = 20.sp,
            fontWeight = FontWeight(600),
            color = Color(0xFF1F1F1E),
            letterSpacing = 0.sp,
            lineHeight = 20.sp
        )
        Spacer(modifier = Modifier.weight(1f))
        Row(
            horizontalArrangement = Arrangement.End, verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                "View all",
                modifier = Modifier.size(44.dp, 18.dp),
                fontFamily = ibmPlex,
                fontSize = 12.sp,
                fontWeight = FontWeight(500),
                color = Color(0xFF03578A),
                letterSpacing = 0.sp,
                lineHeight = 12.sp
            )
            Icon(
                painter = painterResource(R.drawable.arrow_right_04),
                contentDescription = null,
                modifier = Modifier.size(12.dp, 12.dp),
                tint = Color(0xff03578A)
            )
        }


    }
}

@Preview(showBackground = true)
@Composable
fun PreviewCheapTomSectionRowJerryStore() {
    CheapTomSectionRowJerryStore()
}