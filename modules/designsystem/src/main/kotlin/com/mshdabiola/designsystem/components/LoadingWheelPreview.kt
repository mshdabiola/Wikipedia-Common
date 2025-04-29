/*
 *abiola 2022
 */

package com.mshdabiola.designsystem.components

import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import com.mshdabiola.designsystem.component.WcLoadingWheel
import com.mshdabiola.designsystem.component.WcOverlayLoadingWheel
import com.mshdabiola.designsystem.theme.WcTheme

@ThemePreviews
@Composable
fun NiaLoadingWheelPreview() {
    WcTheme {
        Surface {
            WcLoadingWheel(contentDesc = "LoadingWheel")
        }
    }
}

@ThemePreviews
@Composable
fun NiaOverlayLoadingWheelPreview() {
    WcTheme {
        Surface {
            WcOverlayLoadingWheel(contentDesc = "LoadingWheel")
        }
    }
}

private const val ROTATION_TIME = 12000
private const val NUM_OF_LINES = 12
