def call() {
  sh 'sudo apt-get update'
  sh 'sudo apt-get install -y nginx'
}
