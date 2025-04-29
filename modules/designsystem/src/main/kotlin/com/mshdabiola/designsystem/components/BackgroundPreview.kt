/*
 *abiola 2024
 */

package com.mshdabiola.designsystem.components

import android.content.res.Configuration
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.mshdabiola.designsystem.component.WcBackground
import com.mshdabiola.designsystem.component.WcGradientBackground
import com.mshdabiola.designsystem.theme.WcTheme

@Preview(uiMode = Configuration.UI_MODE_NIGHT_NO, name = "Light theme")
@Preview(uiMode = Configuration.UI_MODE_NIGHT_YES, name = "Dark theme")
annotation class ThemePreviews

@ThemePreviews
@Composable
fun BackgroundDefault() {
    WcTheme(disableDynamicTheming = true) {
        WcBackground(Modifier.size(100.dp), content = {})
    }
}

@ThemePreviews
@Composable
fun BackgroundDynamic() {
    WcTheme(disableDynamicTheming = false) {
        WcBackground(Modifier.size(100.dp), content = {})
    }
}

@ThemePreviews
@Composable
fun BackgroundAndroid() {
    WcTheme {
        WcBackground(Modifier.size(100.dp), content = {})
    }
}

@ThemePreviews
@Composable
fun GradientBackgroundDefault() {
    WcTheme(disableDynamicTheming = true) {
        WcGradientBackground(Modifier.size(100.dp), content = {})
    }
}

@ThemePreviews
@Composable
fun GradientBackgroundDynamic() {
    WcTheme(disableDynamicTheming = false) {
        WcGradientBackground(Modifier.size(100.dp), content = {})
    }
}

@ThemePreviews
@Composable
fun GradientBackgroundAndroid() {
    WcTheme {
        WcGradientBackground(Modifier.size(100.dp), content = {})
    }
}
