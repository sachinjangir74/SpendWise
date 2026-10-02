# ðŸ’° SpendWise

A modern, offline-first Personal Expense Tracker Android app built with Kotlin, Jetpack Compose, and Room database. The app follows the MVVM architecture pattern and features a premium Material3 design with smooth animations, category-based filtering, and visual spending summaries.

## âœ¨ Features

| Feature | Description |
|---------|-------------|
| âž• **Add Expense** | Quick expense entry with amount, category, title, note, and date |
| ðŸ“‹ **Expense List** | View all expenses grouped by date with "Today"/"Yesterday" headers |
| ðŸ·ï¸ **Category Filter** | Filter expenses by 7 categories using scrollable chips |
| ðŸ“Š **Summary Dashboard** | Visual spending breakdown with animated bar charts |
| ðŸ—‘ï¸ **Swipe to Delete** | Swipe left on any expense card to delete it |
| ðŸŒ™ **Dark Mode** | Full dark mode support following system theme |
| ðŸ’¾ **Offline Storage** | All data stored locally with Room database |
| ðŸŽ¨ **Premium UI** | Gradient cards, smooth transitions, and micro-animations |

## ðŸ› ï¸ Tech Stack

| Technology | Purpose |
|-----------|---------|
| **Kotlin** | Primary programming language |
| **Jetpack Compose** | Modern declarative UI toolkit |
| **Material3** | Design system with dynamic theming |
| **Room** | Local SQLite database with type-safe queries |
| **ViewModel + StateFlow** | Reactive state management |
| **Coroutines** | Asynchronous programming |
| **Navigation Compose** | Screen-to-screen navigation with transitions |
| **KSP** | Kotlin Symbol Processing for Room code generation |

## ðŸ—ï¸ Architecture Overview (MVVM)

```
â”Œâ”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”
â”‚                    UI Layer                      â”‚
â”‚  â”Œâ”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â” â”Œâ”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â” â”Œâ”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”â”‚
â”‚  â”‚HomeScreen â”‚ â”‚AddExpense    â”‚ â”‚SummaryScreenâ”‚â”‚
â”‚  â”‚           â”‚ â”‚Screen        â”‚ â”‚             â”‚â”‚
â”‚  â””â”€â”€â”€â”€â”€â”¬â”€â”€â”€â”€â”€â”˜ â””â”€â”€â”€â”€â”€â”€â”¬â”€â”€â”€â”€â”€â”€â”€â”˜ â””â”€â”€â”€â”€â”€â”€â”¬â”€â”€â”€â”€â”€â”€â”˜â”‚
â”‚        â”‚               â”‚                â”‚       â”‚
â”‚        â””â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”¼â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”˜       â”‚
â”‚                        â–¼                        â”‚
â”‚              â”Œâ”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”                â”‚
â”‚              â”‚ ExpenseViewModelâ”‚                â”‚
â”‚              â”‚  (StateFlow)    â”‚                â”‚
â”‚              â””â”€â”€â”€â”€â”€â”€â”€â”€â”¬â”€â”€â”€â”€â”€â”€â”€â”€â”˜                â”‚
â”œâ”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”¼â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”¤
â”‚                Data Layer                       â”‚
â”‚              â”Œâ”€â”€â”€â”€â”€â”€â”€â”€â–¼â”€â”€â”€â”€â”€â”€â”€â”€â”                â”‚
â”‚              â”‚ExpenseRepositoryâ”‚                â”‚
â”‚              â””â”€â”€â”€â”€â”€â”€â”€â”€â”¬â”€â”€â”€â”€â”€â”€â”€â”€â”˜                â”‚
â”‚              â”Œâ”€â”€â”€â”€â”€â”€â”€â”€â–¼â”€â”€â”€â”€â”€â”€â”€â”€â”                â”‚
â”‚              â”‚  ExpenseDao     â”‚                â”‚
â”‚              â”‚  (Room)         â”‚                â”‚
â”‚              â””â”€â”€â”€â”€â”€â”€â”€â”€â”¬â”€â”€â”€â”€â”€â”€â”€â”€â”˜                â”‚
â”‚              â”Œâ”€â”€â”€â”€â”€â”€â”€â”€â–¼â”€â”€â”€â”€â”€â”€â”€â”€â”                â”‚
â”‚              â”‚ ExpenseDatabase â”‚                â”‚
â”‚              â”‚ (SQLite)        â”‚                â”‚
â”‚              â””â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”˜                â”‚
â””â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”˜
```

