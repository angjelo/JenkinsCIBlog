node{
  stage ('Scm Checkout'){
    def props = readJSON text: '{ "key": "value" }'
   git 'https://github.com/angjelo/JenkinsCIBlog'
  }
  stage('Compile-Package'){
    sh 'mvn package'
  }
}
