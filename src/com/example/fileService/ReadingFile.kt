package com.example.fileService

import com.example.entities.Transaction
import java.io.File
import kotlin.collections.List as List1

//fun main(args: Array<String>) {
//    val ins: InputStream = File("D:/transaction.csv").inputStream()
//    val lineList = mutableListOf<String>()
//
//    ins.bufferedReader().useLines { lines -> lines.forEach { lineList.add(it)} }
//    lineList.forEach{println("->  " + it)}
//}

fun fileReading(fileName: String) {
    val fileName = "D:/transaction.csv"
    val lines: List1<String> = File(fileName).readLines().drop(1)
    lines.forEach { line ->
        var sp = line.split(",")
        sp.forEach { print("$it -- ") }
        println()

        val trans = Transaction()
        trans.transactionId = sp[0]
        //trans.dateAndTime = sp[1]
        trans.amount = sp[2].toDouble()
        trans.merchantName = sp[3]
        trans.transactionType = enumValueOf(sp[4])
        trans.relatedTransaction = sp[5]
    }
}


