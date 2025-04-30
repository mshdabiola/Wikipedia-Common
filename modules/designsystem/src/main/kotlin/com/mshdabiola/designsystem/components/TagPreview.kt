/*
 *abiola 2022
 */

package com.mshdabiola.designsystem.components

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import com.mshdabiola.designsystem.component.WcTopicTag
import com.mshdabiola.designsystem.theme.WcTheme

@ThemePreviews
@Composable
fun TagPreview() {
    WcTheme {
        WcTopicTag(followed = true, onClick = {}) {
            Text("Topic".uppercase())
        }
    }
}
