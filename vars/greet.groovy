def call() {
   def userFullName = org.UserUtils.getBuildUserFullName(this)
   if (userFullName) {
        echo "Hello, ${userFullName}"
   } else {
         echo "Hello from Pipeline!"
   }
}