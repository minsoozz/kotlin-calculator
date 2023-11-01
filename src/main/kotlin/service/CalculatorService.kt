package service

import domain.Operator

class CalculatorService {

    fun calculate(string: String) {
        Operator.valueOf(string)
    }
}