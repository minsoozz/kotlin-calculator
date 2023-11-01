import service.CalculatorService
import io.Console
import parse.StringParser

fun main() {
    val console = Console()
    val calculatorService = CalculatorService()
    val stringParser = StringParser()
    val text = console.input()
    stringParser.parse(text)

    calculatorService.calculate(text)
    console.output(1)
}