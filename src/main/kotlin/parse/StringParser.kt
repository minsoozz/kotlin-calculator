package parse

class StringParser {

    companion object {
        const val SEPARATOR = " "
    }

    fun parse(string: String) : List<String>{
        return string.split(SEPARATOR)
    }
}