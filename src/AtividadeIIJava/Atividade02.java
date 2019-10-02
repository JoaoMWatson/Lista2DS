package AtividadeIIJava;
import javax.swing.*;


public class Atividade02 {
    
    public static void tirarMedia(double [][] array){
        double [] arrayMedia = new double[7];
        String [] arrayStatus = new String[7];
        double media = 0, acumMedia = 0, mediaClasse = 0;
        int i = 0, aprovados = 0, reprovados = 0, exame = 0;
        
        for(int coluna = 1;coluna < 7;coluna++){
            arrayMedia[i] = (array[0][coluna] + array[1][coluna]) / 2;
            
            if (arrayMedia[i] < 3.0){
                arrayStatus[i] = "reprovado";
                reprovados++;
            }
            if (arrayMedia[i] >= 3.0 && arrayMedia[i] < 7.0){ 
                arrayStatus[i] = "exame";
                exame++;
            }
            if (arrayMedia[i] >= 7.0){
                arrayStatus[i] = "aprovado";
                aprovados++;
               acumMedia += arrayMedia[i];
            }
            
            i++;
        }
        
        mediaClasse = acumMedia / 6;
        JOptionPane.showMessageDialog(null, "Situação academica por aluno: "
                +"\n1 = "+arrayMedia[0]+" "+arrayStatus[0]
                +"\n2 = "+arrayMedia[1]+" "+arrayStatus[1]
                +"\n3 = "+arrayMedia[2]+" "+arrayStatus[2]
                +"\n4 = "+arrayMedia[3]+" "+arrayStatus[3]
                +"\n5 = "+arrayMedia[4]+" "+arrayStatus[4]
                +"\n6 = "+arrayMedia[5]+" "+arrayStatus[5]);
        
        JOptionPane.showMessageDialog(null, "Total de alunos "
                +"\nReprovados: "+reprovados+
                "\nEm exame: "+exame+
                "\nAprovados: "+aprovados);
        
        JOptionPane.showMessageDialog(null, "A media da turma é: "+mediaClasse);
        
    }
    
    public static void main(String[] args){
        double [][] arrayAlunos = new double[2][7];
        String aux;
        
        try{
            for(int coluna = 1; coluna < 7;coluna++){
                aux = JOptionPane.showInputDialog(null, "Por favor, de a primeira"
                    + " nota do aluno "+coluna);
                aux = aux.replace(",", ".");
                arrayAlunos[0][coluna] = Double.parseDouble(aux);
                
                
                aux = JOptionPane.showInputDialog(null, "Por favor, de a segunda"
                    + " nota do aluno "+coluna);
                aux = aux.replace(",", ".");
                arrayAlunos[1][coluna] = Double.parseDouble(aux);
                
            }
            
        }catch(NullPointerException error){
            JOptionPane.showMessageDialog(null, "Obrigado por utilizar "
                    + "nosso programa");
            System.exit(0);
        }catch(NumberFormatException error){
            JOptionPane.showMessageDialog(null, "Favor, inserir valores validos");
            System.exit(0);
        }
        
        tirarMedia(arrayAlunos);
    }
}
