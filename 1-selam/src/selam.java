
public class selam {
    String world = "millett";

    public String selamSoyle(String kime) {
        String cumle;
        if (kime !=  "")
            cumle = "Selam " + kime + " :)";
        else
            cumle = "Selam " + world + " :)";
        return cumle;
    }
}
