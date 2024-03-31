package ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.outlined.Add
import androidx.compose.material.icons.outlined.Bookmark
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import kotlinx.collections.immutable.persistentListOf
import ui.components.MainBottomAppBar
import ui.designsystem.buttons.FilledIconButton
import ui.designsystem.buttons.IconButton
import ui.designsystem.buttons.PrimaryButton
import ui.designsystem.buttons.SecondaryButton
import ui.designsystem.buttons.TertiaryButton
import ui.designsystem.checkbox.Checkbox
import ui.designsystem.checkbox.CheckboxGroup
import ui.designsystem.radiobuttons.RadioButton
import ui.designsystem.radiobuttons.RadioButtonGroup
import ui.designsystem.radiobuttons.RadioButtonItem
import ui.designsystem.switches.Switch
import ui.designsystem.switches.ToggleSelection
import ui.navigation.NavDestination
import ui.theme.AppTheme

@Composable
internal fun MainScreen(
    navigateTo: (NavDestination) -> Unit,
    modifier: Modifier = Modifier,
) {
    Scaffold(
        modifier = modifier,
        bottomBar = { MainBottomAppBar(navigateTo = navigateTo) },
    ) { innerPadding ->
        Column(
            verticalArrangement = Arrangement.spacedBy(AppTheme.padding.m),
            modifier = Modifier
                .fillMaxSize()
                .background(color = AppTheme.colors.background)
                .padding(innerPadding)
                .padding(all = AppTheme.padding.m)
                .verticalScroll(state = rememberScrollState()),
        ) {
            PrimaryButton(text = "Enabled", enabled = true, onClick = {})
            PrimaryButton(text = "Disabled", enabled = false, onClick = {})
            PrimaryButton(text = "Enabled", enabled = true, onClick = {}, icon = Icons.Default.Add)
            PrimaryButton(
                text = "Disabled",
                enabled = false,
                onClick = {},
                icon = Icons.Default.Add
            )

            SecondaryButton(text = "Enabled", enabled = true, onClick = {})
            SecondaryButton(text = "Disabled", enabled = false, onClick = {})
            SecondaryButton(
                text = "Enabled",
                enabled = true,
                onClick = {},
                icon = Icons.Default.Add
            )
            SecondaryButton(
                text = "Disabled",
                enabled = false,
                onClick = {},
                icon = Icons.Default.Add
            )

            TertiaryButton(text = "Enabled", enabled = true, onClick = {})
            TertiaryButton(text = "Disabled", enabled = false, onClick = {})
            TertiaryButton(text = "Enabled", enabled = true, onClick = {}, icon = Icons.Default.Add)
            TertiaryButton(
                text = "Disabled",
                enabled = false,
                onClick = {},
                icon = Icons.Default.Add
            )

            Switch(checked = true, enabled = true, onCheckedChanged = {})
            Switch(checked = true, enabled = false, onCheckedChanged = {})
            Switch(checked = false, enabled = true, onCheckedChanged = {})
            Switch(checked = false, enabled = false, onCheckedChanged = {})

            ToggleSelection(
                selected = false,
                onSelectedChanged = {},
                text = "Switch text",
                modifier = Modifier.fillMaxWidth(),
            )
            ToggleSelection(
                selected = true,
                onSelectedChanged = {},
                text = "Switch text",
                modifier = Modifier.fillMaxWidth(),
            )

            IconButton(icon = Icons.Outlined.Add, enabled = true, onClick = {})
            IconButton(icon = Icons.Outlined.Add, enabled = false, onClick = {})

            FilledIconButton(icon = Icons.Outlined.Bookmark, enabled = true, onClick = {})
            FilledIconButton(icon = Icons.Outlined.Bookmark, enabled = false, onClick = {})

            RadioButton(selected = false, enabled = true, onClick = {})
            RadioButton(selected = true, enabled = true, onClick = {})
            RadioButton(selected = false, enabled = false, onClick = {})
            RadioButton(selected = true, enabled = false, onClick = {})

            RadioButtonItem(selected = true, enabled = true, text = "Text", onClick = {})

            var selectedIndex by remember { mutableIntStateOf(0) }
            RadioButtonGroup(
                modifier = Modifier
                    .background(color = AppTheme.colors.background)
                    .border(width = 1.dp, color = AppTheme.colors.outline),
                title = "Title",
                options = persistentListOf("Text", "Text"),
                selectedIndex = selectedIndex,
                onOptionSelected = { selectedIndex = it },
            )

            Checkbox(checked = false, enabled = true, onCheckedChange = {})
            Checkbox(checked = false, enabled = false, onCheckedChange = {})
            Checkbox(checked = true, enabled = true, onCheckedChange = {})
            Checkbox(checked = true, enabled = false, onCheckedChange = {})

            CheckboxGroup(
                options = persistentListOf("Text", "Text"),
                onCheckedChange = { _, _ -> },
                selectedIndexes = persistentListOf(0),
            )
        }
    }
}
