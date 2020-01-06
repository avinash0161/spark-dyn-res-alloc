- Initial sbt hello-world project was built following the steps at https://medium.com/@pedrodc/setting-up-a-spark-machine-learning-project-with-scala-sbt-and-mllib-831c329907ea

        - To run sbt hello world: in the terminal go to project folder, type sbt and then type run 

- Spark hello world program was built by following steps from https://github.com/zouzias/spark-hello-world 
        
        - To run spark hello world in local mode
              * First do sbt-package
              * Then, ./spark-submit --master local[1] spark-dyn-res-alloc/target/scala-2.12/spark-dyn-res-alloc_2.12-0.1.0-SNAPSHOT.jar
                   **spark-submit** will be found in apache spark's bin folder