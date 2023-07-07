package module1

context(Transaction)
inline fun <T> Boolean.rollbackIfFalse(block: () -> T) {
    if (!this) {
        rollback()
        block()
    }
}
