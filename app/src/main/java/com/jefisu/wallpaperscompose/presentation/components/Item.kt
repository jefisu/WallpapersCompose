package com.jefisu.wallpaperscompose.presentation.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun Item(
    image: Int
) {
    Box (modifier = Modifier.padding(8.dp)) {
        Image(
            painter = painterResource(
                id = image
            ),
            contentDescription = "",
            modifier = Modifier.clip(RoundedCornerShape(16.dp))
        )
    }
}