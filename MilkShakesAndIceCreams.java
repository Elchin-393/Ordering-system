package McDonaldsMenu;

public class MilkShakesAndIceCreams {
	
	private String MilkShakeBanana;
	private String MilkShakeChocolate;
	private String MilkShakeStrawberry;
	private String MilkShakeVanilla;
	private double MilkShakePrice;
	
	private String McSundaeCherry;
	private String McSundaeCaramel;
	private String McSundaeStrawberry;
	private String McSundaeChocolate;
	private double McSundaePrice;

	private String McFlurryCherryKitKat;
	private String McFlurryChocolateKitKat;
	private String McFlurryStarwberryKitKat;
	private String McFlurryKitKat;
	private double McFlurryPrice;

	private String ConeIceCream;
	private double ConeIcePrice;
	

	public MilkShakesAndIceCreams() {
		super();
		this.MilkShakePrice = 1.90;
		this.McSundaePrice = 1.70;
		this.McFlurryPrice = 2.70;
		this.ConeIcePrice = 0.70;
	}

	public String getMilkShakeBanana() {
		return MilkShakeBanana;
	}
	public void setMilkShakeBanana(String milkShakeBanana) {
		MilkShakeBanana = milkShakeBanana;
	}
	public String getMilkShakeChocolate() {
		return MilkShakeChocolate;
	}
	public void setMilkShakeChocolate(String milkShakeChocolate) {
		MilkShakeChocolate = milkShakeChocolate;
	}
	public String getMilkShakeStrawberry() {
		return MilkShakeStrawberry;
	}
	public void setMilkShakeStrawberry(String milkShakeStrawberry) {
		MilkShakeStrawberry = milkShakeStrawberry;
	}
	public String getMilkShakeVanilla() {
		return MilkShakeVanilla;
	}
	public void setMilkShakeVanilla(String milkShakeVanilla) {
		MilkShakeVanilla = milkShakeVanilla;
	}
	public String getMcSundaeCherry() {
		return McSundaeCherry;
	}
	public void setMcSundaeCherry(String mcSundaeCherry) {
		McSundaeCherry = mcSundaeCherry;
	}
	public String getMcSundaeCaramel() {
		return McSundaeCaramel;
	}
	public void setMcSundaeCaramel(String mcSundaeCaramel) {
		McSundaeCaramel = mcSundaeCaramel;
	}
	public String getMcSundaeStrawberry() {
		return McSundaeStrawberry;
	}
	public void setMcSundaeStrawberry(String mcSundaeStrawberry) {
		McSundaeStrawberry = mcSundaeStrawberry;
	}
	public String getMcSundaeChocolate() {
		return McSundaeChocolate;
	}
	public void setMcSundaeChocolate(String mcSundaeChocolate) {
		McSundaeChocolate = mcSundaeChocolate;
	}
	public String getMcFlurryCherryKitKat() {
		return McFlurryCherryKitKat;
	}
	public void setMcFlurryCherryKitKat(String mcFlurryCherryKitKat) {
		McFlurryCherryKitKat = mcFlurryCherryKitKat;
	}
	public String getMcFlurryChocolateKitKat() {
		return McFlurryChocolateKitKat;
	}
	public void setMcFlurryChocolateKitKat(String mcFlurryChocolateKitKat) {
		McFlurryChocolateKitKat = mcFlurryChocolateKitKat;
	}
	public String getMcFlurryStarwberryKitKat() {
		return McFlurryStarwberryKitKat;
	}
	public void setMcFlurryStarwberryKitKat(String mcFlurryStarwberryKitKat) {
		McFlurryStarwberryKitKat = mcFlurryStarwberryKitKat;
	}
	public String getMcFlurryKitKat() {
		return McFlurryKitKat;
	}
	public void setMcFlurryKitKat(String mcFlurryKitKat) {
		McFlurryKitKat = mcFlurryKitKat;
	}
	public String getConeIceCream() {
		return ConeIceCream;
	}
	public void setConeIceCream(String coneIceCream) {
		ConeIceCream = coneIceCream;
	}
	
	
	
	public double getMilkShakePrice() {
		return MilkShakePrice;
	}

	public void setMilkShakePrice(double milkShakePrice) {
		MilkShakePrice = milkShakePrice;
	}

	public double getMcSundaePrice() {
		return McSundaePrice;
	}

	public void setMcSundaePrice(double mcSundaePrice) {
		McSundaePrice = mcSundaePrice;
	}

	public double getMcFlurryPrice() {
		return McFlurryPrice;
	}

	public void setMcFlurryPrice(double mcFlurryPrice) {
		McFlurryPrice = mcFlurryPrice;
	}

	public double getConeIcePrice() {
		return ConeIcePrice;
	}

	public void setConeIcePrice(double coneIcePrice) {
		ConeIcePrice = coneIcePrice;
	}

	public  String MilkShakeSize(String size){
		if("small".equalsIgnoreCase(size) || "medium".equalsIgnoreCase(size) ||
			"large".equalsIgnoreCase(size)) {
		return size;
		 } else {
	            throw new IllegalArgumentException("Invalid size for Milk Shakes: " + "(" + size +")"+ " Availabe sizes: Small, Medium, Large");
	        }
		}
	
	public String ExtraTopingMcSundai(String ExtraToping) {
		if("StrawBerry".equalsIgnoreCase(ExtraToping) || "Cherry".equalsIgnoreCase(ExtraToping) ||
				"Chocolate".equalsIgnoreCase(ExtraToping) || "Caramel".equalsIgnoreCase(ExtraToping))  {
			return ExtraToping;
			 } else {
		            throw new IllegalArgumentException("Invalid toping for McSundai: " + "(" + ExtraToping +")" + 
			 " Availabe topings: StrawBerry, Cherry, Chocolate, Caramel ");
		        }
	}
	
	public String ExtraTopingMcFlurry(String ExtraToping) {
		if("StrawBerry".equalsIgnoreCase(ExtraToping) || "Cherry".equalsIgnoreCase(ExtraToping) ||
				 "Caramel".equalsIgnoreCase(ExtraToping))  {
			return ExtraToping;
			 } else {
		            throw new IllegalArgumentException("Invalid toping for McFlurry: " + "(" + ExtraToping +")" + 
			 " Availabe topings: StrawBerry, Cherry, Caramel ");
		        }
	}

}

