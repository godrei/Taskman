package io.bitrise.taskman.runtime

import kotlin.test.Test
import kotlin.test.assertContains
import kotlin.test.assertEquals

class JVMRuntimeTest {
    @Test
    fun shouldDetectJVM() {
        val runtime = determineCurrentRuntime()
        assertContains(runtime.name, "OpenJDK")
        assertEquals(runtime.version, "21.0")
    }
}