import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        while (true) {
            System.out.println("Выберите номер задачи (1-7):");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Очистка буфера

            switch (choice) {
                case 1:
                    System.out.print("Введите радиус круга: ");
                    double radius = scanner.nextDouble();
                    double area = Math.PI * radius * radius;
                    System.out.println("Площадь круга: " + area);
                    break;

                case 2:
                    System.out.print("Введите сумму в долларах: ");
                    double dollars = scanner.nextDouble();
                    double exchangeRate = 0.85;
                    double euros = dollars * exchangeRate;
                    System.out.println("Сумма в евро: " + euros);
                    break;

                case 3:
                    int[] numbers = new int[5];
                    for (int i = 0; i < numbers.length; i++) {
                        numbers[i] = random.nextInt(100);
                    }
                    System.out.println("Сгенерированный массив: " + Arrays.toString(numbers));
                    int max = Arrays.stream(numbers).max().orElseThrow();
                    System.out.println("Максимальное число: " + max);
                    break;

                case 4:
                    int[][] matrix = new int[5][5];
                    for (int i = 0; i < 5; i++) {
                        for (int j = 0; j < 5; j++) {
                            matrix[i][j] = random.nextInt(100);
                        }
                    }

                    System.out.println("Сгенерированный двумерный массив:");
                    for (int[] row : matrix) {
                        System.out.println(Arrays.toString(row));
                    }

                    for (int[] row : matrix) {
                        Arrays.sort(row);
                    }

                    System.out.println("Отсортированный массив:");
                    for (int[] row : matrix) {
                        System.out.println(Arrays.toString(row));
                    }

                    System.out.println("Вывод нужных элементов:");
                    for (int i = 0; i < matrix.length; i++) {
                        System.out.println(matrix[i][i]);
                    }
                    break;

                case 5:
                    System.out.print("Введите строку с пробелами: ");
                    String text = scanner.nextLine();
                    String noSpaces = text.replace(" ", "");
                    System.out.println("Строка без пробелов: " + noSpaces);
                    break;

                case 6:
                    System.out.print("Введите ваш возраст: ");
                    int age = scanner.nextInt();
                    if (age >= 18) {
                        System.out.println("Вы совершеннолетний.");
                    } else {
                        System.out.println("Вы несовершеннолетний.");
                    }
                    break;

                case 7:
                    runCalculator(scanner);
                    break;

                default:
                    System.out.println("Некорректный ввод. Выберите номер от 1 до 7.");
            }
        }
    }

    public static void runCalculator(Scanner scanner) {
        while (true) {
            System.out.print("Введите первое число: ");
            double num1 = scanner.nextDouble();
            System.out.print("Введите второе число: ");
            double num2 = scanner.nextDouble();
            System.out.print("Введите операцию (+, -, *, /): ");
            char operation = scanner.next().charAt(0);
            double result;

            switch (operation) {
                case '+':
                    result = num1 + num2;
                    System.out.println("Результат: " + result);
                    break;
                case '-':
                    result = num1 - num2;
                    System.out.println("Результат: " + result);
                    break;
                case '*':
                    result = num1 * num2;
                    System.out.println("Результат: " + result);
                    break;
                case '/':
                    if (num2 == 0) {
                        System.out.println("Ошибка: Деление на ноль невозможно.");
                    } else {
                        result = num1 / num2;
                        System.out.println("Результат: " + result);
                    }
                    break;
                default:
                    System.out.println("Ошибка: Неверная операция.");
            }

            System.out.print("Хотите продолжить? (да/нет): ");
            String continueCalc = scanner.next();
            if (!continueCalc.equalsIgnoreCase("да")) {
                break;
            }
        }
    }
}
