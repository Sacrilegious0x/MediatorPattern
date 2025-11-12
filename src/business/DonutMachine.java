package business;

public class DonutMachine implements IMediator {
	private Heater heater;
	private WaterDispenser dispenser;
	private Mixer mixer;
	
	public DonutMachine(Heater h, WaterDispenser wDispenser, Mixer mix) {
		heater = h;
		dispenser = wDispenser;
		mixer = mix;
	}

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("Encendiendo maquina de donas");
		startHeating();
	}

	@Override
	public void startHeating() {
		// TODO Auto-generated method stub
		heater.heatOil(170);
	}

	@Override
	public void pourWater() {
		// TODO Auto-generated method stub
		dispenser.pourWater(300);
	}

	@Override
	public void mixIngredients() {
		// TODO Auto-generated method stub
		mixer.mixIngredients(200);
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("Apagando maquina de donas");
		System.out.println("Sacando donas");
		fillDonut();
	}
	
	private void fillDonut() {
		System.out.println("Rellenando donas con dulce de leche");
	}

}
