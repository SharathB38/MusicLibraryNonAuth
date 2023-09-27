package com.example.plugins

import com.example.di.myModule
import io.ktor.server.application.*
import org.koin.ktor.plugin.Koin

fun Application.configureKoin(){
    install(Koin) {
        modules(myModule) }
}