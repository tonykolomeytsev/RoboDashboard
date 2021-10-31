package kekmech.robodashboard

import android.app.Application
import kekmech.common_navigation.Router
import kekmech.common_navigation.compose.AppReducer
import kekmech.common_navigation.compose.LogReducer
import kekmech.common_navigation.core.NavigationCore
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.dsl.bind
import org.koin.dsl.module

class RoboDashboardApp : Application() {

    override fun onCreate() {
        super.onCreate()
        val navigationCore = NavigationCore(
            if (BuildConfig.DEBUG) {
                LogReducer(AppReducer(this))
            } else {
                AppReducer(this)
            }
        )

        startKoin {
            androidLogger()
            androidContext(this@RoboDashboardApp)
            val navigationModule = module {
                single { navigationCore } bind NavigationCore::class
                single { RouterImpl(get()) } bind Router::class
            }
            modules(navigationModule)
        }
    }
}
