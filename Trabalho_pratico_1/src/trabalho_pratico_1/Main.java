package trabalho_pratico_1;

public class Main {

    public static void main(String[] args) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame_principal().setVisible(true);
            }
        });
        
    }
    
}
