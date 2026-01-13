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
- **app/**: Main Android application module.
- **core/**: Shared logic and utilities.
- **buildSrc/**: Centralized dependency and version management.
- **gradle/**: Version catalog (`libs.versions.toml`) and wrapper.
- **scripts/**: Automation scripts (linting, updates).
- **.github/**: CI/CD workflows.

## 🛠 Tech Stack
- **Languages**: Kotlin
- **UI**: Jetpack Compose
- **DI**: Hilt
- **Async**: Coroutines & Flow
- **Quality**: Detekt, Spotless, Lint
- **Build**: Gradle Kotlin DSL

## 🤝 Contributing
1. Fork the repo.
2. Create a feature branch.
3. Commit changes (`git commit -m "Add feature"`).
4. Push to branch (`git push origin my-feature`).
5. Open a Pull Request.
