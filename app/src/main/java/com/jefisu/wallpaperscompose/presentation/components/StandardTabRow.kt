package com.jefisu.wallpaperscompose.presentation.components

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.material.ScrollableTabRow
import androidx.compose.material.Tab
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.PagerState
import com.jefisu.wallpaperscompose.util.Image
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch

@ExperimentalFoundationApi
@ExperimentalPagerApi
@Composable
fun StandardTabRow(
    pagerState: PagerState,
    scope: CoroutineScope,
    pagesTitle: List<String> = listOf("Game", "Anime", "Scenery", "Art", "Movie"),
    images: List<Image> = listOf(Image.Game, Image.Anime, Image.Scenery, Image.Art, Image.Movie)
) {
    ScrollableTabRow(
        selectedTabIndex = pagerState.currentPage,
        backgroundColor = Color.Transparent
    ) {
        pagesTitle.forEachIndexed { index, title ->
            Tab(
                selected = pagerState.currentPage == index,
                text = { Text(text = title) },
                onClick = {
                    scope.launch {
                        pagerState.scrollToPage(index)
                    }
                }
            )
        }
    }
    PagerContent(
        pagesTitle = pagesTitle,
        pagerState = pagerState,
        image = images[pagerState.currentPage]
    )
}