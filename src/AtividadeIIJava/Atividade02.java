package AtividadeIIJava;
import javax.swing.*;

/*
Ler 2 notas de 6 alunos;

F) Media da classe

2 linhas -> notas
6 colunas -> alunos
*/


public class Atividade02 {
    
    public static void tirarMedia(double [][] array){
        double [] arrayMedia = new double[7];
        String [] arrayStatus = new String[7];
        double media = 0, acumMedia = 0, mediaClasse = 0;
        int i = 0, aprovados = 0, reprovados = 0, exame = 0;
        
        for(int coluna = 1;coluna <= 6;coluna++){
            media = array[0][coluna]+array[1][coluna];
            media /= 2;
            arrayMedia[i] = media;
            i++;
            if (arrayMedia[i] < 3.0){
                arrayStatus[i] = "reprovado";
                reprovados++;
            }
            if (arrayMedia[i] <= 7.0){ 
                arrayStatus[i] = "exame";
                exame++;
            }
            if (arrayMedia[i] > 7.0){ 
                arrayStatus[i] = "aprovado";
                aprovados++;
            }
            acumMedia = media;
        }
        mediaClasse = acumMedia / 6;
        JOptionPane.showMessageDialog(null, "Situação academica por aluno: "
                +"1 = "+arrayMedia[1]+" "+arrayStatus[1]
                +"2 = "+arrayMedia[2]+" "+arrayStatus[2]
                +"3 = "+arrayMedia[3]+" "+arrayStatus[3]
                +"4 = "+arrayMedia[4]+" "+arrayStatus[4]
                +"5 = "+arrayMedia[5]+" "+arrayStatus[5]
                +"6 = "+arrayMedia[6]+" "+arrayStatus[6]);
        
        JOptionPane.showMessageDialog(null, "Total de alunos "
                + "\nReprovados: "+reprovados+
                "\nEm exame: "+exame+
                "\nAprovados: "+aprovados);
        
        JOptionPane.showMessageDialog(null, "A media da turma é: "+mediaClasse);
        
    }
    
    public static void main(String[] args){
        double [][] arrayAlunos = new double[2][7];
        String aux;
        
        
        try{
            for(int coluna = 1; coluna <= 6;coluna++){
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
