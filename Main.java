record Student (int id, String name) {
    
    // overwriting default constructor not recommended
    Student(){
        this(0, "");
    }

    // compact canonical constructor
    public Student{
        // adding only check for id
        if(id==0){
            throw new IllegalArgumentException("Id with value 0 not allowed");
        }
        
    }
};

public class Main{
    public static void main(String[] args){
        Student studObj = new Student(1, "mani");
        Student studObj1 = new Student(1, "mani");

        // print directly
        System.out.println(studObj);
        // compare equals object
        System.out.println(studObj.equals(studObj1));

    }
}