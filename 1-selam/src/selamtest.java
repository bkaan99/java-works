public class selamtest
{
    public static void main(String[] args) {
        selam nesne = new selam();

        String cevap = nesne.selamSoyle("Nurullah");
        System.out.println(cevap);
        System.out.println(nesne.world);
        
        cevap = nesne.selamSoyle("");
        System.out.println(cevap);
    }
}

