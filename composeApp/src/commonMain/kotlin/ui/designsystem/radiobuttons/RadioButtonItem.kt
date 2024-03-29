package ui.designsystem.radiobuttons

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import ui.theme.AppTheme

@Composable
fun RadioButtonItem(
    selected: Boolean,
    enabled: Boolean,
    text: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(AppTheme.padding.m),
        modifier = modifier,
    ) {
        RadioButton(selected = selected, enabled = enabled, onClick = onClick)
        Text(
            text = text,
            style = AppTheme.typography.bodyMedium,
            color = AppTheme.colors.onBackground,
        )
    }
}
