# Project Structure

This template follows a modular Android architecture designed for scalability and separation of concerns.

## Modules

### `app` (Application Module)

The main entry point of the application.
- **Role**: Contains UI logic, dependency injection setup (Hilt), and navigation.
- **Key Components**:
  - `FridgeApplication`: App-level dependency container.
  - `FridgeMainActivity`: Hosting Activity for Jetpack Compose.
- **Structure**:
  - `src/main/kotlin/ro/fridge`: Core source code.
    - `data/`: Data layer (Room entities, Firebase implementation).
    - `di/`: Dependency Injection (Hilt modules).
    - `ui/`: User Interface (Compose screens, Themes).
    - `service/`: Foreground/Background services.

### `core` (Core Library)

Shared logic and domain entities.
- **Role**: Encapsulate business logic that can be reused across multiple feature modules in the future.
- **Contents**:
  - Utility classes.
  - Domain models.
  - Shared extension functions.

### `buildSrc` (Build Logic)

Centralized build configuration.
- **Role**: Manage dependencies, versions, and build plugins in Kotlin DSL.
- **Key Files**:
  - `Coordinates.kt`: Defines App ID and Version.

## Resource Organization

- **`/app/src/main/res`**: Standard Android resources.
  - `values/themes.xml`: App theming.
  - `values/strings.xml`: Localization.

## Key Files

- **`libs.versions.toml`**: Gradle Version Catalog for dependency management.
- **`detekt.yml`**: Static code analysis configuration.
