node{
  stage ('Scm Checkout'){
    
   git 'https://github.com/angjelo/JenkinsCIBlog'
  }
  stage('Compile-Package'){
    sh 'mvn package'
  }
}
