package domain

import java.util.function.BinaryOperator
import java.util.function.IntBinaryOperator

enum class Operator(separator: String) : BinaryOperator<Int>, IntBinaryOperator {
    PLUS("+") {
        override fun apply(t: Int, u: Int): Int = t + u
    },
    MINUS("-") {
        override fun apply(t: Int, u: Int): Int = t - u
    },
    MULTIPLY("*") {
        override fun apply(t: Int, u: Int): Int = t * u
    },
    DIVISION("/") {
        override fun apply(t: Int, u: Int): Int = t / u
    };

    override fun applyAsInt(left: Int, right: Int): Int = apply(left, right)
}