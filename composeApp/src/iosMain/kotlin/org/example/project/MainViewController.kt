package org.example.project

import androidx.compose.foundation.layout.Column
import androidx.compose.ui.window.ComposeUIViewController

fun MainViewController() = ComposeUIViewController {
    Column {
        CarousalExample() ; suggestionchip() ; FilterChipExample()
    }
}
