package com.ankurjb.budget.ui.screens

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun HomeScreen(modifier: Modifier = Modifier) = Scaffold(
    modifier = Modifier.fillMaxSize()
) { innerPadding ->
    Text(
        modifier = Modifier
            .padding(innerPadding)
            .padding(horizontal = 16.dp), text = "Budget"
    )
}
