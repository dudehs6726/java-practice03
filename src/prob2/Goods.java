package prob2;

public class Goods {
	private String itemName;  //상품명
	private int price;        //가격
	private int number;		  //갯수
	
	public Goods(String itemName, int price, int number) 
	{
		this.itemName = itemName;
		this.price = price;
		this.number = number;
	}
	
	public void show()
	{
		System.out.println(itemName + "(가격: " + 
						   price + "원)이 " +
						   number + "개 입고 되었습니다.");
	}

}
