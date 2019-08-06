import com.example.fileService.fileReading
import java.time.LocalDate
import java.time.LocalDateTime
import java.time.Period
import java.time.format.DateTimeFormatter

fun main(args: Array<String>) {
    val fileContent = fileReading("D:/transaction.csv")
    val filteredContent = fileContent.filter { it -> it.merchantName == "Kwik-E-Mart" }
    val counter = filteredContent.count()
    val avg = filteredContent.map { it -> it.amount }
        .reduce { acc, it -> (acc + it) / counter }
    println("Count is $counter , average is $avg")

    val filterData = fileContent.filter {it.merchantName == "Kwik-E-Mart"
                && it.dateAndTime >= LocalDateTime.parse("2018-08-20 13:12:22",
            DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")
        )
                && it.dateAndTime <= LocalDateTime.parse(
            "2018-08-20 13:14:11",
            DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")
        )
    }
    var totalAmount = 0.0
    filterData.forEach { it -> totalAmount += it.amount }
    print("count is ${filterData.size} , averageAmount is ${totalAmount / filterData.size}")
}
