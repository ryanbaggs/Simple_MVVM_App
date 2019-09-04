# Simple_MVVM_App
Simple Model-View-ViewModel example app.

I will add more information here on the demonstration of this app and the 
MVVM architecture as a reference to anyone wanting to figure out and see an 
example of this being done.

Model - Is currently the Text class that is used to hold the data as it is 
created in app. This will be updated to a Room database in the future.

View - UI is comprised of a TextView, EditText, and Button. The EditText 
updates the TextView through the ViewModel. The View only observes that the 
data has changed and updates the TextView with the new data accordingly.

ViewModel - Creates a MutableLiveData object of type Text. The ViewModel is 
Lifecycle aware meaning that it will be destroyed when the the Activity or 
Fragment is destroyed (onDestroy is called) and not due to a configuration 
change. Also it is loosely connected to the View and will not affect Unit 
Tests that are centered on the View component.

Setting an app up in this architecture format allows for great flexibility, 
readablility, and makes testing and debugging more focused on specific 
components rather than trying to make sense of a potentially large app all 
at once.

Thank you for your time!
