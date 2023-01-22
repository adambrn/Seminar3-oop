package Employee;
public class Main {
    public static void main(String[] args) {
        Company ambrella = new Company("Ambrella Corp.");
        ambrella.AddDepartment(new Department("S.T.A.R.S. Dep."));
        ambrella.AddDepartment(new Department("Science Dep."));
      

        ambrella.GetDepartments().get(0).AddWorker(new Worker("Chris Redfield"));
        ambrella.GetDepartments().get(0).AddWorker(new Worker("Jill Valentine"));
        ambrella.GetDepartments().get(0).AddWorker(new Worker("Rebecca Chambers"));
        ambrella.GetDepartments().get(1).AddWorker(new Worker("Leon Scott Kennedy"));
        ambrella.GetDepartments().get(1).AddWorker(new Worker("Claire Redfield"));
        ambrella.GetDepartments().get(1).AddWorker(new Worker("Ada Wong"));
       
        System.out.println("====================");
        ambrella.PrintAllWorker();
        System.out.println("====================");
        System.out.println();
        System.out.println("Transfer Chris Redfield in Science Dep.");
        ambrella.GetDepartments().get(0).TransferWorker(ambrella.GetWorker("Chris Redfield"),  ambrella.GetDepartments().get(1));
        System.out.println("====================");
        ambrella.PrintAllWorker();
        System.out.println("====================");
    }
}
