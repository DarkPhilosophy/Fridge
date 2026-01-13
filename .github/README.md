# Screenshot Manager

<!-- LATEST-BUILD-STATUS-START -->
[![PreBuild](https://img.shields.io/badge/PreBuild-Passing-brightgreen)](https://github.com/DarkPhilosophy/Ko/actions)
[![Build Status](https://github.com/DarkPhilosophy/Ko/actions/workflows/build-apk.yaml/badge.svg)](https://github.com/DarkPhilosophy/Ko/actions)
[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)
[![Version 1.0.0](https://img.shields.io/badge/Version-1.0.0-blue.svg)](https://github.com/DarkPhilosophy/android-Snapify)
<!-- LATEST-BUILD-STATUS-END -->

A modern, intelligent Android application to automatically manage and organize your screenshots. Keep what matters, delete the rest automatically.

<!-- LATEST-VERSION-START -->
Example template version output:
### Latest Update (v1.0.0)
- **New Feature**: Added support for custom folder detection
<!-- LATEST-VERSION-END -->

## Validation Status
<!-- LINT-RESULT-START -->
### Linting Status
> **Status**: ✅ **Passing**  
> **Last Updated**: 2026-01-13 18:22:55 UTC  
> **Summary**: 0 errors, 0 warnings

<details>
<summary>Click to view full lint output</summary>

```
Example template output:
Starting a Gradle Daemon (subsequent builds will be faster)
Calculating task graph as no cached configuration is available for tasks: spotlessCheck detekt test


BUILD SUCCESSFUL in 1m 45s
120 actionable tasks: 120 executed
Configuration cache entry stored.
```

</details>
<!-- LINT-RESULT-END -->

<!-- PERSONAL-README-START -->

# ❄️ Fridge Android Template

## 🚀 Usage Guide

1. **Fork/Use Template**: Create your new repo from this one.
2. **Rename Identity**:
   - Edit `buildSrc/src/main/kotlin/Coordinates.kt`:

     ```kotlin
     object Coordinates {
         const val APP_PACKAGE = "com.example.your" // Update this!
         // Version is read dynamically from version.properties
     }
     ```

   - Rename packages in `app/src/main/kotlin/` to match your new package ID.
   - Rename `YourApplication` and `YourMainActivity` to your app's name.
3. **Setup Secrets**:
   - `app/keystore.jks.example` -> `app/keystore.jks`
   - `app/google-services.json.example` -> `app/google-services.json`
   - `local.properties.example` -> `local.properties` (set `sdk.dir`)

## 📂 Project Structure

- **app/**: Main application module (Hilt + Compose).
  - `src/main/kotlin/com/example/your`: Placeholder package (rename this!).
- **core/**: Shared domain logic module.
- **buildSrc/**: Kotlin DSL build logic & version catalog.
- **scripts/**: Automation scripts (hidden directory `.scripts/`).
  - `update_version_status.sh`: Updates the README with latest version info from `version.properties`.
  - `update_lint_status.sh`: Runs lint checks and updates badge status.

## 🛠 Features & Configuration

### version.properties

Project versioning is centralized in `version.properties`.
- **Logic**: `Coordinates.kt` dynamically reads this file at build time.
- **Usage**: Simply edit `version.major`, `version.minor`, etc., and the build will pick it up immediately (no Gradle sync required for version changes).

### CI/CD Pipelines

Located in `.github/workflows/`:
- **build-apk.yaml**: automatically builds Debug/Release APKs when a tag is pushed.
- **lint.yaml**: Ensures code quality (Detekt/Spotless) on PRs.

## 🤝 Contributing

See [CONTRIBUTING.md](CONTRIBUTING.md) for details on code style (KtLint/Detekt) and PR process.

**Made with ❤️ by [Adalbert Alexandru Ungureanu](https://github.com/DarkPhilosophy)**

<!-- PERSONAL-README-END -->
