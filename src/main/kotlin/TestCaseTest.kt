
class TestCaseTest(name: String): TestCase(name) {

    fun testTemplateMethod() {
        val test = WasRun("testMethod")
        test.run()
        assert("setUp testMethod tearDown " == test.log)
    }

    fun testResult() {
        val test = WasRun("testMethod")
        val result = test.run()
        assert("1 run, 0 failed" == result.summary())
    }

    fun testFailedResultFormatting() {
        val result = TestResult()
        result.testStarted()
        result.testFailed()
        assert("1 run, 1 failed" == result.summary())
    }

    fun testFailedResult() {
        val test = WasRun("testBrokenMethod")
        val result = test.run()
        assert("1 run, 1 failed" == result.summary())
    }
}