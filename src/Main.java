import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        while (true){
        System.out.println(calc(new Scanner(System.in).nextLine()));
    }
    }

    public static String calc(String input) {

        Scanner scanner = new Scanner(input);
        int firstValue;
        int secondValue;
        String operator;
        try {
            firstValue = scanner.nextInt();
            operator = scanner.next();
            secondValue = scanner.nextInt();
        }
        catch(Exception e){
            throw new RuntimeException("т.к. строка не является математической операцией");
        }

        if (scanner.hasNext()){
            String string = scanner.next();
            if(string.matches("[\\+\\-\\/\\*]")){
                throw new RuntimeException("т.к. формат математической операции не удовлетворяет заданию - " +
                        "два операнда и один оператор (+, -, /, *)");
            }else {
                throw new RuntimeException("неверная операция");
            }


        }

        if (Math.abs(firstValue) >10 || Math.abs(secondValue)>10){
            throw new RuntimeException("числа должны быть от -10 до 10");
        }

        switch (operator){
            case "-":
                return String.valueOf(firstValue - secondValue);
            case "+":
                return String.valueOf(firstValue + secondValue);
            case "/":
                return String.valueOf(firstValue / secondValue);
            case "*":
                return String.valueOf(firstValue * secondValue);
            default:
                throw new RuntimeException("неверная операция");
        }
    }
}