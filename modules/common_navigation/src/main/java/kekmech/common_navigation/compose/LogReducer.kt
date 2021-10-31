package kekmech.common_navigation.compose

import android.util.Log
import kekmech.common_navigation.core.NavigationAction
import kekmech.common_navigation.core.NavigationReducer
import kekmech.common_navigation.core.NavigationState

/**
 * Additional reducer for logging changes of navigation state.
 */
class LogReducer(
    private val origin: NavigationReducer,
) : NavigationReducer {

    override fun invoke(
        action: NavigationAction,
        state: NavigationState,
    ): NavigationState {
        Log.d("NavigationCore", "New action=$action")
        val newState = origin.invoke(action, state)
        Log.d("NavigationCore", "New state=$newState")
        return newState
    }
}