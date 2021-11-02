package kekmech.robodashboard

import kekmech.common_navigation.Router
import kekmech.common_navigation.core.*

class RouterImpl(private val core: NavigationCore) : Router {

    override fun forward(screen: Screen) = core.dispatch(Forward(screen))

    override fun replace(screen: Screen) = core.dispatch(Replace(screen))

    override fun newStack(screen: Screen) = core.dispatch(NewStack(screen))

    override fun backTo(screenId: String) = core.dispatch(BackTo(screenId))

    override fun backToRoot() = core.dispatch(BackToRoot)

    override fun back() = core.dispatch(Back)

    override fun exit() = core.dispatch(Exit)
}