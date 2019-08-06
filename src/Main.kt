import com.example.fileService.fileReading
import com.example.fileService.readFileExcel
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

fun main(args: Array<String>) {
    var fileContent = fileReading("D:/transaction.csv")
//    fileContent.forEach { it -> println(it) }
//    var filterData = fileContent.filter { it ->
//        it.merchantName == "Kwik-E-Mart"
//                && it.dateAndTime >= LocalDateTime.parse(
//            "2018-08-20 13:12:22",
//            DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")
//        )
//                && it.dateAndTime <= LocalDateTime.parse(
//            "2018-08-20 13:14:11",
//            DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")
//        )
//    }
//
//    var totalAmount = 0.0
//    filterData.forEach { it -> totalAmount += it.amount }
//    print("count is ${filterData.size} , averageAmount is ${totalAmount / filterData.size}")
}