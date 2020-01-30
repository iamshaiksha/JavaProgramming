package com.bridgelabz.prototype;

/**Prototype design pattern
 * authour:shaik.shaiksha vali
 * date:30/01/2020
 * */
import java.util.ArrayList;
import java.util.List;

public class BookShop implements Cloneable{
	

	private String shopName;
	List<Book> books=new ArrayList<>();
	public String getShopName() {
		return shopName;
	}
	@Override
	public String toString() {
		return "BookShope [shopName=" + shopName + ", books=" + books + "]";
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	public List<Book> getBooks() {
		return books;
	}
	public void setBooks(List<Book> books) {
		this.books = books;
	}
	public void loadData()
	{
		for(int i=1;i<10;i++)
		{
			Book b=new Book();
			b.setBid(i);
			b.setBname("Book"+i);
			getBooks().add(b);
		}
	}
	@Override
	protected BookShop clone() throws CloneNotSupportedException {
	BookShop shop=new BookShop();
		for(Object bs:this.getBooks())
		{
			shop.getBooks().add((Book) bs);
		}
		return shop;
	}
}
