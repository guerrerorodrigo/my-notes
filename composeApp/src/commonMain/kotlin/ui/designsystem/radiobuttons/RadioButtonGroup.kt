package ui.designsystem.radiobuttons

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.selection.selectable
import androidx.compose.foundation.selection.selectableGroup
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.semantics.Role
import kotlinx.collections.immutable.ImmutableList
import kotlinx.collections.immutable.persistentListOf
import ui.theme.AppTheme

@Composable
fun RadioButtonGroup(
    title: String,
    options: ImmutableList<String>,
    selectedIndex: Int,
    onOptionSelected: (Int) -> Unit,
    modifier: Modifier = Modifier,
    disabledIndexes: ImmutableList<Int> = persistentListOf(),
) {
    Column(
        modifier = modifier
            .padding(all = AppTheme.padding.ml)
            .selectableGroup(),
        verticalArrangement = Arrangement.spacedBy(AppTheme.padding.sm),
    ) {
        Text(
            text = title,
            style = AppTheme.typography.bodyMedium,
            color = AppTheme.colors.onBackground,
            modifier = Modifier.padding(top = AppTheme.padding.sm),
        )
        options.forEachIndexed { index, text ->
            Row(
                Modifier
                    .fillMaxWidth()
                    .selectable(
                        selected = index == selectedIndex,
                        onClick = { onOptionSelected(index) },
                        role = Role.RadioButton,
                    ),
                verticalAlignment = Alignment.CenterVertically,
            ) {
                RadioButtonItem(
                    selected = selectedIndex == index,
                    enabled = !disabledIndexes.contains(index),
                    onClick = { onOptionSelected(index) },
                    text = text,
                )
            }
        }
    }
}
