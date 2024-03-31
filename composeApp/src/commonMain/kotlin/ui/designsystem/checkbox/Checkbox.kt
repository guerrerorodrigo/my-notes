package ui.designsystem.checkbox

import androidx.compose.material3.CheckboxDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import ui.theme.AppTheme
import androidx.compose.material3.Checkbox as ComposeCheckbox

@Composable
fun Checkbox(
    checked: Boolean,
    onCheckedChange: (Boolean) -> Unit,
    enabled: Boolean,
    modifier: Modifier = Modifier,
) {
    ComposeCheckbox(
        modifier = modifier,
        checked = checked,
        onCheckedChange = onCheckedChange,
        enabled = enabled,
        colors = CheckboxDefaults.colors(
            checkedColor = AppTheme.colors.primary,
            uncheckedColor = AppTheme.colors.outline,
            checkmarkColor = AppTheme.colors.background,
            disabledCheckedColor = AppTheme.colors.outline,
            disabledUncheckedColor = Color.White,
        ),
    )
}
