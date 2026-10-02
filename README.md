# 💰 SpendWise

SpendWise is a modern, offline-first Android expense tracker built with **Kotlin** and **Jetpack Compose**.

The application helps users record, organize, filter, and analyze their personal expenses through a clean Material 3 interface. It uses **Room Database** for local persistence and follows the **MVVM architecture** with a repository layer for clean separation of concerns.

---

## ✨ Features

- ➕ **Add Expense** — Add an expense with amount, category, title, note, and date.
- 🧾 **Expense List** — View all recorded expenses grouped by date.
- 🏷️ **Category Filter** — Filter expenses by category using interactive filter chips.
- 📊 **Summary Dashboard** — View spending summaries and category-based analytics.
- 🗑️ **Swipe to Delete** — Swipe an expense card to delete it.
- 🌙 **Dark Mode** — Supports the system theme and dark mode.
- 💾 **Offline Storage** — Expense data is stored locally using Room Database.
- ✨ **Modern UI** — Material 3 design with cards, animations, transitions, and micro-interactions.
- 📱 **Responsive Compose UI** — Built entirely with Jetpack Compose.

---

## 🛠️ Tech Stack

| Technology | Purpose |
|---|---|
| Kotlin | Primary programming language |
| Jetpack Compose | Declarative Android UI toolkit |
| Material 3 | Modern Android design system |
| Room Database | Local SQLite persistence |
| ViewModel | UI state and business logic management |
| StateFlow / Flow | Reactive state management |
| Kotlin Coroutines | Asynchronous operations |
| Navigation Compose | Screen navigation |
| KSP | Kotlin Symbol Processing and Room code generation |
| Gradle | Build and dependency management |

---

## 🏗️ Architecture

SpendWise follows the **MVVM (Model–View–ViewModel)** architecture with a repository layer.

