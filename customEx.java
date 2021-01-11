import java.util.*;


class InvalidAgeException extends Exception{
    InvalidAgeException(String s){
        super(s);
    }
}
class CustomEx{

    public static void validate(int age)throws InvalidAgeException{
        if(age<18)
            throw new InvalidAgeException("not valid");
        else
            System.out.println("valid");
    }

    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter age");
        int age=scanner.nextInt();

        try{
            validate(age);
        }catch(Exception e)
        {
            System.out.println("Exception occured: "+e);
        }

    }
}  