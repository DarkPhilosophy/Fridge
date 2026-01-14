# Fridge Inventory App

<!-- LATEST-BUILD-STATUS-START -->
[![PreBuild](https://img.shields.io/badge/PreBuild-Passing-brightgreen)](https://github.com/DarkPhilosophy/Fridge/actions)
[![Build Status](https://github.com/DarkPhilosophy/Fridge/actions/workflows/ci.yaml/badge.svg)](https://github.com/DarkPhilosophy/Fridge/actions)
[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)
[![Version 1.0.0](https://img.shields.io/badge/Version-1.0.0-blue.svg)](https://github.com/DarkPhilosophy/Fridge)
<!-- LATEST-BUILD-STATUS-END -->

A smart, modern Android application for managing your fridge inventory. Track items, expiration dates, and get notifications to reduce food waste. Built with **Jetpack Compose**, **Firebase**, and **Room**.

<!-- LATEST-VERSION-START -->
### Latest Update (v1.0.0)
- Initial Release of Fridge Inventory App.
- Firebase Integration (Auth, Database, Messaging).
- Offline support with Room.
- Jetpack Compose UI (Inventory, Details, Auth).
- Barcode Scanner integration.
<!-- LATEST-VERSION-END -->

## Validation Status
<!-- LINT-RESULT-START -->
### Linting Status
> **Status**: ✅ **Passing**  
> **Last Updated**: 2026-01-14 20:10:31 UTC  
> **Summary**: 0 errors, 0 warnings

<details>
<summary>Click to view full lint output</summary>

```Starting a Gradle Daemon (subsequent builds will be faster)
Calculating task graph as no cached configuration is available for tasks: spotlessCheck detekt test
> Task :buildSrc:checkKotlinGradlePluginConfigurationErrors SKIPPED
> Task :buildSrc:pluginDescriptors
> Task :buildSrc:processResources NO-SOURCE
> Task :buildSrc:compileKotlin
> Task :buildSrc:compileJava NO-SOURCE
> Task :buildSrc:compileGroovy NO-SOURCE
> Task :buildSrc:classes UP-TO-DATE

> Task :buildSrc:jar
:jar: No valid plugin descriptors were found in META-INF/gradle-plugins

> Task :detekt NO-SOURCE
> Task :app:preBuild UP-TO-DATE
> Task :app:preDebugBuild UP-TO-DATE
> Task :app:checkKotlinGradlePluginConfigurationErrors SKIPPED
> Task :spotlessInternalRegisterDependencies
> Task :app:spotlessKotlin
> Task :app:spotlessKotlinCheck
> Task :app:spotlessKotlinGradle
> Task :app:spotlessKotlinGradleCheck
> Task :app:spotlessCheck
> Task :app:generateDebugResValues
> Task :app:generateDebugResources
> Task :app:injectCrashlyticsMappingFileIdDebug
> Task :app:injectCrashlyticsVersionControlInfoDebug
> Task :app:processDebugGoogleServices
> Task :core:preBuild UP-TO-DATE
> Task :core:preDebugBuild UP-TO-DATE
> Task :core:generateDebugResValues
> Task :core:generateDebugResources
> Task :core:packageDebugResources

> Task :app:detekt
Property 'style>ForbiddenComment>values' is deprecated. Use \`comments\` instead, make sure you escape your text for Regular Expressions..
Property 'naming>FunctionNaming>ignoreOverridden' is deprecated. This configuration is ignored and will be removed in the future.

> Task :core:detekt
> Task :core:processDebugNavigationResources
> Task :app:packageDebugResources
> Task :core:parseDebugLocalResources
> Task :core:generateDebugRFile
> Task :app:generateDebugBuildConfig
> Task :core:writeDebugAarMetadata
> Task :app:processDebugNavigationResources
> Task :app:dataBindingMergeDependencyArtifactsDebug
> Task :app:checkDebugAarMetadata
> Task :app:mapDebugSourceSetPaths
> Task :app:createDebugCompatibleScreenManifests
> Task :app:parseDebugLocalResources
> Task :app:extractDeepLinksDebug
> Task :core:extractDeepLinksDebug
> Task :app:compileDebugNavigationResources
> Task :core:checkKotlinGradlePluginConfigurationErrors SKIPPED
> Task :core:compileDebugLibraryResources
> Task :core:generateDebugBuildConfig
> Task :core:javaPreCompileDebug
> Task :core:processDebugManifest
> Task :app:javaPreCompileDebug
> Task :app:preDebugUnitTestBuild UP-TO-DATE
> Task :app:javaPreCompileDebugUnitTest
> Task :app:preReleaseBuild UP-TO-DATE
> Task :app:buildKotlinToolingMetadata
> Task :app:dataBindingMergeDependencyArtifactsRelease
> Task :app:generateReleaseResValues
> Task :app:generateReleaseResources
> Task :app:injectCrashlyticsMappingFileIdRelease
> Task :app:processDebugMainManifest
> Task :app:extractReleaseVersionControlInfo
> Task :app:injectCrashlyticsVersionControlInfoRelease
> Task :app:processReleaseGoogleServices
> Task :core:preReleaseBuild UP-TO-DATE
> Task :core:generateReleaseResValues
> Task :core:generateReleaseResources
> Task :core:packageReleaseResources
> Task :app:processDebugManifest
> Task :app:processDebugManifestForPackage
> Task :app:packageReleaseResources
> Task :core:processReleaseNavigationResources
> Task :app:processReleaseNavigationResources
> Task :app:parseReleaseLocalResources
> Task :core:parseReleaseLocalResources
> Task :core:generateReleaseRFile
> Task :app:generateReleaseBuildConfig
> Task :core:writeReleaseAarMetadata
> Task :app:checkReleaseAarMetadata
> Task :app:compileReleaseNavigationResources
> Task :app:mapReleaseSourceSetPaths
> Task :app:createReleaseCompatibleScreenManifests
> Task :app:extractDeepLinksRelease
> Task :core:extractDeepLinksRelease
> Task :core:processReleaseManifest
> Task :app:processReleaseMainManifest
> Task :app:processReleaseManifest
> Task :app:processReleaseManifestForPackage
> Task :core:compileReleaseLibraryResources
> Task :core:generateReleaseBuildConfig
> Task :app:mergeReleaseResources
> Task :app:mergeDebugResources
> Task :app:dataBindingGenBaseClassesRelease
> Task :app:dataBindingGenBaseClassesDebug
> Task :app:processReleaseResources
> Task :app:processDebugResources
> Task :core:javaPreCompileRelease
> Task :app:preReleaseUnitTestBuild UP-TO-DATE
> Task :app:javaPreCompileRelease
> Task :app:javaPreCompileReleaseUnitTest
> Task :core:preReleaseUnitTestBuild UP-TO-DATE
> Task :core:preDebugUnitTestBuild UP-TO-DATE
> Task :core:generateDebugUnitTestStubRFile
> Task :core:generateReleaseUnitTestStubRFile
> Task :core:javaPreCompileReleaseUnitTest
> Task :core:javaPreCompileDebugUnitTest
> Task :core:compileReleaseKotlin
> Task :core:processReleaseJavaRes
> Task :core:compileDebugKotlin
> Task :core:processDebugJavaRes
> Task :core:compileDebugJavaWithJavac
> Task :core:compileReleaseJavaWithJavac
> Task :core:bundleLibRuntimeToJarDebug
> Task :core:bundleLibCompileToJarDebug
> Task :core:bundleLibRuntimeToJarRelease
> Task :core:bundleLibCompileToJarRelease
> Task :core:createFullJarDebug
> Task :core:createFullJarRelease
> Task :core:compileDebugUnitTestKotlin NO-SOURCE
> Task :core:compileDebugUnitTestJavaWithJavac NO-SOURCE
> Task :core:processDebugUnitTestJavaRes NO-SOURCE
> Task :core:testDebugUnitTest NO-SOURCE
> Task :core:compileReleaseUnitTestKotlin NO-SOURCE
> Task :core:compileReleaseUnitTestJavaWithJavac NO-SOURCE
> Task :core:processReleaseUnitTestJavaRes NO-SOURCE
> Task :core:testReleaseUnitTest NO-SOURCE
> Task :core:test UP-TO-DATE
> Task :app:kspDebugKotlin
> Task :app:kspReleaseKotlin

> Task :app:compileDebugKotlin
w: file:///home/runner/work/Fridge/Fridge/app/src/main/kotlin/ro/fridge/di/DatabaseModule.kt:25:11 'fun fallbackToDestructiveMigration(): RoomDatabase.Builder<AppDatabase>' is deprecated. Replace by overloaded version with parameter to indicate if all tables should be dropped or not.
w: file:///home/runner/work/Fridge/Fridge/app/src/main/kotlin/ro/fridge/ui/item/ItemDetailScreen.kt:26:44 'val Icons.Filled.ArrowBack: ImageVector' is deprecated. Use the AutoMirrored version at Icons.AutoMirrored.Filled.ArrowBack.
w: file:///home/runner/work/Fridge/Fridge/app/src/main/kotlin/ro/fridge/ui/theme/Theme.kt:61:20 'var statusBarColor: Int' is deprecated. Deprecated in Java.

> Task :app:compileReleaseKotlin
w: file:///home/runner/work/Fridge/Fridge/app/src/main/kotlin/ro/fridge/di/DatabaseModule.kt:25:11 'fun fallbackToDestructiveMigration(): RoomDatabase.Builder<AppDatabase>' is deprecated. Replace by overloaded version with parameter to indicate if all tables should be dropped or not.
w: file:///home/runner/work/Fridge/Fridge/app/src/main/kotlin/ro/fridge/ui/item/ItemDetailScreen.kt:26:44 'val Icons.Filled.ArrowBack: ImageVector' is deprecated. Use the AutoMirrored version at Icons.AutoMirrored.Filled.ArrowBack.
w: file:///home/runner/work/Fridge/Fridge/app/src/main/kotlin/ro/fridge/ui/theme/Theme.kt:61:20 'var statusBarColor: Int' is deprecated. Deprecated in Java.

> Task :app:compileDebugJavaWithJavac
> Task :app:compileReleaseJavaWithJavac
> Task :app:hiltAggregateDepsDebug
> Task :app:hiltAggregateDepsRelease
> Task :app:hiltJavaCompileRelease
> Task :app:processReleaseJavaRes
> Task :app:hiltJavaCompileDebug
> Task :app:processDebugJavaRes
> Task :app:bundleReleaseClassesToCompileJar
> Task :app:bundleDebugClassesToCompileJar
> Task :app:kspReleaseUnitTestKotlin NO-SOURCE
> Task :app:kspDebugUnitTestKotlin NO-SOURCE
> Task :app:compileReleaseUnitTestKotlin NO-SOURCE
> Task :app:compileReleaseUnitTestJavaWithJavac NO-SOURCE
> Task :app:compileDebugUnitTestKotlin NO-SOURCE
> Task :app:compileDebugUnitTestJavaWithJavac NO-SOURCE
> Task :app:hiltAggregateDepsReleaseUnitTest
> Task :app:hiltJavaCompileReleaseUnitTest NO-SOURCE
> Task :app:processReleaseUnitTestJavaRes NO-SOURCE
> Task :app:hiltAggregateDepsDebugUnitTest
> Task :app:hiltJavaCompileDebugUnitTest NO-SOURCE
> Task :app:processDebugUnitTestJavaRes NO-SOURCE
> Task :app:transformDebugClassesWithAsm
> Task :app:transformReleaseClassesWithAsm
> Task :app:bundleDebugClassesToRuntimeJar
> Task :app:bundleReleaseClassesToRuntimeJar
> Task :app:transformDebugUnitTestClassesWithAsm
> Task :app:testDebugUnitTest NO-SOURCE
> Task :app:transformReleaseUnitTestClassesWithAsm
> Task :app:testReleaseUnitTest NO-SOURCE
> Task :app:test UP-TO-DATE
gradle/actions: Writing build results to /home/runner/work/_temp/.gradle-actions/build-results/lint_step-1768421211721.json

[Incubating] Problems report is available at: file:///home/runner/work/Fridge/Fridge/build/reports/problems/problems-report.html

Deprecated Gradle features were used in this build, making it incompatible with Gradle 10.

You can use '--warning-mode all' to show the individual deprecation warnings and determine if they come from your own scripts or plugins.

For more on this, please refer to https://docs.gradle.org/9.2.0/userguide/command_line_interface.html#sec:command_line_warnings in the Gradle documentation.

BUILD SUCCESSFUL in 3m 48s
120 actionable tasks: 120 executed
Configuration cache entry stored.
```
</details>
<!-- LINT-RESULT-END -->

## 📱 Features

-   **Cloud & Offline Sync**: Seamlessly switches between Firebase (Realtime) and local Room database.
-   **Smart Notifications**: Get alerts before your food expires.
-   **Barcode Scanner**: Quickly add items using the integrated ML Kit scanner.
-   **Premium Design**: Modern Dark/Light theme with Material 3 components.
-   **Authentication**: Secure login via Email/Password or Google Sign-In.

## 🛠 Tech Stack

-   **Language**: Kotlin
-   **UI**: Jetpack Compose (Material 3)
-   **Architecture**: MVVM + Clean Architecture + Repository Pattern
-   **Dependency Injection**: Hilt
-   **Backend**: Firebase (Auth, Realtime DB, Cloud Messaging)
-   **Local Data**: Room Database
-   **CI/CD**: GitHub Actions (Linting, Building, Releasing)

## 📂 Project Structure

-   `app/src/main/kotlin/ro/fridge/`: Main application source code.
    -   `data/`: Repositories, Models, Data Sources (Room/Firebase).
    -   `di/`: Hilt Modules.
    -   `ui/`: Compose Screens and ViewModels.
    -   `service/`: Background services (Notifications).
-   `.github/workflows/`: CI/CD pipelines.
-   `.scripts/`: Automation scripts for documentation and versioning.

## 🤝 Contributing

See [CONTRIBUTING.md](CONTRIBUTING.md) for details on code style (KtLint/Detekt) and PR process.

**Made with ❤️**
