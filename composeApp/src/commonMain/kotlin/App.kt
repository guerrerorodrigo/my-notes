import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import moe.tlaster.precompose.navigation.NavHost
import moe.tlaster.precompose.navigation.rememberNavigator
import ui.navigation.MainDestination
import ui.screens.MainScreen
import ui.theme.MyNotesTheme

@Composable
fun App() {
    MyNotesTheme {
        val navigator = rememberNavigator()
        NavHost(navigator = navigator, initialRoute = "/home") {
            scene(route = "/home") {
                MainScreen(
                    modifier = Modifier.fillMaxSize(),
                    navigateTo = { destination ->
                        navigator.navigate(route = destination.route)
                    },
                )
            }
            scene(route = MainDestination.ChecklistNote.route) {}
            scene(route = MainDestination.DrawingNote.route) {}
            scene(route = MainDestination.AudioNote.route) {}
            scene(route = MainDestination.MediaNote.route) {}
            scene(route = MainDestination.TextNote.route) {}
        }
    }
}
