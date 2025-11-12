package business;

public class ChurrosMachine implements IMediator {
	private Heater heater;
	private WaterDispenser dispenser;
	private Mixer mixer;
	
	public ChurrosMachine(Heater h, WaterDispenser wDispenser, Mixer mix) {
		heater = h;
		dispenser = wDispenser;
		mixer = mix;
	}
	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("Encendiendo maquina de churros");
		startHeating();
		
	}

	@Override
	public void startHeating() {
		// TODO Auto-generated method stub
		heater.heatOil(180);
	}

	@Override
	public void pourWater() {
		// TODO Auto-generated method stub
		dispenser.pourWater(200);
	}

	@Override
	public void mixIngredients() {
		// TODO Auto-generated method stub
		mixer.mixIngredients(100);
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("Apagando maquina de churros");
		System.out.println("Sacando churros");
	}

}
