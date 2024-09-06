package com.demo.supplier;

import java.util.Date;
import java.util.function.Supplier;

public class SupplierDemo1 {
  public static void main(String[] args) {
	Supplier<Date> supplier = ()-> new Date();
	System.out.println(supplier.get());
	System.out.println(supplier.get());
	System.out.println(supplier.get());
}
}
