package org.example;



class RealNumber extends Number {
    private double number;

    public RealNumber(double number) {
        this.number = number;
    }

    public double add(RealNumber other) {
        return this.number + other.number;
    }

    public double subtract(RealNumber other) {
        return this.number - other.number;
    }

    public double multiply(RealNumber other) {
        return this.number * other.number;
    }

    public double divide(RealNumber other) {
        if (other.number != 0) {
            return this.number / other.number;
        } else {
            throw new ArithmeticException("Деление на ноль невозможно.");
        }
    }

    @Override
    public String toString() {
        return Double.toString(number);
    }
}

