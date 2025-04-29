/*
 *abiola 2022
 */

package com.mshdabiola.designsystem.components

import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import com.mshdabiola.designsystem.component.WcIconToggleButton
import com.mshdabiola.designsystem.icon.WcIcons
import com.mshdabiola.designsystem.theme.WcTheme

@ThemePreviews
@Composable
fun IconButtonPreview() {
    WcTheme {
        WcIconToggleButton(
            checked = true,
            onCheckedChange = { },
            icon = {
                Icon(
                    imageVector = WcIcons.BookmarkBorder,
                    contentDescription = null,
                )
            },
            checkedIcon = {
                Icon(
                    imageVector = WcIcons.Bookmark,
                    contentDescription = null,
                )
            },
        )
    }
}

@ThemePreviews
@Composable
fun IconButtonPreviewUnchecked() {
    WcTheme {
        WcIconToggleButton(
            checked = false,
            onCheckedChange = { },
            icon = {
                Icon(
                    imageVector = WcIcons.BookmarkBorder,
                    contentDescription = null,
                )
            },
            checkedIcon = {
                Icon(
                    imageVector = WcIcons.Bookmark,
                    contentDescription = null,
                )
            },
        )
    }
}
