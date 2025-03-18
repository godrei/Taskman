package io.bitrise.taskman

import androidx.compose.material.MaterialTheme
import androidx.compose.ui.test.ExperimentalTestApi
import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.onRoot
import androidx.compose.ui.test.printToLog
import androidx.compose.ui.test.runComposeUiTest
import kotlin.test.Test

class AppTest {

    @OptIn(ExperimentalTestApi::class)
    @Test
    fun initial_screen_state() = runComposeUiTest {
        setContent {
            MaterialTheme {
                App()
            }
        }
        onRoot().printToLog("AppTest")
        onNodeWithText("Fetch Tasks").assertIsDisplayed()
    }
}