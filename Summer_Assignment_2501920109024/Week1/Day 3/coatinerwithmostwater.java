
public class coatinerwithmostwater {

    public static int maxArea(int[] arr) {
        int start = 0;
        int width, height, product;
        int max = 0;
        int end = arr.length - 1;
        while (start < end) {
            width = end - start;
            height = Math.min(arr[start], arr[end]);
            product = width * height;
            max = Math.max(product, max);
            if (arr[start] > arr[end]) {
                end--;
            } else {
                start++;
            }

        }
        return max;

    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 5, 2, 1, 5, 7};
        System.out.println(maxArea(arr1));
    }
}
