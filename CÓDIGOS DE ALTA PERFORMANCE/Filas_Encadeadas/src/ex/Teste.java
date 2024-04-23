package ex;

import filas.Filaint;

public class Teste {

	public static void main(String[] args) {
		Filaint fila = new Filaint();
		
		fila.enqueue(23);
		fila.enqueue(44);
		fila.enqueue(38);
		
		System.out.println(fila.dequeue());
		System.out.println(fila.dequeue());
		System.out.println(fila.dequeue());
	}
}
