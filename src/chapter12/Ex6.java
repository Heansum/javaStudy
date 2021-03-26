package chapter12;

public class Ex6 {
	public static void main(String[] args) {
		// 사과를 담을 수 있는 바구니를 만들어서 바구니에 사과를 담아보세요.
//		Apple[] appleBasket = new Apple[3];
//		
//		appleBasket[0] = new Apple();
// 	
//		// 바나나를 담을 수 있는 바구니를 만들어서 바구니에 바나나를 담아보세요.
//		
//		
//		Banana[] bananaBasket = new Banana[3];
//		
//		bananaBasket[0] = new Banana();
//		
//		Onion[] onionBasket = new Onion[3];
//		
//		onionBasket[0] = new Onion(); 
//		
//		Product[] basket = new Product[3];
//		basket[0] = new Apple();
//		basket[1] = new Banana();
//		basket[2] = new Onion();
		
		// 과일 진열대에는 과일만 저장되도록
		// 사과는 과일이면서 상품이다.
		// 바나나는 과일이면서 상품이다.
		Fruit[] fruitShelf = new Fruit[3];
		fruitShelf[0] = new Apple();
		fruitShelf[1] = new Banana();

		// 채소 진열대에는 채소만 저장되도록
		// 양파는 채소이면서 상품이다.
		Vegetable[] vegetableShelf = new Vegetable[3];
		vegetableShelf[0] = new Onion();
		
		Product[] basket = new Product[3];
		
		basket[0] = new Apple();
		basket[1] = new Banana();
		basket[2] = new Onion();
		
		
	}
}
