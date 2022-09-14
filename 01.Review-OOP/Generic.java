public class Generic {
  public static void main(String[] args) {
    // Generic1<Boolean> g1 = new Generic1<Boolean>();

    // g1.nilai = true;

    // Generic3<String> g3A= new Generic3<String>("ini string");
    // System.out.println(g3A.getFloatValue());

  }

}


class Generic1 <E> {
  // generic properties
  E nilai;


  // generic method
  public E getNilai() {
    return nilai;
  }


}


// multi-type
class Generic2 <E, B> {
  E nilai1;
  B nilai2;

}


// bounded-type
class Generic3 <E extends Number> {
  E prop;

  Generic3(E prop){
    this.prop = prop;
  }

  // impplementasi bounded parameter
  int getIntValue(){
    return prop.intValue();
  }

  float getFloatValue(){
    return prop.floatValue();
  }
}