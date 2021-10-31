package kekmech.common_navigation.core

/**
 * Marker for actions which will be applied to state via reducer
 */
interface NavigationAction

class Forward(val screen: Screen, vararg val screens: Screen) : NavigationAction

class Replace(val screen: Screen, vararg val screens: Screen) : NavigationAction

class NewStack(val screen: Screen, vararg val screens: Screen) : NavigationAction

class BackTo(val screenId: String) : NavigationAction

object BackToRoot : NavigationAction

object Back : NavigationAction

object Exit : NavigationAction