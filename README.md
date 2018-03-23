# FALDOM
This library is used for  creating the Http Connections  between andoroid app and webserver.  The methods are simple to use especially created for the newbie in android.


# CREATORS
This library is created by [Falcon](https://github.com/rehmatfalcon) and [Wisdomrider](https://github.com/wisdomrider) On March 22.

# WHY TO USE THIS LIBARY?


The methods that needs to be call for getting the response are much more easier and newbie can also easily connect their app to the webservers for data exchange. 


# HOW TO ADD THIS LIBRARY TO YOUR PROJECT?

##### First  go to your root build.gradle then add this at the end of property

```
	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
```

#### Then goto your dependency and add this one

```
compile 'com.github.wisdomrider:Faldom:0.0.2'

```

# HOW TO USE ?


  For simple get request 
```
 
        Faldom.Builder(this) //pass the context
                .setUrl("https://api.com/get") //set url
                .setMethodAsGet() //or you can leave it too the deafult is get
                .after(new Action() { //things to do when we get response
                    @Override
                    public void onSuccess(String response) {
                        //handle your response
                    }

                    @Override
                    public void onError(FaldomError faldomError) {
                        //handle your errors here
                    }
                })
                .request();
```

  For simple Post Request 
  
  ```
  
          Faldom.Builder(this) //pass the context
                .setUrl("https://api.com/get") //set url
                .setMethodAsPost()
                .after(new Action() { //things to do when we get response
                    @Override
                    public void onSuccess(String response) {
                        //handle your response
                    }

                    @Override
                    public void onError(FaldomError faldomError) {
                        //handle your errors here
                    }
                })
                .request();

  ```

For passing params


```

        Faldom.Builder(this) //pass the context
                .addParam("username","wisdomrider") //sending parameters
                .addParam("password","falcon")
                .setUrl("https://api.com/get") //set url
                .setMethodAsPost()
                .after(new Action() { //things to do when we get response
                    @Override
                    public void onSuccess(String response) {
                        //handle your response
                    }

                    @Override
                    public void onError(FaldomError faldomError) {
                        //handle your errors here
                    }
                })
                .request();


```

For passing headers

```
   

        Faldom.Builder(this) //pass the context
                .addHeader("security","skjadhkashdash") //adding headers
                .addParam("username","wisdomrider") //sending parameters
                .addParam("password","falcon")
                .setUrl("https://api.com/get") //set url
                .setMethodAsPost()
                .after(new Action() { //things to do when we get response
                    @Override
                    public void onSuccess(String response) {
                        //handle your response
                    }

                    @Override
                    public void onError(FaldomError faldomError) {
                        //handle your errors here
                    }
                })
                .request();

```

# Managing errors 

```
  Faldom.Builder(this) //pass the context
                .addHeader("security","skjadhkashdash") //adding headers
                .addParam("username","wisdomrider") //sending parameters
                .addParam("password","falcon")
                .setUrl("https://api.com/get") //set url
                .setMethodAsPost()
                .after(new Action() { //things to do when we get response
                    @Override
                    public void onSuccess(String response) {
                        //handle your response
                    }

                    @Override
                    public void onError(FaldomError faldomError) {
                  faldomError.getMessage() --for error message
}
                })
                .request();
                
                
                .getMessage() -- you can get the error message
                faldomError.getLocalizedMessage() -- you can get localized message

```

 


    

# METHODS (Compulsary methods are indicated by /////////////COMPULSARY )

```html
  
.Builder(this) --- you have to pass context here (Compulsary) --- for passing context to Faldom /////////////COMPULSARY

```

```
    .addHeader("headername","header value") ---for passing headers if necessary (Optional)
   
  ```
   
    .addParams("paramsname","params key") --- for passing the datas in the form of get and post (Optional)
  
  ```
    .setParams(new Hashmap<String,String>) ---if you want to pass whole params once using hashmap (Optional)
```
```
  .setMethodAsPost() -- for making request as Post (Optional)
   
    ```

```
    .setMethodAsGet() -- for making get (Optional) -- By default it is get
   
```
    .setMethod(0) -- for making method 0 for get and 1 for post (Optional)
  ```

```
     .setUrl("https://api.com") -- url that you are sending request to  (compulsary)   /////////////COMPULSARY
```

```
.after(new Action() {        ---for doing things when you get response for server (Compulsary)   /////////////COMPULSARY
                    @Override
                    public void onSuccess(String s) {
                        
                    }

                    @Override
                    public void onError(FaldomError faldomError) {

                    }
                });

```


```
		
	            .setAction(new Action() { --same as the above one (Optional)
                    @Override
                    public void onSuccess(String s) {
                        
                    }

                    @Override
                    public void onError(FaldomError faldomError) {

                    }
                });

            .get()  -- for sending get requests without Defining up (Optional)
            
            .post() -- for sending post requests without defining up (Optional)
            
            .request() -- for sending requst to the server (Compulsary)  /////////////COMPULSARY
            
            
```


# Thanks to

   ### volley libary android (since this library is based on it )
   


  
  

