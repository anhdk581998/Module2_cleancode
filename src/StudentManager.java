import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class StudentManager {
    private final Student[] listStudent;
    private int size;

    public StudentManager() {
        this.size = 0;
        this.listStudent = new Student[120];
    }

    public double getAvgClazz() {
        double sum = 0;
        for (int i = 0; i < size; i++) {
            sum += listStudent[i].getAvg();
        }
        return sum / size;
    }

    public double getMaxAvg() {
        double max = 0;
        for (int i = 0; i < size; i++) {
            if (max < listStudent[i].getAvg()) {
                max = listStudent[i].getAvg();
            }
        }
        return max;
    }
    public List<Student> getStudentByName(String name){
        List<Student> data = new ArrayList<Student>(100);
        for (int i = 0; i < this.size; i++) {
            if (Objects.equals(this.listStudent[i].getName(), name)){
                data.add(this.listStudent[i]);
            }
        }
        return data;
    }

    public void add(Student student) {
        this.listStudent[size] = student;
        this.size++;
    }

    public Student[] getListStudent() {
        return this.listStudent;
    }

    public int getSize() {
        return size;
    }

    public Student findStudentById(int id) {
        for (Student student : this.listStudent) {
            if (student.getId() == id) {
                return student;
            }
        }
        return null;
    }

    public int findById(int id) {
        for (int i = 0; i < size; i++) {
            if (id == this.listStudent[i].getId()) {
                return i;
            }
        }
        return -1;
    }

    public void delete(int id) {
        int index = findById(id);
        for (int i = index; i < size; i++) {
            listStudent[i] = listStudent[i + 1];
        }
        size--;
    }

    public void edit(int id, Student newStudent) {
        int index = findById(id);
        this.listStudent[index] = newStudent;
    }

    public void  showListStudent() {
        for (int i = 0; i < this.getSize(); i++) {
            System.out.println(this.getListStudent()[i]);
      }
    }
}
