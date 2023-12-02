import java.util.ArrayList;

public class section extends Texte  {
 public   ArrayList<Texte> textes;

    public section(String titre, String preambule,ArrayList<Texte> textes) {
        super(titre, preambule);
        this.textes=textes;
        
    }

    @Override
    public int longueur() {
        return textes.size();
            }

    @Override
    public void ajout(Texte txt) {
        textes.add(txt);
       }

    @Override
    public void retrait(int index) {
        textes.remove(index);
       }
    
}
