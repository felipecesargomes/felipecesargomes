package br.com.testandojsp.dao;

import java.util.ArrayList;
import java.util.List;

import br.com.testandojsp.model.Carro;

public class CarroDAO {

	static ArrayList<Carro> ListCar = new ArrayList<Carro>();
	
	public void adiciona(Carro car) {
		ListCar.add(car);
	}
	
	public List listaCarro() {
		return ListCar;
	}
 	
}
