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
- **Initial Release**: Core inventory management, Firebase sync, and Offline support.
<!-- LATEST-VERSION-END -->

## Validation Status
<!-- LINT-RESULT-START -->
### Linting Status
> **Status**: ❓ **Pending**
> **Summary**: Run pipeline to update.

<details>
<summary>Click to view full lint output</summary>

```
No recent lint run recorded.
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
