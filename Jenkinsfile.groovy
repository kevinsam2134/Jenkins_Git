pipeline {
    agent any
    environment{
        STAGING_SERVER = "AWS EC2"
        PRODUCTION_SERVER = "Google Computer Engine"
    }
    stages {
        stage("Build") {
            steps {
                echo '''This is the Building Stage, it Build the code by compiling and packaging it using a build automation tool. 
                An example of a tool for this stage would be: Apache Ant'''
            }
        }
        stage("Unit and Integration Tests") {
            steps {
                echo "This is the Unit and Integration Testing Stage,it carries out unit tests to make sure the code performs as intended and runs integration tests to make sure the application's various parts interact as intended."
                echo "An example of a Unit Test tool for this stage would be: JUnit "
                echo "An example of a Integration Test tool for this stage would be: Tessy "
            }
        }
        stage("Code Analysis Check") {
            steps {
                echo "This is the Code Quality Check Stage, it applies a code analysis tool to check the code for compliance with industry standards."
                echo "An example of a Code Analysis Tool for this stage would be: Checkstyle"
                
            }
        }
        stage("Security Scan") {
            steps {
                echo "This is the Security Scan Stage, use a programme to do a security scan on the code to find weaknesses."
                echo "An example of a Security Scan Tool for this stage would be: Probely Security Scanner"
            }
        }
        stage("Deploy to Staging") {
            steps {
                echo "This is the Deploying Stage, upload the programme to a staging server: $STAGING_SERVER  "
                
            }
        }
         stage("Integration Tests on Staging") {
            steps {
                echo "This is the Integration Test in the Stagine Environment, It performs integration tests on the staging environment to make that the application performs as intended in a setting similar to production."
            
            }
        }
        stage("Deploy to Production") {
        steps {
            echo "This is the Deploy to Production Stage, upload the programme to a staging server: $PRODUCTION_SERVER"
        }
    }
}
}