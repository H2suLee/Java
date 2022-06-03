package p20220603_hw;

public class SalaryMan {
	int salary = 1000000;

	SalaryMan(){
		
	}
	SalaryMan(int salary){
		this.salary=salary;
	}
	int getAnnualGross(){
		return this.salary * 12 + this.salary*5;  
	}

}
