package ui.models

internal interface Note {
    data class PreviewText(
        val title: String,
        val content: String,
    ) : Note
}