## ðŸ“¦ Data Model

### Expense Entity

| Field | Type | Description |
|-------|------|-------------|
| `id` | `Int` | Primary key, auto-generated |
| `title` | `String` | Expense description |
| `amount` | `Double` | Amount spent |
| `category` | `String` | Category name (FOOD, TRANSPORT, etc.) |
| `note` | `String` | Optional note (default: "") |
| `date` | `Long` | Timestamp in milliseconds |

### Category Enum

| Category | Display Name | Color |
|----------|-------------|-------|
| FOOD | Food ðŸœ | #FF6B6B |
| TRANSPORT | Transport ðŸš— | #4ECDC4 |
| SHOPPING | Shopping ðŸ› | #FFD93D |
| ENTERTAINMENT | Entertainment ðŸŽ® | #A78BFA |
| HEALTH | Health ðŸ’Š | #F472B6 |
| EDUCATION | Education ðŸ“š | #60A5FA |
| OTHER | Other ðŸ“¦ | #9CA3AF |

## ðŸ”Œ API Design (Internal â€” Room DAO)

| Method | Return Type | Description |
|--------|-------------|-------------|
| `insertExpense(expense)` | `suspend` | Insert or replace an expense |
| `deleteExpense(expense)` | `suspend` | Delete an expense |
| `updateExpense(expense)` | `suspend` | Update an existing expense |
| `getAllExpenses()` | `Flow<List<Expense>>` | Get all expenses, sorted by date DESC |
| `getExpensesByCategory(cat)` | `Flow<List<Expense>>` | Filter expenses by category |
| `getTotalAmount()` | `Flow<Double?>` | Sum of all expense amounts |
| `getCategorySummary()` | `Flow<List<CategorySummary>>` | Grouped totals per category |

## ðŸš€ How to Run

### âœ… Prerequisites

