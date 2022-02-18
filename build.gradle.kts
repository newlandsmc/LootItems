plugins {
    `java-library`
    `maven-publish`
}

allprojects {
    group = "com.semivanilla.lootitems"
    version = "1.0-SNAPSHOT"
}

subprojects {
    apply<JavaLibraryPlugin>()

    java {
        toolchain {
            languageVersion.set(JavaLanguageVersion.of(17))
        }
    }

    tasks {
        withType<JavaCompile> {
            options.encoding = Charsets.UTF_8.name()
        }

        withType<Javadoc> {
            options.encoding = Charsets.UTF_8.name()
        }

        withType<JavaCompile> {
            options.isDeprecation = true
        }
    }
}

dependencies {
    compileOnly("io.papermc.paper:paper-api:1.18.1-R0.1-SNAPSHOT") // Paper
    compileOnly("net.kyori:adventure-text-minimessage:4.10.0-SNAPSHOT") // Minimessage
}
