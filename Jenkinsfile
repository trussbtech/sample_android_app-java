node {
    stage('SCM') {
		echo 'Gathering code from version control'
		git branch: '${branch}', url: 'https://github.com/trussbtech/sample_android_app-java.git'
    }
    stage('Build') {
		echo 'Building....'
		sh 'gradle --version'
		SH 'chmod a+x ./gradlew'
		sh './gradlew clean'
	}	
    stage('Test') {
	echo 'Testing At master branch'
    }
    stage('Deploy') {
        echo 'Deploying....'
    }
}
