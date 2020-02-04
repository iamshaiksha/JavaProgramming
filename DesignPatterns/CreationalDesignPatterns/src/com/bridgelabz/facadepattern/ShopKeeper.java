package com.bridgelabz.facadepattern;

public class ShopKeeper {

	
			
		private MobileShop iphone;
		private MobileShop samsung;
		private MobileShop oppo;
		public ShopKeeper()
		{
			iphone=new Iphone();
			samsung=new Samsung();
			oppo=new OppoF1();
		}
		 public void iphoneSale(){  
		        iphone.modelNo();  
		        iphone.price();  
		    }  
		        public void samsungSale(){  
		        samsung.modelNo();  
		        samsung.price();  
		    }  
		   public void offoF1Sale(){  
		    oppo.modelNo();  
		    oppo.price(); 
		   }
}
