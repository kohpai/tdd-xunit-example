class TestResult {
    private var runCount = 0
    private var errorCount = 0

    fun testStarted() {
        runCount += 1
    }

    fun testFailed() {
        errorCount += 1
    }

    fun summary() = "$runCount run, $errorCount failed"
}