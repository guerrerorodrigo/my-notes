package ui.designsystem.buttons

import androidx.compose.foundation.background
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsFocusedAsState
import androidx.compose.foundation.interaction.collectIsHoveredAsState
import androidx.compose.foundation.interaction.collectIsPressedAsState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Icon
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import ui.theme.AppTheme
import androidx.compose.material.IconButton as ComposeIconButton

@Composable
fun IconButton(
    icon: ImageVector,
    enabled: Boolean,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
) {
    val interactionSource = remember { MutableInteractionSource() }
    val isPressed by interactionSource.collectIsPressedAsState()
    val isHovered by interactionSource.collectIsHoveredAsState()
    val isFocused by interactionSource.collectIsFocusedAsState()

    IconButton(
        icon = icon,
        enabled = enabled,
        onClick = onClick,
        interactionSource = interactionSource,
        backgroundColor = when {
            isPressed || isHovered || isFocused -> AppTheme.colors.onSurface.copy(alpha = 0.08f)
            else -> Color.Transparent
        },
        tint = when {
            enabled -> AppTheme.colors.onSurfaceVariant
            else -> AppTheme.colors.onSurfaceVariant.copy(0.3f)
        },
        modifier = modifier,
    )
}

@Composable
fun FilledIconButton(
    icon: ImageVector,
    enabled: Boolean,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
) {
    IconButton(
        icon = icon,
        enabled = enabled,
        onClick = onClick,
        backgroundColor = when {
            enabled -> AppTheme.colors.primary
            else -> Color(0x1FE6E1E5)
        },
        tint = when {
            enabled -> AppTheme.colors.onPrimary
            else -> AppTheme.colors.onSurfaceVariant
        },
        modifier = modifier,
    )
}

@Composable
private fun IconButton(
    icon: ImageVector,
    enabled: Boolean,
    onClick: () -> Unit,
    backgroundColor: Color,
    tint: Color,
    modifier: Modifier = Modifier,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) {
    ComposeIconButton(
        enabled = enabled,
        onClick = onClick,
        interactionSource = interactionSource,
        modifier = modifier
            .background(
                color = backgroundColor,
                shape = CircleShape,
            ),
    ) {
        Icon(
            imageVector = icon,
            contentDescription = null,
            tint = tint,
        )
    }
}
