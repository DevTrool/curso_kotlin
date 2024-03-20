fun main() {
    println(whenAssing("Hello"))
    println(whenAssing(3.4))
    println(whenAssing(1))
    println(whenAssing(MyClass()))
}

fun whenAssing(obj: Any): Any{ //função que rescebe qualquer coisa mas responde qualquer coisa essa faz tudo a outra só imprime
    val result = when (obj) { //criando uma variavel e fazendo a atribuição do valor dela pelo when
        1 -> "one"
        "Hello" -> 1
        is Long -> false
        else -> 42
    }
    return result
}

class MyClass
