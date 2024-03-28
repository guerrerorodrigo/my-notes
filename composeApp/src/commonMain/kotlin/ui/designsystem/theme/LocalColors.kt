package ui.theme

import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color

private val lightPrimary = Color(0xFF8B418F)
private val lightOnPrimary = Color(0xFFFFFFFF)
private val lightPrimaryContainer = Color(0xFFFFD6FA)
private val lightOnPrimaryContainer = Color(0xFF36003C)
private val lightSecondary = Color(0xFFA23F16)
private val lightOnSecondary = Color(0xFFFFFFFF)
private val lightSecondaryContainer = Color(0xFFFFDBCF)
private val lightOnSecondaryContainer = Color(0xFF380D00)
private val lightTertiary = Color(0xFF006780)
private val lightOnTertiary = Color(0xFFFFFFFF)
private val lightTertiaryContainer = Color(0xFFB8EAFF)
private val lightOnTertiaryContainer = Color(0xFF001F28)
private val lightError = Color(0xFFBA1A1A)
private val lightOnError = Color(0xFFFFFFFF)
private val lightErrorContainer = Color(0xFFFFDAD6)
private val lightOnErrorContainer = Color(0xFF410002)
private val lightBackground = Color(0xFFFCFCFC)
private val lightOnBackground = Color(0xFF201A1B)
private val lightSurface = Color(0xFFFCFCFC)
private val lightOnSurface = Color(0xFF201A1B)
private val lightSurfaceVariant = Color(0xFFEDDEE8)
private val lightOnSurfaceVariant = Color(0xFF4D444C)
private val lightOutline = Color(0xFF7F747C)
private val lightInverseSurface = Color(0xFF362F30)
private val lightOnInverseSurface = Color(0xFFFAEEEF)

private val darkPrimary = Color(0xFFFFA9FE)
private val darkOnPrimary = Color(0xFF560A5D)
private val darkPrimaryContainer = Color(0xFF702776)
private val darkOnPrimaryContainer = Color(0xFFFFD6FA)
private val darkSecondary = Color(0xFFFFB59B)
private val darkOnSecondary = Color(0xFF5B1A00)
private val darkSecondaryContainer = Color(0xFF812800)
private val darkOnSecondaryContainer = Color(0xFFFFDBCF)
private val darkTertiary = Color(0xFF5DD5FC)
private val darkOnTertiary = Color(0xFF003544)
private val darkTertiaryContainer = Color(0xFF004D61)
private val darkOnTertiaryContainer = Color(0xFFB8EAFF)
private val darkError = Color(0xFFFFB4AB)
private val darkOnError = Color(0xFF690005)
private val darkErrorContainer = Color(0xFF93000A)
private val darkOnErrorContainer = Color(0xFFFFDAD6)
private val darkBackground = Color(0xFF201A1B)
private val darkOnBackground = Color(0xFFECDFE0)
private val darkSurface = Color(0xFF201A1B)
private val darkOnSurface = Color(0xFFECDFE0)
private val darkSurfaceVariant = Color(0xFF4D444C)
private val darkOnSurfaceVariant = Color(0xFFD0C3CC)
private val darkOutline = Color(0xFF998D96)
private val darkInverseSurface = Color(0xFFECDFE0)
private val darkOnInverseSurface = Color(0xFF201A1B)

sealed class ColorPalette(
    val primary: Color,
    val onPrimary: Color,
    val primaryContainer: Color,
    val onPrimaryContainer: Color,
    val secondary: Color,
    val onSecondary: Color,
    val secondaryContainer: Color,
    val onSecondaryContainer: Color,
    val tertiary: Color,
    val onTertiary: Color,
    val tertiaryContainer: Color,
    val onTertiaryContainer: Color,
    val error: Color,
    val errorContainer: Color,
    val onError: Color,
    val onErrorContainer: Color,
    val background: Color,
    val onBackground: Color,
    val surface: Color,
    val onSurface: Color,
    val surfaceVariant: Color,
    val onSurfaceVariant: Color,
    val outline: Color,
    val inverseOnSurface: Color,
    val inverseSurface: Color,
) {
    data object Light : ColorPalette(
        primary = lightPrimary,
        onPrimary = lightOnPrimary,
        primaryContainer = lightPrimaryContainer,
        onPrimaryContainer = lightOnPrimaryContainer,
        secondary = lightSecondary,
        onSecondary = lightOnSecondary,
        secondaryContainer = lightSecondaryContainer,
        onSecondaryContainer = lightOnSecondaryContainer,
        tertiary = lightTertiary,
        onTertiary = lightOnTertiary,
        tertiaryContainer = lightTertiaryContainer,
        onTertiaryContainer = lightOnTertiaryContainer,
        error = lightError,
        errorContainer = lightErrorContainer,
        onError = lightOnError,
        onErrorContainer = lightOnErrorContainer,
        background = lightBackground,
        onBackground = lightOnBackground,
        surface = lightSurface,
        onSurface = lightOnSurface,
        surfaceVariant = lightSurfaceVariant,
        onSurfaceVariant = lightOnSurfaceVariant,
        outline = lightOutline,
        inverseOnSurface = lightOnInverseSurface,
        inverseSurface = lightInverseSurface,
    )

    data object Dark : ColorPalette(
        primary = darkPrimary,
        onPrimary = darkOnPrimary,
        primaryContainer = darkPrimaryContainer,
        onPrimaryContainer = darkOnPrimaryContainer,
        secondary = darkSecondary,
        onSecondary = darkOnSecondary,
        secondaryContainer = darkSecondaryContainer,
        onSecondaryContainer = darkOnSecondaryContainer,
        tertiary = darkTertiary,
        onTertiary = darkOnTertiary,
        tertiaryContainer = darkTertiaryContainer,
        onTertiaryContainer = darkOnTertiaryContainer,
        error = darkError,
        errorContainer = darkErrorContainer,
        onError = darkOnError,
        onErrorContainer = darkOnErrorContainer,
        background = darkBackground,
        onBackground = darkOnBackground,
        surface = darkSurface,
        onSurface = darkOnSurface,
        surfaceVariant = darkSurfaceVariant,
        onSurfaceVariant = darkOnSurfaceVariant,
        outline = darkOutline,
        inverseOnSurface = darkOnInverseSurface,
        inverseSurface = darkInverseSurface,
    )
}

val LocalColors = staticCompositionLocalOf<ColorPalette> { ColorPalette.Light }
