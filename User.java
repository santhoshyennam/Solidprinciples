


//it does only login and logout and assigns uid
public class User implements Authentication,UserSession{  //from Authentication.java and UserSession.java files
    private static int uid,login_status;
    
    public boolean login(String email,String pass)
    {
        //check the credentials,return true if exists else false
        System.out.println("login successfull user:"+email);
        uid=379874879;
        login_status=1;
        return true;
    }
    public boolean logout()
    {
        //destroy session
        System.out.println("logged out");
        uid=0;
        login_status=0;
        return true;
    }
    public int getUid()
    {
        return uid;
    }
    public int getLoginStatus()
    {
        return login_status;
    }
    
    
    
}

