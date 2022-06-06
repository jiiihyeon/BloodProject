package com.green.map.vo;

public class MapVo {
	// Fields
	private int center_num;
	private String center_name;
	private String sido;
	private String gugun;
	private String doromyeong;
	private String tel;
	// Constructors
	public MapVo() {};
	public MapVo(int center_num, String center_name, String sido, String gugun, String doromyeong, String tel) {
		super();
		this.center_num = center_num;
		this.center_name = center_name;
		this.sido = sido;
		this.gugun = gugun;
		this.doromyeong = doromyeong;
		this.tel = tel;
	}
	// Getter/Setter
	public int getCenter_num() {
		return center_num;
	}
	public void setCenter_num(int center_num) {
		this.center_num = center_num;
	}
	public String getCenter_name() {
		return center_name;
	}
	public void setCenter_name(String center_name) {
		this.center_name = center_name;
	}
	public String getSido() {
		return sido;
	}
	public void setSido(String sido) {
		this.sido = sido;
	}
	public String getGugun() {
		return gugun;
	}
	public void setGugun(String gugun) {
		this.gugun = gugun;
	}
	public String getDoromyeong() {
		return doromyeong;
	}
	public void setDoromyeong(String doromyeong) {
		this.doromyeong = doromyeong;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	// toString()
	@Override
	public String toString() {
		return "MapVo [center_num=" + center_num + ", center_name=" + center_name + ", sido=" + sido + ", gugun="
				+ gugun + ", doromyeong=" + doromyeong + ", tel=" + tel + "]";
	}
	
}
