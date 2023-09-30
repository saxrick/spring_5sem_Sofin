public class Main {
    public static void main(String[] args) {
        int res = 0;
        for (int i = 0; i <= 1000; i++) {
            if (i % 3 == 0|| i % 5 == 0) {
                res += i;
            }
        }
        System.out.println(res);
        int[][] arr = { {20, 34, 2}, {9, 12, 18}, {3, 4, 5} };
        int min = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++){
                if (arr[i][j] < min) {
                    min = arr[i][j];
                }
            }
        }
        System.out.println(min);
    }
}