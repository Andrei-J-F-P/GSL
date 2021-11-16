def call() {
  sh 'mvn -v'
  sh 'hostname'
  sh 'cat Persistent_File'
  sh 'pwd'
}
