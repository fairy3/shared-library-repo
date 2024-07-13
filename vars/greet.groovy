def call() {
    def user = currentBuild.rawBuild.getCause(hudson.model.Cause$UserIdCause)?.userId
    if (user) {
        echo "Hello, ${user}!"
    } else {
        echo "Hello, World!"
    }
}    