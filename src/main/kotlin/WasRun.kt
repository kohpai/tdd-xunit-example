class WasRun(private val name: String): TestCase(name) {
    var wasRun = false

    fun testMethod() {
        wasRun = true
    }
}