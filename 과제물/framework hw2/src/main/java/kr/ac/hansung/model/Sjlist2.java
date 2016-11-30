package kr.ac.hansung.model;

public class Sjlist2 {
	private int pid;
	private String year;
	private String semester;
	private String sjcode;
	private String sjname;
	private String sjtype;
	private int sjweight;
	
	public Sjlist2(){
		
	}
	
	public Sjlist2( String year, String semester ,String sjcode, 
			String sjname ,String sjtype,int sjweight){
		this.year=year;
		this.semester=semester;
		this.sjcode=sjcode;
		this.sjname=sjname;
		this.sjtype=sjtype;
		this.sjweight=sjweight;
	}
	
	public Sjlist2(int pid , String year, String semester ,String sjcode, 
			String sjname ,String sjtype,int sjweight){
		this.pid = pid;
		this.year=year;
		this.semester=semester;
		this.sjcode=sjcode;
		this.sjname=sjname;
		this.sjtype=sjtype;
		this.sjweight=sjweight;
	}
	
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public String getSemester() {
		return semester;
	}
	public void setSemester(String semester) {
		this.semester = semester;
	}
	public String getSjcode() {
		return sjcode;
	}
	public void setSjcode(String sjcode) {
		this.sjcode = sjcode;
	}
	public String getSjname() {
		return sjname;
	}
	public void setSjname(String sjname) {
		this.sjname = sjname;
	}
	public String getSjtype() {
		return sjtype;
	}
	public void setSjtype(String sjtype) {
		this.sjtype = sjtype;
	}
	public int getSjweight() {
		return sjweight;
	}
	public void setSjweight(int sjweight) {
		this.sjweight = sjweight;
	}

	@Override
	public String toString() {
		return "Sjlist2 [pid=" + pid + ", year=" + year + ", semester=" + semester + ", sjcode=" + sjcode + ", sjname="
				+ sjname + ", sjtype=" + sjtype + ", sjweight=" + sjweight + "]";
	}
	
}
