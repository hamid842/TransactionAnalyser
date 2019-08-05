package fileService

import java.io.File
import java.io.FileInputStream

const val filePath = "C:/Users/PC_1/Downloads/Transaction.xlsx"
val file = File(filePath)
val excelFileInputStream = FileInputStream(file)
