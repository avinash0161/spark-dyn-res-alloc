- Release 1: Initial sbt hello-world project was built following the steps at https://medium.com/@pedrodc/setting-up-a-spark-machine-learning-project-with-scala-sbt-and-mllib-831c329907ea

        - To run sbt hello world: in the terminal go to project folder, type sbt and then type run 

- Release 2: Spark hello world program was built by following steps from https://github.com/zouzias/spark-hello-world 
        
        - To run spark hello world in local mode
              * First do sbt-package
              * Then, ./spark-submit --master local[1] spark-dyn-res-alloc/target/scala-2.12/spark-dyn-res-alloc_2.12-0.1.0-SNAPSHOT.jar
                   **spark-submit** will be found in apache spark's bin folder
                   
                   
 - Release 3: Dynamic resource allocation on Spark standalone cluster on local machine
 
        - sbt-package
        - Then, start Spark server
            * ./sbin/start-master.sh
            * ./sbin/start-slave.sh <master URL gotten from http:localhost:8080>
            * ./sbin/start-shuffle-service.sh
            * ./spark-submit --master <master URL> spark-dyn-res-alloc/target/scala-2.11/spark-dyn-res-alloc_2.11-0.1.0-SNAPSHOT.jar
            
            
  