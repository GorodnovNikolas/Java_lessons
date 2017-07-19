    import java.util.Scanner;

    public class les_3 {

        public static void main(String[] args) {

            System.out.println("Введите значение выбора операции: 1 - ррасчет максимальной строки в массиве, 2 - калькулятор");

            Scanner scanner1 = new Scanner(System.in);
            int choice = scanner1.nextInt();

            if (choice == 1) {

                System.out.print("Сколько Ячеек будет в массиве ");
                Scanner scanner = new Scanner(System.in);
                int size = scanner.nextInt();

                String[] array = new String[size];
                System.out.print("Заполните ячейки массива в колличестве "+ size + " ");

                for (int i = 0; i < size; i++) {
                    array[i] = scanner.next();
                }
                int maxLength = 0;
                for(int i = 0; i < array.length; i++){
                    if(array[i].length() > maxLength) {
                        maxLength = array[i].length();
                    }
                }
                for(int i=0;i<array.length;i++){
                    if(array[i].length() == maxLength){
                        System.out.println("Самое длинное слово в массиве: " + array[i]);
                        System.out.println ("Длинна строки: " + maxLength);
                    }
                }

            } else if (choice == 2 ) {
                Scanner scanner = new Scanner(System.in);
                System.out.println("ВВедите 1");
                int x = scanner.nextInt();
                System.out.println("Введите 2");
                int y = scanner.nextInt();
                System.out.println("Введите знак");
                String z = scanner.next();

                if (z.equals("*")) {
                    System.out.println("= " + (x * y));
                }
                if (z.equals("/")){
                    if (y != 0) {
                    System.out.println("= " + (x / y)); }
                    else {
                        System.out.println ("Нельзя делить на 0!");
                    }
                }
                if (z.equals("+")) {
                    System.out.println("= " + (x + y));
                }
                if (z.equals("-")) {
                    System.out.println("= " + (x - y));
                }
                else
                    System.out.println("Знак введен не правильно");

            }
            else
                System.out.println("Число введено не правильно");
        }
    }

