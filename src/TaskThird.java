public class TaskThird {
    void merge(int[] array, int left, int mid, int right) {

        int lengthLeft = mid - left + 1;
        int lengthRight = right - mid;

        int leftArray[] = new int[lengthLeft];
        int rightArray[] = new int[lengthRight];


        for (int i = 0; i < lengthLeft; i++)
            leftArray[i] = array[left + i];
        for (int i = 0; i < lengthRight; i++)
            rightArray[i] = array[mid + i + 1];

        int leftIndex = 0;
        int rightIndex = 0;


        for (int i = left; i < right + 1; i++) {

            if (leftIndex < lengthLeft && rightIndex < lengthRight) {
                if (leftArray[leftIndex] < rightArray[rightIndex]) {
                    array[i] = leftArray[leftIndex];
                    leftIndex++;
                } else {
                    array[i] = rightArray[rightIndex];
                    rightIndex++;
                }
            }

            else if (leftIndex < lengthLeft) {
                array[i] = leftArray[leftIndex];
                leftIndex++;
            }

            else if (rightIndex < lengthRight) {
                array[i] = rightArray[rightIndex];
                rightIndex++;
            }
        }
    }

    public void showSortedArray(int[] array) {
        System.out.println("Sorted array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}

