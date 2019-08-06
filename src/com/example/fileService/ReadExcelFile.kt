package com.example.fileService

import org.apache.poi.ss.usermodel.WorkbookFactory
import java.io.FileInputStream

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
    xlRows.forEach { row ->
        (row.toList())
        val id = row.getCell(0)

        //row.forEachIndexed({i, e -> println("words[$i] = $e")})

    }
}

