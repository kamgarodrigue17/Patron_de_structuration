import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Paragraphe paragraphe=new Paragraphe("teste de paragraphe", "preazmbule");
       section section = new section("titre", "pre1",new ArrayList<>() );
       section.ajout(paragraphe);

        System.out.println("le nombre de texte est "+ section.textes.size());
    for (int index = 0; index < section.textes.size(); index++) {
        System.out.println(section.textes.get(index).titre);
    }
           section.retrait(0);
    
        System.out.println("le nombre de texte est "+ section.textes.size());
   
    }
}
