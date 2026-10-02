package com.sachin.spendwise.data.repository

import com.sachin.spendwise.data.local.CategorySummary
import com.sachin.spendwise.data.local.ExpenseDao
import com.sachin.spendwise.data.model.Expense
import kotlinx.coroutines.flow.Flow

class ExpenseRepository(private val expenseDao: ExpenseDao) {

    val allExpenses: Flow<List<Expense>> = expenseDao.getAllExpenses()

    val totalAmount: Flow<Double?> = expenseDao.getTotalAmount()

    val categorySummaries: Flow<List<CategorySummary>> = expenseDao.getCategorySummary()

    fun getExpensesByCategory(category: String): Flow<List<Expense>> {
        return expenseDao.getExpensesByCategory(category)
    }

    suspend fun insertExpense(expense: Expense) {
        expenseDao.insertExpense(expense)
    }

    suspend fun deleteExpense(expense: Expense) {
        expenseDao.deleteExpense(expense)
    }

    suspend fun updateExpense(expense: Expense) {
        expenseDao.updateExpense(expense)
    }
}

