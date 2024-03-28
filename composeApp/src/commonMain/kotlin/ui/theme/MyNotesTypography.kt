package ui.theme

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import org.jetbrains.compose.resources.Font
import mynotes.composeapp.generated.resources.Res
import mynotes.composeapp.generated.resources.inter_regular
import org.jetbrains.compose.resources.ExperimentalResourceApi

@OptIn(ExperimentalResourceApi::class)
@Composable
internal fun typography(): AppTypography {
    val inter = FontFamily(
        Font(
            Res.font.inter_regular,
        ),
    )

    return AppTypography(
        xs = TextStyle(
            fontFamily = inter,
            fontSize = 10.sp,
            fontWeight = FontWeight.W400,
            fontStyle = FontStyle.Normal,
        ),
        xxs = TextStyle(
            fontFamily = inter,
            fontSize = 12.sp,
            fontWeight = FontWeight.W400,
            fontStyle = FontStyle.Normal,
        ),
        sm = TextStyle(
            fontFamily = inter,
            fontSize = 14.sp,
            fontWeight = FontWeight.W400,
            fontStyle = FontStyle.Normal,
            lineHeight = 20.sp,
        ),
        base = TextStyle(
            fontFamily = inter,
            fontSize = 16.sp,
            fontWeight = FontWeight.W400,
            fontStyle = FontStyle.Normal,
            lineHeight = 22.sp,
        ),
        lg = TextStyle(
            fontFamily = inter,
            fontSize = 20.sp,
            fontWeight = FontWeight.W400,
            fontStyle = FontStyle.Normal,
            lineHeight = 28.sp,
        ),
        xl = TextStyle(
            fontFamily = inter,
            fontSize = 24.sp,
            fontWeight = FontWeight.W400,
            fontStyle = FontStyle.Normal,
            lineHeight = 28.sp,
        ),
        xxl = TextStyle(
            fontFamily = inter,
            fontSize = 32.sp,
            fontWeight = FontWeight.W400,
            fontStyle = FontStyle.Normal,
            lineHeight = 28.sp,
        ),
        xxxl = TextStyle(
            fontFamily = inter,
            fontSize = 40.sp,
            fontWeight = FontWeight.W400,
            fontStyle = FontStyle.Normal,
            lineHeight = 44.sp,
        ),
    )
}

@Stable
data class AppTypography(
    val xs: TextStyle,
    val xxs: TextStyle,
    val sm: TextStyle,
    val base: TextStyle,
    val lg: TextStyle,
    val xl: TextStyle,
    val xxl: TextStyle,
    val xxxl: TextStyle,
)

internal val LocalAppTypography = staticCompositionLocalOf<AppTypography> { error("No typography provided.") }
