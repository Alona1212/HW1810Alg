public class SingleElement {
    public static void main(String[] args) {

        int[] arr = {1, 1, 2, 2, 3, 3, 4, 5, 5};
        int result = findSingleElement(arr);
        System.out.println("Single element: " + result);
    }

    public static int findSingleElement(int[] arr) {
        if (arr.length == 1) {
            return arr[0];
        }

        for (int i = 0; i < arr.length; i += 2) {
            if (i == arr.length - 1 || arr[i] != arr[i + 1]) {
                return arr[i];
            }
        }

        return -1; // Если искомый элемент не найден
    }
}





