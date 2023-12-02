public class App {
    public static void main(String[] args) throws Exception {
      Fenetre fsimple= new FenetreSimple();
     System.out.println( fsimple.decrire());  
     Fenetre fcurseurHoriz= new DecorateurCurseurHorizontal(fsimple);
      System.out.println( fcurseurHoriz.decrire()); 
      Fenetre fcurseurvertical= new DecorateurCurseurVertical(fcurseurHoriz);
         System.out.println( fcurseurvertical.decrire()); 

    }
}
