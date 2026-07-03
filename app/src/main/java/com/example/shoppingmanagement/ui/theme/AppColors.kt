package com.example.shoppingmanagement.ui.theme

import androidx.compose.runtime.Composable
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.material3.ColorScheme
import androidx.compose.ui.graphics.Color

// Blue
val ColorScheme.darkBlue: Color
    @Composable
    @ReadOnlyComposable
    get() = if (LocalIsDarkTheme.current) DarkBlueDark else DarkBlueLight

val ColorScheme.lightBlue: Color
    @Composable
    @ReadOnlyComposable
    get() = if (LocalIsDarkTheme.current) LightBlueDark else LightBlueLight

// Brown
val ColorScheme.darkBrown: Color
    @Composable
    @ReadOnlyComposable
    get() = if (LocalIsDarkTheme.current) DarkBrownDark else DarkBrownLight

val ColorScheme.mediumBrown: Color
    @Composable
    @ReadOnlyComposable
    get() = if (LocalIsDarkTheme.current) MediumBrownDark else MediumBrownLight

val ColorScheme.lightBrown: Color
    @Composable
    @ReadOnlyComposable
    get() = if (LocalIsDarkTheme.current) LightBrownDark else LightBrownLight

// Gray
val ColorScheme.lightGray: Color
    @Composable
    @ReadOnlyComposable
    get() = if (LocalIsDarkTheme.current) LightGrayDark else LightGrayLight

// Green
val ColorScheme.darkGreen: Color
    @Composable
    @ReadOnlyComposable
    get() = if (LocalIsDarkTheme.current) DarkGreenDark else DarkGreenLight

val ColorScheme.middleGreen: Color
    @Composable
    @ReadOnlyComposable
    get() = if (LocalIsDarkTheme.current) MiddleGreenDark else MiddleGreenLight

val ColorScheme.lightGreen: Color
    @Composable
    @ReadOnlyComposable
    get() = if (LocalIsDarkTheme.current) LightGreenDark else LightGreenLight

// Red
val ColorScheme.darkRed: Color
    @Composable
    @ReadOnlyComposable
    get() = if (LocalIsDarkTheme.current) DarkRedDark else DarkRedLight

val ColorScheme.middleRed: Color
    @Composable
    @ReadOnlyComposable
    get() = if (LocalIsDarkTheme.current) MiddleRedDark else MiddleRedLight

val ColorScheme.lightRed: Color
    @Composable
    @ReadOnlyComposable
    get() = if (LocalIsDarkTheme.current) LightRedDark else LightRedLight
