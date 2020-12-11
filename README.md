"# UtilsMaster" 

Step - 1 

Build.gradle (Project:Module)
  allprojects {
    repositories {
        google()
        jcenter()
       maven { url 'https://jitpack.io' }
        maven { url "https://maven.google.com" }
     }
  }

Step-2

Build.gradle (Module)

 implementation 'com.github.Kishan7up:UtilsMaster:1.0.1'

Step - 3
 
  MainActivity,class
  {
     //Uses For Show Log Msg
    1. Logcat-> type "dhruveni-Log"
    2. DMLog.DmLogMsg("Helllo This Is Kishan Lib");
     
    //Uses For Show Toast Msg   
   1 . DMLog.ShowToast(getApplicationContext(),"Helllo There");
    
  }

