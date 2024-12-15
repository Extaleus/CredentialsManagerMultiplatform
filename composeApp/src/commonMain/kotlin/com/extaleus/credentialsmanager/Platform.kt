package com.extaleus.credentialsmanager

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform