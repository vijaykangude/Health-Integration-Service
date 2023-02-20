# Health Integration Service

## Description:
 REST API's for Health Integration

## Commands To RUN Docker image locally
1. Build docker image with help of Dockerfile by using this command...
docker build -t tag_name.
2. Now run the docker image with this command...
docker run --name container_name -d -p 8080:8080 tag_name/id

### Endpoints:
localhost:8080/get: returns hello world