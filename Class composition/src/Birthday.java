public class Birthday {
    int day;
    int mon;
    int year;
     public Birthday(int day,int mon,int year){
       this.day= day;
       this.mon= mon;
       this.year= year;
     }
     public void printBirthday(){
         System.out.println("Birthday: "+day+"/"+mon+"/"+year);
     }
}
