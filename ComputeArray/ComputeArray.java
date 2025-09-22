// package ComputeArray;
public class ComputeArray {
    public static int[] computeArray(int[] array) {
        if (array == null) {
            return null;
        }
        int[] res = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            int item = array[i];
            // multiple of 3
            if (item % 3 == 0) {
                res[i] += item * 5;
            } else if (item % 3 == 1) {
                res[i] = item + 7;
            } else {
                res[i] = item;
            }
        }
        return res;
    }
}