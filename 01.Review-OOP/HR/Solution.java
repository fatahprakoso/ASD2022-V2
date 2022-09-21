import java.util.Scanner;

public class Solution {
      private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
          Mahasiswa mahasiswa = new Mahasiswa("John Doe", (long) 404, 3.1415);

          int commandsCount = in.nextInt();

        for(int i=0; i<commandsCount; i++){
            if(in.next().equals("print")){
                System.out.println(mahasiswa);
            } else{
                  if(in.next().equals("nim")){
                    mahasiswa.setIdentity(in.nextLong());
                } else {
                    mahasiswa.setIdentity(in.next());
                }
            }

            if(i!=commandsCount-1){
                in.nextLine();
            }

        }

    }
}

class Mahasiswa{
  private String nama;
  private long nim;
  private double ipk;

  Mahasiswa(String nama, long nim, double ipk){
    this.nama = nama;
    this.nim = nim;
    this.ipk = ipk;
  }

  public void setIdentity(String identity){
    this.nama = identity;
  }

  public void setIdentity(long identity){
    this.nim = identity;
  }

  @Override
  public String toString() {
    return String.format("Halo, Nama saya %s. Nim saya %d, dan ipk saya saat ini %f", this.nama, this.nim, this.ipk);
  }

}