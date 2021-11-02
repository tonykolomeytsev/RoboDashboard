package kekmech.robodashboard.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import kekmech.common_navigation.compose.ComposeScreen
import kekmech.feature_dashboard.DashboardScreenApi
import kekmech.ui_kit.color.LocalAppColors
import kekmech.ui_kit.theme.AppTheme
import kotlinx.parcelize.Parcelize

@Parcelize
class MainScreen : ComposeScreen("Main") {

    @Composable
    override fun Content() {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(LocalAppColors.current.background100)
        ) {
            var selectedTab by remember { mutableStateOf(BottomTab.DASHBOARD) }
            NavigationRail(
                modifier = Modifier
                    .align(Alignment.BottomEnd)
                    .width(80.dp),
                backgroundColor = LocalAppColors.current.background100
            ) {
                for (tab in BottomTab.values()) {
                    NavigationRailItem(
                        selected = selectedTab == tab,
                        onClick = { selectedTab = tab },
                        icon = { Icon(tab.icon, tab.title) },
                        alwaysShowLabel = false,
                        selectedContentColor = LocalAppColors.current.accentDefault,
                        unselectedContentColor = LocalAppColors.current.content100,
                        label = { Text(tab.title, modifier = Modifier.padding(top = 8.dp)) }
                    )
                }
            }
            Box(modifier = Modifier.padding(end = 80.dp)) {
                when (selectedTab) {
                    BottomTab.DASHBOARD -> DashboardScreenApi.newInstance().Content()
                    BottomTab.SETTINGS -> Unit
                }
            }
        }
    }

    @Preview(device = Devices.PIXEL_C)
    @Composable
    private fun Preview() =
        AppTheme {
            Content()
        }
}