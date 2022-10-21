
class TestCaseTest(private val name: String): TestCase(name) {
    private lateinit var test: WasRun

    override fun setUp() {
        test = WasRun("testMethod")
    }
    fun testRunning() {
        test.run()
        assert(test.wasRun)
    }

    fun testSetUp() {
        assert(!test.wasSetUp)
        test.run()
        assert(test.wasSetUp)
    }
}