package kekmech.common_navigation.core

/**
 * Holder of current navigation state
 */
data class NavigationState(
    val chain: List<Screen> = emptyList()
)