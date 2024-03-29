package ui.designsystem.theme

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.unit.dp

data class AppShapes(
    val large: Shape = RoundedCornerShape(size = 100.dp),
    val medium: Shape = RoundedCornerShape(size = 24.dp),
)

val LocalShapes = staticCompositionLocalOf { AppShapes() }
