# Health Integration Service

## Description:
 REST API's for Health Integration

## Commands To Build and Run Docker image locally
1. Build docker image with help of Dockerfile by using this command...
```
docker build -t healthintegrationservice .
```

2. Now run the docker image with this command.

```
docker run --name container_name -d -p 8080:8080 healthintegrationservice .
```


### Endpoints:
1. localhost:8080: returns welcome to spring boot app
2. localhost:8080/get: returns hello world
3. localhost:8080/swagger-ui: returns ui page for all controller