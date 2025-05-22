package college;
public class College {
    public String ID;
    public String name;
    private long Contact;
    public College(String stud_id){
        ID=stud_id;
    }
    public void studentname(String stud_name){
        name=stud_name;
    
    }
    public void studentcontact(long stud_contact){
        Contact=stud_contact;
    
    }
    public void stud_detail(){
        System.out.println("student ID :"+ID);
        System.out.println("student name :"+name);
        System.out.println("student contact :"+Contact);
        System.out.println();
    }
    
   
    
    public static void main(String[] args) {
        College s1=new College("E23DS008");
        College s2=new College("E23DS017");
        s1.studentname("Dheepika.R");
        s1.studentcontact(879479876);
        s2.studentname("Kanishka.N");
        s2.studentcontact(984079876);
        s1.stud_detail();
        s2.stud_detail();
        
       
    }
    
}
