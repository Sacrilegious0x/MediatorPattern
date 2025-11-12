package business;

public class Mixer implements ICollague {
	private IMediator mediator;
	@Override
	public void setMediator(IMediator mediator) {
		// TODO Auto-generated method stub
		this.mediator = mediator;

	}
	
	public void mixIngredients(int velocity) {
		System.out.println("Mezclando a una velocidad de " + velocity + " rpm");
		System.out.println("Agregando a la freidora");
		this.mediator.turnOff();
	}

}
