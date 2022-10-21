open class TestCase(private val name: String) {
    fun run() {
        val method = this::class.members.find { it.name == name }!!
        method.call(this)
    }
}