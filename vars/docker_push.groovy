def call (String ImageName, String ImageTag , String DockerUser) {
    withCredentials([usernamePassword(
        credentialId: "Docker",
        variablePassword :"DockerPass",
        variableUsername:"DockerUser")]) {
            sh "docker login -u ${DockerUser} -p ${DockerPass}" 
        }

    sh "docker push ${DockerUser}/${ImageName}:${ImageTag}"
}
