package ui.designsystem.checkbox

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import kotlinx.collections.immutable.ImmutableList
import kotlinx.collections.immutable.persistentListOf
import ui.theme.AppTheme

@Composable
fun CheckboxGroup(
    options: ImmutableList<String>,
    onCheckedChange: (Boolean, Int) -> Unit,
    modifier: Modifier = Modifier,
    selectedIndexes: ImmutableList<Int> = persistentListOf(),
    disabledIndexes: ImmutableList<Int> = persistentListOf(),
) {
    Column(
        modifier = modifier
            .padding(all = AppTheme.padding.ml),
        verticalArrangement = Arrangement.spacedBy(AppTheme.padding.ml),
    ) {
        options.forEachIndexed { index, option ->
            Row(
                horizontalArrangement = Arrangement.spacedBy(AppTheme.padding.sm),
                verticalAlignment = Alignment.CenterVertically,
            ) {
                Text(
                    text = option,
                    style = AppTheme.typography.bodyMedium,
                    color = AppTheme.colors.onBackground,
                )
                Checkbox(
                    checked = selectedIndexes.contains(index),
                    enabled = !disabledIndexes.contains(index),
                    onCheckedChange = {
                        onCheckedChange(it, index)
                    },
                )
            }
        }
    }
}
