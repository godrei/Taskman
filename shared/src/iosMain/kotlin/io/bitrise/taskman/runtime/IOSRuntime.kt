package io.bitrise.taskman.runtime

import kotlin.experimental.ExperimentalNativeApi

@OptIn(ExperimentalNativeApi::class)
actual fun determineCurrentRuntime(): CurrentRuntime {
    val name = Platform.osFamily.name.lowercase()
    return CurrentRuntime(name, null)
}