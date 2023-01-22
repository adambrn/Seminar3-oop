package Employee;

import java.util.ArrayList;
import java.util.List;

public class Department {
    public String name;
    public Company company;
    private List <Worker> workers= new ArrayList<>();

    public Department(String newName){
        this.name = newName;
    }
    public List <Worker> GetWorkers() {
       return workers;
    }
    public void AddWorker(Worker newWorker) {
        workers.add(newWorker);
        newWorker.department = this;
    }
    
    public void DelWorker(Worker worker) {
        workers.remove(worker);
        worker.department = null;
    }

    public void TransferWorker(Worker worker, Department newDepartment) {
        this.DelWorker(worker);
        newDepartment.AddWorker(worker);
       
    }
}
