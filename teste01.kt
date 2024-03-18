data class Usuario(val nome: String, val email: String, val senha: String)

class SistemaRegistro {
    private val usuarios = mutableListOf<Usuario>()

    fun registrarUsuario(nome: String, email: String, senha: String) {
        val novoUsuario = Usuario(nome, email, senha)
        usuarios.add(novoUsuario)
        println("Usuário registrado com sucesso!")
    }

    fun listarUsuarios() {
        println("Lista de Usuários:")
        for ((index, usuario) in usuarios.withIndex()) {
            println("${index + 1}. Nome: ${usuario.nome}, Email: ${usuario.email}")
        }
    }
}

fun main() {
    val sistema = SistemaRegistro()

    while (true) {
        println("\nEscolha uma opção:")
        println("1. Registrar novo usuário")
        println("2. Listar usuários")
        println("3. Sair")

        when (readLine()?.toIntOrNull()) {
            1 -> {
                println("Digite o nome do usuário:")
                val nome = readLine() ?: ""
                println("Digite o email do usuário:")
                val email = readLine() ?: ""
                println("Digite a senha do usuário:")
                val senha = readLine() ?: ""
                sistema.registrarUsuario(nome, email, senha)
            }
            2 -> sistema.listarUsuarios()
            3 -> {
                println("Saindo do programa...")
                return
            }
            else -> println("Opção inválida. Por favor, escolha novamente.")
        }
    }
}
Neste
