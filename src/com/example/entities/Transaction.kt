package com.example.entities

import com.example.enumeratins.TransactionType
import java.time.LocalDateTime

 data class Transaction(
    var transactionId: String,
    val merchantName: String,
    val transactionType: TransactionType,
    val dateAndTime: LocalDateTime,
    val amount: Double,
    val relatedTransaction: String
)
fun transactionCounter(merchantName: String):Int? {
   return null
}
fun averageAmount(merchantName: String) : Double? {
   return null
}
