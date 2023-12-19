package oop;

interface ISort {
    void sortAsc();
    void sortDesc();
}

class Mass implements ISort {
    private int[] elements;

    public Mass(int[] elements) {
        this.elements = elements;
    }

    @Override
    public void sortAsc() {
        for (int i = 0; i < elements.length - 1; i++) {
            for (int j = 0; j < elements.length - i - 1; j++) {
                if (elements[j] > elements[j + 1]) {
                    int temp = elements[j];
                    elements[j] = elements[j + 1];
                    elements[j + 1] = temp;
                }
            }
        }
    }

    @Override
    public void sortDesc() {
        for (int i = 0; i < elements.length - 1; i++) {
            for (int j = 0; j < elements.length - i - 1; j++) {
                if (elements[j] < elements[j + 1]) {
                    int temp = elements[j];
                    elements[j] = elements[j + 1];
                    elements[j + 1] = temp;
                }
            }
        }
    }

    public void printArray() {
        for (int element : elements) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}

public class Task7 {
    public static void main(String[] args) {
        int[] arrayElements = {5, 2, 8, 1, 7, 3, 9, 4, 6};
        Mass array = new Mass(arrayElements);

        array.printArray();

        array.sortAsc();
        array.printArray();

        array.sortDesc();
        array.printArray();
    }
}
