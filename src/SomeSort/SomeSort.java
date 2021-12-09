package SomeSort;

import java.util.ArrayList;
import java.util.Collections;

class SomeSort {
    static int[] arrayForSort(int n) {    //массив для сортировки
        int[] result = new int[n];
        if (n > 0) {
            for (int i = n, j = 0; i > 0; i--, j++) {
                result[j] = i;
            }
        }
        return result;
    }

    static ArrayList<Integer> arrayListForSort(int n) {   //массив для сортировки ArrayList
        ArrayList<Integer> result = new ArrayList<>();
        if (n > 0) {
            for (int i = n; i > 0; i--) {
                result.add(i);
            }
        }
        return result;
    }

    static ArrayList<Integer> recursionSort(ArrayList<Integer> mas) {
        if (mas.size() < 2) {
            return mas;
        }
        ArrayList<Integer> lef = new ArrayList<>(), rig = new ArrayList<>();
        int mid = mas.get(0);
        mas.remove(0);
        for (int i : mas) {
            if (i < mid) {
                lef.add(i);
            } else {
                rig.add(i);
            }
        }
        lef = recursionSort(lef);
        rig = recursionSort(rig);
        lef.add(mid);
        lef.addAll(rig);
        return lef;
    }

    static int[] arraySort(int[] mas) {
        for (int i = 0; i < mas.length; i++) {
            int min = mas[i];
            int indx = i;
            for (int j = i + 1; j < mas.length; j++) {
                if (mas[j] < min) {
                    min = mas[j];
                    indx = j;
                }
            }
            if (min != mas[i]) {
                int temp = mas[i];
                mas[i] = min;
                mas[indx] = temp;
            }
        }
        return mas;
    }


    public static void main(String[] args) {
        int n = 33;

        System.out.println("Сортировка методом Collections.sort");
        ArrayList<Integer> aLN = arrayListForSort(n);
        System.out.println(aLN);
        Collections.sort(aLN);
        System.out.println(aLN);

        System.out.println("Сортировка рекурсией");
        aLN = arrayListForSort(n);
        System.out.println(aLN);
        System.out.println(recursionSort(aLN));

        System.out.println("Сортировка перестановкой");
        int[] aN = arrayForSort(n);
        for (int i : aN)
            System.out.print(i + " ");
        System.out.println();
        for (int i : arraySort(aN))
            System.out.print(i + " ");
    }
}
