

/**

Java 8 新增了接口的默认方法。

简单说，默认方法就是接口可以有实现方法，而且不需要实现类去实现其方法。

我们只需在方法名前面加个 default 关键字即可实现默认方法。

*/


class InterfaceDefault implements Duck {
	@Override
	public void kua() {
		System.out.println("hello from kua");
	}

	public static void main(String[] args) {
		new InterfaceDefault().kua();
		
	}
}

interface Duck {
	void kua();
	default void egg() {

		System.out.println("hello from interface ");

	}
	default void testDefault() {
		
	};
}
