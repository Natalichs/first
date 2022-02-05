import java.io.*;
import java.util.Arrays;

public class AppData {
    private String[] header;
    private int[][] data;


 //чтение
    public void read(File file){
        int size=0;
        int count=1;

        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(file))){
            String line = bufferedReader.readLine();
            char[] c = line.toCharArray();
            for(char n:c){
                if(n==';')
                    count++;
            }
            while (bufferedReader.readLine()!=null)
                size++;

        }catch(IOException e){
            e.printStackTrace();
        }
        header = new String[count];
        data = new int[size][count];
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            header = bufferedReader.readLine().split(";");

            for (int i = 0; i < size; i++) {
                String[] dataStr = bufferedReader.readLine().split(";");
                for (int j = 0; j < count ; j++) {
                    data[i][j] =Integer.parseInt(dataStr[j]) ;
                }
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    //вывод данных в консоль
    public void print(){
        for (String s: header) {
            System.out.print(s +";");
        }
        System.out.println();
        for(int i =0; i< data.length; i++){
            for (int j = 0; j < data[i].length; j++) {
                System.out.print(data[i][j]+ ";");
            }
            System.out.println();
        }
    }

    public void write(File file){
        try(BufferedWriter bufferedWriter= new BufferedWriter(new FileWriter(file))){
            for (int i = 0; i < header.length-1 ; i++) {
                bufferedWriter.write(header[i]+";");
            }
            bufferedWriter.write(header[header.length-1] + "\n");
            for (int i = 0; i < header.length; i++){
                for (int j = 0; j < data[i].length-1; j++) {
                    bufferedWriter.write(data[i][j]+ ";");
                }
                bufferedWriter.write(data[i][data[i].length-1] + "\n");
            }

        }catch(IOException e){
            e.printStackTrace();
        }
    }


}
