/**
 * Created by andfaulkner on 2018-01-03
 */
package calculator

actual fun log(msg: String) = System.out.println(msg)

fun main(args: Array<String>) {
    Calculator.runExperiments()
}
