package com.jee.revision.Section5.CodingExercises;

public class No30SimpleCalculator {

    public class SimpleCalculator {

        private double firstNumber;     // 0.0 by default
        private double secondNumber;    // 0.0 by default

        // == getters/setters ==
        public double getFirstNumber() {
            return firstNumber;
        }

        public void setFirstNumber(double firstNumber) {
            this.firstNumber = firstNumber;
        }

        public double getSecondNumber() {
            return secondNumber;
        }

        public void setSecondNumber(double secondNumber) {
            this.secondNumber = secondNumber;
        }

        // == public methods ==
        public double getAdditionResult() {
            return firstNumber + secondNumber;
        }

        public double getSubtractionResult() {
            return firstNumber - secondNumber;
        }

        public double getMultiplicationResult() {
            return firstNumber * secondNumber;
        }

        public double getDivisionResult() {
            // 1. check if we can divide with secondNumber
            if (secondNumber == 0) {
                return 0;
            }
            return firstNumber / secondNumber;
        }
    }
}
