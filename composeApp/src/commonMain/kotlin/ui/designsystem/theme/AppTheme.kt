package ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.ReadOnlyComposable
import moe.tlaster.precompose.PreComposeApp
import ui.designsystem.theme.AppShapes
import ui.designsystem.theme.LocalShapes

object AppTheme {
    val colors: ColorPalette
        @Composable
        @ReadOnlyComposable
        get() = LocalColors.current

    val padding: AppPaddings
        @Composable
        @ReadOnlyComposable
        get() = LocalPaddings.current

    val typography: AppTypography
        @Composable
        @ReadOnlyComposable
        get() = LocalTypography.current

    val shapes: AppShapes
        @Composable
        @ReadOnlyComposable
        get() = LocalShapes.current
}

@Composable
fun AppTheme(
    useDarkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit,
) {
    PreComposeApp {
        val colors = if (!useDarkTheme) {
            ColorPalette.Light
        } else {
            ColorPalette.Dark
        }

        CompositionLocalProvider(
            LocalColors provides colors,
            LocalPaddings provides AppPaddings(),
            LocalTypography provides typography(),
            LocalShapes provides AppShapes(),
        ) {
            content()
        }
    }
}
