def call(String credentialsId, String nexusProtocol, String nexusUrl, String nexusRepo) {
   withCredentials([usernamePassword(credentialsId: credentialsId, usernameVariable: 'NEXUS_USERNAME', passwordVariable: 'NEXUS_PASSWORD')]) {
        echo "Logging in to Nexus as ${NEXUS_USERNAME}"
        sh "docker login -u ${NEXUS_USERNAME} -p ${NEXUS_PASSWORD} ${nexusProtocol}://${nexusUrl}/repository/${nexusRepo}"
   }
}

