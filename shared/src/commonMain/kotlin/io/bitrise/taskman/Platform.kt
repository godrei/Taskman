package io.bitrise.taskman

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform