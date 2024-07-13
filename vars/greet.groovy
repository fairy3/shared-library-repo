def call() {
   def userFullName = org.UserUtils.getBuildUserName(this)
   if (userFullName) {
        echo "Hello, ${userFullName}"
   } else {
         echo "Hello from Pipeline!"
   }
}