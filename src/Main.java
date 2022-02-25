public class Main {

    public static void main(String[] args) {
//        Calculator calculator = Calculator::new;
        Calculator calc = Calculator.instanse.get();
        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1, 1);
        int c = calc.devide.apply(a, b);//Если b будет равно 0, произойдет ошибка деления на 0
        calc.println.accept(c);
        Calculator.calcDevide(calc, a, b); //Проверить деление на ноль можно через метод

    }

}
