def call(String repoUrl, String branch = 'main') {
    def repoDir = "${env.WORKSPACE}/my_repo"
    deleteDir()
    checkout([$class: 'GitSCM', branches: [[name: "*/${branch}"]], userRemoteConfigs: [[url: repoUrl, credentialsId: 'your_git_credentials']]])
    return repoDir
}

