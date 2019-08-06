package com.example.entities

import com.example.enumeratins.TransactionType
import java.time.LocalDateTime

class Transaction {
   var transactionId: String
      get() {
         TODO()
      }
      set(value) {}

   var merchantName: String
      get() {
         TODO()
      }
      set(value) {}
   var transactionType: TransactionType
      get() {
         TODO()
      }
      set(value) {}
   var dateAndTime: LocalDateTime
      get() {
         TODO()
      }
      set(value) {}
   var amount: Double
      get() {
         TODO()
      }
      set(value) {}
   var relatedTransaction: String
      get() {
         TODO()
      }
      set(value) {}


   fun transactionCounter(merchantName: String): Int? {
      return null
   }

   fun averageAmount(merchantName: String): Double? {
      return null
   }
}