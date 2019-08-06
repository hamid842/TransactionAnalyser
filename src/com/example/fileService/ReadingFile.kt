package com.example.fileService

import com.example.entities.Transaction
import java.io.File
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
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
        val sp = line.split(",")
        val trans = Transaction(
            transactionId = sp[0],
            dateAndTime = LocalDateTime.parse(sp[1], DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")),
            amount = sp[2].toDouble(),
            merchantName = sp[3],
            transactionType = enumValueOf(sp[4]),
            relatedTransaction = sp[5]
        )
    }
}




