package com.tugas1;

import java.util.TreeMap;
import java.util.TreeSet;

public class tugas1 {
	public static void main(String[] arg) {
		
		System.out.println("-----INI ADALAH CONTOH ARRAY TREESET-----");
		
		TreeSet<Integer> rollNumber = new TreeSet();
		rollNumber.add(17);
		rollNumber.add(13);
		rollNumber.add(28);
		rollNumber.add(16);
		rollNumber.add(45);
		rollNumber.add(53);
		rollNumber.add(29);
		
		for (Integer item : rollNumber) {
			System.out.println(item);
		}
		
		
		System.out.println("-----CONTOH ARRAY TREEMAP-----");
		
		TreeMap<Integer, String> skorKaryawan = new TreeMap();
		skorKaryawan.put(25, "jono");
		skorKaryawan.put(23, "bagus");
		skorKaryawan.put(26, "adhi");
		skorKaryawan.put(28, "hasan");
		skorKaryawan.put(21, "rama");
		skorKaryawan.put(30, "christie");
		skorKaryawan.put(35, "anton");
		skorKaryawan.put(24, "galang");
		
		for (Integer key : skorKaryawan.keySet()) {
			System.out.println("Karyawan " + skorKaryawan.get(key) + " sudah memiliki skor kerjaan sebanyak " + key);
		}
	}
}
