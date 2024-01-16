def call() {
   
    def command = 'gitleaks detect -v'
    def process = command.execute()
    process.waitForOrKill(10000)
    
    if (process.exitValue() == 0) {
        echo 'No sensitive information found.'
    } else {
        error 'Sensitive information found. Please review and address the issues.'
    }
}
