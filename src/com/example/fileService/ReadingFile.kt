package com.example.fileService

import com.sun.xml.bind.v2.schemagen.xmlschema.List
import org.openxmlformats.schemas.drawingml.x2006.chart.CTChartLines
import java.io.File
import com.example.entities.Transaction as Trans
import kotlin.collections.List as List1

//fun main(args: Array<String>) {
//    val ins: InputStream = File("D:/transaction.csv").inputStream()
//    val lineList = mutableListOf<String>()
//
//    ins.bufferedReader().useLines { lines -> lines.forEach { lineList.add(it)} }
//    lineList.forEach{println("->  " + it)}
//}

fun readFile(fileName:String) {
    val fileName = "D:/transaction.csv"
    val lines: List1<String> = File(fileName).readLines().drop(1)
    lines.forEach { line -> println(line) }
}


