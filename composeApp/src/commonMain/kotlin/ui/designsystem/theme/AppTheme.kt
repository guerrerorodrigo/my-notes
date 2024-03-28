package ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.ReadOnlyComposable
import moe.tlaster.precompose.PreComposeApp

object AppTheme {
    val colors: ColorPalette
        @Composable
        @ReadOnlyComposable
        get() = LocalColors.current

    val padding: LocalPaddings
        @Composable
        @ReadOnlyComposable
        get() = LocalMyNotesPadding.current

    val typography: AppTypography
        @Composable
        @ReadOnlyComposable
        get() = LocalAppTypography.current
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
            LocalMyNotesPadding provides LocalPaddings(),
            LocalAppTypography provides typography(),
        ) {
            content()
        }
    }
}
