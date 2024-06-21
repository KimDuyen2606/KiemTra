package advance.devv;
import advance.dev.model.Teacher;
import advance.dev.dao.Manager;

public class MainApp {
   public static void main(String [] args) {
	   Manager manager = new Manager();
	   Teacher teacher1 = new Teacher("Hậu", 45, "2360249");
	   Teacher teacher2 =  new Teacher("Thiện", 18, "2360246");
	   manager.addTeacher(teacher1);
	   manager.addTeacher(teacher2);
	   
	   manager.listTeacher();
	   System.out.println("Lấy số của giáo viên: "+manager.countTeachers());
	   System.out.println("Danh Sách giáo viên có tuổi cao nhất: "+manager.getTeacherNameAboveAge(40));
   }
}
