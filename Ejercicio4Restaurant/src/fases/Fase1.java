package fases;

import java.util.*;

public class Fase1 {

	private static Scanner input;

	public static void main(String[] args) {

		// FASE 1

		String[] menuRestaurant = new String[2];
		double[] priceMenu = new double[2];
		List<String> menuSelected = new ArrayList<String>();
		int keepBuying = 0;
		boolean wrongOption = true;
		double totalPrice = 0;

		input = new Scanner(System.in);

		// FASE 2

		for (int i = 0; i < menuRestaurant.length; i++) {

			do {
				System.out.println("Ingresa el plato del menú");
				menuRestaurant[i] = input.nextLine();

				System.out.println("Ingresa el precio del menú");
				priceMenu[i] = input.nextDouble();

			} while (!input.nextLine().isEmpty());

		}

		System.out.println("\n" + "Platos del menú del día" + "\n");

		for (int i = 0; i < menuRestaurant.length; i++) {
			System.out.print(menuRestaurant[i] + "  precio: ");

			System.out.print(priceMenu[i] + " €" + "\n");
		}

		do {
			System.out.println("\n" + "Escoge un plato por favor: ");
			menuSelected.add(input.nextLine());

			// if(!input.nextLine().isEmpty()) {
			System.out.println("Has finalizado tu pedido? 0=SI  1=NO");
			keepBuying = input.nextInt();
			// }

		} while (keepBuying == 1 && input.nextLine().isEmpty());
		
		
		//FASE 3
		for (int i = 0; i < menuSelected.size(); i++) {
			for (int j = 0; j < menuRestaurant.length; j++) {

				if (menuSelected.get(i).equalsIgnoreCase(menuRestaurant[j])) {
					totalPrice += priceMenu[j];
					wrongOption = false;
				}
			}
			
		}
		
		System.out.println("El precio total es de: " + totalPrice);
		
		if (wrongOption == true)
			System.out.println("El producto no existe.Intentalo nuevamente");
	}
}