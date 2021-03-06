package generic;

public class GenericPrinter<T extends Material>{		//extends 를 통해 상위 클래스를 상속받으면 해당하는 애들만 GenericPrinter을 쓸 수 있게 제어해줄 수 있다.

	private T material;
	
	public T getMaterial() {
		return material;
	}
	
	public void setMaterial(T material) {
		this.material = material;
	}
	
	public String toString() {
		return material.toString();
	}
	
	public void printing() {
		material.doPrinting();
	}
}
