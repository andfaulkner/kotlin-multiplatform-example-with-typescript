/**
 * Created by andfaulkner on 2018-01-03
 */
package calculator

import kotlin.js.JsName

/**
 * Annotate a function with JSName to ensure the Kotlin transpiler doesn't
 * "mangle" it (i.e. ensure output isn't e.g. root_tmwb55$_0 or root_1h5j24$).
 */
@JsName("root")
fun root(args: Array<String>) {
    Calculator.runExperiments()
}

/**
 * This is annotated with "expect" in the corresponding Kotlin common file:
 *     expect fun log(msg: String)
 * ..which indicates we need a JS-specific implementation of it (as below).
 */
@JsName("log")
actual fun log(msg: String) = console.log(msg)

/**
 * We don't actually need a main routine for JS-KT. However, if we do write
 * one, it will execute immediately on loading the module.
 */
@JsName("main")
fun main(args: Array<String>) {
    log('Calculator.kt: function main ran! (automatically on module import)')
}
