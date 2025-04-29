/*
 *abiola 2022
 */

package com.mshdabiola.designsystem.components

import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.mshdabiola.designsystem.component.WcBackground
import com.mshdabiola.designsystem.component.WcFilterChip
import com.mshdabiola.designsystem.theme.WcTheme

@ThemePreviews
@Composable
fun ChipPreview() {
    WcTheme {
        WcBackground(modifier = Modifier.size(80.dp, 20.dp)) {
            WcFilterChip(selected = true, onSelectedChange = {}) {
                Text("Chip")
            }
        }
    }
}
