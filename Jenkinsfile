node{
  stage ('Scm Checkout'){
    def mvnHome = tool name:'maven-3', type:'maven'
   git 'https://github.com/angjelo/JenkinsCIBlog'
  }
  stage('Compile-Package'){
    sh 'mvn package'
  }
}
