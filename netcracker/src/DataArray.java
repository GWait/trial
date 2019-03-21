import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DataArray {
    private ArrayList<String> list = new ArrayList<>();

    public void add(String str){
        list.add(str);
    }

    public void fetchFromConsole(){
        DataArray array = new DataArray();
        System.out.println("Введите количество слов: ");
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        System.out.println("Введите слова через пробел: ");
        for(int i = 0; i < count; i++){
            String str = sc.next();
            add(str);
        }
    }

    public void sort(){
        list.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                int compare1 = compareByVowel(o1,o2);
                int compare2 = compareByLength(o1,o2);
                if(compare1 == 0){
                    if(compare2 == 0){
                        return -1;
                    }
                    return compare2;
                }
                return compare1;
            }
        });
    }

    public void print(){
        System.out.println(list.toString());
    }

    private int compareByVowel(String o1, String o2){
        return getCountVowel(o2) - getCountVowel(o1);
    }

    private int compareByLength(String o1, String o2){
        return o2.length() - o1.length();
    }

    private int getCountVowel(String str){
        Pattern ptr = Pattern.compile("(?iu)[аоэиуыеёюя]");
        Matcher m = ptr.matcher(str);
        int res = 0;
        while (m.find()) {
            res++;
        }
        return res;
    }
}
