package mvc;

import java.util.Scanner;

public class ConsoleView {

    public void printArray(DataArray array){
        System.out.println(array.toString());
    }

    public DataArray fetchArray(){
        DataArray array = new DataArray();
        System.out.println("Введите количество слов: ");
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        System.out.println("Введите слова через пробел: ");
        for(int i = 0; i < count; i++){
            String str = sc.next();
            array.add(str);
        }
        return array;
    }
}
