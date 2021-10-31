package kekmech.robodashboard

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.WindowCompat
import kekmech.common_navigation.Router
import kekmech.common_navigation.compose.ComposeRender
import kekmech.common_navigation.compose.init
import kekmech.common_navigation.compose.saveState
import kekmech.common_navigation.core.NavigationCore
import org.koin.android.ext.android.inject

class MainActivity : AppCompatActivity() {

    private val navigationCore by inject<NavigationCore>()
    private val router by inject<Router>()
    private val render = ComposeRender { finish() }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        WindowCompat.setDecorFitsSystemWindows(window, false)
        navigationCore.init(savedInstanceState, MainScreen())
        setContent { render.Content() }
    }

    override fun onResume() {
        super.onResume()
        navigationCore.render = render
    }

    override fun onPause() {
        super.onPause()
        navigationCore.render = null
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        navigationCore.saveState(outState)
    }

    override fun onBackPressed() {
        super.onBackPressed()
        router.back()
    }
}