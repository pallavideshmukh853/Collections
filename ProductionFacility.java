package com.collection;

import java.time.LocalDate;

public class ProductionFacility {

	int proid;
	String pro_facility_name;
	String pro_fa_location;
	int total_productionperday;
	String itemname;
	LocalDate Pro_date;
	public int getProid() {
		return proid;
	}
	public void setProid(int proid) {
		this.proid = proid;
	}
	public String getPro_facility_name() {
		return pro_facility_name;
	}
	public void setPro_facility_name(String pro_facility_name) {
		this.pro_facility_name = pro_facility_name;
	}
	public String getPro_fa_location() {
		return pro_fa_location;
	}
	public void setPro_fa_location(String pro_fa_location) {
		this.pro_fa_location = pro_fa_location;
	}
	public int getTotal_productionperday() {
		return total_productionperday;
	}
	public void setTotal_productionperday(int total_productionperday) {
		this.total_productionperday = total_productionperday;
	}
	public String getItemname() {
		return itemname;
	}
	public void setItemname(String itemname) {
		this.itemname = itemname;
	}
	public LocalDate getPro_date() {
		return Pro_date;
	}
	public void setPro_date(LocalDate pro_date) {
		Pro_date = pro_date;
	}
	public ProductionFacility(int proid, String pro_facility_name, String pro_fa_location, int total_productionperday,
			String item_name, LocalDate pro_date) {
		super();
		this.proid = proid;
		this.pro_facility_name = pro_facility_name;
		this.pro_fa_location = pro_fa_location;
		this.total_productionperday = total_productionperday;
		this.itemname = item_name;
		Pro_date = pro_date;
	}
	@Override
	public String toString() {
		return "ProductionFacility [proid=" + proid + ", pro_facility_name=" + pro_facility_name + ", pro_fa_location="
				+ pro_fa_location + ", total_productionperday=" + total_productionperday + ", itemname=" + itemname
				+ ", Pro_date=" + Pro_date + "]";
	}
	
}
