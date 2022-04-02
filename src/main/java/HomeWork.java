import java.util.Arrays;
import java.util.Random;
public class HomeWork {
        public static void main(String[] args) {
//        massiveFigure();
//        arrayHundred();
//        massiveSixOnTWo();
//        doubleMassive();
//        initialValuMassive(5, 10);
//        minMaxArray();
        }
        public static void minMaxArray() {
            int[] arr = {6, 4, 3, 5, 6, 8, 9, 12, 26};
            int min = arr[0]; int max = arr[0];
            for(int i : arr) {
                if (min > i) min = i;
                if (max < i) max = i;
            }
            System.out.println(min);
            System.out.println(max);
        }
        public static void initialValuMassive( int len, int initialValue){
            int[] arr = new int[len];
            for (int i = 0; i < len; i++) {
                arr[i] = initialValue;
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
        public static void doubleMassive() {
            int arr[][] = new int[5][5];
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
                    if (arr[i] == arr[j]) {
                        System.out.print(arr[i][j] + 1 + " ");
                    } else if (arr[i] == arr[arr.length - j - 1]){
                        System.out.print(arr[i][arr.length - j - 1] + 1 + " ");
                    } else {
                        System.out.print(arr[i][j] + 0 + " ");
                    }
                }
                System.out.println();
            }
        }
        public static void massiveSixOnTWo(){
            int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] < 6) {
                    System.out.print(arr[i] * 2 + " ");
                } else {
                    System.out.print(arr[i] + " ");
                }
            }
        }
        public static void arrayHundred(){
            int[] arr = new int[100];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = i + 1;
            }
            System.out.print(Arrays.toString(arr));
        }
        public static void massiveFigure() {
            int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == 1){
                    System.out.print(0 + " ");
                }else{
                    System.out.print(1 + " ");
                }
            }

        }
}
