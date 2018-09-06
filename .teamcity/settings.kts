import jetbrains.buildServer.configs.kotlin.v2018_1.*
import jetbrains.buildServer.configs.kotlin.v2018_1.buildSteps.script
 
version = "2018.1"
 
project {
  buildType {
    id("HelloWorld")
    name = "Hello world"
    steps {
        script {
            scriptContent = "echo 'Hello world!'"
        }
    }
  }
}
