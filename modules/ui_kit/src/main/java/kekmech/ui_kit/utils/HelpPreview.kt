package kekmech.ui_kit.utils

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import kekmech.ui_kit.color.LocalAppColors
import kekmech.ui_kit.theme.AppTheme

@Composable
internal fun HelpPreview(
    content: @Composable () -> Unit,
) {
    AppTheme {
        Box(modifier = Modifier
            .background(LocalAppColors.current.background100)
            .width(440.dp)
            .wrapContentHeight()
            .padding(16.dp)) {

            content.invoke()
        }
    }
}