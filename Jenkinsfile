node {
    stage("checkout") {
        checkout([$class: 'GitSCM', branches: [[name: '*/master']], extensions: [], userRemoteConfigs: [[credentialsId: 'f18c2441-372d-4fb4-bcd3-56b3d0b1237a', url: 'https://github.com/mahdchek/jenkins-demo']]])
    }


    stage("build") {
        sh 'chmod 777 mvnw'
        sh './mvnw clean compile'
    }

    stage("unit test"){
        sh "./mvnw test"
    }

    stage("sonarqube"){
        sh "./mvnw sonar:sonar " +
                "  -Dsonar.projectKey=moh-demo " +
                "  -Dsonar.host.url=http://192.168.1.12:9001 " +
                "  -Dsonar.login=5f7149bd6d21223164a944b0b2101904d15ab384"
    }

}
