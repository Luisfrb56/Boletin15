
package boletin15;

import javax.swing.JOptionPane;


public class Notas {
    private float probaesc1;
    private float probaesc2;
    private float probapra;
    private float Boletins;
    private float BoletinsPorcen;
    private float probaescNotaM;
    private float probapraNotaM;
    private float BoletinsNotaM;
    private float NotaFinal;
    public void calcularNota(){
do{
        float probaesc1= Float.parseFloat(JOptionPane.showInputDialog("Nota primeira proba escrita: "));
        float probaesc2= Float.parseFloat(JOptionPane.showInputDialog("Nota segunda proba escrita: "));
        float probapra= Float.parseFloat(JOptionPane.showInputDialog("Nota proba practica: "));
        float mediaesc=(probaesc1+probaesc2)/2;
        probaescNotaM= (float) (mediaesc*0.40);
        probapraNotaM=(float) (probapra*0.40);
        float Boletins= Float.parseFloat(JOptionPane.showInputDialog("Boletins feitos: "));
        
        BoletinsPorcen=(Boletins/17)*100;
        if(BoletinsPorcen>90){
            BoletinsNotaM=2;
        }else{
            if(70<BoletinsPorcen){
                BoletinsNotaM=1;
            }else{
                BoletinsNotaM=0;
            }
        }
        NotaFinal=probaescNotaM+probapraNotaM+BoletinsNotaM;
        JOptionPane.showMessageDialog(null, "Probas teoricas: "+probaescNotaM+"\n Proba practica: "+probapraNotaM+"\n Boletins: "+BoletinsNotaM+"\n Nota final: "+NotaFinal);
    }while (JOptionPane.showConfirmDialog(null, "Calcular otra nota?") == JOptionPane.YES_OPTION);
}
}
