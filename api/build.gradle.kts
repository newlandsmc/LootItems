plugins {
    `maven-publish`
}

dependencies {
    compileOnly("io.papermc.paper:paper-api:1.18.1-R0.1-SNAPSHOT") // Paper
    compileOnly("net.kyori:adventure-text-minimessage:4.10.0-SNAPSHOT") // Minimessage
}

dependencies {
    compileOnly("io.papermc.paper:paper-api:1.18.1-R0.1-SNAPSHOT") // Paper
    compileOnly("net.kyori:adventure-text-minimessage:4.10.0-SNAPSHOT") // Minimessage
}

publishing {
    publications {
        create<MavenPublication>("mavenJava") {
            from(components["java"])
        }
    }

    repositories{
        maven {
            name = "SemiVanilla"
            url = uri("https://sv.destro.xyz/snapshots")
            credentials(PasswordCredentials::class)
        }
    }
}