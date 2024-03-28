package ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextOverflow
import org.jetbrains.compose.ui.tooling.preview.Preview
import ui.models.Note
import ui.theme.AppTheme

@Composable
internal fun TextNoteItem(
    textNote: Note.PreviewText,
    modifier: Modifier = Modifier
) {
    Card(
        modifier = modifier,
        shape = RoundedCornerShape(size = AppTheme.padding.s),
        colors = CardDefaults.cardColors(
            containerColor = AppTheme.colors.surfaceVariant,
            contentColor = AppTheme.colors.onSurfaceVariant,
        ),
    ) {

    }
}

@Preview
@Composable
private fun PreviewTextNoteItem() {
    AppTheme {
        TextNoteItem(
            textNote = Note.PreviewText(title = "title", content = "content"),
            modifier = Modifier.padding(all = AppTheme.padding.m),
        )
    }
}
