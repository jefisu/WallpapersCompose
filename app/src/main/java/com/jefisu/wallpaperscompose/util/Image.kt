package com.jefisu.wallpaperscompose.util

import com.jefisu.wallpaperscompose.R

sealed class Image(val images: List<Int>) {
    object Game : Image(
        images = listOf(
            R.drawable.super_mario
        )
    )

    object Anime : Image(
        images = listOf(
            R.drawable.trafalgar_law,
            R.drawable.roronoa_zoro
        )
    )

    object Scenery : Image(
        images = listOf(
            R.drawable.scenery1
        )
    )

    object Art : Image(
        images = listOf(
            R.drawable.art1
        )
    )

    object Movie : Image(
        images = listOf(
            R.drawable.spider_man
        )
    )
}
