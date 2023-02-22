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
localhost:8080/get: returns hello world