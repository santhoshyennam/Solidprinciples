

//it can update user profile and fetch profile from database
public class UserProfile  implements UserProfileInterface{
    String address,contact_number;
    UserSession session;
    UserProfile(UserSession session)
    {
       this.session = session;
    }
    public void getDetails()
   {
       //fetch from database using uid and assign address,contact_number
       address ="hyd";
       contact_number="123456";
	   //System.out.println(userinfo.getUid());
   }
   
   public void updateProfile()
   {
       
       System.out.println("user profile updated");
   }
}
