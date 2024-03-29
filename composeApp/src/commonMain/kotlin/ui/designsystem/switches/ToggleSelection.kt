package ui.designsystem.switches

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import ui.theme.AppTheme

@Composable
fun ToggleSelection(
    selected: Boolean,
    text: String,
    onSelectedChanged: (Boolean) -> Unit,
    modifier: Modifier = Modifier,
) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween,
        modifier = modifier
            .background(
                color = if (selected) {
                    AppTheme.colors.primaryContainer
                } else {
                    AppTheme.colors.surfaceVariant

                },
                shape = AppTheme.shapes.medium,
            )
            .padding(all = AppTheme.padding.m),
    ) {
        Text(text = text, style = AppTheme.typography.labelLarge, color = AppTheme.colors.onSurface)
        Switch(enabled = true, checked = selected, onCheckedChanged = onSelectedChanged)
    }
}
