def call() {
   
    def command = 'gitleaks detect -v'
    def process = command.execute()
    process.waitForOrKill(10000)
    
   
}
