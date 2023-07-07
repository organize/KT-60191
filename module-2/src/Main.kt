import module1.Transaction
import module1.rollbackIfFalse

fun main() = with(Transaction()) {
    runInTransaction {
        true
    }
}

context(Transaction)
fun runInTransaction(block: () -> Boolean) {
    block().rollbackIfFalse {}
}
