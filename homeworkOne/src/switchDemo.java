public class switchDemo {
    public static void main(String[] args) {
        char grade = 'C';

        switch (grade) {
            case 'A':
                System.out.println("Mükemmel : Geçtiniz");
                break;
            case 'B':    //İki case için aynı çıktıyı kullanabiliriz.
            case 'C':
                System.out.println("iyi : Geçtiniz");
                break;
            case 'D':
                System.out.println("Fena Değil : Geçtiniz");
                break;
            case 'F':
                System.out.println("Maalesef Kaldınız :(");
                break;
            default:
                System.out.println("Geçersiz not girdiniz!");
        }
    }
}