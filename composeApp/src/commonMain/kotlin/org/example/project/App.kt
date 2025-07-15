package org.example.project

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.safeContentPadding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.AssistChip
import androidx.compose.material3.AssistChipDefaults
import androidx.compose.material3.Button
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Icon
import androidx.compose.material3.FilterChip
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.SuggestionChip
import androidx.compose.material3.TriStateCheckbox
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.state.ToggleableState
import androidx.compose.material3.FilterChipDefaults
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.ui.tooling.preview.Preview

import kotlinproject.composeapp.generated.resources.Res
import kotlinproject.composeapp.generated.resources.free_settings_icon_3110_thumb
import kotlinproject.composeapp.generated.resources.selected
import kotlinproject.composeapp.generated.resources.unselected

@Preview
@Composable
fun CarousalExample() {
    AssistChip(
        { println("AssistChip clicked: apani beti ko bhej") },
        label = { Text("Assist Chip")},
        leadingIcon = {
            Icon(
               painter = painterResource(Res.drawable.free_settings_icon_3110_thumb), // TODO: fix this, drawable is not found
                contentDescription = "Settings Icon",
                Modifier.size(AssistChipDefaults.IconSize)
            )
        }
    )
}

@Preview
@Composable
fun FilterChipExample() {
    var selected by remember { mutableStateOf(false) }
    FilterChip(
        onClick = { selected = !selected },
        label = { Text("Filter Chip") },
        selected = selected,
        leadingIcon = if (selected) {
            {
                Icon(
                    painter = painterResource(Res.drawable.free_settings_icon_3110_thumb),
                    contentDescription = "Filter Icon",
                    modifier = Modifier.size(FilterChipDefaults.IconSize)
                )
            }
        } else { null }
    )
}

@Preview
@Composable
fun suggestionchip() {
    SuggestionChip(
        onClick = { println("payal") },
        label = { Text("Suggestion Chip") }


    )

}