package DSA;

public class TestProduct {

	public static void main(String[] args) {
		SimpleArrayList<Product> p = new SimpleArrayList<>();
		Product p1 = new Product("1111", "A", 10000, 2);
                Product p2 = new Product("1111", "B", 10000, 3);
                Product p3 = new Product("1111", "B", 10000, 4);
		p.add(p1);
                p.add(p2);
                p.add(p3);
		System.out.println(p.size());
		p.output();
                p.remove(p1);
                p.output();
                System.out.println(p.isExist(p3));
	}

}
