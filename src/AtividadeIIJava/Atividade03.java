package AtividadeIIJava;
import javax.swing.*;
import java.util.Arrays; 


public class Atividade03 {
    
    public static double maisNova(double [][] array){
        double maisNova = 0;
        
        Arrays.sort(array);
        
        maisNova = array[0][1];
        
        return maisNova;
    }
    
    public static double maisVelho(double [][] array){
        double maisVelho = 0;
        
        for(int linha = 0; linha <= array[linha][0]; linha++){
            if(array[linha][2] == 1){
                if(array[linha][0] > maisVelho) 
                    maisVelho = array[linha][0];
            }
        }
        return 0;
    }
    
    public static double maiorAltura(double [][] array){
        double maior = 0;
        
        for(int linha = 0; linha <= array[linha][1]; linha++){
            if(array[linha][1] > maior){
                maior = array[linha][1];
            }
        }
        return maior;
    }
    
    public static double menorAltura(double [][] array){
        double menor = 0;
        
        Arrays.sort(array);
        
        menor = array[0][1];
        return menor;
    }
    
    public static  double mediaAltura(double [][] array){
        double media = 0, acum = 0;
        
        for(int linha = 0; linha <= array[linha][1]; linha++){
            if(array[linha][2] == 2){
                acum += array[linha][1];
            }
        }
        media = acum / 49; // substituir para 49
        return media;
    }


    public static void main(String[] args) {
        double[][] arrayEntradas = new double[51][3];
        String aux;

        try {
            JOptionPane.showMessageDialog(null, "Bem vindo!!");

            for (int linha = 1; linha <= 50; linha++) {
                
                aux = JOptionPane.showInputDialog(null, "Por favor, de a sua idade");
                arrayEntradas[linha][0] = Integer.parseInt(aux);

                aux = JOptionPane.showInputDialog(null, "Por favor, de a sua altura"
                        + "\nNota: Digite em 'Metros,Centimetros'");
                aux = aux.replace(",", ".");
                arrayEntradas[linha][1] = Double.parseDouble(aux);

                aux = JOptionPane.showInputDialog(null, "Por favor, de o seu sexo"
                        + "\n'1' para masculino"
                        + "\n'2' para feminino");
                arrayEntradas[linha][2] = Integer.parseInt(aux);
            }
            
        } catch (NumberFormatException error) {
            JOptionPane.showMessageDialog(null, "Por favor, digite apenas "
                    + "valores validos");
            System.exit(0);

        } catch (NullPointerException error) {
            JOptionPane.showMessageDialog(null, "Obrigado por utilizar nosss"
                    + "programas!!");
            System.exit(0);
            
        }catch(ArrayIndexOutOfBoundsException error){
            System.out.println("Erro no array: "+error);
            System.exit(0);
            
        }catch(ArrayStoreException error){
            System.out.println("Error no array 2"+error);
            System.exit(0);
        }
        
        double maior = maiorAltura(arrayEntradas);
        double menor = menorAltura(arrayEntradas);

        JOptionPane.showMessageDialog(null, "A pessoa mais alta do grupo "
                + "tem: "+maior+" de altura.\n"
                + "E a menor tem: "+menor+" de altura");
        
        double mediaAltura = mediaAltura(arrayEntradas);
        
        JOptionPane.showMessageDialog(null, "A media de altura entre as "
                + "mulheres é de : "+mediaAltura);
        
        double maisVelho = maisVelho(arrayEntradas);
        double maisNova = maisNova(arrayEntradas);
        
        JOptionPane.showMessageDialog(null, "A mulher mais nova "
                + "tem: "+maisNova+" anos de idade"
                + "\n E o homem mais velho tem: "+maisVelho+" anos de idade.");

    }
    
}
