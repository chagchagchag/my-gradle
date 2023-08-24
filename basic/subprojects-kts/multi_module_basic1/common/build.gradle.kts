//group = "io.study.mygradle"
//version = "0.0.1-SNAPSHOT"
//
//
//java {
//    sourceCompatibility = JavaVersion.VERSION_17
//}

plugins{
    kotlin("jvm") version "1.6.21"
}

repositories {
    mavenCentral()
}

dependencies{
    apply(plugin ="org.jetbrains.kotlin.jvm")
//    implementation("com.google.code.gson:gson:2.10")
    api("com.google.code.gson:gson:2.10")
}

tasks.getByName("bootJar"){
    enabled = false
}

tasks.getByName("jar"){
    enabled = true
}
