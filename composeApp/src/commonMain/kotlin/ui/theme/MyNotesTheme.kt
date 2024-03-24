package ui.theme

import androidx.compose.runtime.Composable
import androidx.compose.runtime.ReadOnlyComposable

object MyNotesTheme {
    val colors: ColorPalette
        @Composable
        @ReadOnlyComposable
        get() = LocalColors.current

    val padding: MyNotesPadding
        @Composable
        @ReadOnlyComposable
        get() = LocalMyMoneyPadding.current
}
