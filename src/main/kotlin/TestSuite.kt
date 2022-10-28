class TestSuite {
    private val tests: MutableList<TestCase> = mutableListOf()

    fun add(test: TestCase) {
        tests.add(test)
    }

    fun run(result: TestResult) {
        tests.forEach { it.run(result) }
    }
}