package com.example.fileService

import com.example.entities.Transaction
import org.apache.poi.ss.usermodel.WorkbookFactory
import java.io.FileInputStream
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

/*fun main(args: Array<String>) {
    val filepath = "D:/Nahid/transactionAnalyser/transaction_master.xlsx"
    val inputStream = FileInputStream(filepath)
    var xlWb = WorkbookFactory.create(inputStream)
    val xlWs = xlWb.getSheetAt(0)
    val xlRows = xlWs.rowIterator()
    xlRows.forEach { row -> println(row.toList())}
}*/

fun readFileExcel(fileName: String) : MutableList<Transaction>{
    val inputStream = FileInputStream(fileName)
    var xlWb = WorkbookFactory.create(inputStream)
    val xlWs = xlWb.getSheetAt(0)
    val xlRows = xlWs.drop(1)
    var tr: MutableList<Transaction> = mutableListOf()
    xlRows.forEach { eachRow ->
        (eachRow.toList())

        val trans = Transaction(
            transactionId = eachRow.getCell(0).toString(),
            dateAndTime = LocalDateTime.parse(eachRow.getCell(1).toString(),
                DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")),
            amount = eachRow.getCell(2).toString().toDouble(),
            merchantName = eachRow.getCell(3).toString(),
            transactionType = enumValueOf(eachRow.getCell(4).toString()),
            relatedTransaction = eachRow.getCell(5).toString())
        tr.add(trans)
 /*       trans.transactionId = eachRow.getCell(0).toString()
        println(eachRow.getCell(0))*/
        //row.forEachIndexed({i, e -> println("words[$i] = $e")})
    }
    return tr
}

