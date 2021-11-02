package kekmech.robodashboard.ui

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Dashboard
import androidx.compose.material.icons.filled.Settings
import androidx.compose.ui.graphics.vector.ImageVector

enum class BottomTab(
    val title: String,
    val icon: ImageVector
) {

    DASHBOARD(
        title = "Dashboard",
        icon = Icons.Filled.Dashboard
    ),

    SETTINGS(
        title = "Settings",
        icon = Icons.Filled.Settings
    )
}