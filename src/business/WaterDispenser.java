package business;

public class WaterDispenser implements ICollague {
	private IMediator mediator;
	@Override
	public void setMediator(IMediator mediator) {
		// TODO Auto-generated method stub
		this.mediator = mediator;

	}
	
	public void pourWater(int ml) {
		System.out.println("Agregando "+ml + "ml de agua a la mezcla");
		this.mediator.mixIngredients();
	}

}
