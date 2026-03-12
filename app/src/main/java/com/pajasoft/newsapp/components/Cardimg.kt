package com.pajasoft.newsapp.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import com.pajasoft.newsapp.models.Noticia

@Composable
fun Cardimg(noticia: Noticia){
    Column(
        modifier = Modifier
            .padding(5.dp)
            .clip(RoundedCornerShape(15.dp))
            .background(Color(0xFFF0F0F0))
    ) {
        AsyncImage(
            model = noticia.img,
            contentDescription = noticia.title,
            modifier = Modifier
                .fillMaxWidth()
                .height(120.dp),
            contentScale = ContentScale.Crop

        )
        Text(
            text = noticia.title,
            fontSize = 15.sp,
            modifier = Modifier
                .padding(10.dp)
        )
    }
}