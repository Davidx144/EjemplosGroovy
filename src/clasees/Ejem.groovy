package clasees
import java.io.File

class Example {
    static int x = 100;
    public static int getX() {
        int lx = 200;
        println(lx);
        return x;
    }
    static void main(String[] args) {
        Example ex = new Example();
        println(ex.getX());
        Example2 ex2 = new Example2();
        println(ex2.getX());

        new File("C:/Users/NARISTIZABAL/Downloads/ejemploFile.txt").eachLine {
            line -> println "line : $line";
        }

        new File("C:/Users/NARISTIZABAL/Downloads/ejemploFile.txt").withWriter('utf-8') {
            writer -> writer.writeLine 'Hello Worlduu'
        }
        Student st = new Student();
        st.ID = 5;
        st.Name = "Nelson"
        println("Mi nombre es "+st.Name+" y mi ID es "+st.ID)
        println(st.edad(7))
    }
}

class Example2 {
    int x = 100;
    public int getX() {
        this.x = 200;
        return x;
    }
}

class Student {
    int ID;
    String Name;

    public int edad(n){
        return n+ID
    }
}



