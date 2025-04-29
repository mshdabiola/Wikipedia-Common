/*
 *abiola 2023
 */

package com.mshdabiola.designsystem

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.mshdabiola.designsystem.component.WcFilterChip
import com.mshdabiola.testing.util.CaptureMultiTheme

class FilterChipScreenshotTests {

    @Preview
    @Composable
    fun UnSelectedFilterChip() {
        CaptureMultiTheme {
            WcFilterChip(selected = false, onSelectedChange = {}) {
                Text("Unselected chip")
            }
        }
    }

    @Preview
    @Composable
    fun SelectedFilterChip() {
        CaptureMultiTheme {
            WcFilterChip(selected = true, onSelectedChange = {}) {
                Text("Selected Chip")
            }
        }
    }

    @Preview
    @Preview(fontScale = 2.0f)
    @Composable
    fun HugeFontFilterChip() {
        CaptureMultiTheme {
            WcFilterChip(selected = true, onSelectedChange = {}) {
                Text("Chip")
            }
        }
    }
}
