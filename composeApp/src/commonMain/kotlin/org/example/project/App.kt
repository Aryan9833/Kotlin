package org.example.project

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.background
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeContentPadding
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.AssistChip
import androidx.compose.material3.AssistChipDefaults
import androidx.compose.material3.Button
import androidx.compose.material3.Checkbox
import androidx.compose.material3.DatePickerDialog
import androidx.compose.material3.DatePicker
import androidx.compose.material3.Icon
import androidx.compose.material3.FilterChip
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.SuggestionChip
import androidx.compose.material3.TriStateCheckbox
import androidx.compose.material3.TextButton
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.state.ToggleableState
import androidx.compose.material3.FilterChipDefaults
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.ui.tooling.preview.Preview

import kotlinproject.composeapp.generated.resources.Res
import kotlinproject.composeapp.generated.resources.free_settings_icon_3110_thumb
import kotlinproject.composeapp.generated.resources.selected
import kotlinproject.composeapp.generated.resources.unselected
import androidx.compose.material3.rememberDatePickerState
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Popup
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.width

import androidx.compose.material3.Divider


import androidx.compose.ui.unit.dp



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


@Preview
@Composable
fun HorizontalDividerExample() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(IntrinsicSize.Min),
        horizontalArrangement = Arrangement.SpaceEvenly
    ) {
        Text("First item in list")
        Divider(
            modifier = Modifier
                .fillMaxHeight()
                .width(2.dp)
        )
        Text("Second item in list")
        Divider(
            modifier = Modifier
                .fillMaxHeight()
                .width(2.dp)

        )
        Text(text = "Third item in list")
    }
}

class MainActivity :ComponentActivity() {

    private val permissionsToRequest =arraybof(
        manifest.permission.RECORD_AUDIO,
        manifest.permission.CALL_PHONE,

    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            permisionsGuideCompoaseTheme {
                val viewmodal =viewmodel<MainViewModel>()
                val dialogQueue =viewModel.visiblePermissionDialogQueue

                val cama
            }
        }

    }

}