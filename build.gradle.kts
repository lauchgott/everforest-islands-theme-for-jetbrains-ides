plugins {
    id("org.jetbrains.intellij.platform") version "2.6.0"
}

group = "com.github.florianseidel"
version = "1.0.0"

repositories {
    mavenCentral()
    intellijPlatform {
        defaultRepositories()
    }
}

intellijPlatform {
    pluginConfiguration {
        id = "com.github.florianseidel.everforest-islands-theme"
        name = "Everforest Islands Theme"
        version = "1.0.0"
        description = "Everforest color theme with Islands UI support – dark and light variants in hard, medium, and soft contrast."
        vendor {
            name = "Florian Seidel"
        }
        ideaVersion {
            sinceBuild = "251"
        }
    }
}

dependencies {
    intellijPlatform {
        // Target IntelliJ IDEA 2025.1 (Islands UI available from 2025.1)
        intellijIdeaCommunity("2025.1")
        pluginVerifier()
        zipSigner()
        instrumentationTools()
    }
}
