package org.practice.java;
/*
 * .WAP in java to create a class employee declear veriable empid,empname,empddesignation,empsal,empcountry
and generate getterand setter method. now if empsalry smallerthan equal than 50k then print "grade c" employee and give increament of 10% .
(1)if empsalry smallerthan equal than 70k then print grade B employee and give increament of 5% .
(2)if empsalry smallerthan equal than 90k then print grade A employee and give increament of 2% .
(3)if empcountry is equal india  then print "amazonvouchar" .
 */
public class EmployeeClassMain {

	public static void main(String[] args) {
		EmployeeClassDeclearVariable employeeClassDeclearVariable= new EmployeeClassDeclearVariable();
		employeeClassDeclearVariable.setEmpid(2);
		employeeClassDeclearVariable.setEmpname("rupali");
		employeeClassDeclearVariable.setEmpsalary(30000);
		employeeClassDeclearVariable.setEmpddesignation("devloper");
		employeeClassDeclearVariable.setEmpcountry("India");
	double empsalary=employeeClassDeclearVariable.getEmpsalary();
	String empcountry=employeeClassDeclearVariable.getEmpcountry();
	
		//if( empsalary>=0 && empsalary<=50000)
	if(empsalary<=50000){
			double inc=(empsalary*10)/100;
			empsalary=empsalary+inc;
			System.out.println("GRAD c " +empsalary);
		}
		//if(empsalary>50000 && empsalary<=70000 )
	if(empsalary<=70000){
			double inc =(empsalary*5)/100;
			empsalary=empsalary+inc;
			System.out.println("GRAD B " +empsalary);
		}
		//if(empsalary>70000 &&  empsalary<=90000)
	if(empsalary<=90000){
			double inc=(empsalary*2)/100;
			empsalary=empsalary+inc;
			System.out.println("GRAD C "+empsalary);
			
		}
		if(empcountry=="India") {
			System.out.println("amazonvouchar");
		}
		

	}

}
