package org.example.project

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.safeContentPadding
import androidx.compose.material3.Button
import androidx.compose.material3.Checkbox
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TriStateCheckbox
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.state.ToggleableState
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.ui.tooling.preview.Preview

import kotlinproject.composeapp.generated.resources.Res
import kotlinproject.composeapp.generated.resources.compose_multiplatform
@Composable

@Preview
fun CarousalExample() {
    val childCheckedStates = remember { mutableStateListOf(false, false, false) }

    val parentState = remember(childCheckedStates) {
        when {
            childCheckedStates.all { it } -> ToggleableState.On
            childCheckedStates.none { it } -> ToggleableState.Off
            else -> ToggleableState.Indeterminate
        }
    }

    Column {
        Row(
            verticalAlignment = Alignment.CenterVertically,
        )
        {
            Text("select all")
            TriStateCheckbox(
                state = parentState,
                onClick = {
                    val newState = parentState != ToggleableState.On
                    for (i in childCheckedStates.indices) {
                        childCheckedStates[i] = newState
                    }
                }
            )
        }
        childCheckedStates.forEachIndexed { index, checked ->
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.fillMaxWidth().safeContentPadding()
            ) {
                Text("Child ${index + 1}")
                Checkbox(
                    checked = checked,
                    onCheckedChange = { isChecked ->
                        childCheckedStates[index] = isChecked
                    }
                )
            }
        }
        if (childCheckedStates.all { it }) {
            Text("all options are selected")
        }
 }
}