package kekmech.ui_kit.views

import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.LocalTextStyle
import androidx.compose.material.Text
import androidx.compose.material.TextFieldColors
import androidx.compose.material.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import kekmech.ui_kit.color.LocalAppColors
import kekmech.ui_kit.utils.HelpPreview

@Composable
fun TextField(
    value: String,
    onValueChange: (String) -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    readOnly: Boolean = false,
    label: String? = null,
    placeholder: @Composable (() -> Unit)? = null,
    leadingIcon: @Composable (() -> Unit)? = null,
    trailingIcon: @Composable (() -> Unit)? = null,
    isError: Boolean = false,
    visualTransformation: VisualTransformation = VisualTransformation.None,
    keyboardOptions: KeyboardOptions = KeyboardOptions.Default,
    keyboardActions: KeyboardActions = KeyboardActions(),
    singleLine: Boolean = false,
    maxLines: Int = Int.MAX_VALUE,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) {
    androidx.compose.material.TextField(
        value = value,
        onValueChange = onValueChange,
        modifier = modifier
            .height(56.dp),
        enabled = enabled,
        readOnly = readOnly,
        textStyle = LocalTextStyle.current.copy(lineHeight = 20.sp),
        label = label?.let {
            {
                Text(
                    text = it,
                    modifier = Modifier
                )
            }
        },
        placeholder = placeholder,
        leadingIcon = leadingIcon,
        trailingIcon = trailingIcon,
        isError = isError,
        visualTransformation = visualTransformation,
        keyboardOptions = keyboardOptions,
        keyboardActions = keyboardActions,
        singleLine = singleLine,
        maxLines = maxLines,
        interactionSource = interactionSource,
        shape = RoundedCornerShape(8.dp),
        colors = textFieldColors()
    )
}

@Composable
private fun textFieldColors(): TextFieldColors {
    val palette = LocalAppColors.current
    val white10 = Color.White.copy(alpha = 0.1f)
    return TextFieldDefaults.textFieldColors(
        textColor = palette.content100,
        disabledTextColor = palette.content50,
        backgroundColor = white10,
        cursorColor = palette.accentDefault,
        errorCursorColor = palette.accentNegative,
        focusedIndicatorColor = Color.Transparent,
        unfocusedIndicatorColor = Color.Transparent,
        disabledIndicatorColor = Color.Transparent,
        errorIndicatorColor = Color.Transparent,
        leadingIconColor = palette.content100,
        disabledLeadingIconColor = palette.content50,
        errorLeadingIconColor = palette.accentNegative,
        trailingIconColor = palette.content100,
        disabledTrailingIconColor = palette.content50,
        errorTrailingIconColor = palette.accentNegative,
        focusedLabelColor = palette.accentDefault,
        unfocusedLabelColor = palette.content50,
        disabledLabelColor = palette.content25,
        disabledPlaceholderColor = palette.content25,
        errorLabelColor = palette.accentNegative,
        placeholderColor = white10
    )
}

@Preview("Empty TextField without label")
@Composable
private fun TextFieldPreview1() =
    HelpPreview {
        TextField(
            value = "",
            onValueChange = { /* no-op */ }
        )
    }

@Preview("Filled TextField without label")
@Composable
private fun TextFieldPreview2() =
    HelpPreview {
        TextField(
            value = "This is the way",
            onValueChange = { /* no-op */ }
        )
    }

@Preview("Empty TextField with label")
@Composable
private fun TextFieldPreview3() =
    HelpPreview {
        TextField(
            value = "",
            onValueChange = { /* no-op */ },
            label = "Mandalorian phrase"
        )
    }

@Preview("Filled TextField with label")
@Composable
private fun TextFieldPreview4() =
    HelpPreview {
        TextField(
            value = "This is the way",
            onValueChange = { /* no-op */ },
            label = "Mandalorian phrase"
        )
    }