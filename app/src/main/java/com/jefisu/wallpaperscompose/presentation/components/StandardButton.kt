package com.jefisu.wallpaperscompose.presentation.components

import androidx.compose.animation.*
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.OutlinedButton
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.sp

@ExperimentalAnimationApi
@Composable
fun StandardButton(
    text: String,
    modifier: Modifier = Modifier,
    isVisible: Boolean = false,
    onClick: () -> Unit = {}
) {
    Box(modifier = modifier) {
        AnimatedVisibility(
            visible = isVisible,
            modifier = Modifier.fillMaxWidth(),
            enter = fadeIn() + scaleIn(),
            exit = fadeOut() + scaleOut()
        ) {
            OutlinedButton(
                onClick = onClick,
                colors = ButtonDefaults.buttonColors(
                    backgroundColor = Color(0x831AFFDA)
                )
            ) {
                Text(
                    text = text,
                    fontSize = 22.sp
                )
            }
        }
    }
}