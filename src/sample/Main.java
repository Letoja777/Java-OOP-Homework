package sample;

public class Main {

	public static void main(String[] args) {
		
		//Создание новых объектов класса
		Product product1 = new Product(30, 1000, "Milk");
		Product product2 = new Product(24, 500, "Eggs");
		Product product3 = new Product(250, 1000, "Meat");
		
		//Просмотр информации об объектах
		System.out.println(product1);
		System.out.println(product2);
		System.out.println(product3);
		
		//Использование геттеров
		System.out.println(product1.getName());
		System.out.println(product2.getPrice());
		System.out.println(product3.getWeight());
		
		//Использование сеттеров
		product1.setName("Bread");
		System.out.println(product1);
		product2.setPrice(50);
		System.out.println(product2);
		product3.setWeight(1500);
		System.out.println(product3);
	}

}
