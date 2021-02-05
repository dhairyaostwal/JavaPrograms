class employee{
    float salary =0.0f;
    int empid = 0;
    String name;
    
    void getData(int eid, float sal, String nameOfEmployee){
        empid = eid;
        salary = sal;
        name = nameOfEmployee;
    }

    void putData(){
        System.out.println(empid);
        System.out.println(name);
        System.out.println(salary);
    }
}

class employee4{
    public static void main(String a[]){
        employee e = new employee();
        e.getData(1001, 23.45f, "asdf");
        e.putData();
    }
}

// Create a class called as housing which takes the input 