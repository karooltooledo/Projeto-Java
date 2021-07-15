package projeto.java.beecode;

import java.util.Scanner;

public class Ecoponto extends DadosUsuario{
		
	void ecoponto() throws InterruptedException {
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("\n==== Encontre um ECOPONTO próximo a você para realizar o devido descarte ====\n");
		Thread.sleep(1500);
		
		System.out.println(getNome() + ", você mora em qual região de São Paulo?\n" + "\n1 - Centro" + "\n2 - Sul" + "\n3 - Leste" + "\n4 - Norte" + "\n5 - Oeste");
	    setTipoEcoponto(ler.nextInt());
	
		if(getTipoEcoponto() == 1) {
			System.out.println("Para descartar itens como resíduos, vidro, papel, alumínio, plástico, o EcoPonto mais próximo de sua residência é:\n"
					+ "\nECOPONTO Brás  –  Rua Palmorino Mônaco x Rua da Moóca (Baixo Viad. Prof. Alberto Mesquita de Carvalho)" 
					+ "\nECOPONTO Barra Funda  –  Rua Sólon (Baixos Viaduto Eng.º Orlando Murgel)"
					+ "\nECOPONTO Liberdade  –  Rua Jaceguai, 67. Av. Liberdade"
					+ "\nRealize os descartes corretamente, assim você contribui para o meio ambiente!");		
		}
		if(getTipoEcoponto() == 2) {
			System.out.println("Para descartar itens como resíduos, vidro, papel, alumínio, plástico, o EcoPonto mais próximo de sua residência é:\n"
				+ "\nECOPONTO Santa Cruz  –  Rua Santa Cruz, 1452 (Baixos Viad. Santa Cruz)\n"
				+ "ECOPONTO Giovanni Gronchi  –  Av. Giovanni Gronchi, 3413. Rua José Dias da Costa)\n"
				+ "ECOPONTO Jabaquara  –  Rua Genaro de Carvalho x Rua Jupatis"
				+ "\nRealize os descartes corretamente, assim você contribui para o meio ambiente!");
    }
		if(getTipoEcoponto() == 3) {
    	System.out.println("Para descartar itens como resíduos, vidro, papel, alumínio, plástico, o EcoPonto mais próximo de sua residência é:\n"
    			+ "\nECOPONTO Cangaíba - Rua Dr. Luciano Nogueira X Frei Ricardo Pilar"
				+ "\nECOPONTO Imperador – Av. Ribeirão Jacu, 201 (Baixos do Viad. Jacu Pêssego)"
				+ "\nECOPONTO Tatuapé – Av. Salim Farah Maluf, 179 (Central de Triagem)"
				+ "\nRealize os descartes corretamente, assim você contribui para o meio ambiente!");
    } 
		if(getTipoEcoponto() == 4) {
			System.out.println("Para descartar itens como resíduos, vidro, papel, alumínio, plástico, o EcoPonto mais próximo de sua residência é:\n"
					+ "\nECOPONTO Casa Verde – Rua Zanzibar, 125"
					+ "\nECOPONTO Tucuruvi – Rua Eduardo Vicente Nasser, 519"
					+ "\nECOPONTO Vila Sabrina – Av. dos Poetas, 931"
					+ "\nRealize os descartes corretamente, assim você contribui para o meio ambiente!");
		}
		if(getTipoEcoponto() == 5) {
			System.out.println("Para descartar itens como resíduos, vidro, papel, alumínio, plástico, o EcoPonto mais próximo de sua residência é:\n"
					+ "\nECOPONTO Pinheiros – Pça. do Cancioneiro, 15 (Baixos da Pte. Eng° Ary Torres)"
					+ "\nECOPONTO Vila Jaguara – Rua Agrestina X Av. Marginal Direita do Tietê"
					+ "\nECOPONTO Água Rasa – Av. Salim Farah Maluf, próximo ao nº 1.500"
					+ "\nRealize os descartes corretamente, assim você contribui para o meio ambiente!");
			
		}
	}
}	