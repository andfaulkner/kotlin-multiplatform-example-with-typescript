/**
 * Created by andfaulkner on 2018-01-03
 */
package calculator

expect fun log(msg: String)

object Calculator {
    fun add(x: Int, y: Int): Int {
        log("add -> $x $y")
        return x + y
    }
    fun subtract(x: Int, y: Int): Int {
        log("subtract -> $x $y")
        return x - y
    }
}
