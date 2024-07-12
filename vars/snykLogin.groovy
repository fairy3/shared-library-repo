def call(String snykToken) {
    sh "snyk auth ${snykToken}"
}