```text
                    ┌──────────────────────┐
                    │     Compose UI       │
                    │ Home / Add / Summary │
                    └──────────┬───────────┘
                               │
                               ▼
                    ┌──────────────────────┐
                    │      ViewModel       │
                    │  UI State + Logic    │
                    └──────────┬───────────┘
                               │
                               ▼
                    ┌──────────────────────┐
                    │     Repository       │
                    │  Data Abstraction    │
                    └──────────┬───────────┘
                               │
                               ▼
                    ┌──────────────────────┐
                    │    Room Database     │
                    │      DAO + Entity    │
                    └──────────────────────┘

Architecture Layers
- UI Layer — Jetpack Compose screens responsible for displaying application state and handling user interaction.
- ViewModel Layer — Manages UI state, coordinates user actions, and communicates with the repository.
- Repository Layer — Provides a clean abstraction between the ViewModel and local data source.
- Data Layer — Contains Room entities, DAO interfaces, and database configuration.
- Utility Layer — Contains reusable helper functionality such as currency and number formatting.

💾 Data Model
The main Expense entity represents an individual expense.
Each expense contains information such as:
Field		Description
ID	        Auto-generated primary key
Amount	    Amount spent
Category	Expense category
Title	    Expense title
Note	    Optional expense note
Date	    Expense date and timestamp

Expense Categories
- 🍔 Food
- 🚗 Transport
- 🛍️ Shopping
- 🎮 Entertainment
- 💊 Health
- 📚 Education
- 📦 Other

📊 Spending Analytics
The Summary screen provides visual information about recorded expenses.
It includes:
- Total spending
- Category-wise spending
- Spending breakdown
- Category summaries
- Visual bar charts
- Animated analytics components
The application calculates these values from locally stored expense data.

📱 Application Screens

🏠 Home Screen
The Home screen provides the main expense dashboard.
It includes:
- Total spending
- Expense count
- Average daily spending
- Month-based information
- Category filters
- Expense list
- Swipe-to-delete functionality
- Add Expense action

➕ Add Expense Screen
Users can create a new expense by entering:
- Amount
- Category
- Title
- Note
- Date
After saving, the expense is stored in the local Room database and becomes available throughout the application.

📊 Summary Screen
The Summary screen provides spending analytics and category-based breakdowns using the locally stored expense data.

👤 Profile Screen
The project also contains a profile section for the application's user-facing navigation and settings experience.

📁 Project Structure
SpendWise/
├── app/
│   └── src/
│       ├── main/
│       │   ├── java/
│       │   │   └── com/
│       │   │       └── sachin/
│       │   │           └── spendwise/
│       │   │               ├── MainActivity.kt
│       │   │               │
│       │   │               ├── data/
│       │   │               │   ├── local/
│       │   │               │   │   ├── ExpenseDao.kt
│       │   │               │   │   └── ExpenseDatabase.kt
│       │   │               │   │
│       │   │               │   ├── model/
│       │   │               │   │   ├── Expense.kt
│       │   │               │   │   └── Category.kt
│       │   │               │   │
│       │   │               │   └── repository/
│       │   │               │       └── ExpenseRepository.kt
│       │   │               │
│       │   │               ├── navigation/
│       │   │               │   ├── Screen.kt
│       │   │               │   └── ExpenseNavGraph.kt
│       │   │               │
│       │   │               ├── ui/
│       │   │               │   ├── screen/
│       │   │               │   │   ├── HomeScreen.kt
│       │   │               │   │   ├── AddExpenseScreen.kt
│       │   │               │   │   ├── SummaryScreen.kt
│       │   │               │   │   └── ProfileScreen.kt
│       │   │               │   │
│       │   │               │   ├── theme/
│       │   │               │   │   ├── Color.kt
│       │   │               │   │   ├── Theme.kt
│       │   │               │   │   └── Type.kt
│       │   │               │   │
│       │   │               │   └── viewmodel/
│       │   │               │       ├── ExpenseViewModel.kt
│       │   │               │       └── ExpenseViewModelFactory.kt
│       │   │               │
│       │   │               └── util/
│       │   │                   └── FormatUtils.kt
│       │   │
│       │   └── res/
│       │
│       └── androidTest/
│
├── gradle/
│   └── libs.versions.toml
│
├── build.gradle.kts
├── settings.gradle.kts
├── gradle.properties
├── gradlew
├── gradlew.bat
└── README.md

⚙️ Project Configuration
Application ID : com.sachin.spendwise
Namespace      : com.sachin.spendwise
Compile SDK    : 37
Minimum SDK    : 36
Target SDK     : 36
Java / JVM     : 17

Build & Dependency Versions
Android Gradle Plugin : 9.4.0
Gradle                : 9.6.0
Kotlin                : 2.3.20
KSP                   : 2.3.12
Compose BOM           : 2026.09.00
Room                  : 2.8.5
Lifecycle             : 2.11.0
Activity Compose      : 1.13.0
Navigation Compose    : 2.10.2
Coroutines            : 1.10.2

🚀 Getting Started
Prerequisites
Make sure the following are installed:
- Android Studio Quail 4 | 2026.1.4 Patch 1 or newer
- JDK 17
- Android SDK Platform 37
- Android device or emulator running Android 16 / API 36 or newer
- Git

📥 Clone the Repository
git clone https://github.com/sachinjangir74/SpendWise.git
cd SpendWise

🧑‍💻 Open the Project
1. Open Android Studio.
2. Select Open.
3. Select the SpendWise project directory.
4. Wait for Gradle synchronization to complete.
5. Make sure the required Android SDK is installed.
6. Select an Android emulator or connected Android device.
7. Click Run ▶.

📱 Run on an Emulator
The project can be run using an Android emulator configured with:
Android Version : Android 16 / newer
API Level       : 36+
Architecture    : x86_64

The project has been tested during development on an Android emulator environment.

📲 Run on a Physical Device
1. Enable Developer Options on your Android device.
2. Enable USB Debugging.
3. Connect the device to your computer.
4. Accept the debugging authorization prompt.
5. Select the device from Android Studio.
6. Click Run ▶.
The device must support Android 16 / API 36 or newer because the project's minimum SDK is 36.

🔨 Build the Project
From the project root directory:
Windows
.\gradlew.bat clean assembleDebug

macOS / Linux
./gradlew clean assembleDebug

A successful build generates the debug APK at:
app/build/outputs/apk/debug/app-debug.apk

🧪 Testing
Run local unit tests with:
.\gradlew.bat test

Run Android instrumentation tests with:
.\gradlew.bat connectedAndroidTest

The project can also be tested directly through Android Studio using the Run and Debug actions.

🗄️ Local Database
SpendWise uses Room Database for local expense persistence.
The application stores expense information locally, allowing the core expense-management functionality to work without requiring a remote backend.
Room provides:
- Entity-based data modeling
- DAO interfaces
- SQLite-backed persistence
- Kotlin Flow integration
- Reactive database updates

🔒 Privacy
SpendWise's core expense-management functionality operates locally on the Android device.
Expense records are stored using the local Room database and do not require a cloud database for normal application usage.

🩺 Troubleshooting
Gradle Sync Problems
Try the following:
1. Make sure Android Studio is using JDK 17.
2. Make sure Android SDK Platform 37 is installed.
3. Run:
.\gradlew.bat clean

4. Synchronize the project again.
SDK Error
Open:
Tools → SDK Manager
Make sure the required Android SDK platform and build tools are installed.
Build Error
Try:
.\gradlew.bat clean assembleDebug

If the problem persists, check the Gradle output and Android Studio Build window for the exact error.
Emulator Problems
Check:
- Available RAM
- Available disk space
- Hardware virtualization
- Emulator configuration
- Installed Android system image
Application Crash
Open Logcat in Android Studio and inspect the stack trace for the underlying exception.
Device API Error
The project uses:
minSdk = 36

Therefore, the device or emulator must run Android 16 / API 36 or newer.

🎯 Project Highlights
SpendWise demonstrates practical modern Android development concepts including:
- Kotlin
- Jetpack Compose
- Material 3
- MVVM Architecture
- Repository Pattern
- Room Database
- SQLite
- DAO
- ViewModel
- StateFlow
- Kotlin Flow
- Kotlin Coroutines
- Navigation Compose
- KSP
- Offline-first application design
- Reactive UI updates
- Expense management
- Category filtering
- Swipe gestures
- Spending analytics
- Modern Android UI
- Dark mode support

🔄 Application Flow
Launch Application
        │
        ▼
   Home Screen
        │
        ├───────────────┐
        │               │
        ▼               ▼
 Add Expense        Summary
        │               │
        ▼               ▼
  Save Expense      Analytics
        │
        ▼
  Room Database
        │
        ▼
 ViewModel / Flow
        │
        ▼
   Updated UI

💡 Learning Objectives
This project was developed to practice and demonstrate:
- Modern Android application development
- Kotlin programming
- Declarative UI development with Jetpack Compose
- MVVM architecture
- Local database management with Room
- Reactive programming using Flow and StateFlow
- Dependency and build management with Gradle
- Android navigation
- State-driven UI
- Material 3 design
- Application testing and debugging
- Modern Android project modernization

👨‍💻 Author
Sachin Jangir
Android & Software Development

📄 License
This project is intended for learning, and portfolio purposes as part of Android and mobile application development practice.

⭐ Acknowledgements
Built with:
- Kotlin
- Jetpack Compose
- Android Jetpack
- Material 3
- Room Database
- Android Studio