import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Здравствуйте, перед вами математический калькулятор\nДанный калькулятор умеет выполнять такие математические операции как: \nСложение; " +
                "\nДеление; \nВычитание; \nУмножение; \nДанные операции возможно производить над Арабскими и Римскими значениями \n(конечное число не должно превышать 100)");
        System.out.println("Введите математическую операцию:");
        Scanner MathOperation = new Scanner(System.in);
        String StringOperation = MathOperation.nextLine();
        System.out.println(calc(StringOperation));

    }
    public static String calc(String inputString) {
        Scanner MyVar = new Scanner(inputString);
        int result;
        try {
            int value1;
            int value2;
            String operation;
            value1 = MyVar.nextInt();
            operation = MyVar.next();
            value2 = MyVar.nextInt();
            result = calculated(value1, value2, operation);
            String result1 = Integer.toString(result);
            return result1;
        } catch (Exception e) {
            int number1, number2;
            String value1;
            String value2;
            String operation;
            value1 = MyVar.next();
            operation = MyVar.next();
            value2 = MyVar.next();
            number1 = romanToNumber(value1);
            number2 = romanToNumber(value2);
            result = calculated(number1, number2, operation);
            String resultRoman = convertNumToRoman(result);
            return resultRoman;
        }
    }
    public static String[] roman = {"O", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XI", "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX",
            "XXI", "XXII", "XXIII", "XXIV", "XXV", "XXVI", "XXVII", "XXVIII", "XXIX", "XXX", "XXXI", "XXXII", "XXXIII", "XXXIV", "XXXV", "XXXVI", "XXXVII", "XXXVIII", "XXXIX", "XL",
            "XLI", "XLII", "XLIII", "XLIV", "XLV", "XLVI", "XLVII", "XLVIII", "XLIX", "L", "LI", "LII", "LIII", "LIV", "LV", "LVI", "LVII", "LVIII", "LIX", "LX",
            "LXI", "LXII", "LXIII", "LXIV", "LXV", "LXVI", "LXVII", "LXVIII", "LXIX", "LXX",
            "LXXI", "LXXII", "LXXIII", "LXXIV", "LXXV", "LXXVI", "LXXVII", "LXXVIII", "LXXIX", "LXXX",
            "LXXXI", "LXXXII", "LXXXIII", "LXXXIV", "LXXXV", "LXXXVI", "LXXXVII", "LXXXVIII", "LXXXIX", "XC",
            "XCI", "XCII", "XCIII", "XCIV", "XCV", "XCVI", "XCVII", "XCVIII", "XCIX", "C"};
    private static String convertNumToRoman (int numArabian) {
        return roman[numArabian];
    }
    private static int romanToNumber (String romanS) {
        for (int i = 0;i!=roman.length;i++){
            if (roman[i].equals(romanS)){
                return i;
            }
        }
        return 0;
    }
    public static int calculated (int num1, int num2, String op) {
        int result = 0;
        switch (op) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                result = num1 / num2;
                break;
        }
        return result;
    }
}