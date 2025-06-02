package com.example.tomandjerry.screens

import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.tomandjerry.composable.jerry_store.CheapTomSectionRowJerryStore
import com.example.tomandjerry.composable.jerry_store.JerryStoreTopBar
import com.example.tomandjerry.composable.jerry_store.SearchRowJerryStore
import com.example.tomandjerry.composable.jerry_store.TomOfferBoxJerryStore
import com.example.tomandjerry.composable.jerry_store.TomsSectionForSale

@Composable
fun JerryStore() {
    Scaffold(modifier = Modifier.fillMaxSize(), topBar = { JerryStoreTopBar() }) { innerPadding ->
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .background(color = Color(0xFFEEF4F6))
                .padding(innerPadding)
                .padding(top = 12.dp)
                .fillMaxSize()
                .padding(start = 16.dp, end = 16.dp)
                .verticalScroll(state = ScrollState(0), enabled = true)
        ) {
            SearchRowJerryStore()
            Spacer(Modifier.height(6.dp))
            TomOfferBoxJerryStore()
            Spacer(modifier = Modifier.height(24.dp))
            CheapTomSectionRowJerryStore()
            Spacer(Modifier.height(16.dp))
            TomsSectionForSale()
        }
    }
}

@Preview
@Composable
fun PreviewJerryStore() {
    JerryStore()
}