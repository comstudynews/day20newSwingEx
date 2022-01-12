package org.comstudy21.ex06;

import java.util.Vector;

public class SaramDto {
	private int idx;
	private String name;
	private String email;
	private String phone;
	
	public SaramDto() {
		this(0,"","","");
	}

	public SaramDto(int idx, String name, String email, String phone) {
		this.idx = idx;
		this.name = name;
		this.email = email;
		this.phone = phone;
	}

	public int getIdx() {
		return idx;
	}

	public void setIdx(int idx) {
		this.idx = idx;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "SaramDto [" + idx + ", " + name + ", " + email + ", " + phone + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idx;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SaramDto other = (SaramDto) obj;
		if (idx != other.idx)
			return false;
		return true;
	}

	public Vector toVector() {
		Vector vector = new Vector();
		vector.add(idx);
		vector.add(name);
		vector.add(email);
		vector.add(phone);
		return vector;
	}
}
