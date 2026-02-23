pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "DivisionB"
include(":app")
include(":app:buttondemo")
include(":app:activityswitching")
include(":app:autocompletedemo")
include(":app:demowebview")
include(":app:demosplash")
include(":app:demoalert")
include(":app:customlistviewdemo")
include(":app:demodatasend")
include(":app:demosharedpref")
include(":app:democustompractice")
