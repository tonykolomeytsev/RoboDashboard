package kekmech.ui_kit.theme

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.selection.LocalTextSelectionColors
import androidx.compose.foundation.text.selection.TextSelectionColors
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Shapes
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.unit.dp
import kekmech.ui_kit.color.AppColorPalette
import kekmech.ui_kit.color.LocalAppColors
import kekmech.ui_kit.typography.typography

@Composable
fun AppTheme(content: @Composable () -> Unit) {
    CompositionLocalProvider(
        LocalAppColors provides AppColorPalette,
        LocalTextSelectionColors provides TextSelectionColors(
            handleColor = AppColorPalette.accentDefault,
            backgroundColor = AppColorPalette.accentDefault.copy(alpha = 0.5f)
        ),
    ) {
        MaterialTheme(
            typography = typography,
            shapes = Shapes(
                small = RoundedCornerShape(2.dp),
                medium = RoundedCornerShape(4.dp),
                large = RoundedCornerShape(8.dp),
            ),
            content = content
        )
    }
}