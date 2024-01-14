def call(String repoUrl, String branch = 'master') {
    def repoDir = "${WORKSPACE}/my_repo"
    deleteDir()
    checkout([$class: 'GitSCM', branches: [[name: "*/${branch}"]], userRemoteConfigs: [[url: repoUrl, credentialsId: 'your_git_credentials']]])
    return repoDir
}

