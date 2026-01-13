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
         const val APP_PACKAGE = "com.your.package" // Update this!
         const val APP_VERSION_NAME = "1.0.0"
     }
     ```

   - Rename packages in `app/src/main/kotlin/` to match your new package ID.
3. **Setup Secrets**:
   - `app/keystore.jks.example` -> `app/keystore.jks`
   - `app/google-services.json.example` -> `app/google-services.json`
   - `local.properties.example` -> `local.properties` (set `sdk.dir`)

## 📂 Project Structure

- **app/**: Main application module (Hilt + Compose).
- **core/**: Shared domain logic module.
- **buildSrc/**: Kotlin DSL build logic & version catalog.
- **scripts/**: Automation scripts.
  - `update_readme.sh`: Updates the README with latest lint status and version info.
  - `update_lint_status.sh`: Runs lint checks and updates badge status.

## 🛠 Automation & Scripts

This template includes helper scripts in `/scripts/` to maintain project health:

### `scripts/update_lint_status.sh`

Runs `./gradlew detekt spotlessCheck` and updates the **Linting Status** section in this README with the result (Passing/Failing) and a timestamp.
- **Usage**: Automatically run by CI, or run locally: `./scripts/update_lint_status.sh`

### `scripts/update_readme.sh`

Updates the **Latest Version** section in this README by parsing `version.properties`.
- **Usage**: `./scripts/update_readme.sh`

## 🤝 Contributing

See [CONTRIBUTING.md](CONTRIBUTING.md) for details on code style (KtLint/Detekt) and PR process.

**Made with ❤️ by [Adalbert Alexandru Ungureanu](https://github.com/DarkPhilosophy)**

<!-- PERSONAL-README-END -->

