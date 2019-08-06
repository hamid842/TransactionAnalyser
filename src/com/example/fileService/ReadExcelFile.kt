package com.example.fileService

import com.example.entities.Transaction
import org.apache.poi.ss.usermodel.WorkbookFactory
import java.io.FileInputStream
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.util.*
import java.util.Arrays.stream

/*fun main(args: Array<String>) {
    val filepath = "D:/Nahid/transactionAnalyser/transaction_master.xlsx"
    val inputStream = FileInputStream(filepath)
    var xlWb = WorkbookFactory.create(inputStream)
    val xlWs = xlWb.getSheetAt(0)
    val xlRows = xlWs.rowIterator()
    xlRows.forEach { row -> println(row.toList())}
}*/

fun readFileExcel(fileName: String) {
    val inputStream = FileInputStream(fileName)
    var xlWb = WorkbookFactory.create(inputStream)
    val xlWs = xlWb.getSheetAt(0)
    val xlRows = xlWs.rowIterator()
    xlRows.forEach { eachRow ->
        (eachRow.toList())

        val trans = Transaction( transactionId = eachRow.getCell(0).toString(),
            dateAndTime = LocalDateTime.parse(eachRow.getCell(1).toString(),
                DateTimeFormatter.ofPattern("dd/mm/yyyy HH:mm:ss")),
            amount = eachRow.getCell(2).toString().toDouble(),
            merchantName = eachRow.getCell(3).toString(),
            transactionType = enumValueOf(eachRow.getCell(4).toString()),
            relatedTransaction = eachRow.getCell(5).toString())

 /*       trans.transactionId = eachRow.getCell(0).toString()
        println(eachRow.getCell(0))*/

//        trans.dateAndTime = eachRow.getCell(1)
//        val date = LocalDate.parse( DateTimeFormatter.ISO_DATE)

        //row.forEachIndexed({i, e -> println("words[$i] = $e")})

    }
}

