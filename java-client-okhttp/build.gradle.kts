plugins {
    id("java.kotlin")
    id("java.publish")
}

dependencies {
    api(project(":java-core"))

    implementation("com.squareup.okhttp3:okhttp:4.12.0")

    testImplementation(kotlin("test"))
    testImplementation("org.junit.jupiter:junit-jupiter:5.9.3")
}
