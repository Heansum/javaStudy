package chapter12;

public class Ex6 {
	public static void main(String[] args) {
		// ����� ���� �� �ִ� �ٱ��ϸ� ���� �ٱ��Ͽ� ����� ��ƺ�����.
//		Apple[] appleBasket = new Apple[3];
//		
//		appleBasket[0] = new Apple();
// 	
//		// �ٳ����� ���� �� �ִ� �ٱ��ϸ� ���� �ٱ��Ͽ� �ٳ����� ��ƺ�����.
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
		
		// ���� �����뿡�� ���ϸ� ����ǵ���
		// ����� �����̸鼭 ��ǰ�̴�.
		// �ٳ����� �����̸鼭 ��ǰ�̴�.
		Fruit[] fruitShelf = new Fruit[3];
		fruitShelf[0] = new Apple();
		fruitShelf[1] = new Banana();

		// ä�� �����뿡�� ä�Ҹ� ����ǵ���
		// ���Ĵ� ä���̸鼭 ��ǰ�̴�.
		Vegetable[] vegetableShelf = new Vegetable[3];
		vegetableShelf[0] = new Onion();
		
		Product[] basket = new Product[3];
		
		basket[0] = new Apple();
		basket[1] = new Banana();
		basket[2] = new Onion();
		
		
	}
}
