def call() {
 def gitRepoUrl = 'https://github.com/opstree/spring3hibernate.git'

    
    checkout([$class: 'GitSCM', branches: [[name: '*/java7']], userRemoteConfigs: [[url: gitRepoUrl]]])

