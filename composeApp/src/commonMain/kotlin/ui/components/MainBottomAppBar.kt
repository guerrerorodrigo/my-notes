package ui.components

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.outlined.Brush
import androidx.compose.material.icons.outlined.CheckBox
import androidx.compose.material.icons.outlined.Mic
import androidx.compose.material.icons.outlined.Photo
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.BottomAppBarDefaults
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.FloatingActionButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import ui.navigation.MainDestination
import ui.theme.MyNotesTheme

@Composable
internal fun MainBottomAppBar(
    navigateTo: (MainDestination) -> Unit,
    modifier: Modifier = Modifier,
) {
    BottomAppBar(
        modifier = modifier,
        containerColor = MyNotesTheme.colors.surface,
        contentColor = MyNotesTheme.colors.onSurface,
        actions = {
            IconButton(onClick = { navigateTo(MainDestination.ChecklistNote) }) {
                Icon(
                    imageVector = Icons.Outlined.CheckBox,
                    contentDescription = null,
                )
            }
            IconButton(onClick = { navigateTo(MainDestination.DrawingNote) }) {
                Icon(
                    imageVector = Icons.Outlined.Brush,
                    contentDescription = null,
                )
            }
            IconButton(onClick = { navigateTo(MainDestination.AudioNote) }) {
                Icon(
                    imageVector = Icons.Outlined.Mic,
                    contentDescription = null,
                )
            }
            IconButton(onClick = { navigateTo(MainDestination.MediaNote) }) {
                Icon(
                    imageVector = Icons.Outlined.Photo,
                    contentDescription = null,
                )
            }
        },
        floatingActionButton = {
            FloatingActionButton(
                onClick = { navigateTo(MainDestination.TextNote) },
                containerColor = BottomAppBarDefaults.bottomAppBarFabColor,
                elevation = FloatingActionButtonDefaults.bottomAppBarFabElevation()
            ) {
                Icon(Icons.Filled.Add, null)
            }
        }
    )
}
