package entities

import enumeratins.TransactionType
import java.time.LocalDateTime

data class Transaction(
    val transactionId: String,
    val merchantName: String,
    val transactionType: TransactionType,
    val dateAndTime: LocalDateTime,
    val ammount: Double,
    val relatedTransaction: String
)