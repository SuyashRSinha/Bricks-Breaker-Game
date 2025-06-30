package demogame;

import javax.swing.JFrame;

public class mainclass {

    @SuppressWarnings("static-access")
    public static void main(String[] args) {
        JFrame jf = new JFrame("BRICK BREAKER");
        jf.setSize(700,600);
        jf.setLocationRelativeTo(null);
        jf.setDefaultCloseOperation(jf.EXIT_ON_CLOSE);
        jf.setVisible(true);
        jf.setResizable(false);
        GamePlay gp = new GamePlay();
        jf.add(gp);
        
    }

}
