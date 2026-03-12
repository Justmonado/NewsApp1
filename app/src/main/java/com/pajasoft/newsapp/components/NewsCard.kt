package com.pajasoft.newsapp.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.pajasoft.newsapp.models.Noticia

@Composable
fun NewsCard(noticia: Noticia){
    Box(
        modifier = Modifier
            .padding(end = 15.dp)
            .width(200.dp)
            .height(150.dp)
            .clip(RoundedCornerShape(15.dp))
            .background(Color(0xFF7B61FF))
    ){
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(Color(0xFF7B61FF))
        )
        Column(
            modifier = Modifier
                .align(Alignment.BottomStart)
                .padding(15.dp)
        ) {
            Text(
                text = noticia.title,
                color = Color.White,
                fontWeight = FontWeight.Bold,
                fontSize = 15.sp
            )
            Text(
                text = noticia.fecha,
                color = Color.White,
                fontSize = 12.sp,
                modifier = Modifier
                    .padding(top = 5.dp)
            )
        }
    }
}