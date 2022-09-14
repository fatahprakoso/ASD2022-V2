public class Abstraction {
  public static void main(String[] args) {

  }
}

// abstractclass
abstract class AbstracClass{
  int a;

  AbstracClass(int a){
    this.a = a;
  }

  int getA(){
    return this.a;
  }

  // abstract method
  abstract int operation();

}


// interface
interface Interfaces {
  // interface properties
  final double PI = 3.141592;


  // contract method
  int count();

  int operation();


}


class ConcreteClass extends AbstracClass implements Interfaces{

  ConcreteClass(int a) {
    super(a);
    //TODO Auto-generated constructor stub
  }

  @Override
  public int count() {
    // TODO Auto-generated method stub
    return 0;
  }

  @Override
  public
  int operation() {
    // TODO Auto-generated method stub
    return 0;
  }

}