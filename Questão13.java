package cap.pkg3;

import javax.swing.JOptionPane;

public class Questão13 {
    public static void main(String[] args) {
        int num;
        num = Integer.parseInt(JOptionPane.showInputDialog("Qual tabuada você deseja? "));
        
        JOptionPane.showMessageDialog(null, 
                num+"x1="+num*1+" \n"+
                num+"x2="+num*2+" \n"+
                num+"x3="+num*3+" \n"+
                num+"x4="+num*4+" \n"+
                num+"x5="+num*5+" \n"+
                num+"x6="+num*6+" \n"+
                num+"x7="+num*7+" \n"+
                num+"x8="+num*8+" \n"+
                num+"x9="+num*9+" \n"+
                num+"x10="+num*10+" \n");
                        
    }
   
}
