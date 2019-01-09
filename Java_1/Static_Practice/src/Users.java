
public class Users {

	private String name;
    private String address;
    private String phone;

//   declaring static variable 
     private static int totalUsers = 0;

//     constructor to add new Users
    public Users(String userName, String userAddress, String userPhone) {
        name = userName;
        address = userAddress;
        phone = userPhone;
        
//        With each new user we will increment the total users
        totalUsers++;

}

	
	 public static void main(String[] args) {
		 
//		  Here we are creating two new instances of Users
		 Users user1 = new Users("Sally", "21 S Blvd", "333-3333");
		 Users user2 = new Users("Bob", "1403 N St", "444-4444");
		 
//		 Then for each new User we are printing the static totalUsers -- which prints 2
		 System.out.println(user2.totalUsers);
		 System.out.println(user2.totalUsers);

	 }


}

// noting in here yet
