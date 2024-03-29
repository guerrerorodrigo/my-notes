package ui.designsystem.radiobuttons

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.LocalMinimumInteractiveComponentEnforcement
import androidx.compose.material3.RadioButtonDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import ui.theme.AppTheme
import androidx.compose.material3.RadioButton as ComposeRadioButton

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun RadioButton(
    selected: Boolean,
    enabled: Boolean,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
) {
    CompositionLocalProvider(LocalMinimumInteractiveComponentEnforcement provides false) {
        ComposeRadioButton(
            onClick = onClick,
            selected = selected,
            modifier = modifier,
            enabled = enabled,
            colors = RadioButtonDefaults.colors(
                selectedColor = AppTheme.colors.primary,
                unselectedColor = Color.White,
                disabledSelectedColor = AppTheme.colors.onSurfaceVariant.copy(alpha = 0.3f),
                disabledUnselectedColor = Color.White.copy(alpha = 0.3f),
            ),
        )
    }
}
