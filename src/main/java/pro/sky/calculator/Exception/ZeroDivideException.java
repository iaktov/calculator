package pro.sky.calculator.Exception;

public class ZeroDivideException extends IllegalArgumentException {
    public ZeroDivideException() {
        super("Делить на ноль нельзя, введите новое число");
    }
}
