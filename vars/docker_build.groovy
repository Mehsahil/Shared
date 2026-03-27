def call (String ImageName, String ImageTag , String DockerUser) {
    sh "docker build -t ${DockerUser}/${ImageName}:${ImageTag}"
}
