package com.jefisu.wallpaperscompose.presentation.components

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.HorizontalPager
import com.google.accompanist.pager.PagerState
import com.google.accompanist.pager.rememberPagerState
import com.jefisu.wallpaperscompose.R
import com.jefisu.wallpaperscompose.util.Image

@ExperimentalFoundationApi
@ExperimentalPagerApi
@Composable
fun PagerContent(
    pagesTitle: List<String>,
    pagerState: PagerState,
    image: Image
) {
    HorizontalPager(
        count = pagesTitle.size,
        state = pagerState,
    ) {
        LazyVerticalGrid(
            cells = GridCells.Fixed(2),
            modifier = Modifier.fillMaxSize()
        ) {
            items(image.images) { image ->
                Item(image = image)
            }
        }
    }
}

@ExperimentalPagerApi
@ExperimentalFoundationApi
@Preview(showBackground = true)
@Composable
fun PreviewPagerContent() {
    PagerContent(
        pagesTitle = listOf("Art", "Movie"), pagerState = rememberPagerState(),
        Image.Anime
    )
}