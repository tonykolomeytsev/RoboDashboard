package kekmech.robodashboard.ui

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.BugReport
import androidx.compose.material.icons.filled.Dashboard
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.ViewList
import androidx.compose.ui.graphics.vector.ImageVector

enum class BottomTab(
    val title: String,
    val icon: ImageVector
) {

    DASHBOARD(
        title = "Dashboard",
        icon = Icons.Filled.Dashboard
    ),

    DEBUGGER(
        title = "Debugger",
        icon = Icons.Filled.BugReport
    ),

    ROBOT_LIST(
        title = "Robots List",
        icon = Icons.Filled.ViewList
    ),

    SETTINGS(
        title = "Settings",
        icon = Icons.Filled.Settings
    )
}