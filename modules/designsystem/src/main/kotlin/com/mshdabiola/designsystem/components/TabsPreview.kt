/*
 *abiola 2022
 */

package com.mshdabiola.designsystem.components

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import com.mshdabiola.designsystem.component.WcTab
import com.mshdabiola.designsystem.component.WcTabRow
import com.mshdabiola.designsystem.theme.WcTheme

@ThemePreviews
@Composable
fun TabsPreview() {
    WcTheme {
        val titles = listOf("Topics", "People")
        WcTabRow(selectedTabIndex = 0) {
            titles.forEachIndexed { index, title ->
                WcTab(
                    selected = index == 0,
                    onClick = { },
                    text = { Text(text = title) },
                )
            }
        }
    }
}

object SkTabDefaults {
    val TabTopPadding = 7.dp
}
