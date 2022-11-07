package com.nullsafety.worker

import com.nullsafety.core.CoreContext
import com.nullsafety.core.CoreServiceKit


class Application {
    companion object {
        var port = 7070
        val core = CoreServiceKit.create(CoreContext())
    }
}

fun main() {
    Application.core.app.start(Application.port)
    Application.core.app.run {
        Application.core.workerManager.start()
    }
    Runtime.getRuntime().addShutdownHook(Thread {
        Application.core.app.stop()
        Application.core.workerManager.stop()
    })
}



