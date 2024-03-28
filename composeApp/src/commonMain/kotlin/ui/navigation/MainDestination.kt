package ui.navigation

internal sealed class MainDestination(override val route: String) : NavDestination {

    data object ChecklistNote : MainDestination(route = "checklist-note")
    data object DrawingNote : MainDestination(route = "drawing-note")
    data object AudioNote : MainDestination(route = "audio-note")
    data object MediaNote : MainDestination(route = "media-note")
    data object TextNote : MainDestination(route = "text-note")
}
