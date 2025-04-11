public class ArrayUtility {

    public static void print(int[] array) {
  for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    public static int sum(int[] array) {
               int total = 0;
        for (int num : arr) {
            total += num;
        }
        return total;
    }

    public static double average(int[] array) {
        if (array.length == 0) {
            return 0;
        }
        int total = sum(array);
        return (double) total / array.length;
    }

    public static int minimum(int[] array) {
        if (array.length == 0) {
            return Integer.MAX_VALUE; // or throw an exception
        }
        int min = array[0];
        for (int num : array) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    public static int maximum(int[] array) {
        if (array.length == 0) {
            return Integer.MIN_VALUE; // or throw an exception
        }
        int max = array[0];
        for (int num : array) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    public static int evenCount(int[] array) {
        int count = 0;
        for (int num : array) {
            if (num % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public static int[] reverseOne(int[] array) {
        int[] reversed = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            reversed[i] = array[array.length - 1 - i];
        }
        return reversed;
    }

    public static void reverseTwo(int[] array) {
        int left = 0;
        int right = array.length - 1;
        while (left < right) {
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++;
            right--;
        }
    }

    public static boolean linearSearchInt(int[] array, int num) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == num) {
                return true;
            }
        }
        return false;
    }

    public static boolean linearSearchString(String[] array, String str) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(str)) {
                return true;
            }
        }
        return false;
    }

    public static void multiplyByTwo(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] *= 2;
        }
    }

    public static void multiplyByN(int[] array, int n) {
        for (int i = 0; i < array.length; i++) {
            array[i] *= n;
        }
    }

    public static String toString(int[] array) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            sb.append(array[i]);
            if (i < array.length - 1) {
                sb.append(", ");
            }
        }
        return sb.toString();
    }

    public static boolean twoSum(int[] array, int num) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] == num) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void shiftRight(int[] array) {
        if (array.length == 0) {
            return;
        }
        int last = array[array.length - 1];
        for (int i = array.length - 1; i > 0; i--) {
            array[i] = array[i - 1];
        }
        array[0] = last;
    }

    public static void shiftLeft(int[] array) {
        if (array.length == 0) {
            return;
        }
        int first = array[0];
        for (int i = 0; i < array.length - 1; i++) {
            array[i] = array[i + 1];
        }
        array[array.length - 1] = first;

    }

    public static void shiftRightNTimes(int[] array, int n) {
        n = n % array.length; // Handle cases where n is greater than the length of the array
        for (int i = 0; i < n; i++) {
            shiftRight(array);
        }

    }

    public static void shiftLeftNTimes(int[] array, int n) {
        n = n % array.length; // Handle cases where n is greater than the length of the array
        for (int i = 0; i < n; i++) {
            shiftLeft(array);
        }

    }


}
