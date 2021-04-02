// written by: Piotr J. Węgrzyn
// contact: piotrwegrzyn@protonmail.com
//          telegram.me/piotrjwegrzyn

import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import com.fasterxml.jackson.module.kotlin.readValue
import java.io.File

fun main(params: Array<String>) {

    val files: MutableList<String> = mutableListOf()

    val args = params.toMutableList()

    // for parsing JSON files in root/data directory of project
    // args.addAll(getNames())

    if(args.isNotEmpty()) {

        files.addAll(readFiles(args.toList()))

        val mapper = jacksonObjectMapper()

        for(name in args) {

            val content: String? = readFile(name)

            if(name.endsWith(".json")) {

                var csvToExport = "start,bps,retransmits"

                if (!content.isNullOrEmpty()) {

                    val json = mapper.readValue<json.Database>(content)

                    for (interval in json.intervals) {
                        csvToExport =
                            csvToExport + "\n" + interval.sum.start.toString() + "," + interval.sum.bits_per_second.toString() + "," + interval.sum.retransmits.toString()
                    }

                    exportToCSV(name, csvToExport)

                }

            }
        }
    }

}

fun exportToCSV(name: String, csvToExport: String) {

    try {

        File("$name.csv").writeText(csvToExport)

    } catch (ex: Exception) {

        ex.printStackTrace()

        println("Something Went Wrong When Creating File!!")
    }
}

// for reading files in root/data directory of project
fun getNames(): List<String> {
    return File("data").listFiles()!!.map { it.absolutePath }
}

fun readFiles(files: List<String>): List<String> {
    return files.filter { it.endsWith(".json") } .mapNotNull { readFile(it) }.toList()
}

fun readFile(name: String): String? = try {
    File(name).readText()
} catch (e: Exception) {
    println("File $name does not exist or is not valid file")
    null
}