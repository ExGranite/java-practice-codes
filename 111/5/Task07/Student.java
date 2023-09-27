class Student{
    private String name;
    public static int numberOfStudents = 0;
    public Student(){
        numberOfStudents++;
    }
    public Student(String n){
        name = n;
        numberOfStudents++;
    }
    public String getName(){
        if (name == null)
            return "default name";
        else
            return name;
    }
}