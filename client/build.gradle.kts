plugins {
    kotlin("multiplatform")
}

kotlin {
    jvm()
    js {
        nodejs()
        browser()
    }
    linuxX64()
    sourceSets {
        val commonMain by getting {
            dependencies {
                api(project(":engine-api"))
            }
        }
        val commonTest by getting {
            dependencies {
                api(kotlin("test"))
                api(project(":engine-impl"))
            }
        }
    }
}
