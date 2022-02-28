package com.jefisu.wallpaperscompose.util

import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.PagerState
import com.jefisu.wallpaperscompose.presentation.GreetingScreen
import com.jefisu.wallpaperscompose.presentation.HomeScreen
import kotlinx.coroutines.CoroutineScope

@ExperimentalAnimationApi
@ExperimentalFoundationApi
@ExperimentalPagerApi
@Composable
fun Navigation(
    navController: NavHostController,
    scope: CoroutineScope,
    pagerState: PagerState
) {
    NavHost(
        navController = navController,
        startDestination = Screen.Greeting.route
    ) {
        composable(route = Screen.Greeting.route) {
            GreetingScreen(
                navController = navController,
                pagerState = pagerState
            )
        }
        composable(route = Screen.Home.route) {
            EnterAnimation {
                HomeScreen(pagerState = pagerState, scope = scope)
            }
        }
    }
}