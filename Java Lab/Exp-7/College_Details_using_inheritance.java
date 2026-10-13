//Aim:
To write a Java program to demonstrate single inheritance using College and Department classes.

//Algorithm:
Start the program.
Create a College class to store and display college details.
Create a Department class that extends College.
Initialize college and department details using constructors.
Create an object of Department and display all details.
Stop the program.

//program:
class College {
    String collegeName, principalName;

    College(String collegeName, String principalName) {
        this.collegeName = collegeName;
        this.principalName = principalName;
    }

    void displayCollegeDetails() {
        System.out.println("CollegeName: " + collegeName);
        System.out.println("PrincipalName: " + principalName);
    }
}

class Department extends College {
    String departmentName, HODName;

    Department(String collegeName, String principalName,
               String departmentName, String HODName) {
        super(collegeName, principalName);
        this.departmentName = departmentName;
        this.HODName = HODName;
    }

    void displayDepartmentDetails() {
        System.out.println("DepartmentName: " + departmentName);
        System.out.println("HODName: " + HODName);
    }
}

class SingleInherit {
    public static void main(String[] args) {
        Department obj = new Department(
            "NIT", "B.K.Sinha", "Electronics", "B.C.Rai"
        );

        obj.displayCollegeDetails();
        obj.displayDepartmentDetails();
    }
}


//Result:
The program successfully demonstrates single inheritance and displays the college and department details.
