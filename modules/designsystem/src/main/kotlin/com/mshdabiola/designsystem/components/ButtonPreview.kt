/*
 *abiola 2024
 */

package com.mshdabiola.designsystem.components

import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.mshdabiola.designsystem.component.WcBackground
import com.mshdabiola.designsystem.component.WcButton
import com.mshdabiola.designsystem.icon.WcIcons
import com.mshdabiola.designsystem.theme.WcTheme

@ThemePreviews
@Composable
fun ButtonPreview() {
    WcTheme {
        WcBackground(modifier = Modifier.size(150.dp, 50.dp)) {
            WcButton(onClick = {}, text = { Text("Test button") })
        }
    }
}

@ThemePreviews
@Composable
fun ButtonPreview2() {
    WcTheme {
        WcBackground(modifier = Modifier.size(150.dp, 50.dp)) {
            WcButton(onClick = {}, text = { Text("Test button") })
        }
    }
}

@ThemePreviews
@Composable
fun ButtonLeadingIconPreview() {
    WcTheme {
        WcBackground(modifier = Modifier.size(150.dp, 50.dp)) {
            WcButton(
                onClick = {},
                text = { Text("Test button") },
                leadingIcon = { Icon(imageVector = WcIcons.Add, contentDescription = null) },
            )
        }
    }
}
