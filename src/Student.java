import java.util.Arrays;

public class Student {
    private int id;
    private String name;
    private String sex;
    private double[] points;

    private static int idIcrement = 1;

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", points=" + Arrays.toString(points) +
                '}';
    }

    public Student( String name, String sex, double[] points) {
        this.id = idIcrement;
        this.name = name;
        this.sex = sex;
        this.points = points;
        idIcrement++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public double[] getPoints() {
        return points;
    }

    public void setPoints(double[] points) {
        this.points = points;
    }

    public static void main(String[] args) {
        double[] points = {1.1, 2.2,3.3};
        Student student1 = new Student("Anh","Nam", points);
        Student student2 = new Student("Anh","Nam", points);
        Student student3 = new Student("Anh","Nam", points);
        Student student4 = new Student("Anh","Nam", points);
        System.out.println(student3.getId());
    }
    public double getAvg(){
        double sum = 0;
        for (double point: points){
            sum += point;
        }
        return sum/3;
    }
}
