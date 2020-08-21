import javax.swing.*;
import java.awt.*;

public class Plateau extends JComponent {




    private int[][] plateau = new int[8][8];//plateau de jeu 8x8
    private int[] piece = {1,2,3,4,5,3,2,1}; //chaque piece à un numéro : 1 = tour, 2 = cavalier , 3 = fou, 4 = reine, 5 =roi
    private int pion = 8;// 8 = pion


    @Override
    protected void paintComponent(Graphics pinceau) {

        Graphics secondPinceau = pinceau.create();

    int x = 350;
    int y = 0;

    //premiere zone de joueur
        for (int ligneP = 0; ligneP < 2; ligneP++)
        {
            for (int colonneP =0 ; colonneP < 8; colonneP++)
            {


                if (ligneP == 1){
                    plateau[ligneP][colonneP] = pion;

                }else {

                    plateau[ligneP][colonneP] = piece[colonneP];
                }


            }
        }
        System.out.println("-----------------------");


        for (int ligne = 2; ligne < 6; ligne++)
        {
            for (int colonne =0 ; colonne < 8; colonne++)
            {
                plateau[ligne][colonne] = 0;//Zone vide, on lui attribut 0
            }
        }

        System.out.println("-----------------------");
        //deuxieme zone de joueur

        for (int ligneP = 6; ligneP < 8; ligneP++)
        {
            for (int colonneP =0 ; colonneP < 8; colonneP++)
            {
                if (ligneP == 6){
                    plateau[ligneP][colonneP] = pion;

                }else {

                    plateau[ligneP][colonneP] = piece[colonneP];
                }

            }
        }


        for (int i = 0; i < 8; i++)
        {
            for (int j = 0; j < 8; j++)
            {
                secondPinceau.setColor(Color.black);
                secondPinceau.fillRect(x,y,125,125);
                
                System.out.print(plateau[i][j]);
            }
            System.out.println("");

        }


    }
}
