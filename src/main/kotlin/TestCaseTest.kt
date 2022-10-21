class TestCaseTest(private val name: String): TestCase(name) {
    fun testRunning() {
        val test = WasRun("testMethod")
        assert(!test.wasRun)
        test.run()
        assert(test.wasRun)
    }
}