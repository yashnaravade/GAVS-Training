export class empManagementService{
    addEmp(emp: any, emplist: any[]) {
        const isEmpIdExists = emplist.some((employee) => employee.empId === emp.empId);
      
        if (isEmpIdExists) {
          console.log(emp.empId);
          alert("Employee with the same empId already exists.");
        } else {
          emplist.push({
            empId: emp.empId,
            firstName: emp.firstName,
            lastName: emp.lastName,
            age: emp.age,
            location: emp.location,
          });
        }
    }

    deleteEmp()
    {

    }

    updateEmp()
    {

    }
}