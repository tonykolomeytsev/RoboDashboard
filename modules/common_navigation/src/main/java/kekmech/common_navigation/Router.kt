package kekmech.common_navigation

import kekmech.common_navigation.core.Screen

interface Router {

    fun forward(screen: Screen)
    fun replace(screen: Screen)
    fun newStack(screen: Screen)
    fun backTo(screenId: String)
    fun back()
    fun exit()
}