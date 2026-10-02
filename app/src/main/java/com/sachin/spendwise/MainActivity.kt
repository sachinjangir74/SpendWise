package com.sachin.spendwise

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.compose.rememberNavController
import com.sachin.spendwise.data.local.ExpenseDatabase
import com.sachin.spendwise.data.repository.ExpenseRepository
import com.sachin.spendwise.navigation.ExpenseNavGraph
import com.sachin.spendwise.ui.theme.SpendWiseTheme
import com.sachin.spendwise.ui.viewmodel.ExpenseViewModel
import com.sachin.spendwise.ui.viewmodel.ExpenseViewModelFactory

class MainActivity : ComponentActivity() {
    // Force English locale for consistent dates/month names
    init {
        java.util.Locale.setDefault(java.util.Locale.ENGLISH)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        // Initialize Room database
        val database = ExpenseDatabase.getDatabase(applicationContext)
        val repository = ExpenseRepository(database.expenseDao())
        val factory = ExpenseViewModelFactory(application, repository)
        val viewModel = ViewModelProvider(this, factory)[ExpenseViewModel::class.java]

        setContent {
            SpendWiseTheme {
                val navController = rememberNavController()
                ExpenseNavGraph(
                    navController = navController,
                    viewModel = viewModel
                )
            }
        }
    }
}

