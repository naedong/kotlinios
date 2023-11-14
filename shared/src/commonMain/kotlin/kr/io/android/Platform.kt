package kr.io.android

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform