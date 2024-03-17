fun describeString(maybeString: String?): String {
    if (maybeString != null && maybeString.length > 0) {
        return "String of length ${maybeString}"
    } else {
        return "Empty of null string"
    }
}

fun main (){
    printlnd(describeString(null))
    printlnd(describeString(""))
    printlnd(describeString("teste"))
}
