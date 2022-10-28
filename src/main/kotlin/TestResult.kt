class TestResult {
    private var runCount = 0

    fun testStarted() {
        runCount += 1
    }

    fun summary() = "$runCount run, 0 failed"
}