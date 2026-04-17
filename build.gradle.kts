plugins {
    id("org.jetbrains.intellij.platform") version "2.10.5"
}

group = "com.github.lauchgott"
version = "0.1.2"

repositories {
    mavenCentral()
    intellijPlatform {
        defaultRepositories()
    }
}

intellijPlatform {
    publishing {
        token = providers.environmentVariable("PUBLISH_TOKEN")
    }
    pluginConfiguration {
        id = "com.github.lauchgott.everforest-islands-theme"
        name = "Everforest Islands Theme"
        version = "0.1.2"
        description = "This is a Port of the sainnhe/everforest theme for JetBrains based IDEs. This one is still work in progress. all credits go to the creators of this colorscheme - not me"
        vendor {
            name = "lauchgott"
        }
        ideaVersion {
            sinceBuild = "232"
            untilBuild = provider { null }
        }
    }
}

dependencies {
    intellijPlatform {
        intellijIdeaCommunity("2025.2.3")
        pluginVerifier()
        zipSigner()
        instrumentationTools()
    }
}
