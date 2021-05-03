# Solidprinciples


//Single responsibilty principle is covered in every class like User,UserProfile,OrderCancellation,OrderDetails,Payments

//Open-closed principle covered in Payments like UpiPayment,Cardpayment,CashPayment classes

//liskov substitution principle occured in between cart and wishlist

//interface seggegation principle is everywhere
Eg:
User related information divided into following three interfaces.
User login and logout present in Authentication interface
UserSession methods like getUid(),getLoginStatu() present in UserSession interface
user profile related methods present in UserProfileInterface interface.


//Dependency inversion principle is covered on UserSession class
As every class(High level module) doesnot depend on User class(low level module) for user id,
rather they depends on UserSession interface(abstraction between User class and other classes) for retrieving user id.
