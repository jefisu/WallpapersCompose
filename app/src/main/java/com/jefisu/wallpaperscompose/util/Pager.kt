package com.jefisu.wallpaperscompose.util

import com.jefisu.wallpaperscompose.R

sealed class Pager(
    val profile: Int,
    val title: String,
    val description: String,
) {
    object GamesFirst : Pager(
        profile = R.drawable.mario,
        title = "Game",
        description = "Lorem Ipsum is simply dummy text of the printing and typesetting industry.",

    )

    object AnimeSecond : Pager(
        profile = R.drawable.zoro,
        title = "Anime",
        description = "Lorem Ipsum is simply dummy text of the printing and typesetting industry.",
    )
}