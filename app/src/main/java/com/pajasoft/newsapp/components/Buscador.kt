package com.pajasoft.newsapp.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun Buscador(){
    OutlinedTextField(
        value = "",
        onValueChange = {},
        placeholder = {
            Text(
                text = "Buscar"
            )
        },
        leadingIcon = {
            Icon(
                imageVector = Icons.Default.Home,
                contentDescription = "Home"
            )
        },
        shape = RoundedCornerShape(45.dp),
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 10.dp, bottom = 10.dp)
    )
}