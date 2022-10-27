
plugins {
    id("org.jetbrains.kotlin.jvm")
    application
}

repositories {
    mavenCentral()

    maven("https://dl.bintray.com/kotlin/kotlinx/")
}

dependencies {
    implementation(platform("org.jetbrains.kotlin:kotlin-bom"))
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
    implementation("org.jetbrains.kotlinx", "kotlinx-cli", "0.2")


//    implementation(project("CoreServiceKit"))


}

application {
    mainClass.set("com.nullsafety.worker.ApplicationKt")
}
val jar by tasks.getting(Jar::class) {
    manifest {
        attributes["Main-Class"] = "com.nullsafety.worker.ApplicationKt"
    }

}