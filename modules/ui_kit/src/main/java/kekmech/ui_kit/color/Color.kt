package kekmech.ui_kit.color

import androidx.compose.runtime.*
import androidx.compose.ui.graphics.Color

@Stable
data class AppColor(
    val background100: Color,
    val background75: Color,
    val background50: Color,
    val background25: Color,
    val content100: Color,
    val content50: Color,
    val content25: Color,
    val accentDefault: Color,
    val accentWarning: Color,
    val accentPositive: Color,
    val accentNegative: Color,
    val accentDark: Color,
)

val AppColorPalette = AppColor(
    background100 = Color(0xff000000),
    background75 = Color(0xff1B1B1B),
    background50 = Color(0xff313133),
    background25 = Color(0xff3D3D3F),
    content100 = Color(0xffFCFCFC),
    content50 = Color(0xffA2A2A2),
    content25 = Color(0xff8B8B8B),
    accentDefault = Color(0xff33A9FF),
    accentWarning = Color(0xffFAC661),
    accentPositive = Color(0xff35DF90),
    accentNegative = Color(0xffF47961),
    accentDark = Color(0xff0170C1)
)

val LocalAppColors = staticCompositionLocalOf<AppColor> { error("AppColor not provided!") }