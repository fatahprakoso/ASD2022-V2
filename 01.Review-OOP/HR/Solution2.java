import java.util.Scanner;

public class Solution2 {
    private static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        int commandsCount = in.nextInt();
        String namaBangunDatar;

        for(int i=0; i<commandsCount; i++){
            namaBangunDatar= in.next();
            if(namaBangunDatar.equals("segitiga")){
                double panjangSisi = in.nextDouble();
                Segitiga segitiga = new Segitiga(namaBangunDatar, panjangSisi);
                System.out.println(segitiga);
            } else if(namaBangunDatar.equals("lingkaran")){
                double diameter = in.nextDouble();
                Lingkaran lingkaran = new Lingkaran(namaBangunDatar, diameter);
                System.out.println(lingkaran);
            } else{
                double panjangSisi = in.nextDouble();

                // contoh instansiasi
                Persegi persegi = new Persegi(namaBangunDatar, panjangSisi);

                System.out.println(persegi);
            }

            if(i!=commandsCount-1){
                in.nextLine();
            }
        }
    }
}

interface HitungBangunDatar{
  	public final double PI = 3.1415;

  	// luas dari bangun datar
	  public double luas();

  	// keliling dari bangung datar
  	public double keliling();
}

abstract class BangunDatar implements HitungBangunDatar{
	  protected String namaBangunDatar;

  	  BangunDatar(String namaBangunDatar){
    	   this.namaBangunDatar = namaBangunDatar;
      }

  	  public abstract String toString();
}

class Persegi extends BangunDatar{

    private double panjangSisi;

    Persegi(String namaBangunDatar, double panjangSisi) {
        super(namaBangunDatar);
        this.panjangSisi = panjangSisi;
    }

    @Override
    public double luas() {
        return panjangSisi*panjangSisi;
    }

    @Override
    public double keliling() {
        return panjangSisi*4;
    }

    @Override
    public String toString() {
        return String.format("Bangun datar %s memiliki luas sebesar %f dan keliling sebesar %f", super.namaBangunDatar, this.luas(), this.keliling());
    }
}

// lengkapi klas di bawah ini!
class Segitiga extends BangunDatar{
    private double panjangSisi;

    Segitiga(String namaBangunDatar, double panjangSisi) {
        super(namaBangunDatar);
        this.panjangSisi = panjangSisi;
    }

    @Override
    public double luas() {
        double tinggi = Math.sqrt(Math.pow(panjangSisi, 2) - Math.pow(panjangSisi/2, 2));
        return tinggi*panjangSisi*0.5;
    }

    @Override
    public double keliling() {
        return panjangSisi*3;
    }

    @Override
    public String toString() {
        return String.format("Bangun datar %s memiliki luas sebesar %f dan keliling sebesar %f", super.namaBangunDatar, this.luas(), this.keliling());
    }
}


class Lingkaran extends BangunDatar{
    private double diameter;

    Lingkaran(String namaBangunDatar, double diameter) {
        super(namaBangunDatar);
        this.diameter = diameter;
    }

    @Override
    public double luas() {
        return PI*diameter*diameter/4;
    }

    @Override
    public double keliling() {
        return diameter*PI;
    }

    @Override
    public String toString() {
        return String.format("Bangun datar %s memiliki luas sebesar %f dan keliling sebesar %f", super.namaBangunDatar, this.luas(), this.keliling());
    }
}