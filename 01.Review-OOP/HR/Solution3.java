import java.util.Scanner;

public class Solution3 {
	private static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        String keyType = in.nextLine();
      	String valueType = in.nextLine();

      	if (keyType.equals("String")){
        	  if(valueType.equals("String")){
            	  Pair<String,String> pair = new Pair<String, String>(in.next(), in.next());
                print(pair);
              } else {
                Pair<String,Integer> pair = new Pair<String, Integer>(in.next(), in.nextInt());
                print(pair);
            }
        } else {
        	  if(valueType.equals("String")){
                Pair<Integer,String> pair = new Pair<Integer, String>(in.nextInt(), in.next());
                print(pair);
            } else {
                Pair<Integer,Integer> pair = new Pair<Integer, Integer>(in.nextInt(), in.nextInt());
                print(pair);
            }
        }
    }

    private static void print(Pair<?,?> pair) {
        System.out.println("key   : " + pair.getKey());
        System.out.println("value : " + pair.getValue());
        System.out.println(pair);
    }
}

// Ubahlah tipe data key dan value menjadi tipe data generic dan lakukan refactoring pada fungsi yang bersangkutan!
class Pair <E, T>{
    private E key;
    private T value;

    Pair(E key, T value){
        this.key = key;
        this.value = value;
    }

    E getKey(){
      return this.key;
    }

    T getValue(){
      return this.value;
    }


    public String toString(){
      return "it has \"" + key + "\" as a key and \"" + value + "\" as a value";
    }
}