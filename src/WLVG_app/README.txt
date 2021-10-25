1) NAME: EUGENE RYOO

2) Group 6

3) Object Oriented pattern: FACADE
Package:  App, Payments          
Classes:  PaymentCntl, PaymentList, PaymentProcessor, PaymentUI, App.Controller

4) UI pattern: PASSWORD STRENGTH METER
Package:  Views, App          
Classes:  App.Controller, PasswordStrengthPanel

To switch between the patterns; in Controller's constructor, uncomment the appropriate this.switchViews();

	//FOR MO3-AO3 / BECAUSE SWING 
	//payment ui 
	this.listenerThing();
	this.switchViews(pui);

	//password strength
	//this.switchViews(ps);

I burned a bunch of time trying to get the navbar buttons to switch between them but abandoned the idea due to some quirks with Swing -- either not all the elements would show up, or a few but not all of them. Elements would also carry over between panels. 

FACADE - PAYMENTS 
After the values are grabbed from the panel in Controller, they are passed to the PaymentCntl class and further operated on, and added to the PaymentList. 

There is stub code that will reach out to the Payment Processor in PaymentProcessor.java. Honestly that's probably the real facade in this use case -- choosing which payment processor/payment option to use based on the user's input.  

PASSWORD STRENGTH METER - PASSWORD STRENGTH METER
The logic that checks the password's strength needs to be moved to controller, not just added in the PasswordStrengthMeter class itself. 

Grabs the text from each field, checks if it matches, and if so then checks for strength requirements (special chars, length). A password at least 16 chars long and with a special character will have 75% strength in the JProgressBar. 

