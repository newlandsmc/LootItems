rootProject.name = "LootItems"

include(":api")

dependencyResolutionManagement {
    repositories {
        mavenLocal()
        mavenCentral()
        maven { // Paper
            url = uri("https://papermc.io/repo/repository/maven-public/")
        }
    }
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
}

pluginManagement {
    repositories {
        gradlePluginPortal()
    }
}

