import scala.io.Source
import java.io.PrintWriter

class TransformData {

  def readAndTransformData(): Unit = {

    val inputFile = "input.csv"
    val outputFile = "output.csv"

    val lines = Source.fromFile(inputFile).getLines().toList

    val outputHeader = "Nome, País"

    val tranformedData = lines.tail
      .map(_.split(","))
      .filter(fields => fields.length >= 4 && fields(1).toInt >= 18)
      .map(fields => s"${fields(0)},${fields(3)}")
    
    new PrintWriter(outputFile) {
      write(outputHeader + "\n")
      tranformedData.foreach(line => write(line + "\n"))
      close()
    }
    
    println("Data Transformation complete!")
    
  }

}
