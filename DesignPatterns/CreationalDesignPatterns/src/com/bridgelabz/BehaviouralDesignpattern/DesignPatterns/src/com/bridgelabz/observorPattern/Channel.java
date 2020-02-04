/**
 * 
 */
package com.bridgelabz.observorPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @author shaik shaiksha vali
 *
 */
public class Channel implements Subject{
	private List<Subscriber> subsList=new ArrayList<>();
	public String title;
    public void subscribe(Subscriber sub)
    {
    	subsList.add(sub);
    }
    public void unSubscribe(Subscriber sub)
    {
    	subsList.remove(sub);
    }
    public void subscribenotify()
    {
    	for(Subscriber sub:subsList)
    	{
    		sub.update();
    	}
    }
    public void upload(String title)
    {
    	this.title=title;
    	subscribenotify();
    }
}