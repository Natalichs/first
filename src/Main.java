public class Main {

    public static void main(String[] args) {
        String[][] array= {
                {"41","4","8","77"},
                {"7","2","10","7"},
                {"19","23","1","55"},
                {"25","73","49","9"}};
        //System.out.println(check4x4(array));
        try{
            printArr(stringToInt(array));
        }catch(MyArraySizeException e){
            System.out.println(e.getMessage());
        }catch (MyArrayDataException e){
            System.out.println(e.getMessage());
        }
        }

    public static boolean check4x4(String[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length != 4 || arr.length != 4){
                throw new MyArraySizeException("несоответсвующий размер массива");
            }
        }
        return true;
    }
     public static int[][] stringToInt(String[][] arr){
        check4x4(arr);
        int[][] arrInt = new int[4][4];
         for (int i = 0; i < arr.length; i++) {
             for (int j = 0; j < arr[i].length; j++) {
                 try{
                     arrInt[i][j]=Integer.parseInt(arr[i][j]);
                 }catch(NumberFormatException e){
                     throw new MyArrayDataException("элемент["+i+"]["+j+"] нельзя преобразовать в число");
                 }
             }
         }

        return arrInt;

    }
    public static void printArr(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+ " | ");
            }
            System.out.println();
        }
    }

    }



