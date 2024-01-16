// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { BASICO, INTERMEDIARIO, AVANCADO }

class Aluno

data class ConteudoEducacional(var nome: String, val duracao: Int = 60)

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>) {

    val matriculados = mutableListOf<Aluno>()

    fun matricular(aluno: Aluno) {
        matriculados.add(aluno)
        println("Aluno ${aluno.hashCode()} matriculado na formação $nome.")
    }
}

fun main() {
    // Simulação de cenários de teste
    val kotlinBasico = ConteudoEducacional("Kotlin Básico")
    val kotlinIntermediario = ConteudoEducacional("Kotlin Intermediário")
    val kotlinAvancado = ConteudoEducacional("Kotlin Avançado", 90)

    val formacaoKotlin = Formacao("Formação Kotlin", listOf(kotlinBasico, kotlinIntermediario, kotlinAvancado))

    val aluno1 = Aluno()
    val aluno2 = Aluno()

    formacaoKotlin.matricular(aluno1)
    formacaoKotlin.matricular(aluno2)

    println("Alunos matriculados na formação ${formacaoKotlin.nome}: ${formacaoKotlin.matriculados.size}")
}
