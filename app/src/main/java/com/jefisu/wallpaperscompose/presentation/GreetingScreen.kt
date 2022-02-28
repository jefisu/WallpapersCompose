package com.jefisu.wallpaperscompose.presentation

import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.HorizontalPager
import com.google.accompanist.pager.HorizontalPagerIndicator
import com.google.accompanist.pager.PagerState
import com.jefisu.wallpaperscompose.util.Pager
import com.jefisu.wallpaperscompose.util.Screen
import com.jefisu.wallpaperscompose.presentation.components.PagerInitial
import com.jefisu.wallpaperscompose.presentation.components.StandardButton

@ExperimentalAnimationApi
@ExperimentalPagerApi
@Composable
fun GreetingScreen(
    pagerState: PagerState,
    navController: NavController
) {
    val pages: List<Pager> = listOf(
        Pager.GamesFirst,
        Pager.AnimeSecond
    )
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        HorizontalPager(
            modifier = Modifier.weight(8f),
            count = pages.size,
            state = pagerState,
        ) { index ->
            PagerInitial(
                pager = pages[index],
                modifier = Modifier.fillMaxWidth()
            )
        }
        HorizontalPagerIndicator(
            pagerState = pagerState,
            modifier = Modifier
                .weight(1f)
                .align(Alignment.CenterHorizontally)
        )
        StandardButton(
            text = "Finish",
            isVisible = pagerState.currentPage == 1,
            modifier = Modifier
                .fillMaxWidth()
                .padding(12.dp)
                .weight(1f)
        ) {
            navController.popBackStack()
            navController.navigate(Screen.Home.route)
        }
    }
}