package kekmech.robodashboard

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import kekmech.common_navigation.compose.ComposeScreen
import kotlinx.parcelize.Parcelize

@Parcelize
class MainScreen : ComposeScreen("Main") {

    @Preview(device = Devices.PIXEL_C)
    @Composable
    override fun Content() {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.White)
        ) {
            val appName = stringResource(R.string.app_name)
            Text(
                text = "Hello $appName!",
                modifier = Modifier.align(Alignment.Center)
            )
        }
    }
}