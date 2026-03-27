def call (String ImageName, String ImageTag , String DockerUser) {
    withCredentials([usernamePassword(
        credentialsId : "Docker",
        passwordVariable :"DockerPass",
        usernameVariable :"DockerUser")]) {
            sh "docker login -u ${DockerUser} -p ${DockerPass}" 
        }

    sh "docker push ${DockerUser}/${ImageName}:${ImageTag}"
}
