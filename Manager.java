package advance.dev.dao;
import advance.dev.model.Teacher;
import java.util.ArrayList;
import java.util.List;

public class Manager {
   private ArrayList< Teacher> teacherlist = new ArrayList<>();
   
   public void addTeacher(Teacher teacher) {
	   teacherlist.add (teacher);
	   System.out.println("Thêm Giáo Viên: "+teacher.getName());
   }
   public void listTeacher() {
	   System.out.println("Danh Sách Của Giáo viên: ");
	   for(Teacher teacher : teacherlist) {
		   teacher.printPeople();
	   }
   }
   public int countTeachers() {
	   return teacherlist.size();
   }
   public List<String> getTeacherNameAboveAge(int age) {
	   List<String> names = new ArrayList<>();
	   for(Teacher teachers : teacherlist) {
		   if(teachers.getAge() > age) {
			   names.add(teachers.getName());
		   }
	   }
	   return names;
   }
}
