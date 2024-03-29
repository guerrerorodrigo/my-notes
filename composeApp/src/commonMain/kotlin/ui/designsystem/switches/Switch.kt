package ui.designsystem.switches

import androidx.compose.material3.SwitchDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import ui.theme.AppTheme
import androidx.compose.material3.Switch as ComposeSwitch

@Composable
fun Switch(
    checked: Boolean,
    enabled: Boolean,
    onCheckedChanged: (Boolean) -> Unit,
    modifier: Modifier = Modifier,
) {
    ComposeSwitch(
        modifier = modifier,
        checked = checked,
        enabled = enabled,
        onCheckedChange = onCheckedChanged,
        colors = SwitchDefaults.colors(
            checkedTrackColor = AppTheme.colors.onPrimaryContainer,
            checkedThumbColor = AppTheme.colors.primaryContainer,
            uncheckedTrackColor = AppTheme.colors.onSurfaceVariant,
            uncheckedThumbColor = AppTheme.colors.surfaceVariant,
            uncheckedBorderColor = Color.Transparent,
            disabledCheckedThumbColor = AppTheme.colors.surface,
            disabledCheckedTrackColor = AppTheme.colors.onSurface,
            disabledUncheckedThumbColor = AppTheme.colors.surface,
            disabledUncheckedTrackColor = AppTheme.colors.onSurface,
            disabledCheckedBorderColor = Color.Transparent,
            disabledUncheckedBorderColor = Color.Transparent,
        ),
    )
}
