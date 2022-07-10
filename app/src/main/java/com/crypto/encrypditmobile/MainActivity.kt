package com.crypto.encrypditmobile

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.crypto.encrypditmobile.ui.theme.EncrypditMobileTheme
import com.crypto.encrypditmobile.ui.theme.LocalReplacementShapes
import com.crypto.encrypditmobile.ui.theme.ReplacementShapes
import com.crypto.encrypditmobile.viewmodel.LendeeViewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val replacementShapes = ReplacementShapes()
            CompositionLocalProvider (
                LocalReplacementShapes provides replacementShapes
            ) {
                EncrypditMobileTheme(darkTheme = true) {
                    // A surface container using the 'background' color from the theme
                    Surface(
                        modifier = Modifier.fillMaxSize(),
                        color = MaterialTheme.colors.background
                    ) {
                        LendeesPage()
                    }
                }
            }
        }
    }
}

@Composable
fun LendeesPage() {
    val lendees: MutableList<LendeeViewModel> = mutableListOf()
    lendees.add(LendeeViewModel())
    LendeesList(lendees = lendees.toList())
}


@Composable
fun LendeesList(lendees: List<LendeeViewModel>) {

    LazyColumn (
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.padding(10.dp)
    ) {
        items (lendees) { lendees ->
            Surface (
                shape = MaterialTheme.shapes.medium,
                modifier = Modifier
                    .height(120.dp)
                    .fillMaxWidth()
                    .border(
                        border = BorderStroke(1.dp, MaterialTheme.colors.onBackground),
                        shape = MaterialTheme.shapes.medium
                    )
            ) {
            }
        }
    }
}