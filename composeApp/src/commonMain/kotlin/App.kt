import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Modifier
import moe.tlaster.precompose.PreComposeApp
import moe.tlaster.precompose.navigation.NavHost
import moe.tlaster.precompose.navigation.rememberNavigator
import ui.theme.ColorPalette
import ui.theme.LocalColors
import ui.theme.LocalMyMoneyPadding
import ui.theme.MyNotesPadding

@Composable
fun App(
    useDarkTheme: Boolean = isSystemInDarkTheme(),
) {
    PreComposeApp {
        val colors = if (!useDarkTheme) {
            ColorPalette.Light
        } else {
            ColorPalette.Dark
        }

        CompositionLocalProvider(
            LocalColors provides colors,
            LocalMyMoneyPadding provides MyNotesPadding(),
        ) {
            val navigator = rememberNavigator()
            NavHost(navigator = navigator, initialRoute = "/home") {
                scene(route = "/home") {
                    Column(modifier = Modifier.fillMaxSize()) {
                        Text("lkjlkjklasdf")
                    }
                }
            }
        }
    }
}
