package org.learn.oops;
/*
 * .WAP in java to create a class employee declear veriable empid,empname,empddesignation,empsal,empcountry
and generate getterand setter method. now if empsalry smallerthan equal than 50k then print "grade c" employee and give increament of 10% .
(1)if empsalry smallerthan equal than 70k then print grade B employee and give increament of 5% .
(2)if empsalry smallerthan equal than 90k then print grade A employee and give increament of 2% .
(3)if empcountry is equal india  then print "amazonvouchar" .
 */
public class EmployeeDemo {

	public static void main(String[] args) {
		EmployeeClass employeeClass=new EmployeeClass();
		employeeClass .setEmpid(2);
		employeeClass.setEmpname("rupali");
		employeeClass.setEmpddesignation("jr. java dev");
		employeeClass.setEmpsalary(60000);
		employeeClass.setEmpcountry("India");
		double empsalary=employeeClass.getEmpsalary();
		String empcountry=employeeClass.getEmpcountry();
		if(empsalary>=0 && empsalary<=50000) {
			double inc=(empsalary*10)/100;
			empsalary=empsalary+inc;
			System.out.println("grade C " + empsalary);
		}
		if(empsalary>50000 && empsalary<=70000) {
			double inc=(empsalary*5)/100;
			empsalary=empsalary+inc;
			System.out.println("grade B " + empsalary);
			
		}
		if(empsalary>70000 && empsalary<=90000) {
			double inc =(empsalary*2)/100;
			empsalary=empsalary+inc;
			System.out.println("grade A " + empsalary);
		} 
			
			if (empcountry=="India") {
				System.out.println("amazonvouchar");
		}
	}
	}


