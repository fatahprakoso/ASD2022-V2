public class ClassNObject {
  public static void main(String[] args) {
    // instansiasi class
    Buku buku = new Buku("asd", "765326312", 200);


    // akses properti


    // akses method
    int jumlahHalamanKonten = buku.hitungJumlahHalamanKonten();
    System.out.println(jumlahHalamanKonten);

    buku.setJudul("ASD-SI-B");
    System.out.println(buku.getJudul());



  }
}

// access_modifier class nama_class {

// }
class Buku {
  // properti
  private String judul;
  private String isbn;
  private int jumlahHalaman;

  /**
   * Access modifier:
   * 1. Public
   * 2. private
   * 3. protected
   * 4. default
   */

  // constructor
  Buku(String judul, String isbn, int jumlahHalaman){
    // algoritma
    this.judul = judul;
    this.isbn = isbn;
    this.jumlahHalaman = jumlahHalaman;

    System.out.println("Class Buku berhasil diinstansiasi");
  }

  // method
  public int hitungJumlahHalamanKonten(){
    return this.jumlahHalaman - 2;
  }


  // overloading


  // enkapsulasi
  public String getIsbn() {
    return this.isbn;
  }

  public String getJudul() {
    return judul;
  }

  public int getJumlahHalaman() {
    return jumlahHalaman;
  }

  public void setIsbn(String isbn) {
    this.isbn = isbn;
  }

  public void setJudul(String judul) {
    this.judul = judul;
  }


}
