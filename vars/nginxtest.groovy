#!groovy
def calll(String name = 'world') {
    echo "Hello there, ${name}!"
}

def call() {
    stage('Install Dependencies') {
        sh 'sudo apt-get update'
        sh 'sudo apt-get install -y nginx'
        sh 'sudo apt-get install -y curl'
    }

    stage('Check Installation') {
        sh 'curl http://localhost:80'
    }
}
