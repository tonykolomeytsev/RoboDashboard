package kekmech.common_navigation.compose

import android.os.Bundle
import android.util.Log
import kekmech.common_navigation.core.*

private var navigationCoreInitialized: Boolean = false

fun NavigationCore.init(bundle: Bundle?, firstScreen: Screen) {
    if (bundle == null) {
        if (!navigationCoreInitialized) {
            Log.d("NavigationCore", "Activity first launch")
            navigationCoreInitialized = true
        } else {
            Log.d("NavigationCore", "Activity re-launch")
        }
        dispatch(Forward(firstScreen))
    } else {
        if (!navigationCoreInitialized) {
            Log.d("NavigationCore", "Activity restored after process death")
            navigationCoreInitialized = true
            val restoredState = bundle.restoreNavigationState()
            if (restoredState.chain.isNotEmpty()) {
                restore(restoredState)
            }
        } else {
            Log.d("NavigationCore", "Activity restored after rotation")
            //do nothing
        }
    }
}

private const val KEY_NAVIGATION_STATE = "ket_nav_state"

private fun Bundle.restoreNavigationState() = NavigationState(
    getParcelableArray(KEY_NAVIGATION_STATE)
        ?.toList()
        .orEmpty()
        .filterIsInstance<Screen>()
)

fun NavigationCore.saveState(bundle: Bundle) {
    bundle.putParcelableArray(
        KEY_NAVIGATION_STATE,
        state.chain.filterIsInstance<ComposeScreen>().toTypedArray()
    )
}