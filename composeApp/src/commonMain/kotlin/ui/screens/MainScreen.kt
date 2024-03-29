package ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import ui.components.MainBottomAppBar
import ui.designsystem.buttons.PrimaryButton
import ui.designsystem.buttons.SecondaryButton
import ui.designsystem.buttons.TertiaryButton
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
        }
    }
}
