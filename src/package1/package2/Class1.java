package package1.package2;

public class Class1 {

    public String str;
    public void fnc(){
        System.out.println("Class1 from package2");
    }

    public static void main(String[] args){
        Class1 obj = new Class1();
        obj.str = "Hello from Class1 in package2";
        obj.fnc();
    }
}
