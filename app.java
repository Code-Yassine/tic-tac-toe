import java.awt.*;
import javax.swing.*;


public class app extends JFrame{

    private final JPanel General = new JPanel();
    private JButton[][] buttons = new JButton[3][3];
    private String [][] Tableau = new String[3][3]; 
    private boolean player = true;
    private static String name = null;
    private boolean draw = true;

    public app(){
            setTitle("Tic Tac Toe");
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setSize(200,200);
            add(General);
            General.setLayout(new GridLayout(3,3));
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                final int row = i;
                final int col = j;
                Tableau[row][col] = null;
                buttons[row][col] = new JButton();
                buttons[row][col].addActionListener(e -> {
                    if(player){
                        name = "X";
                    }else{
                        name = "O";
                    }
                    buttons[row][col].setText(name);
                    buttons[row][col].setEnabled(false);
                    Tableau[row][col] = name;
                    player = !player;
                    test();
                });
                General.add(buttons[i][j]);
            }
        }
        
        setVisible(true);
    }

    public void test(){
        for(int i = 0;i < 3;i++){
            if(Tableau[i][1] != null && Tableau[i][2] != null){
                if(Tableau[i][0] != null && Tableau[i][1].equals(Tableau[i][0]) && Tableau[i][2].equals(Tableau[i][0])){
                    JOptionPane.showMessageDialog(null, Tableau[i][0] + " is the winner");
                    reset();
                }
            }

        }
        for(int j = 0 ; j < 3 ; j ++){
            if(Tableau[0][j] != null && Tableau[1][j] != null && Tableau[2][j] != null){
                if(Tableau[1][j].equals(Tableau[0][j]) && Tableau[2][j].equals(Tableau[0][j])){
                    JOptionPane.showMessageDialog(null, Tableau[0][j] + " is the winner");
                    reset();
                }
            }
        }

        if(Tableau[0][0] != null && Tableau[1][1] != null && Tableau[2][2] != null){
            if(Tableau[1][1].equals(Tableau[0][0]) && Tableau[2][2].equals(Tableau[0][0])){
                JOptionPane.showMessageDialog(null, Tableau[0][0] + " is the winner");
                reset();
            }
        }

        if(Tableau[2][0] != null && Tableau[1][1] != null && Tableau[0][2] != null){
            if(Tableau[1][1].equals(Tableau[2][0]) && Tableau[0][2].equals(Tableau[2][0])){
                JOptionPane.showMessageDialog(null, Tableau[2][0] + " is the winner");
                reset();
            }
        }
        draw();
    }

    public void reset(){
        for(int i = 0 ; i < 3 ; i ++){
            for(int j = 0 ; j < 3 ; j ++){
                Tableau[i][j] = null;
                buttons[i][j].setText(null);
            }
        }
    }

    public void draw(){
        for (int i  = 0 ; i < 3 ; i ++){
            for (int j = 0 ; j < 3 ; j ++){
                if(Tableau[i][j] == null){
                   draw = false;
                }
            }
        }
        if(draw){
            JOptionPane.showMessageDialog(null, "Draw");
            reset();
        }
        draw = true;
    }
    public static void main(String[] args) {
        new app();
    }
}
