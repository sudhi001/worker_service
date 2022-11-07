
plugins {
    id("org.jetbrains.kotlin.jvm")
    application
}

repositories {
    mavenCentral()
    jcenter()
}

dependencies {
    implementation(project("CoreServiceKit"))
}

application {
    mainClass.set("com.nullsafety.worker.ApplicationKt")
}
val jar by tasks.getting(Jar::class) {
    manifest {
        attributes["Main-Class"] = "com.nullsafety.worker.ApplicationKt"
    }

}