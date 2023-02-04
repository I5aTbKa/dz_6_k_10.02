import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = 2;
        while (a == 2) {
            System.out.println("Введите №задания или 0 для окончания программы");
            int b = in.nextInt();
            int c = 1;
            if (b == 1) {
                while (c == 1) {
                    System.out.println("Введите год:");
                    int god = in.nextInt();
                    System.out.println("1 - н.э , 2 - до н.э:");
                    int nado = in.nextInt();
                    if (god % 4 == 0 && nado == 1) {
                        System.out.println(god + " " + "високосный год");
                    } else if ((god - 1) % 4 == 0 && nado == 2 && god <46) {
                        System.out.println(god + " " + "високосный год");
                    } else {
                        System.out.println(god + " " + "не високосный год");
                    }
                    System.out.println("Чтобы выйти в главное меню нажмите '0' ");
                    c = in.nextInt();
                }
            } else if (b == 2) {
                while (c == 1) {
                    System.out.print("Сколько денег? ");
                    int i = in.nextInt();
                    String word = null;
                    if (i % 10 == 1 && i % 100 != 11) {
                        word = "копейка";
                    } else if (i % 10 == 2 || i % 10 == 3 || i % 10 == 4 && i % 100 != 12 && i % 100 != 13 && i % 100 != 14) {
                        word = "копейки";
                    } else {
                        word = "копеек";
                    }
                    System.out.println(i + " " + word);
                    System.out.println("Чтобы выйти в главное меню нажмите '0' ");
                    c = in.nextInt();

                }
            } else if (b == 3) {
                while (c == 1) {
                    System.out.print("Номер дня? ");
                    int day = in.nextInt();
                    if (day % 7 == 1 && day <= 366) {
                        System.out.println("Понедельник");
                    }
                    if (day % 7 == 2 && day <= 366) {
                        System.out.println("Вторник");
                    }
                    if (day % 7 == 3 && day <= 366) {
                        System.out.println("Среда");
                    }
                    if (day % 7 == 4 && day <= 366) {
                        System.out.println("Четверг");
                    }
                    if (day % 7 == 5 && day <= 366) {
                        System.out.println("Пятнциа");
                    }
                    if (day % 7 == 6 && day <= 366) {
                        System.out.println("Суббота");
                    }
                    if (day % 7 == 0 && day <= 366) {
                        System.out.println("Воскресенье");
                    }
                    System.out.println("Чтобы выйти в главное меню нажмите '0' ");
                    c = in.nextInt();

                }
            } else if (b == 4) {
                while (c == 1) {
                    System.out.print("День: ");
                    int d = in.nextInt();
                    System.out.print("Месяц: ");
                    int n = in.nextInt();
                    if (d > 20 && n == 3 || d < 21 && n == 4) {
                        System.out.println("Овен");
                    }
                    if (d > 20 && n == 4 || d < 22 && n == 5) {
                        System.out.println("Телец");
                    }
                    if (d > 21 && n == 5 || d < 22 && n == 6) {
                        System.out.println("Близнецы");
                    }
                    if (d > 21 && n == 6 || d < 23 && n == 7) {
                        System.out.println("Рак ");
                    }
                    if (d > 22 && n == 7 || d < 24 && n == 8) {
                        System.out.println("Лев");
                    }
                    if (d > 23 && n == 8 || d < 23 && n == 9) {
                        System.out.println("Дева");
                    }
                    if (d > 22 && n == 9 || d < 23 && n == 10) {
                        System.out.println("Весы");
                    }
                    if (d > 22 && n == 10 || d < 23 && n == 11) {
                        System.out.println("Скорпион");
                    }
                    if (d > 21 && n == 11 || d < 22 && n == 12) {
                        System.out.println("Стрелец");
                    }
                    if (d > 22 && n == 12 || d < 21 && n == 1) {
                        System.out.println("Козерог");
                    }
                    if (d > 20 && n == 1 || d < 20 && n == 2) {
                        System.out.println("Водолей");
                    }
                    if (d > 19 && n == 2 || d < 21 && n == 3) {
                        System.out.println("Рыбы");
                    }
                    System.out.println("Чтобы выйти в главное меню нажмите '0' ");
                    c = in.nextInt();
                }
            }
        }
    }
}