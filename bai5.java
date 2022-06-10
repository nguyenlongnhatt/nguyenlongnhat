import java.util.Scanner;

public class bai5 {
    public static void main(String[] args) {
            int soDong, soCot;
            Scanner sc = new Scanner(System.in);
            System.out.println("Nhập vào số dòng của mảng: ");
            soDong = sc.nextInt();
            System.out.println("Nhập vào số cột của mảng: ");
            soCot = sc.nextInt();
            int[][] A = new int[soDong][soCot];
            for (int i = 0; i < soDong; i++) {
                for (int j = 0; j < soCot; j++) {
                    System.out.print("Nhập phần tử thứ [" + i + ", " + j + "]: ");
                    A[i][j] = sc.nextInt();
                }
            }
            System.out.println("Mảng vừa nhập: ");
            for (int i = 0; i < soDong; i++) {
                for (int j = 0; j < soCot; j++) {
                    System.out.print(A[i][j] + "\t");
                }
                System.out.println("\n");

                    }
        for (int i = 0; i < soDong; i++) {
            for (int j = 0; j < soCot; j++) {
                if (i == j) {
                    System.out.println("các phần tử nằm trong đường chéo chính là :"+A[i][j]);
                }
                }
            }
    }}