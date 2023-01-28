//Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.nio.Buffer;
import java.nio.charset.Charset;
public class buble{
    public static void main(String[] args) {
        int[] SortArr = new int [] {2,1,5,34,4,9,56,23,2,7,8,1}; 
        Arr(SortArr); 
        File file = new File("text.txt");

        try {
            FileWriter wr = new FileWriter(file, Charset.forName("UTF16"));
            int total = 1;
            for (int i = 0; i < SortArr.length; i++) {
                String str = String.valueOf(SortArr[i]);
                
                wr.write(str +"  " + total +  " Итерация\n");
                total += 1;
    
            }
            wr.close();

        } catch (Exception e) {
            System.out.println("Сбой");
        }
                
        
        }   
    
    public static int[] Arr(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - 1; j++) {
                if (a[j + 1] < a[j]) {
                    int swap = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = swap;

                }
                            
            }
           
        }

        return a;
    }

    
        
    }



