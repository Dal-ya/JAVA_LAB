package inheritance;

public class Customer2 {
	
	private int customerID;
	private String customerName;
	private String customerGrade;
	int bonusPoint;
	double bonusRatio;
	
	public Customer2()
	{
		customerGrade = "SILVER";
		bonusRatio = 0.01;
	}
	
	public int calcPrice(int price){
		bonusPoint += price * bonusRatio;
		return price;
	}
	
	public String getCustomerInfo(){
		return customerName + "���� ����� " + customerGrade + "�̸�, ���ʽ� ����Ʈ�� " + bonusPoint + "�Դϴ�.";  
	}
}
