public class Employee {
    String name;
    int  salary;
    int workHours;
    int hireYear;//Ise baslangıc yılı

    Employee(String name, int salary,int workHours,int hireYear){

        this.name=name;
        this.salary=salary;
        this.workHours=workHours;
        this.hireYear=hireYear;

    }
    public int  tax(){
        /*if (this.salary < 0) {
            System.out.println("negatif maaş yazılamaz");
        }*/
        int totalTax=0;
        if (this.salary>1000){
            totalTax=((this.salary*3)/100);

        }
        return totalTax;
    }
    public int bonus(){
        int total=0;
        if (this.workHours>40){
            total=(this.workHours)-40;
            total=total*30;



        }
        return total;
    }

    public double raiseSalary(){
        int year=2021;
        int total2=0;

        if (year-this.hireYear<10){

            total2=(this.salary*5)/100;

        }else if (year-this.hireYear>=10 && year-this.hireYear<20){
            total2=(this.salary*10)/100;
        }else if (year-this.hireYear>=20){
            total2=(this.salary*20)/100;
        }

        return total2;
    }

    public void bilgileriGoster(){
        int y= (int) (this.salary+ raiseSalary()+ bonus()-tax());
        int z= (int) (this.salary+ raiseSalary());

        System.out.println("Adı : "+ this.name);
        System.out.println("Maaşı : "+ this.salary);
        System.out.println("Çalışma Saati : "+this.workHours);
        System.out.println("Vergi : " +tax());
        System.out.println("Bonus : " +bonus());
        System.out.println("Maaş Artışı : "+ raiseSalary());
        System.out.println("Vergi ve Bonusları ile birlikte maaş : "+ y);
        System.out.println("Toplam Maaş : " + z);




    }
}
