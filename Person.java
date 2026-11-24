public abstract class Person implements IPerson {
protected final int id ; 
protected final String name ; 
protected String phoneNumber ; 
protected IBST<ITimeSlot, IRide> schedule ; // keyed by time slot

public Person (int id , String name , String phoneNumber){
this.id = id ; 
this.name = name ;
setPhoneNumber(phoneNumber) ; 
// this.schedule = new BST<ITimeSlot, IRide>() ; 
}

public int getId(){
return id ; }

public String getName(){
return name ; }

public String getPhoneNumber(){
return phoneNumber ; }

public void setPhoneNumber(String phoneNumber){
if (phoneNumber == null || phoneNumber.length() != 10)
throw new IllegalArgumentException("Phone number should consist of 10 digits." ) ; 

for( int i = 0 ; i < phoneNumber.length() ; i++ )
if (Character.isDigit( phoneNumber.charAt(i) ) )
throw new IllegalArgumentException("Phone number should inculde digits only." ) ; 

this.phoneNumber = phoneNumber ; 
}
public IBST<ITimeSlot , IRide> getSchedule(){
return schedule ; }

public String toString(){
return "ID: " +id+ ", name: " +name+", phone number: " +phoneNumber ; }

} 
