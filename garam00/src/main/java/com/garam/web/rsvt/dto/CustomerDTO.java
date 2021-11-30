package com.garam.web.rsvt.dto;

public class CustomerDTO {

	private Integer no;

	private Integer sepa;

	private String name;

	private String address;

	private String tel1;

	private String tel2;

	private String fax;

	private String homepage;

	private String start;

	private String detail;

	private Integer trash;

	public Integer getNo() {
		return no;
	}

	public void setNo(Integer no) {
		this.no = no;
	}

	public Integer getSepa() {
		return sepa;
	}

	public void setSepa(Integer sepa) {
		this.sepa = sepa;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getTel1() {
		return tel1;
	}

	public void setTel1(String tel1) {
		this.tel1 = tel1;
	}

	public String getTel2() {
		return tel2;
	}

	public void setTel2(String tel2) {
		this.tel2 = tel2;
	}

	public String getFax() {
		return fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public String getHomepage() {
		return homepage;
	}

	public void setHomepage(String homepage) {
		this.homepage = homepage;
	}

	public String getStart() {
		return start;
	}

	public void setStart(String start) {
		this.start = start;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public Integer getTrash() {
		return trash;
	}

	public void setTrash(Integer trash) {
		this.trash = trash;
	}

	@Override
	public String toString() {
		return "CustomerDTO [no=" + no + ", sepa=" + sepa + ", name=" + name + ", address=" + address + ", tel1=" + tel1
				+ ", tel2=" + tel2 + ", fax=" + fax + ", homepage=" + homepage + ", start=" + start + ", detail="
				+ detail + ", trash=" + trash + ", getNo()=" + getNo() + ", getSepa()=" + getSepa() + ", getName()="
				+ getName() + ", getAddress()=" + getAddress() + ", getTel1()=" + getTel1() + ", getTel2()=" + getTel2()
				+ ", getFax()=" + getFax() + ", getHomepage()=" + getHomepage() + ", getStart()=" + getStart()
				+ ", getDetail()=" + getDetail() + ", getTrash()=" + getTrash() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

}
