def call (String ImageName, String ImageTag , String DockerUser) {
    withCredentials([usernamePassword(
        credentialsId : "Docker",
        passwordVariable :"DockerHubPass",
        usernameVariable :"DockerHubUser")]) {
            sh "docker login -u ${DockerUser} -p ${DockerPass}" 
        }

    sh "docker push ${DockerUser}/${ImageName}:${ImageTag}"
}
