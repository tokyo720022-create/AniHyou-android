package com.axiel7.anihyou.core.ui.theme

import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.ui.graphics.Color

// --- The Assassin-Pirate Palette Definitions ---
private val AbyssalBlack = Color(0xFF000000)
private val ShadowCharcoal = Color(0xFF141414)
private val CrimsonDeath = Color(0xFFC62828)
private val WeatheredParchment = Color(0xFFEFE6D5)
private val InkwellNavy = Color(0xFF11171A)
private val AntiqueGold = Color(0xFFC4A059)
private val BloodSpill = Color(0xFFEF5350)

// --- Injecting the Dark Theme ---
val DarkColorScheme = darkColorScheme(
    primary = CrimsonDeath,
    onPrimary = AbyssalBlack,
    primaryContainer = ShadowCharcoal,
    onPrimaryContainer = WeatheredParchment,
    
    secondary = AntiqueGold,
    onSecondary = AbyssalBlack,
    secondaryContainer = InkwellNavy,
    onSecondaryContainer = WeatheredParchment,
    
    background = AbyssalBlack,
    onBackground = WeatheredParchment,
    
    surface = ShadowCharcoal,
    onSurface = WeatheredParchment,
    surfaceVariant = InkwellNavy,
    onSurfaceVariant = AntiqueGold,
    
    error = BloodSpill,
    onError = AbyssalBlack,
    errorContainer = ShadowCharcoal,
    onErrorContainer = BloodSpill,
    
    outline = AntiqueGold // Gave the outlines a weathered gold touch for that pirate map aesthetic
)

// --- Fallback Light Theme (Keeping it simple as we focus on Dark Mode) ---
val LightColorScheme = lightColorScheme(
    primary = CrimsonDeath,
    onPrimary = Color.White,
    background = Color.White,
    onBackground = Color.Black,
    surface = Color.White,
    onSurface = Color.Black,
    error = BloodSpill,
    onError = Color.White,
)