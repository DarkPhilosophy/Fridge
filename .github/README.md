# Fridge Inventory App

<!-- LATEST-BUILD-STATUS-START -->
[![PreBuild](https://img.shields.io/badge/PreBuild-Failing-red)](https://github.com/DarkPhilosophy/Fridge/actions)
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
> **Status**: ❌ **Failing**  
> **Last Updated**: 2026-01-14 19:25:41 UTC  
> **Summary**: Check output for details

<details>
<summary>Click to view full lint output</summary>

```Downloading https://services.gradle.org/distributions/gradle-9.2.0-bin.zip
............10%.............20%.............30%.............40%.............50%.............60%.............70%.............80%.............90%.............100%

Welcome to Gradle 9.2.0!

Here are the highlights of this release:
 - Windows ARM support
 - Improved publishing APIs
 - Better guidance for dependency verification failures

For more details see https://docs.gradle.org/9.2.0/release-notes.html

Starting a Gradle Daemon (subsequent builds will be faster)
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
> Task :app:processDebugGoogleServices FAILED
> Task :core:preBuild UP-TO-DATE
> Task :core:preDebugBuild UP-TO-DATE
> Task :core:generateDebugResValues
> Task :core:generateDebugResources
> Task :core:packageDebugResources
> Task :core:processDebugNavigationResources

> Task :app:detekt
Property 'style>ForbiddenComment>values' is deprecated. Use \`comments\` instead, make sure you escape your text for Regular Expressions..
Property 'naming>FunctionNaming>ignoreOverridden' is deprecated. This configuration is ignored and will be removed in the future.

> Task :core:detekt FAILED
/home/runner/work/Fridge/Fridge/core/src/main/kotlin/ro/fridge/events/AppEvents.kt:1:1: The package declaration does not match the actual file location. [InvalidPackageDeclaration]
/home/runner/work/Fridge/Fridge/core/src/main/kotlin/ro/fridge/di/AppModule.kt:1:1: The package declaration does not match the actual file location. [InvalidPackageDeclaration]
/home/runner/work/Fridge/Fridge/core/src/main/kotlin/ro/fridge/di/ReceiverEntryPoint.kt:1:1: The package declaration does not match the actual file location. [InvalidPackageDeclaration]
/home/runner/work/Fridge/Fridge/core/src/main/kotlin/ro/fridge/data/dao/ScreenshotDao.kt:1:1: The package declaration does not match the actual file location. [InvalidPackageDeclaration]
/home/runner/work/Fridge/Fridge/core/src/main/kotlin/ro/fridge/data/entity/MediaItem.kt:1:1: The package declaration does not match the actual file location. [InvalidPackageDeclaration]
/home/runner/work/Fridge/Fridge/core/src/main/kotlin/ro/fridge/data/database/ScreenshotDatabase.kt:1:1: The package declaration does not match the actual file location. [InvalidPackageDeclaration]
/home/runner/work/Fridge/Fridge/core/src/main/kotlin/ro/fridge/config/MediaMonitorConfig.kt:1:1: The package declaration does not match the actual file location. [InvalidPackageDeclaration]
/home/runner/work/Fridge/Fridge/core/src/main/kotlin/ro/fridge/util/UriPathConverter.kt:3:1: The package declaration does not match the actual file location. [InvalidPackageDeclaration]
/home/runner/work/Fridge/Fridge/core/src/main/kotlin/ro/fridge/util/DebugLogger.kt:1:1: The package declaration does not match the actual file location. [InvalidPackageDeclaration]
/home/runner/work/Fridge/Fridge/core/src/main/kotlin/ro/fridge/util/MediaFileValidator.kt:3:1: The package declaration does not match the actual file location. [InvalidPackageDeclaration]
/home/runner/work/Fridge/Fridge/core/src/main/kotlin/ro/fridge/util/PermissionUtils.kt:1:1: The package declaration does not match the actual file location. [InvalidPackageDeclaration]
/home/runner/work/Fridge/Fridge/core/src/main/kotlin/ro/fridge/util/TimeUtils.kt:1:1: The package declaration does not match the actual file location. [InvalidPackageDeclaration]
/home/runner/work/Fridge/Fridge/core/src/main/kotlin/ro/fridge/util/WorkManagerScheduler.kt:1:1: The package declaration does not match the actual file location. [InvalidPackageDeclaration]
/home/runner/work/Fridge/Fridge/core/src/main/kotlin/ro/fridge/util/NotificationHelper.kt:1:1: The package declaration does not match the actual file location. [InvalidPackageDeclaration]


> Task :app:generateDebugBuildConfig
> Task :core:writeDebugAarMetadata
> Task :core:parseDebugLocalResources
> Task :app:processDebugNavigationResources
> Task :app:dataBindingMergeDependencyArtifactsDebug
> Task :core:generateDebugRFile
> Task :app:createDebugCompatibleScreenManifests
> Task :core:extractDeepLinksDebug
> Task :app:checkDebugAarMetadata
> Task :core:checkKotlinGradlePluginConfigurationErrors SKIPPED
> Task :core:generateDebugBuildConfig
> Task :core:compileDebugLibraryResources
> Task :app:compileDebugNavigationResources
> Task :core:processDebugManifest
> Task :core:javaPreCompileDebug
> Task :app:preDebugUnitTestBuild UP-TO-DATE
> Task :app:preReleaseBuild UP-TO-DATE
> Task :app:javaPreCompileDebugUnitTest
> Task :app:dataBindingMergeDependencyArtifactsRelease
> Task :app:generateReleaseResValues
> Task :app:generateReleaseResources
> Task :app:injectCrashlyticsMappingFileIdRelease
> Task :app:buildKotlinToolingMetadata
> Task :app:processReleaseGoogleServices FAILED
> Task :core:preReleaseBuild UP-TO-DATE
> Task :core:generateReleaseResValues
> Task :core:generateReleaseResources
> Task :core:packageReleaseResources
> Task :core:processReleaseNavigationResources
> Task :app:processReleaseNavigationResources
> Task :core:parseReleaseLocalResources
> Task :app:extractReleaseVersionControlInfo
> Task :app:injectCrashlyticsVersionControlInfoRelease
> Task :app:generateReleaseBuildConfig
> Task :core:generateReleaseRFile
> Task :core:writeReleaseAarMetadata
> Task :app:compileReleaseNavigationResources
> Task :app:createReleaseCompatibleScreenManifests
> Task :core:extractDeepLinksRelease
> Task :core:processReleaseManifest
> Task :app:checkReleaseAarMetadata
> Task :core:compileReleaseLibraryResources
> Task :core:generateReleaseBuildConfig
> Task :core:javaPreCompileRelease
> Task :app:javaPreCompileRelease
> Task :app:preReleaseUnitTestBuild UP-TO-DATE
> Task :app:javaPreCompileDebug
> Task :core:preDebugUnitTestBuild UP-TO-DATE
> Task :app:javaPreCompileReleaseUnitTest
> Task :core:javaPreCompileDebugUnitTest
> Task :core:preReleaseUnitTestBuild UP-TO-DATE
> Task :core:generateDebugUnitTestStubRFile
> Task :core:generateReleaseUnitTestStubRFile
> Task :core:javaPreCompileReleaseUnitTest
> Task :core:compileReleaseKotlin
> Task :core:compileDebugKotlin
> Task :core:processReleaseJavaRes
> Task :core:processDebugJavaRes
> Task :core:compileReleaseJavaWithJavac
> Task :core:compileDebugJavaWithJavac
> Task :core:bundleLibRuntimeToJarDebug
> Task :core:bundleLibRuntimeToJarRelease
> Task :core:bundleLibCompileToJarDebug
> Task :core:bundleLibCompileToJarRelease
> Task :core:compileReleaseUnitTestKotlin NO-SOURCE
> Task :core:compileDebugUnitTestKotlin NO-SOURCE
> Task :core:createFullJarDebug
> Task :core:createFullJarRelease
> Task :core:compileReleaseUnitTestJavaWithJavac NO-SOURCE
> Task :core:compileDebugUnitTestJavaWithJavac NO-SOURCE
> Task :core:processDebugUnitTestJavaRes NO-SOURCE
> Task :core:processReleaseUnitTestJavaRes NO-SOURCE
> Task :core:testReleaseUnitTest NO-SOURCE
> Task :core:testDebugUnitTest NO-SOURCE
> Task :core:test UP-TO-DATE
gradle/actions: Writing build results to /home/runner/work/_temp/.gradle-actions/build-results/lint_step-1768418431447.json

[Incubating] Problems report is available at: file:///home/runner/work/Fridge/Fridge/build/reports/problems/problems-report.html

FAILURE: Build completed with 3 failures.

1: Task failed with an exception.
-----------
* What went wrong:
Execution failed for task ':app:processDebugGoogleServices'.
> com.google.gson.stream.MalformedJsonException: Use JsonReader.setStrictness(Strictness.LENIENT) to accept malformed JSON at line 2 column 2 path $
  See https://github.com/google/gson/blob/main/Troubleshooting.md#malformed-json

* Try:
> Run with --stacktrace option to get the stack trace.
> Run with --info or --debug option to get more log output.
> Run with --scan to generate a Build Scan (powered by Develocity).
> Get more help at https://help.gradle.org.
==============================================================================

2: Task failed with an exception.
-----------
* What went wrong:
Execution failed for task ':core:detekt'.
> Analysis failed with 14 weighted issues.

* Try:
> Run with --stacktrace option to get the stack trace.
> Run with --info or --debug option to get more log output.
> Run with --scan to generate a Build Scan (powered by Develocity).
> Get more help at https://help.gradle.org.
==============================================================================

3: Task failed with an exception.
-----------
* What went wrong:
Execution failed for task ':app:processReleaseGoogleServices'.
> com.google.gson.stream.MalformedJsonException: Use JsonReader.setStrictness(Strictness.LENIENT) to accept malformed JSON at line 2 column 2 path $
  See https://github.com/google/gson/blob/main/Troubleshooting.md#malformed-json

* Try:
> Run with --stacktrace option to get the stack trace.
> Run with --info or --debug option to get more log output.
> Run with --scan to generate a Build Scan (powered by Develocity).
> Get more help at https://help.gradle.org.
==============================================================================

Deprecated Gradle features were used in this build, making it incompatible with Gradle 10.

You can use '--warning-mode all' to show the individual deprecation warnings and determine if they come from your own scripts or plugins.

For more on this, please refer to https://docs.gradle.org/9.2.0/userguide/command_line_interface.html#sec:command_line_warnings in the Gradle documentation.

BUILD FAILED in 5m 21s
78 actionable tasks: 78 executed
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
