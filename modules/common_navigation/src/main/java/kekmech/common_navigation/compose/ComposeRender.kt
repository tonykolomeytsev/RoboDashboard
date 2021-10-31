package kekmech.common_navigation.compose

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import kekmech.common_navigation.core.NavigationRender
import kekmech.common_navigation.core.NavigationState

class ComposeRender(
    private val exitAction: () -> Unit
) : NavigationRender {

    private var state: NavigationState by mutableStateOf(NavigationState())

    override fun invoke(state: NavigationState) {
        this.state = state
        if (state.chain.isEmpty()) {
            exitAction()
        }
    }

    @Composable
    fun Content() {
        state.chain.lastOrNull()?.let { screen ->
            when (screen) {
                is ComposeScreen -> screen.Content()
                else -> error("ComposeRender works with ComposeScreen only! Received $screen")
            }
        }
    }
}