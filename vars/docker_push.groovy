def call (String ImageName, String ImageTag , String DockerUser) {
    withCredentials([usernamePassword(
        credentialsId : "Docker",
        passwordVariable :"DockerHubPass",
        usernameVariable :"DockerUser")]) {
            sh "docker login -u ${DockerUser} -p ${DockerHubPass}" 
        }

    sh "docker push ${DockerUser}/${ImageName}:${ImageTag}"
}
