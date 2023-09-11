export class EmpManagementService {


    addEmployee(employee: any, employees: any) {
        employees.push({
            firstName: employee.firstName,
            lastName: employee.lastName,
            age: employee.age,
            salary: employee.salary,
            designation: employee.designation,
            location: employee.location,
        });
        console.log(employees);
    }

  add(employee: any, employees: any) {
    employees.push({
      firstName: employee.firstName,
      lastName: employee.lastName,
      age: employee.age,
      salary: employee.salary,
      designation: employee.designation,
      location: employee.location,
    });
    console.log(employees);
  }

  remove(employee: any, employees: any) {
    employees.pop();
    console.log(employees);
  }

  delete(employee: any, employees: any) {
    employees.splice(employee, 1);
    console.log(employees);
  }

  update(employee: any, employees: any) {
    employees[employee.index] = {
      firstName: employee.firstName,
      lastName: employee.lastName,
      age: employee.age,
      salary: employee.salary,
      designation: employee.designation,
      location: employee.location,
    };
    console.log(employees);
  }

  search(employee: any, employees: any) {
    let emp = employees.find((emp: any) => emp.firstName == employee.firstName);
    console.log(emp);
  }

  sort(employee: any, employees: any) {
    employees.sort((a: any, b: any) => {
      return a.salary - b.salary;
    });
    console.log(employees);
  }
}

let empvc = new EmpManagementService();
let employees = [
    {
        firstName: 'Rahul',
        lastName: 'Dravid',
        age: 45,
        salary: 50000,
        designation: 'Project Manager',
        location: 'Bangalore',
    },
    {
        firstName: 'Sachin',
        lastName: 'Tendulkar',
        age: 40,
        salary: 60000,
        designation: 'Project Manager',
        location: 'Mumbai',
    },
    {
        firstName: 'Saurav',
        lastName: 'Ganguly',
        age: 50,
        salary: 70000,
        designation: 'Project Manager',
        location: 'Kolkata',
    }
];