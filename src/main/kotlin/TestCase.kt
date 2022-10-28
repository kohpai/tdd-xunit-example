open class TestCase(private val name: String) {
    open fun setUp() {}

    open fun tearDown() {}

    fun run(result: TestResult) {
        result.testStarted()
        setUp()
        val method = this::class.members.find { it.name == name }!!
        try {
            method.call(this)
        } catch (e: Exception) {
            result.testFailed()
        }
        tearDown()
    }
}