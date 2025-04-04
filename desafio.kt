// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { BASICO, INTERMEDIARIO, DIFICIL }

class Usuario(val nome: String)

data class ConteudoEducacional(var nome: String, val duracao: Int = 60)

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()

    fun matricular(usuario: Usuario) {
        inscritos.add(usuario)
        println("${usuario.nome} matriculado na formação $nome")
    }
}

fun main() {
    val usuario1 = Usuario("João")
    val usuario2 = Usuario("Maria")

    val kotlinBasico = ConteudoEducacional("Kotlin Básico", 90)
    val poo = ConteudoEducacional("POO com Kotlin", 120)

    val formacaoKotlin = Formacao("Formação Kotlin", listOf(kotlinBasico, poo))

    formacaoKotlin.matricular(usuario1)
    formacaoKotlin.matricular(usuario2)

    println("Inscritos na formação Kotlin:")
    formacaoKotlin.inscritos.forEach { println(it.nome) }
}
