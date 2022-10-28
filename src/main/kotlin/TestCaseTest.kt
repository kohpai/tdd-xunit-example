
class TestCaseTest(name: String): TestCase(name) {
    private lateinit var result: TestResult

    override fun setUp() {
        result = TestResult()
    }

    fun testTemplateMethod() {
        val test = WasRun("testMethod")
        val result = TestResult()
        test.run(result)
        assert("setUp testMethod tearDown " == test.log)
    }

    fun testResult() {
        val test = WasRun("testMethod")
        test.run(result)
        assert("1 run, 0 failed" == result.summary())
    }

    fun testFailedResultFormatting() {
        result.testStarted()
        result.testFailed()
        assert("1 run, 1 failed" == result.summary())
    }

    fun testFailedResult() {
        val test = WasRun("testBrokenMethod")
        test.run(result)
        assert("1 run, 1 failed" == result.summary())
    }

    fun testSuite() {
        val suite = TestSuite()
        suite.add(WasRun("testMethod"))
        suite.add(WasRun("testBrokenMethod"))
        suite.run(result)
        assert("2 run, 1 failed" == result.summary())
    }
}