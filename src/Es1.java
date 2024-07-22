public class Es1 {
    public static void main(String[] args) {

        String[] arr={"M","", "r","k","o"};
        String i= "i";

        System.out.println(moltiplicazione(5,2));
        System.out.println(concatena("Sono ", "Mirko"));
        System.out.println(inserisciInArray(arr, i));


    }
    public static int moltiplicazione(int num1, int num2){
         return num1 * num2;
    }

    public static String concatena(String str1, String str2){
         return str1 + str2;
    }

    public static String[] inserisciInArray(String[] array, String str3 ) {
        array = new String[5];
        array[2] = str3;
        return array;
    }
}
