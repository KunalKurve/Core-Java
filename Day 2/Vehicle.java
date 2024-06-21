package day2;

public class Vehicle {
	
	private String vOwner;
	private String vModel ;
	private int vPrice;
	private String vFeatures;
	private static int vCount = 0;
	
	//default constructor
	public Vehicle()
	{
		vCount++;
		vOwner = "Rajesh";
		vModel = "BMW";
		 vPrice = 10;
		 vFeatures = "Toy";
		
	}
	//parameterized constructor
	public Vehicle(String vowner,String vmodel,int vprice,String vfeatures)
	{
		vCount++;
		vOwner = vowner;
		vModel = vmodel;
		vPrice = vprice;
		vFeatures = vfeatures;
	}
	
	
	
	public String getvOwner() {
		return vOwner;
	}
	public void setvOwner(String vOwner) {
		this.vOwner = vOwner;
	}
	public String getvModel() {
		return vModel;
	}
	public void setvModel(String vModel) {
		this.vModel = vModel;
	}
	public int getvPrice() {
		return vPrice;
	}
	public void setvPrice(int vPrice) {
		this.vPrice = vPrice;
	}
	public String getvFeatures() {
		return vFeatures;
	}
	public void setvFeatures(String vFeatures) {
		this.vFeatures = vFeatures;
	}
	
	public static int displayCount()
	{
		return vCount;
	}
	
	@Override
	public String toString()
	{
		return "Vehicle: [owner: "+vOwner+"  Vehicle : vmodel  "+vModel+"  Vehicle: vprice:  "+vPrice+"  vehicle: vfeatures:  "+vFeatures+"]";
	}	
	

}
