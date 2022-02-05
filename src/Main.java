import java.io.File;

public class Main {

    public static void main(String[] args) {
        File file = new File("src/test.csv");
        File file2 = new File("src/test2.csv");
        AppData appData = new AppData();
        appData.read(file);
        appData.print();
        appData.write(file2);


    }
}
