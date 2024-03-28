package ui.models

internal interface Note {
    data class Text(
        val title: String,
        val content: String,
    ) : Note
}