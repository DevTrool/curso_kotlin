import kotlin.contracts.ReturnsNotNull

fun main() {

    /* var neverNull: String = "This can't be null" | não vai funcionar pois uma string n aceita null
    neverNull = null
    */

    var nullable: String? = "YOu can keep a null here"
    nullable = null //funcionou pq o sinal (?) faz a string poder ser null

   /* var inferredNonNull = "This compiler assumes non-null"
    inferredNonNull = null | não funcionou pq não tem o :String?
    */

    fun strLength(notNull: String): int {
        return notNull.length
    }

    strLength(neverNull)
    strLength(nullable)

}