| Requirement | Version | Download |
|-------------|---------|----------|
| Android Studio | Ladybug 2024.2.1 or later | [Download](https://developer.android.com/studio) |
| JDK | 11 or higher | Bundled with Android Studio |
| Android SDK | API 36 (Android 16.0 "Baklava") | Install via SDK Manager |
| Android Emulator or Device | API 36+ | Setup below |

---

### ðŸ“¥ Step 1 â€” Get the Source Code

**Option A: Clone with Git**
```bash
git clone <repository-url>
cd SpendWise
```

**Option B: Download ZIP**
- Download the ZIP from the repository
- Extract to any folder
- Remember the folder path

---

### ðŸ“‚ Step 2 â€” Open in Android Studio

1. Launch **Android Studio**
2. On the Welcome screen, click **"Open"**
   (or go to **File â†’ Open...** if already inside a project)
3. Navigate to the **SpendWise** folder
4. Click **"OK"** / **"Open"**
5. Wait for the project to index (bottom status bar shows progress)

---

### ðŸ”§ Step 3 â€” Sync Gradle

1. Android Studio will show a banner:
   **"Gradle files have changed since last project sync"**
2. Click **"Sync Now"** (top right of banner)
3. Wait for sync to complete â€” check the **Build** tab at the bottom
4. âœ… Success: "BUILD SUCCESSFUL" message
5. âŒ If sync fails: Go to **File â†’ Invalidate Caches â†’ Invalidate and Restart**

---

### ðŸ“± Step 4A â€” Run on Emulator (Recommended)

1. Go to **Device Manager** (right sidebar icon or **View â†’ Tool Windows â†’ Device Manager**)
2. Click **"+"** â†’ **"Create Virtual Device"**
3. Choose a phone (e.g. **Pixel 8**) â†’ click Next
4. Select system image: **"Baklava" (API 36)** â†’ Download if needed â†’ Next
5. Click **Finish**
6. Click â–¶ï¸ **Play** button next to your new emulator to start it
7. Once emulator boots, click the green â–¶ï¸ **Run** button in Android Studio toolbar
   (or press **Shift + F10** on Windows / **Control + R** on Mac)
8. Select your emulator â†’ OK
9. App will install and launch automatically

---

### ðŸ“² Step 4B â€” Run on Physical Device

1. On your Android phone, go to **Settings â†’ About Phone**
2. Tap **"Build Number"** 7 times to enable Developer Options
3. Go to **Settings â†’ Developer Options**
4. Enable **"USB Debugging"**
5. Connect phone to computer via USB cable
6. On phone: tap **"Allow"** when asked to trust this computer
7. In Android Studio, select your device from the device dropdown (top toolbar)
8. Click â–¶ï¸ **Run** (or **Shift + F10** / **Control + R**)
9. App installs and launches on your phone

> âš ï¸ Note: Physical device must run Android 16 (API 36) or higher due to minSdk=36

---

### ðŸ“¦ Step 5 â€” Build APK (Optional)

To generate a standalone APK file:

**Option A: Via Android Studio**
1. Go to **Build â†’ Build Bundle(s) / APK(s) â†’ Build APK(s)**
2. Wait for build to complete
3. Click **"locate"** in the notification to find the APK

**Option B: Via Terminal**
```bash
./gradlew assembleDebug
```

APK location: `app/build/outputs/apk/debug/app-debug.apk`

---

### â“ Troubleshooting

| Problem | Solution |
|---------|----------|
| Gradle sync fails | File â†’ Invalidate Caches â†’ Restart |
| SDK not found | Open SDK Manager, install API 36 |
| Emulator won't start | Increase RAM in AVD config, enable hardware acceleration |
| App crashes on launch | Check Logcat tab for errors |
| "minSdk" device error | Use device/emulator with Android 16 (API 36+) |

## ðŸ“¸ Screenshots

| Home Screen | Add Expense | Summary |
|:-----------:|:-----------:|:-------:|
| *Gradient header with total spent, category filters, expense list* | *Amount hero display, category grid, form fields* | *Overview cards, bar chart, category breakdown* |

## ðŸ“ Project Structure

```
app/src/main/java/com/sachin/spendwise/
â”œâ”€â”€ MainActivity.kt
â”œâ”€â”€ data/
â”‚   â”œâ”€â”€ model/
â”‚   â”‚   â”œâ”€â”€ Expense.kt          # Room entity
â”‚   â”‚   â””â”€â”€ Category.kt         # Category enum
â”‚   â”œâ”€â”€ local/
â”‚   â”‚   â”œâ”€â”€ ExpenseDao.kt       # Data Access Object
â”‚   â”‚   â””â”€â”€ ExpenseDatabase.kt  # Room database
â”‚   â””â”€â”€ repository/
â”‚       â””â”€â”€ ExpenseRepository.kt
â”œâ”€â”€ ui/
â”‚   â”œâ”€â”€ screen/
â”‚   â”‚   â”œâ”€â”€ HomeScreen.kt       # Main expense list
â”‚   â”‚   â”œâ”€â”€ AddExpenseScreen.kt # Add new expense
â”‚   â”‚   â””â”€â”€ SummaryScreen.kt    # Spending summary
â”‚   â”œâ”€â”€ viewmodel/
â”‚   â”‚   â”œâ”€â”€ ExpenseViewModel.kt
â”‚   â”‚   â””â”€â”€ ExpenseViewModelFactory.kt
â”‚   â””â”€â”€ theme/
â”‚       â”œâ”€â”€ Color.kt
â”‚       â”œâ”€â”€ Type.kt
â”‚       â””â”€â”€ Theme.kt
â”œâ”€â”€ navigation/
â”‚   â”œâ”€â”€ Screen.kt
â”‚   â””â”€â”€ ExpenseNavGraph.kt
â””â”€â”€ util/
    â””â”€â”€ FormatUtils.kt
```

## ðŸ“„ License

This project is for educational purposes as part of a Mobile Development course assignment.

