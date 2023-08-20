public class Main {
    public static void main(String[] args) {
        int[][] array = {
                {1, 2, 3},
                {4, 5, 6}
        };

        print(array, 0, 0);
    }

    public static void print(int[][] array, int row, int col) {
        if (row == array.length) {
            return;
        }
        System.out.print(array[row][col] + " ");
        if (col == array[row].length - 1) {
            System.out.println();
            print(array, row + 1, 0);
        } else {
            print(array, row, col + 1);
        }
    }
}