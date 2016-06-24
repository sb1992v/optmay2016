package com.two95.Sooraj;

public class Showroom {
	long showroomno1;
	long showroomno2;
	long showroomno3;
	
	public Showroom(){
		
	}

	@Override
	public String toString() {
		return "Showroom [showroomno1=" + showroomno1 + ", showroomno2=" + showroomno2 + ", showroomno3=" + showroomno3
				+ "]";
	}

	public Showroom(long showroomno1, long showroomno2, long showroomno3) {
		super();
		this.showroomno1 = showroomno1;
		this.showroomno2 = showroomno2;
		this.showroomno3 = showroomno3;
	}

	public long getShowroomno1() {
		return showroomno1;
	}

	public void setShowroomno1(long showroomno1) {
		this.showroomno1 = showroomno1;
	}

	public long getShowroomno2() {
		return showroomno2;
	}

	public void setShowroomno2(long showroomno2) {
		this.showroomno2 = showroomno2;
	}

	public long getShowroomno3() {
		return showroomno3;
	}

	public void setShowroomno3(long showroomno3) {
		this.showroomno3 = showroomno3;
	}
	

}
