package ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.ReadOnlyComposable
import moe.tlaster.precompose.PreComposeApp

object MyNotesTheme {
    val colors: ColorPalette
        @Composable
        @ReadOnlyComposable
        get() = LocalColors.current

    val padding: MyNotesPadding
        @Composable
        @ReadOnlyComposable
        get() = LocalMyNotesPadding.current

    val typography: AppTypography
        @Composable
        @ReadOnlyComposable
        get() = LocalAppTypography.current
}

@Composable
fun MyNotesTheme(
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
            LocalMyNotesPadding provides MyNotesPadding(),
            LocalAppTypography provides typography(),
        ) {
            content()
        }
    }
}
