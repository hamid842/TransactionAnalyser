package com.example.entities

import com.example.enumeratins.TransactionType
import java.time.LocalDateTime

data class Transaction(
    var transactionId: String,
    var merchantName: String,
    var transactionType: TransactionType,
    var dateAndTime: LocalDateTime,
    var amount: Double,
    var relatedTransaction: String
)

