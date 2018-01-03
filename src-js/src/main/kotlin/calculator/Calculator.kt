/**
 * Created by andfaulkner on 2018-01-03
 */
package calculator

import kotlin.js.JsName

@JsName("log")
actual fun log(msg: String) = console.log(msg)

@JsName("root")
fun root(args: Array<String>) {
    Calculator.runExperiments()
}

/**
 * We don't actually need a main routine for JS-KT. However, if we do write
 * one, it will execute immediately on loading the module.
 */
// @JsName("main")
// fun main(args: Array<String>) {}
