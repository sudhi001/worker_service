package com.nullsafety.worker

import kotlinx.cli.ArgParser
import kotlinx.cli.ArgType
import kotlinx.cli.default

object Application {
    const val appName = "Worker Service App"
    const val version = "0.0.1"
}

fun main(args: Array<String>) {
    val parser = ArgParser("${Application.appName}:: ${Application.version}")
    val version by parser.option(ArgType.Boolean, shortName = "V", description = "Version")
        .default(false)

    // Add all input to parser
    parser.parse(args)

    if (version) println(Application.version)
}


