package com.vnk.main;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import com.vnk.BLC.BussinessLogic;
import com.vnk.Base.Movies;

public class StreamMaon {
	public static void main(String[] args) {
		Movies m=new Movies("movien","actorn",(byte)32, "Hyderabad", 2023, 300);
		Movies m1=new Movies("Puspa","Allu Arjun",(byte)32, "Hyderabad", 2022, 300);
		Movies m2=new Movies("Alla vaikuntapuram ","Allu Arjun",(byte)32, "Hyderabad", 2020, 200);
		Movies m3=new Movies("DJ","Allu Arjun",(byte)32, "Hyderabad", 2019, 150);
		Movies m4=new Movies("Resuguram","Allu Arjun",(byte)32, "Hyderabad", 2018, 100);
		Movies m5=new Movies("Gangotree","Allu Arajun",(byte)32, "Hyderabad", 2005, 30);
		Movies m6=new Movies("Bahubali","Prabash",(byte)38, "Vizag", 2018, 200);
		Movies m7=new Movies("Mirchi","Prabash",(byte)38, "Vizag", 2013, 80);
		Movies m8=new Movies("Kalki","Prabash",(byte)38, "Vizag", 2023, 230);
		Movies m9=new Movies("Ega","Nani",(byte)34, "Nellor", 2014, 90);
		Movies m10=new Movies("Nennu Local","Nani",(byte)34, "Nellor", 2018, 130);
		Movies m11=new Movies("Racha","Ramcharan",(byte)31, "Chithoor", 2014, 110);
		Movies m12=new Movies("RRR","Ramcharan",(byte)31, "Chithoor", 2022, 110);
		Movies m13=new Movies("Magadeera","Ramcharan",(byte)31, "Chithoor", 2012, 10);
		Movies m14=new Movies("RRR","NTR",(byte)32, "Thirupati", 2022, 110);
		Movies m15=new Movies("Devara","NTR",(byte)32, "Thirupati", 2024, 200);
		List<Movies> list=List.of(m1,m2,m3,m4,m5,m6,m7,m8,m9,m10,m11,m12,m13,m14,m15);
		
		BussinessLogic bs=new BussinessLogic();
		
		//bs.getRecords(list).stream().forEach(System.out::println);
		
		/*long count=bs.getRecords(list).stream().count();
		System.out.println(count);*/
		
		//bs.getRecords(list).stream().limit(3).forEach(System.out::println);
		
	    //bs.getRecords(list).stream().filter(a-> a.getCollection()==200).forEach(System.out::println);
		
		bs.getRecords(list).stream().mapToInt(a->a.getActorAge()).max().ifPresentOrElse(System.out::println,()->{System.out.print("Not Found");});
		
		
	}

}
