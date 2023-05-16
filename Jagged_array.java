public class Jagged_array {
    public static void main(String[] args) {
        int[][] arr = new int[3][];
        arr[0] = new int[4];
        arr[1] = new int[5];
        arr[2] = new int[3];

        System.out.println(arr.length);
        System.out.println(arr[0].length);
        System.out.println(arr[1].length);
        System.out.println(arr[2].length);
        
    }
}
