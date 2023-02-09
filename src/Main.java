public class Main {
    public static void main(String[] args) {
        int[] array = {1, 4, 3, 2, 5};
        int[] arrayTwo = {9, 8, 22, 23, 51};

        TaskFirs taskFirs = new TaskFirs();
        taskFirs.quickSort(array, 0, 4);

        taskFirs.showSortedArray(array);

        TaskSecond taskSecond = new TaskSecond();
        taskSecond.bubbleSort(array);
        taskSecond.showSortedArray(array);

        TaskThird taskThird = new TaskThird();
        taskThird.showSortedArray(arrayTwo);


        TaskFourth taskFourth = new TaskFourth();
        taskFourth.selectionSort(array);

    }
}