import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String inputString = perevirka();

        while (true) {
            System.out.println("Виберіть, яку функцію викликати:");
            System.out.println("1. Функція, яка приймає строку. Ця функція має повертати перевернуту строку - останній символ строки має бути першим, передостанній - другим, і так далі.");
            System.out.println("2. Функція, яка приймає строку. Ця функція має повертати строку, в якій кожне слово - перевернуте. Сам порядодк слів не має змінюватись.");

            if (s.hasNextInt()) {
                int diya = s.nextInt();
                s.nextLine();

                if (diya == 1) {
                    System.out.println("Функція, яка приймає строку. Ця функція має повертати перевернуту строку - останній символ строки має бути першим, передостанній - другим, і так далі: " + revstr(inputString));
                    break;
                } else if (diya == 2) {
                    System.out.println("Функція, яка приймає строку. Ця функція має повертати строку, в якій кожне слово - перевернуте. Сам порядодк слів не має змінюватись: " + revwords(inputString));
                    break;
                } else {
                    System.out.println("Невірний вибір! Спробуйте ще раз.");
                }
            } else {
                System.out.println("Будь ласка, введіть ціле число (1 або 2).");
                s.nextLine();
            }
        }
    }

    public static String perevirka() {
        Scanner s = new Scanner(System.in);
        String str;
        while (true) {
            System.out.println("Введіть 2 слова, в кожному слові від 3-х літер:");
            str = s.nextLine();
            String[] words = str.split(" ");

            if (words.length == 2 && words[0].length() >= 3 && words[1].length() >= 3) {
                return str;
            } else {
                System.out.println("Невірно! Перевірте, що в рядку є саме 2 слова, і кожне слово має мінімум 3 літери.");
            }
        }
    }

    public static String revstr(String str) {
        String res = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            res += str.charAt(i);
        }
        return res;
    }

    public static String revwords(String str) {
        String[] words = str.split(" ");
        String res = "";

        for (String word : words) {
            String revword = "";
            for (int i = word.length() - 1; i >= 0; i--) {
                revword += word.charAt(i);
            }
            res += revword + " ";
        }

        return res.trim();
    }
}
