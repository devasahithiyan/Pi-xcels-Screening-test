

public class Main2 {
    public static int minDist(int[] arr, int n, int x, int y) {
        int lastX = -1, lastY = -1, minDist = Integer.MAX_VALUE;
        boolean foundX = false, foundY = false;

        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                lastX = i;
                foundX = true;
                if (lastY != -1) {
                    minDist = Math.min(minDist, lastX - lastY);
                }
            }
            if (arr[i] == y) {
                lastY = i;
                foundY = true;
                if (lastX != -1) {
                    minDist = Math.min(minDist, lastY - lastX);
                }
            }
        }

        if (!foundX || !foundY) return -1;
        return minDist;
    }

    public static void main(String[] args) {
        int[] test1 = {1, 2, 3, 2};
        int x1 = 1, y1 = 2;
        System.out.println(minDist(test1, test1.length, x1, y1)); 

        int[] test2 = {86, 39, 90, 67, 84, 66, 62};
        int x2 = 42, y2 = 12;
        System.out.println(minDist(test2, test2.length, x2, y2)); 
    }
}

