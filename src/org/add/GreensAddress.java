package org.add;

public class GreensAddress {
	private void greensOmr() {
		System.out.println("Greens OMR Address: Balamurugan Garden, Okkiam, Landmark: icici Bank Upstairs, Plat No.19, OMR, Opposite to Sankeetha Hotel, Thoraippakkam, TN 600097");
	}
    private void greensAdayar() {
		System.out.println("Greens Adyar Address: No.11, 1st St, Padmanabha Nagar, Adyar, Chennai, TN 600020");
	}
    private void greensTambaram() {
    System.out.println("Greens Tambaram Address: Tambaram Sanatorium, 1, Chennai - Theni Hwy, near HP Petrol Bulk, Opposite Arulmigu Sri Rama Anjaneyar Temple, Apparao Colony, Tambaram, Chennai, TN 600047");
    }
    private void greensValachery() {
	System.out.println("Greens Valachery Adrees: #28, Nagendra Nagar, Opposite Phoenix Market City, Valachery, Chennai, TN 600042");	
	}
    private void greensAnnanagar() {
	System.out.println("Greens Anna Nagar Address: 4th floor, SDV Arcade, AB-5, 2nd Ave, AB Block, Santhi Colony, Anna Nagar, Chennai, TN 600040");	
	}
    public static void main(String[] args) {
		GreensAddress a = new GreensAddress();
		a.greensOmr();
		a.greensAdayar();
		a.greensTambaram();
		a.greensValachery();
		a.greensAnnanagar();
	}
}
