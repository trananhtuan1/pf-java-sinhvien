import java.util.Scanner;

public class Sinhvien {
    public static void main(String[] args) {
         int [] array;

        Scanner scanner = new Scanner(System.in);

        int size;
        do {
            System.out.println("nhập kích thước:");
            size = scanner.nextInt();
            if (size >30)
                System.out.println("kích thước không vượt quá 30");
        } while (size > 30);

        array = new int[size] ;
        int i = 0;
        while (i < array.length){
            System.out.println("nhập số cho sinh viên  " + (i + 1) + ":");
            array [i] = scanner.nextInt();
            i++;
        }
        int count = 0;
        System.out.println("danh sách các nhãn:");
        for ( int j = 0; j < array.length; j++) {
            System.out.println(array[j] + "\t");
            if (array[j] >= 5 && array [j] <= 10)
                count++;
        }
        System.out.println("\n số người vượt qua kỳ thi" + count);

    }
}
