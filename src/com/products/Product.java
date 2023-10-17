package com.products;
import java.util.*;
import java.util.stream.Collectors;

public class Product {
	private int prodId;
	private String prodName;
	private String prodCategory;
	private double price;
	

	public Product(int prodId, String prodName, String prodCategory, double price) {
		this.prodId = prodId;
		this.prodName = prodName;
		this.prodCategory = prodCategory;
		this.price = price;
	}
	
	public int getProdId() {
		return prodId;
	}

	public void setProdId(int prodId) {
		this.prodId = prodId;
	}

	public String getProdName() {
		return prodName;
	}

	public void setProdName(String prodName) {
		this.prodName = prodName;
	}

	public String getProdCategory() {
		return prodCategory;
	}

	public void setProdCategory(String prodCategory) {
		this.prodCategory = prodCategory;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	

	@Override
	public String toString() {
		return "Product [prodId=" + prodId + ", prodName=" + prodName + ", prodCategory=" + prodCategory + ", price="
				+ price + "]";
	}
	

	@Override
	public int hashCode() {
		return Objects.hash(price, prodCategory, prodId, prodName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price)
				&& Objects.equals(prodCategory, other.prodCategory) && prodId == other.prodId
				&& Objects.equals(prodName, other.prodName);
	}

	public static void main(String[] args) {
		Product p1 = new Product(1,"Hersheys","Chocolate",250);
		Product p2 = new Product(2,"Gems","Chocolate",560);
		Product p3 = new Product(3,"Nutella","Chocolate",900);
		Product p4 = new Product(4,"Cornetto","Icecream",500);
		Product p5 = new Product(5,"Havmour","Icecream",80);
		Product p6 = new Product(3,"Nutella","Chocolate",900);
		
		List<Product> products = new ArrayList<Product>();
		products.add(p1);
		products.add(p2);
		products.add(p3);
		products.add(p4);
		products.add(p5);
		products.add(p6);
		
		List<Product> updatedList = products.stream().filter(p -> p.getProdCategory()=="Chocolate" && p.getPrice()>500).collect(Collectors.toList());
		updatedList.stream().distinct().forEach(t -> System.out.println(t));		

	}
	
	
}
