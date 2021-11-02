package kekmech.ui_kit.typography

import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import kekmech.ui_kit.R

val Montserrat =
    FontFamily(
        Font(R.font.montserrat_regular, FontWeight.Normal, FontStyle.Normal),
        Font(R.font.montserrat_italic, FontWeight.Normal, FontStyle.Italic),
        Font(R.font.montserrat_medium, FontWeight.Medium, FontStyle.Normal),
        Font(R.font.montserrat_medium_italic, FontWeight.Medium, FontStyle.Italic),
        Font(R.font.montserrat_semibold, FontWeight.SemiBold, FontStyle.Normal),
        Font(R.font.montserrat_semibold_italic, FontWeight.SemiBold, FontStyle.Italic),
        Font(R.font.montserrat_bold, FontWeight.Bold, FontStyle.Normal),
        Font(R.font.montserrat_bold_italic, FontWeight.Bold, FontStyle.Italic),
    )

val JetBrainsMono =
    FontFamily(
        Font(R.font.jetbrainsmono_regular, FontWeight.Normal, FontStyle.Normal),
        Font(R.font.jetbrainsmono_medium, FontWeight.Medium, FontStyle.Normal),
    )

val typography =
    Typography(
        defaultFontFamily = Montserrat,
        h1 = TextStyle(
            fontWeight = FontWeight.Bold,
            fontSize = 32.sp,
            lineHeight = 35.sp
        ),
        h2 = TextStyle(
            fontWeight = FontWeight.Bold,
            fontSize = 26.sp,
            lineHeight = 29.sp
        ),
        h3 = TextStyle(
            fontWeight = FontWeight.SemiBold,
            fontSize = 22.sp,
            lineHeight = 24.sp
        ),
        h4 = TextStyle(
            fontWeight = FontWeight.SemiBold,
            fontSize = 18.sp,
            lineHeight = 20.sp
        ),
        h5 = TextStyle(
            fontWeight = FontWeight.SemiBold,
            fontSize = 16.sp,
            lineHeight = 18.sp
        ),
        h6 = TextStyle(
            fontWeight = FontWeight.Normal,
            fontSize = 14.sp,
            lineHeight = 16.sp
        ),
        caption = TextStyle(
            fontWeight = FontWeight.Medium,
            fontSize = 11.sp,
            lineHeight = 12.sp
        ),
        subtitle1 = TextStyle(
            fontWeight = FontWeight.Normal,
            fontSize = 16.sp,
            lineHeight = 18.sp
        ),
        subtitle2 = TextStyle(
            fontWeight = FontWeight.Medium,
            fontSize = 14.sp,
            lineHeight = 15.sp
        ),
        button = TextStyle(
            fontWeight = FontWeight.SemiBold,
            fontSize = 14.sp,
            lineHeight = 15.sp
        ),
        // TODO: define body1, body2, subtitle2 and overline
    )