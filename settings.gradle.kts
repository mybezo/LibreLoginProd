pluginManagement {
    repositories {
        maven {
            url = uri("https://repo.kyngs.xyz/gradle-plugins")
        }
        gradlePluginPortal()
        // Fallback: repo.kyngs.xyz no longer serves libby-gradle-plugin
        maven {
            url = uri("https://jitpack.io")
        }
    }
    resolutionStrategy {
        eachPlugin {
            if (requested.id.id == "xyz.kyngs.libby.plugin") {
                useModule("com.github.kyngs:libby-gradle-plugin:${requested.version}")
            }
        }
    }
}

rootProject.name = "LibreLoginProd"
include("Plugin", "API")
