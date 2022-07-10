package com.crypto.encrypditmobile.ui.theme

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Shapes
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.unit.dp

val shapeSize = mapOf(
    "small" to 24.dp,
    "medium" to 12.dp,
    "large" to 4.dp,
    "component" to 0.dp,
    "surface" to 0.dp,
    "button" to 48.dp,
    "photo" to 60.dp
)

@Immutable
data class ReplacementShapes(
    val component: Shape = RoundedCornerShape(shapeSize.getValue("component")),
    val surface: Shape = RoundedCornerShape(shapeSize.getValue("surface")),
    val button: Shape = RoundedCornerShape(shapeSize.getValue("button")),
    val photo: Shape = RoundedCornerShape(shapeSize.getValue("photo")),
)

val LocalReplacementShapes = staticCompositionLocalOf {
    ReplacementShapes(
        component = RoundedCornerShape(shapeSize.getValue("component")),
        surface = RoundedCornerShape(shapeSize.getValue("surface")),
        button = RoundedCornerShape(shapeSize.getValue("button")),
        photo = RoundedCornerShape(shapeSize.getValue("photo"))
    )
}

val Shapes = Shapes(
    small = RoundedCornerShape(24.dp),
    medium = RoundedCornerShape(12.dp),
    large = RoundedCornerShape(4.dp)
)