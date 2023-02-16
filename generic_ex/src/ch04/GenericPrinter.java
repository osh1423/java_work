package ch04;

// T는 Meterial 를 상속 받은 녀석으로 제한
public class GenericPrinter<T extends Material> {

	private T material;

	public T getMaterial() {
		return material;
	}

	public void setMaterial(T material) {
		this.material = material;
	}
	@Override
	public String toString() {
		return material.toString();
	}
}
