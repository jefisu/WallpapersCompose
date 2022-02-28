package com.jefisu.wallpaperscompose.presentation

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.PagerState
import com.jefisu.wallpaperscompose.presentation.components.StandardTabRow
import kotlinx.coroutines.CoroutineScope

@ExperimentalFoundationApi
@ExperimentalPagerApi
@Composable
fun HomeScreen(
    pagerState: PagerState,
    scope: CoroutineScope
) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
    ) {
        Text(text = "Wallpapers", style = MaterialTheme.typography.h4)
        Spacer(modifier = Modifier.height(8.dp))
        StandardTabRow(pagerState = pagerState, scope = scope)
    }
}