package McDonaldsMenu;

public class Snacks {
   
	private String FrenchFries;
	private double FrenchFriesPrice;
	
	private String Wedges;
	private double WedgesPrice;
	
	private String ChickenMcNuggets;
	private double ChickenMcNuggetsPrice;
	
	private String OnionRings;
	private double OnionRingsPrice;
	
	private String Shrimps;
	private double ShrimpsPrice;
	
	private String ChickenWings;
	private double ChickenWingsPrice;
	
	private String ChickenBox;
	private double ChickenBoxPrice;
	
	public Snacks() {
		super();
		this.FrenchFriesPrice = 1.70;
		this.WedgesPrice = 2.50;
		this.ChickenMcNuggetsPrice = 3.50;
		this.OnionRingsPrice = 1.80;
		this.ShrimpsPrice = 4.00;
		this.ChickenWingsPrice = 2.40;
		this.ChickenBoxPrice = 7.90;
	}

	public String getFrenchFries() {
		return FrenchFries;
	}

	public void setFrenchFries(String frenchFries) {
		FrenchFries = frenchFries;
	}

	public String getWedges() {
		return Wedges;
	}

	public void setWedges(String wedges) {
		Wedges = wedges;
	}

	public String getChickenMcNuggets() {
		return ChickenMcNuggets;
	}

	public void setChickenMcNuggets(String chickenMcNuggets) {
		ChickenMcNuggets = chickenMcNuggets;
	}

	public String getOnionRings() {
		return OnionRings;
	}

	public void setOnionRings(String onionRings) {
		OnionRings = onionRings;
	}

	public String getShrimps() {
		return Shrimps;
	}

	public void setShrimps(String shrimps) {
		Shrimps = shrimps;
	}

		public String getChickenWings() {
		return ChickenWings;
	}

	public void setChickenWings(String chickenWings) {
		ChickenWings = chickenWings;
	}

	public String getChickenBox() {
		return ChickenBox;
	}

	public void setChickenBox(String chickenBox) {
		ChickenBox = chickenBox;
	}
	
	
	
	public double getFrenchFriesPrice() {
		return FrenchFriesPrice;
	}

	public void setFrenchFriesPrice(double frenchFriesPrice) {
		FrenchFriesPrice = frenchFriesPrice;
	}

	public double getWedgesPrice() {
		return WedgesPrice;
	}

	public void setWedgesPrice(double wedgesPrice) {
		WedgesPrice = wedgesPrice;
	}

	public double getChickenMcNuggetsPrice() {
		return ChickenMcNuggetsPrice;
	}

	public void setChickenMcNuggetsPrice(double chickenMcNuggetsPrice) {
		ChickenMcNuggetsPrice = chickenMcNuggetsPrice;
	}

	public double getOnionRingsPrice() {
		return OnionRingsPrice;
	}

	public void setOnionRingsPrice(double onionRingsPrice) {
		OnionRingsPrice = onionRingsPrice;
	}

	public double getShrimpsPrice() {
		return ShrimpsPrice;
	}

	public void setShrimpsPrice(double shrimpsPrice) {
		ShrimpsPrice = shrimpsPrice;
	}

	public double getChickenWingsPrice() {
		return ChickenWingsPrice;
	}

	public void setChickenWingsPrice(double chickenWingsPrice) {
		ChickenWingsPrice = chickenWingsPrice;
	}

	public double getChickenBoxPrice() {
		return ChickenBoxPrice;
	}

	public void setChickenBoxPrice(double chickenBoxPrice) {
		ChickenBoxPrice = chickenBoxPrice;
	}

	
	public  String FrenchFriesSize(String size){
		if("small".equalsIgnoreCase(size) || "medium".equalsIgnoreCase(size) ||
				"large".equalsIgnoreCase(size) || "ekstra".equalsIgnoreCase(size)) {
			return size;
			 } else {
		            throw new IllegalArgumentException("Invalid size for French Fries: " + "(" + size +")"+ 
			 " Availabe sizes French Fries: Small, Medium, Large, Extra");
		        }
		
		}
	
	public  String WedgesSize(String size){
		if("medium".equalsIgnoreCase(size) || "large".equalsIgnoreCase(size) || "ekstra".equalsIgnoreCase(size)) {
			return size;
			 } else {
		            throw new IllegalArgumentException("Invalid size for Wedges: " + "(" + size +")"+ " Availabe sizes Wedges: Medium, Large, Extra");
		        }
		
		}
	
	public  String McNuggetsSize(String size){
		if("4".equalsIgnoreCase(size) || "6".equalsIgnoreCase(size) ||
				"9".equalsIgnoreCase(size) || "20".equalsIgnoreCase(size)) {
			return size;
			 } else {
		            throw new IllegalArgumentException("Invalid size for McNuggets: " + "(" + size +")"+ 
			 " Availabe sizes McNuggets: 4 pieces, 6 pieces, 9 pieces, 20 pieces");
		        }
		
		}
	
	public  String OnionRingsSize(String size){
		if("5".equalsIgnoreCase(size) || "10".equalsIgnoreCase(size)) {
			return size;
			 } else {
		            throw new IllegalArgumentException("Invalid size for Onion Rings: " + "(" + size +")"+ 
			 " Availabe sizes Onion Rings: 5 pieces, 10 pieces,");
		        }
		
		}
	
	
	
	
	public  String ShrimpsSize(String size){
		if("4".equalsIgnoreCase(size) || "6".equalsIgnoreCase(size)) {
			return size;
			 } else {
		            throw new IllegalArgumentException("Invalid size for Shrimps: " + "(" + size +")"+ 
			 " Availabe sizes Shrimps: 4 pieces, 6 pieces,");
		        }
		
		}
	
	public  String ChickenWingsSize(String size){
		if("3".equalsIgnoreCase(size) || "5".equalsIgnoreCase(size) || "8".equalsIgnoreCase(size)) {
			return size;
			 } else {
		            throw new IllegalArgumentException("Invalid size for Chocken Wings: " + "(" + size +")"+ 
			 " Availabe sizes Chicken WIngs: 5 pieces, 10 pieces,");
		        }
		
		}
	
}

