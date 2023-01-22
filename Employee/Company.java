package Employee;

import java.util.ArrayList;
import java.util.List;

public class Company {
    public String name;
    private List<Department> departments = new ArrayList<>();

    public Company(String newName) {
        this.name = newName;
    }

    public List<Department> GetDepartments() {
        return departments;
    }

    public void AddDepartment(Department newDepartment) {
        departments.add(newDepartment);
        newDepartment.company = this;
    }

    public void PrintWorkerForDepartment(Department d) {
        System.out.println(d.name);
        for (Worker worker : d.GetWorkers()) {
            System.out.println("  " + worker.name);

        }
    }

    public void PrintAllWorker() {
        System.out.println(this.name);
        System.out.println("**************");

        for (Department d : departments) {
            this.PrintWorkerForDepartment(d);
        }
    }

    public Worker GetWorker(String name) {
        Worker temp = null;
        for (Department d : departments) {
            for (Worker w : d.GetWorkers()) {
                if (w.name.toLowerCase().contains(name.toLowerCase())) {
                    temp = w;
                }
            }
        }
        return temp;
    }
}
