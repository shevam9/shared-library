def call(String repoUrl, String branch = 'master') {
    def repoDir = checkoutRepo(repoUrl, branch)
    return repoDir
}

def checkoutRepo(String repoUrl, String branch) {
    node {
        def repoDir = "${env.WORKSPACE}/my_repo"
        checkDir()
        checkout([$class: 'GitSCM', branches: [[name: "*/${branch}"]], userRemoteConfigs: [[url: repoUrl, credentialsId: 'your_git_credentials']]])
        return repoDir
    }
}

