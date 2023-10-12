package view;

import model.Lista;
import model.Pilha;

public class Principal {

	public static void main(String[] args) {
		Lista<Integer> l = new Lista<Integer>();
		Pilha<Integer> p = new Pilha<Integer>();
		l.addFirst(16);
		l.addFirst(4);
		l.addFirst(13);
		l.addFirst(2);
		l.addFirst(6);
		l.addFirst(7);
		l.addFirst(9);
		l.addFirst(12);
		l.addFirst(18);
		l.addFirst(5);
		l.addFirst(3);
		
		int tamanho;
		int aux = 0;
		while (!l.isEmpty()) {
			tamanho = (l.size()-1);
			try {
				aux = l.get(tamanho);
				l.removeLast();
				p.push(aux);
			} catch (Exception e) {
				e.printStackTrace();
			}	
		}
		while (!p.isEmpty()) {
			try {
				aux = p.pop();
				l.addFirst(aux);
				System.out.println(aux);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
