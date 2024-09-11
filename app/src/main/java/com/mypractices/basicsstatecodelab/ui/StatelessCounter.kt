package com.mypractices.basicsstatecodelab.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun StatelessCounter(count: Int, onIcrement: () -> Unit, modifier: Modifier = Modifier) {
    Column(
        modifier = modifier.padding(16.dp)
    ) {
        if (count > 0) {
            Text(text = "You've had $count glasses.")
        }
        Button(onClick = onIcrement, Modifier.padding(top = 8.dp), enabled = count < 10) {
            Text(text = "Add one")
        }
    }
}