package kekmech.common_navigation.compose

import android.os.Parcelable
import androidx.compose.runtime.Composable
import kekmech.common_navigation.core.Screen

abstract class ComposeScreen(
    override val id: String
) : Screen, Parcelable {

    @Composable
    abstract fun Content()

    override fun toString() = "[$id]"
}