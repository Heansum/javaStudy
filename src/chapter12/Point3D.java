package chapter12;

// 3������ �� ���� ǥ���ϱ� ���� Ŭ����
public class Point3D extends Point {
	private int z;
	
	public int getZ() {
		return z;
	}
	
	// �������̵� : �θ� Ŭ������ ���ǵǾ��ִ� �޼��带 �ڽ� Ŭ�������� �������ϴ� ��
	// overwriting
	public String getLocation() {
		int x = getX();
		int y = getY();
		
		return "x : " + x + ", y : " + y + ", z : " + z;
	}
	
	
//	public String get3DLocation() {
//		int x = getX();
//		int y = getY();
//		
//		return "x : " + x + ", y : " + y + ", z : " + z;
//	}

}
