plugins {
    id("galaxy.kotlin")
    id("galaxy.publish")
}

dependencies {
    api(project(":galaxy-java-core"))

    implementation("com.squareup.okhttp3:okhttp:4.12.0")

    testImplementation(kotlin("test"))
    testImplementation("org.junit.jupiter:junit-jupiter:5.9.3")
}
