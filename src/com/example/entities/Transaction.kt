package com.example.entities


import com.example.enumeratins.TransactionType
import java.time.LocalDateTime

data class Transaction(
    var transactionId: String,
    var merchantName: String,
    var transactionType: TransactionType,
    var dateAndTime: LocalDateTime,
    var relatedTransaction: String,
    var amount: Double
) {
    fun counter(merchantName: String, fromDate: LocalDateTime, toDate: LocalDateTime): Int? {
        return null
    }

}
