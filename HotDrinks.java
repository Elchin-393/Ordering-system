package McDonaldsMenu;

public class HotDrinks {
	
	private String Tea;
	private double TeaPrice;
	
	private String Coffee;
	private double CoffeePrice;

	private String Latte;
	private double LattePrice;

	private String Cappuccino;
	private double CappuccinoPrice;

	private String HotChocolate;
	private double HotChocolatePrice;

	private String Espresso;
	private double EspressoPrice;

	
	public HotDrinks() {
		super();
	this.TeaPrice = 1.00;	
	this.CoffeePrice = 2.50;
	this.LattePrice = 2.50;
	this.CappuccinoPrice = 2.50;
	this.HotChocolatePrice = 2.70;
	this.EspressoPrice = 2.80;
	}


	public String getTea() {
		return Tea;
	}

	public void setTea(String tea) {
		Tea = tea;
	}

	public String getAmericano() {
		return Coffee;
	}

	public String getCoffee() {
		return Coffee;
	}


	public void setCoffee(String coffee) {
		Coffee = coffee;
	}


	public double getCoffeePrice() {
		return CoffeePrice;
	}


	public void setCoffeePrice(double coffeePrice) {
		CoffeePrice = coffeePrice;
	}


	public void setAmericano(String coffee) {
		this.Coffee = coffee;
	}

	public String getLatte() {
		return Latte;
	}

	public void setLatte(String latte) {
		Latte = latte;
	}

	public String getCappuccino() {
		return Cappuccino;
	}

	public void setCappuccino(String cappuccino) {
		Cappuccino = cappuccino;
	}

	public String getHotChocolate() {
		return HotChocolate;
	}

	public void setHotChocolate(String hotChocolate) {
		HotChocolate = hotChocolate;
	}

	public String getEspresso() {
		return Espresso;
	}

	public void setEspresso(String espresso) {
		Espresso = espresso;
	}
	
	
	
	public double getTeaPrice() {
		return TeaPrice;
	}


	public void setTeaPrice(double teaPrice) {
		TeaPrice = teaPrice;
	}


	public double getAmericanoPrice() {
		return CoffeePrice;
	}


	public void setAmericanoPrice(double coffeePrice) {
		CoffeePrice = coffeePrice;
	}


	public double getLattePrice() {
		return LattePrice;
	}


	public void setLattePrice(double lattePrice) {
		LattePrice = lattePrice;
	}


	public double getCappuccinoPrice() {
		return CappuccinoPrice;
	}


	public void setCappuccinoPrice(double cappuccinoPrice) {
		CappuccinoPrice = cappuccinoPrice;
	}


	public double getHotChocolatePrice() {
		return HotChocolatePrice;
	}


	public void setHotChocolatePrice(double hotChocolatePrice) {
		HotChocolatePrice = hotChocolatePrice;
	}


	public double getEspressoPrice() {
		return EspressoPrice;
	}


	public void setEspressoPrice(double espressoPrice) {
		EspressoPrice = espressoPrice;
	}


	
	

	

}
