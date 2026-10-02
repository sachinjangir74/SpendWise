package com.sachin.spendwise.data.model

enum class Category(
    val displayName: String,
    val iconName: String,
    val colorHex: String
) {
    FOOD("Food", "restaurant", "#FF6B6B"),
    TRANSPORT("Transport", "directions_car", "#4ECDC4"),
    SHOPPING("Shopping", "shopping_bag", "#FFD93D"),
    ENTERTAINMENT("Entertainment", "sports_esports", "#A78BFA"),
    HEALTH("Health", "medical_services", "#F472B6"),
    EDUCATION("Education", "school", "#60A5FA"),

    CHILL("Chill","sports","#2381S1"),
    OTHER("Other", "inventory_2", "#9CA3AF")
}

