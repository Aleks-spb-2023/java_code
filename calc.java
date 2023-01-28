import java.io.IOException;
import java.lang.ProcessHandle.Info;
import java.util.Scanner;
import java.util.logging.*;

import com.sun.tools.javac.Main;
public class calc {
    
    public static void main(String[] args) throws SecurityException, IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое число");
        Double a = sc.nextDouble();
        System.out.println("Введите второе число");
        Double b = sc.nextDouble();
        System.out.println("Введите операцию +, -,/,*");
        String op = sc.next();
        Logger logger = Logger.getLogger(Main.class.getPackageName());
        /* ConsoleHandler ch = new ConsoleHandler(); */
        FileHandler file = new FileHandler("Callog.xml");
        logger.addHandler(file);

        /* SimpleFormatter format = new SimpleFormatter(); */
        XMLFormatter xml = new XMLFormatter();
        file.setFormatter(xml);

        logger.log(Level.WARNING, "Тестовое сообщение");
        logger.info("тестовое сообщение 2");







        switch (op) {
            case "+":
                System.out.println((a + b));
                
                break;
        
            case "-":
                System.out.println((a - b));
                break;

            case "*":
                System.out.println((a * b));
                break;  
            case "/":
                System.out.println((a / b));
                break;     
        }
        /*  */
        


        



    }

    
}