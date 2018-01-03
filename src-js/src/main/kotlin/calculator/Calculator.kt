/**
 * Created by andfaulkner on 2018-01-03
 */
package calculator

import kotlin.js.JsName

actual fun log(msg: String) = console.log(msg)

@JsName("root")
fun main(args: Array<String>) {
    Calculator.runExperiments()
}
