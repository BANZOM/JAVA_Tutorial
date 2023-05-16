public class array {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};

        System.out.println("Static: ");
        for (int i = 0; i < 5; i++) {
            System.out.println(arr[i]);
        }

        System.out.println("Dynamic: ");
        int arr2[] = new int[5];
        for (int i = 0; i < 5; i++) {
            arr2[i] = i+5;
        }

        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }

        // new loop:
        System.out.println("New loop method: ");
        for(int i: arr)
        {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
