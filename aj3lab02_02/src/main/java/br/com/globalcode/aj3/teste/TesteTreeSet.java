package br.com.globalcode.aj3.teste;

import java.util.Iterator;
import java.util.Set;

import br.com.globalcode.aj3.beans.Cliente;

public class TesteTreeSet {
	public static void main(String args[]) {
		Cliente c1 = new Cliente("Cliente1", "1111", "cpf1");
		Cliente c2 = new Cliente("Cliente2", "2222", "cpf2");
		Cliente c3 = new Cliente("Cliente3", "3333", "cpf3");
		Cliente c4 = new Cliente("Cliente3", "3333", "cpf3");

		// Defina a colecao do tipo TreeSet
		Set clientes = null;

		clientes.add(c1);
		clientes.add(c2);
		clientes.add(c3);
		clientes.add(c4);

		Iterator ponteiroClientes = clientes.iterator();
		while (ponteiroClientes.hasNext()) {
			System.out.println(ponteiroClientes.next());
		}
	}
}