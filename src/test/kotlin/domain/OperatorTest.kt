package domain

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class OperatorTest {

    @Test
    fun `두개의 숫자를 더한다`() {
        Assertions.assertEquals(Operator.PLUS.apply(1, 10), 11)
    }

    @Test
    fun `두개의 숫자를 뺀다`() {
        Assertions.assertEquals(Operator.MINUS.apply(10, 9), 1)
    }

    @Test
    fun `두개의 숫자를 곱한다`() {
        Assertions.assertEquals(Operator.MULTIPLY.apply(5, 3), 15)
    }

    @Test
    fun `두개의 숫자를 나눈다`() {
        Assertions.assertEquals(Operator.DIVISION.apply(10, 2), 5)
    }
}