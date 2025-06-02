package com.example.tomandjerry.composable.jerry_store

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.tomandjerry.R

@Composable
fun TomsSectionForSale() {
    Row {
        TomItemForSaleJerryStore(
            title = "Sport Tom",
            description = "He runs 1 meter... trips over his boot.\n",
            img = R.drawable.tom_1_in_sale,
            numCheeses = 3,
            numCheesesBeforeDisc = 5
        )
        Spacer(Modifier.width(width = 8.dp))
        TomItemForSaleJerryStore(
            title = "Tom the lover",
            description = "He loves one-sidedly... and is beaten by the other side.",
            img = R.drawable.tom_2_in_sale,
            numCheeses = 5
        )
    }
    Spacer(modifier = Modifier.height(12.dp))
    Row {
        TomItemForSaleJerryStore(
            title = "Tom the bomb",
            description = "He blows himself up before Jerry can catch him.",
            img = R.drawable.tom_3_in_sale,
            numCheeses = 10
        )
        Spacer(Modifier.width(width = 8.dp))
        TomItemForSaleJerryStore(
            title = "Spy Tom",
            description = "Disguises itself as a table.\n" + "\n",
            img = R.drawable.tom_4_in_sale,
            numCheeses = 12
        )


    }
    Spacer(modifier = Modifier.height(12.dp))
    Row {
        TomItemForSaleJerryStore(
            title = "Frozen Tom",
            description = "He was chasing Jerry, he froze after the first look\n",
            img = R.drawable.tom_5_in_sale,
            numCheeses = 10
        )
        Spacer(Modifier.width(width = 8.dp))
        TomItemForSaleJerryStore(
            title = "Sleeping Tom",
            description = "He doesn't chase anyone, he just snores in stereo.\n",
            img = R.drawable.tom_6_in_sale,
            numCheeses = 10
        )
    }
    Spacer(modifier = Modifier.height(12.dp))
}