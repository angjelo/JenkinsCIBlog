node{
  stage ('scm checkout'){
   git 'https://github.com/angjelo/JenkinsCIBlog'
  }
  stage('Compile-Package'){
    sh 'mvn package'
  }
}
