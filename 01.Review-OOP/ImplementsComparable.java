public class ImplementsComparable {
  public static void main(String[] args) {

  }
}


// implements interface Comparable
class Person implements Comparable<Person>{


  // contract method
  @Override
  public int compareTo(Person person) {
    // melakukan compare dengan syarat variabel yang akan dicompare harus implements Comparable interface
    return 0;
  }
}