# Fridge ❄️

A robust Android project template extracted from `ro.snapify`.
Ready for GitHub, CI/CD, and modern Android development (Compose, Hilt, Detekt).

## 🚀 Getting Started

### 1. Use this Template
Click "Use this template" on GitHub or fork/clone this repository.

### 2. Configure Your App
Modify `buildSrc/src/main/kotlin/Coordinates.kt` to set your project identity:
```kotlin
// Change these default values!
val APP_PACKAGE = "com.example.fridge" 
val APP_VERSION_NAME = "1.0.0"
```

### 3. Sync & Build
Run `./gradlew assembleDebug` to verify the setup.


## 📂 Project Structure

A modular architecture designed for scalability and separation of concerns.

### `app/` (Application Module)

The entry point of the application. Contains the UI logic and Android-specific components.

- **`src/main/kotlin/`**:
  - `FridgeApplication.kt`: Hilt-enabled Application class.
  - `FridgeMainActivity.kt`: Main entry point hosting the Compose content.
- **`build.gradle.kts`**: Module-specific configuration (plugins, dependencies).

### `core/` (Core Module)

Contains shared business logic, utility classes, and domain models.

- **Purpose**: Keep this module pure and reusable across different feature modules if the app grows.

### `buildSrc/` (Build Logic)

Centralized locations for build configuration to ensure consistency.

- **`Coordinates.kt`**: Single source of truth for **App ID**, **Version**, and **SDK levels**. Edit this file to rename your project!

```kotlin
object Coordinates {
    const val APP_PACKAGE = "com.example.fridge" // <--- Change this!
    // ...
}
```

### `gradle/`

- **`libs.versions.toml`**: Gradle Version Catalog. Manage all library versions and plugins here.

## 🛠 Project Configuration

### 1. Identity

Modify `buildSrc/src/main/kotlin/Coordinates.kt` to set your unique package name and version.

### 2. Signing & Secrets

- **Keystore**: A sample `keystore.jks.example` is provided in `app/`. Rename to `keystore.jks` and generate your own key for release builds.
- **Google Services**: If using Firebase, place your `google-services.json` in `app/`. An example is provided.
- **Local Properties**: Copy `local.properties.example` to `local.properties` and set your `sdk.dir` or `cmake.dir` if needed.

## ✅ Quality Control

This template comes pre-configured with:

- **KtLint (via Spotless)**: Enforces code style.
  - Run: `./gradlew spotlessApply`
- **Detekt**: Static code analysis.
  - Run: `./gradlew detekt`
  - Config: `detekt.yml` (derived from the strict Snapify standard).

## 🚀 Workflows (CI/CD)

Located in `.github/workflows/`, inheriting the robust Snapify pipeline:

- **Build & Test**: Runs on every pull request.
- **Linting**: Checks formatting and Detekt rules.
- **Release**: Automatically builds APKs/Bundles on version tags.

## 🤝 Contributing

1. Fork the repo.

2. Create a feature branch.
3. Commit changes (`git commit -m "Add feature"`).
4. Push to branch (`git push origin my-feature`).
5. Open a Pull Request.
