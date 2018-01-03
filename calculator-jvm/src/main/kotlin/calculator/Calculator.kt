/**
 * Created by andfaulkner on 2018-01-03
 */
package calculator

actual fun log(msg: String) = System.out.println(msg)

fun main(args: Array<String>) {
    Calculator.add(1, 2)
    Calculator.subtract(1, 2)
}
