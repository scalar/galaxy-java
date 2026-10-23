import com.vanniktech.maven.publish.JavadocJar
import com.vanniktech.maven.publish.KotlinJvm

plugins {
    id("com.vanniktech.maven.publish")
    id("org.jetbrains.dokka-javadoc")
}

dokka {
    dokkaGeneratorIsolation.set(
        ProcessIsolation {
            maxHeapSize.set("8g")
        }
    )
}

mavenPublishing {
    configure(
        KotlinJvm(
            javadocJar = JavadocJar.Dokka("dokkaGeneratePublicationJavadoc"),
            sourcesJar = true,
        )
    )
    publishToMavenCentral(automaticRelease = true)
    signAllPublications()
    coordinates(project.group.toString(), project.name, project.version.toString())
    pom {
        name.set("Scalar Galaxy SDK")
        description.set(
            "The Scalar Galaxy is an example OpenAPI document to test OpenAPI tools and libraries. It's a fictional universe with fictional planets and fictional data."
        )
        url.set("https://github.com/scalar/galaxy-java")
        licenses {
            license {
                name.set("Apache-2.0")
                url.set("https://github.com/scalar/galaxy-java/blob/HEAD/LICENSE")
            }
        }
        developers {
            developer {
                id.set("scalarGalaxy")
                name.set("Scalar Galaxy")
                url.set("https://github.com/scalar/galaxy-java")
            }
        }
        scm {
            url.set("https://github.com/scalar/galaxy-java")
            connection.set("scm:git:https://github.com/scalar/galaxy-java.git")
            developerConnection.set("scm:git:ssh://git@github.com/scalar/galaxy-java.git")
        }
    }
}

tasks.withType<Zip>().configureEach {
    isZip64 = true
}

tasks.named<org.gradle.jvm.tasks.Jar>("dokkaJavadocJar") {
    exclude("dokka-configuration.json")
}
