package kekmech.feature_dashboard

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import kekmech.common_navigation.compose.ComposeScreen
import kekmech.ui_kit.color.LocalAppColors
import kekmech.ui_kit.theme.AppTheme
import kekmech.ui_kit.typography.typography
import kotlinx.parcelize.Parcelize

@Parcelize
internal class DashboardScreen : ComposeScreen("Dashboard") {

    @Composable
    override fun Content() {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(LocalAppColors.current.background100)
                .padding(horizontal = 16.dp, vertical = 16.dp)
        ) {
            Text(
                text = "Dashboard",
                style = typography.h1,
                color = LocalAppColors.current.content100
            )
        }
    }

    @Preview(device = Devices.PIXEL_C)
    @Composable
    private fun Preview() =
        AppTheme {
            Content()
        }
}