package AtividadeIIJava;

import javax.swing.*;

/*
 * casa possui 40 mesas de 6 lugares cada
 * cliente fornece o numero da mesa  e a quantidade de lugares desejado
 * sistema informa se é possivel realizar a reserva e atualiza a mesma,
 * se n for possivel emitir uma mensagem
 * programa termina quando digitar 0 na mesa ou quando acabar os 240 lugares
 */

public class Atividade04 {
	public static void main(String[] args) {
		int totalLugares = 5, mesa = 1, quantLugares = 0;
		boolean mesasReservadas [] = new boolean [41]; 
		String aux;

		JOptionPane.showMessageDialog(null, "Bem vindo!!");

		while (mesa != 0 || totalLugares != 0);{
			try {

				aux = JOptionPane.showInputDialog(null,
						"Olá, por favor, qual a mesa  que você deseja?" + 
						"\nPara sair digite '0'");
				mesa = Integer.parseInt(aux);
				if(mesasReservadas[mesa] == true) { 
					JOptionPane.showMessageDialog(null, "Mesa oculpada");
			}else {
				mesasReservadas[mesa] = true;
			}
				aux = JOptionPane.showInputDialog(null, "Por favor, quantos lugares você deseja?");
				quantLugares = Integer.parseInt(aux);

				totalLugares -= quantLugares;
				
				JOptionPane.showMessageDialog(null, "Reserva efetuada com sucesso!");

			} catch (NumberFormatException error) {
				JOptionPane.showMessageDialog(null,
						"Você digitou um valor invalido." + 
						"\nCaso queira sair, favor digitar '0' na entrada da mesa");

			} catch (NullPointerException error) {
				JOptionPane.showMessageDialog(null, "Obrigado por utilizar nosso programa!!");

			} catch (ArrayIndexOutOfBoundsException error) {
				JOptionPane.showMessageDialog(null, "Mesa inexistente. Mesas enumeradas de 1 a 40");
			}
		}
		JOptionPane.showMessageDialog(null,"Obrigado por utilizar!");
	}
}




