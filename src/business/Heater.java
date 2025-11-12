package business;

public class Heater implements ICollague {
	private IMediator mediator;
	@Override
	public void setMediator(IMediator mediator) {
		// TODO Auto-generated method stub
			this.mediator = mediator;
	}
	
	public void heatOil(int degrees) {
		System.out.println("Calentando el aceite a " + degrees + "°C");
		this.mediator.pourWater();
	}

}
