import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.nio.charset.Charset;

public class Parse {
    public static void main(String[] args)throws Exception {
        File file = new File("bd.txt");
        FileWriter wr = new FileWriter(file, Charset.forName("Utf16"));
        FileReader rd = new FileReader(file);

        wr.write("фамилия:Иванов,оценка:5,предмет:Математика фамилия:Петрова,оценка:4,предмет:Информатика");

        wr.close();

        List<String> list = new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new FileReader(file));

        while (reader.ready()){

            list.add(reader.readLine());

        }
        reader.close();



        

        

        
}

    
        
                
 }

    
        
    
            
    
        
        
       
        

        


        


    

