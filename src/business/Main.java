package business;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Heater h = new Heater();
		WaterDispenser w = new WaterDispenser();
		Mixer m = new Mixer();
		
		ChurrosMachine churros = new ChurrosMachine(h, w, m);
		
		DonutMachine donuts = new DonutMachine(h, w, m);
		System.out.println("----------MAQUINA DE CHURROS----------\n");
		h.setMediator(churros);
		w.setMediator(churros);
		m.setMediator(churros);
		churros.turnOn();
		System.out.println("\n----------MAQUINA DE DONAS----------\n");
		h.setMediator(donuts);
		w.setMediator(donuts);
		m.setMediator(donuts);
		donuts.turnOn();
	}

}
