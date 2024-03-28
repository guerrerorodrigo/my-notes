package ui.designsystem.buttons

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.ripple.LocalRippleTheme
import androidx.compose.material.ripple.RippleAlpha
import androidx.compose.material.ripple.RippleTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import ui.theme.AppTheme

private class PrimaryButtonRippleTheme : RippleTheme {
    @Composable
    override fun defaultColor() = Color.White

    @Composable
    override fun rippleAlpha() = RippleAlpha(
        draggedAlpha = 0.2f,
        focusedAlpha = 0.12f,
        hoveredAlpha = 0.08f,
        pressedAlpha = 0.12f,
    )
}

@Composable
fun PrimaryButton(
    text: String,
    enabled: Boolean,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    isSystemInDarkTheme: Boolean = isSystemInDarkTheme(),
) {
    val color = getButtonContentColor(enabled, isSystemInDarkTheme)

    PrimaryButton(
        modifier = modifier,
        enabled = enabled,
        onClick = onClick,
        contentPadding = PaddingValues(
            horizontal = AppTheme.padding.ml,
            vertical = AppTheme.padding.s,
        ),
    ) {
        Text(text = text, style = AppTheme.typography.labelLarge, color = color)
    }
}

@Composable
fun PrimaryButton(
    text: String,
    enabled: Boolean,
    onClick: () -> Unit,
    icon: ImageVector,
    modifier: Modifier = Modifier,
    isSystemInDarkTheme: Boolean = isSystemInDarkTheme(),
) {
    val color = getButtonContentColor(enabled, isSystemInDarkTheme)
    PrimaryButton(
        modifier = modifier,
        enabled = enabled,
        onClick = onClick,
        contentPadding = PaddingValues(
            end = AppTheme.padding.ml,
            start = AppTheme.padding.m,
            top = AppTheme.padding.s,
            bottom = AppTheme.padding.s,
        ),
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(AppTheme.padding.s),
        ) {
            Icon(imageVector = icon, contentDescription = null, tint = color)
            Text(
                text = text,
                style = AppTheme.typography.labelLarge,
                color = color,
            )
        }
    }
}

@Composable
private fun PrimaryButton(
    enabled: Boolean,
    onClick: () -> Unit,
    contentPadding: PaddingValues,
    modifier: Modifier = Modifier,
    isSystemInDarkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit,
) {
    CompositionLocalProvider(LocalRippleTheme provides PrimaryButtonRippleTheme()) {
        Button(
            modifier = modifier,
            enabled = enabled,
            onClick = onClick,
            colors = ButtonDefaults.buttonColors(
                backgroundColor = if (isSystemInDarkTheme) {
                    AppTheme.colors.primary
                } else {
                    AppTheme.colors.inverseSurface
                },
                contentColor = AppTheme.colors.onPrimary,
                disabledBackgroundColor = if (isSystemInDarkTheme) {
                    Color(0x1fE3E3E3)
                } else {
                    Color(0x1F1F1F1F)
                },
                disabledContentColor = AppTheme.colors.onSurface,
            ),
            shape = AppTheme.shapes.large,
            elevation = null,
            contentPadding = contentPadding,
        ) {
            content()
        }
    }
}

@Composable
private fun getButtonContentColor(
    enabled: Boolean,
    isSystemInDarkTheme: Boolean
): Color {
    val color = when {
        !enabled && isSystemInDarkTheme -> AppTheme.colors.onSurface.copy(alpha = 0.3f)
        enabled -> AppTheme.colors.onPrimary
        else -> Color(0x801F1F1F)
    }
    return color
}
