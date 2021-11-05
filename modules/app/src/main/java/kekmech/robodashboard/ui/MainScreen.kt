package kekmech.robodashboard.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.NavigationRail
import androidx.compose.material.NavigationRailItem
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import kekmech.common_navigation.compose.ComposeScreen
import kekmech.feature_dashboard.DashboardScreenApi
import kekmech.robodashboard.R
import kekmech.ui_kit.color.LocalAppColors
import kekmech.ui_kit.theme.AppTheme
import kotlinx.parcelize.Parcelize

@Parcelize
class MainScreen : ComposeScreen("Main") {

    @Composable
    override fun Content() {
        Row(
            modifier = Modifier
                .fillMaxSize()
                .background(LocalAppColors.current.background100)
        ) {
            var selectedTab by remember { mutableStateOf(BottomTab.DASHBOARD) }
            NavigationRail(
                selectedTab = selectedTab,
                onSelectTab = { selectedTab = it }
            )
            Box {
                when (selectedTab) {
                    BottomTab.DASHBOARD -> DashboardScreenApi.newInstance().Content()
                    BottomTab.SETTINGS -> Unit
                }
            }
        }
    }

    @Composable
    private fun NavigationRail(
        selectedTab: BottomTab,
        onSelectTab: (BottomTab) -> Unit,
        modifier: Modifier = Modifier
    ) {
        NavigationRail(
            modifier = modifier.width(80.dp),
            backgroundColor = LocalAppColors.current.background100,
            header = {
                Icon(painterResource(R.drawable.ic_launcher_background), "")
            }
        ) {
            for (tab in BottomTab.values()) {
                NavigationRailItem(
                    selected = selectedTab == tab,
                    onClick = { onSelectTab.invoke(tab) },
                    icon = { Icon(tab.icon, tab.title) },
                    alwaysShowLabel = false,
                    selectedContentColor = LocalAppColors.current.accentDefault,
                    unselectedContentColor = LocalAppColors.current.content100,
                    label = { Text(tab.title, modifier = Modifier.padding(top = 8.dp)) }
                )
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