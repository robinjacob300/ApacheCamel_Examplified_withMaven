#### SPring BOOt APAche CAmel Examplified

camel version 4.*.*

APIs that can be tested in PostMan (Just paste the url )

POST
localhost:8080/enos/say/bye

GET
localhost:8080/enos/echo/hello

GET
localhost:8080/enos/echo/hello

GET
localhost:8080/restos

GET
localhost:8082/restos

GET
localhost:8081/enos/echo/hello


Multiple ports are opened through tomcat.

This project has currently spring boot controller and 
apache camel rest dsl endpoints.

To differentiate between spring boot rest endpoints and camel endpoints
apache camel uses

camel.servlet.mapping.context-path

property. the current value provided in this project is /enos/*


