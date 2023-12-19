package oop;

interface IMath {
    int Max();
    int Min();
    float Avg();
}

class Array implements IMath {
    private int[] elements;

    public Array(int[] elements) {
        this.elements = elements;
    }

    @Override
    public int Max() {
        int max = elements[0];
        for (int element : elements) {
            if (element > max) {
                max = element;
            }
        }
        return max;
    }

    @Override
    public int Min() {
        int min = elements[0];
        for (int element : elements) {
            if (element < min) {
                min = element;
            }
        }
        return min;
    }

    @Override
    public float Avg() {
        int sum = 0;
        for (int element : elements) {
            sum += element;
        }
        return (float) sum / elements.length;
    }
}

public class Task6 {
    public static void main(String[] args) {
        int[] arrayElements = {4,6,7,3,2,7,9,0,5,3};
        Array array = new Array(arrayElements);

        System.out.println("Max: " + array.Max());
        System.out.println("Min: " + array.Min());
        System.out.println("Avg: " + array.Avg());
    }
}
