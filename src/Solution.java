/**
 * Created by K.Kurakhtenkov on 15.02.2018.
 * 
 */
import java.util.Scanner;
public class Solution {


    public static void main(String[] args) {

        int[] myarray = SetNumberArray();

        System.out.println("Исходный массив: ");
        printarray(myarray);
        puzir(myarray);
        System.out.println("Отсортированный массив: ");
        printarray(myarray);

        System.out.println("Максимальный элемент массива: " + myarray[myarray.length-1]);

        System.out.println("Минимальный элемент массива: " + myarray[0]);


    }

    public static int[] SetNumberArray ()
    {
        Scanner input = new Scanner(System.in); // Объявляем Scanner
        System.out.println("Введите длину массива целых чисел: ");
        int size = input.nextInt(); // Читаем с клавиатуры размер массива и записываем в size
        int array[] = new int[size]; // Создаём массив int размером в size
        System.out.println("Введите элемены массива:");
    /*Пройдёмся по всему массиву, заполняя его*/
        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt(); // Заполняем массив элементами, введёнными с клавиатуры
        }
        return array;
    }


  public static void puzir (int[] in_array)
    {

       int[] array = in_array;

        int tmp;
                for (int j=0; j< array.length; j++)
                {
                    for (int i = 0; i < array.length -1; i++)
                    {   if ( array[i]> array[i+1] )
                        {
                            tmp=array[i];
                            array[i] = array[i+1];
                            array[i+1] = tmp;
                        }
                    }
                }
    }


    public static void printarray (int[] in_array)
    {


        for (int i = 0; i < in_array.length; i++)
        {
            System.out.print(in_array[i] + " ");
        }
        System.out.println();
    }

}



