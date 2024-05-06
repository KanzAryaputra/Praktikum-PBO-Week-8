class Kupu {
    void gerak() {
      // Implementasi gerakan kupu-kupu
    }
  }
  
  class Ulat extends Kupu {
    @Override
    void gerak() {
      System.out.println("Ulat merayap");
    }
  }
  
  class Data<T> {
    private T isi;
  
    public T getIsi() {
      return isi;
    }
  
    public void setIsi(T isi) {
      this.isi = isi;
    }
  }
  
  public class Main {
    public static void main(String[] args) {
      Kupu K = new Ulat();
      Data<Kupu> anu = new Data<>();
  
      anu.setIsi(K);
      anu.getIsi().gerak();
    }
  }
  