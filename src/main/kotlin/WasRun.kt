import kotlin.properties.Delegates

class WasRun(private val name: String): TestCase(name) {
    var wasRun by Delegates.notNull<Boolean>()
    var wasSetUp = false

    override fun setUp() {
        wasRun = false
        wasSetUp = true
    }

    fun testMethod() {
        wasRun = true
    }
}