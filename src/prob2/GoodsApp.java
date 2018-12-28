package prob2;

import java.util.Scanner;

public class GoodsApp {
	private static final int COUNT_GOODS = 3;

	public static void main(String[] args) {
		
		Goods[] arrayGoods = new Goods[COUNT_GOODS];
		Scanner scanner = new Scanner(System.in);
		for(int i = 0; i < COUNT_GOODS; i++)
		{
			String line = scanner.nextLine();
			String[] tokens = line.split(" ");
			
			String name = tokens[0];
			int price = Integer.parseInt(tokens[1]);
			int number = Integer.parseInt(tokens[2]);
			arrayGoods[i] = new Goods(name, price, number);
		}
		
		System.out.println("");
		
		for(int j = 0; j < arrayGoods.length; j++)
		{
			arrayGoods[j].show();
		}
		
		scanner.close();

	}
}
