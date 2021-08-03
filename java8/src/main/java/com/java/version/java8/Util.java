package com.java.version.java8;

import java.util.ArrayList;
import java.util.List;

import com.java.version.java8.streams.Hosting;

public class Util {

	public static List<String> prepareListOfStrings()
	{
		List<String> list = new ArrayList<String>();

		list.add("Bangalore");
		list.add("Hyd");
		list.add("Vizag");
		list.add("Chennai");
		list.add("Bhihar");
		
		return list;
	}
	
	public static List<Hosting> getListOfHostDetails()
	{
		List<Hosting> list = new ArrayList<>();
		
        list.add(new Hosting(1, "liquidweb.com", 80000));
        list.add(new Hosting(2, "linode.com", 90000));
        list.add(new Hosting(3, "digitalocean.com", 120000));
        list.add(new Hosting(4, "aws.amazon.com", 200000));
        list.add(new Hosting(5, "mkyong.com", 1));
        
        return list;
	}
	
	public static List<Hosting> getListOfHostDetailsWithDuplicateName()
	{
		List<Hosting> list = new ArrayList<>();
		
        list.add(new Hosting(1, "liquidweb.com", 80000));
        list.add(new Hosting(2, "linode.com", 90000));
        list.add(new Hosting(3, "digitalocean.com", 120000));
        list.add(new Hosting(4, "aws.amazon.com", 200000));
        list.add(new Hosting(5, "mkyong.com", 1));
        
        // Here linode.com is duplicate
        list.add(new Hosting(6, "linode.com", 80000));
        
        return list;
	}
}
