package advance.dev.model;
import advance.dev.dao.IPeople;

public class Teacher extends People implements IPeople{
    private String teacherID;
    
    public Teacher(String name, int age, String teacherID) {
    	super(name, age);
    	this.teacherID = teacherID;
    }
    public String getTeacherID() {
    	return teacherID;
    }
    public void setTeacherID(String teacherID) {
    	this.teacherID = teacherID;
    }
    @Override
    public void add() {
    	System.out.println("Thêm Giáo Viên: "+this.getName());
    }
    @Override
    public void printPeople() {
    	System.out.println("Tên Giáo Viên: "+this.getName()+",Tuổi: "+this.getAge()+",ID: "+this.teacherID);
    }
}
