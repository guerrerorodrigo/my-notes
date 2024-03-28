package ui.components

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextOverflow
import org.jetbrains.compose.ui.tooling.preview.Preview
import ui.models.Note
import ui.theme.MyNotesTheme

@Composable
internal fun TextNoteItem(
    textNote: Note.Text,
    modifier: Modifier = Modifier
) {
    Card(
        modifier = modifier,
        shape = RoundedCornerShape(size = MyNotesTheme.padding.s),
        colors = CardDefaults.cardColors(
            containerColor = MyNotesTheme.colors.surfaceVariant,
            contentColor = MyNotesTheme.colors.onSurfaceVariant,
        ),
    ) {
        Text(
            text = textNote.title,
            style = MyNotesTheme.typography.xxl,
            color = MyNotesTheme.colors.primary,
        )
        Text(
            text = textNote.content,
            style = MyNotesTheme.typography.lg,
            color = MyNotesTheme.colors.primary,
            maxLines = 10,
            overflow = TextOverflow.Ellipsis,
        )
    }
}

@Preview
@Composable
private fun PreviewTextNoteItem() {
    MyNotesTheme {
        TextNoteItem(textNote = Note.Text(title = "Title", content = "This is the note content"))
    }
}
