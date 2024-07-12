def call(String nexusUser, String nexusPassword, String nexusProtocol, String nexusUrl, String nexusRepo) {
    sh '''
        docker login -u ${nexusUser} -p ${nexusPassword} ${nexusProtocol}://${nexusUrl}/repository/${nexusRepo}"
    '''
}
