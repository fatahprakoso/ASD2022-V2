public class Inheritance {
  public static void main(String[] args) {
    Child child = new Child(2);
    Parent parent = new Parent(2);

    int pangkatChild = child.pangkat();
    int pangkatParent = parent.pangkat();

    System.out.println("child: " +pangkatChild);
    System.out.println("parent: " +pangkatParent);
  }
}

// superclass, parentclass
class Parent{
  int number;

  Parent(int number){
    this.number = number;
  }

  int pangkat(){
    return number*number;
  }

}

// subclass, childclass
class Child extends Parent{

  // contructor
  Child(int number) {
    super(number);
  }


  // overiding
  int pangkat(){
    return super.number*super.number*super.number;
  }


  // super keyword


}