//as classes de maneira geral são objetos que podem ser instanciados

class Customer

class Contack(val id: Int, var email: String)

fun main() {

    val customer = Customer()

    val contact = Contact(1, "mary@gmail.com")

    println(contact.id)
    println(contact.email)
    contact.email = "jane@gmail.com"
    println(contact.email)
}
