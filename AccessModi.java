// -----------------------Access-Modifier-------------------------------
// these are of 4 types:-
// 1. Public :- Accessable to Everywhere!
// 2. Private :- Can be Accesable in the same class only!
// 3. Protected :- Accessable in same package as well as 
// you can access sub-class of a package to the other package as well!

// 4. Default :- Accessable to the same package only!
// package bank;

class Bank{
    public String name;
    protected String gmail;
    private String password;

    // so, to access private thing we have two methods getters and setters.
    public String getPass(){
        return this.password;
    }

    public void setPass(String password){
        this.password = password;
    }
    
}
class AccessModi{
    public static void main(String args[]){
        Bank account1 = new Bank();
        account1.name = "gautam";
        account1.gmail = "abc@gmail.com";
        // acoount1.password = "abcdef"; (We can't access private thing here!).
        account1.setPass("abcd");
        System.out.println(account1.getPass());
    }
}