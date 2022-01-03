stage("checkout"){
    checkout([$class: 'GitSCM', branches: [[name: '*/master']], extensions: [], userRemoteConfigs: [[credentialsId: 'f18c2441-372d-4fb4-bcd3-56b3d0b1237a', url: 'https://github.com/mahdchek/jenkins-demo']]])
}

stage("build"){
    sh './mvnw clean compile'
}
