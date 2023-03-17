# FROM alpine
FROM golang
WORKDIR /app
COPY main.go ./
# Install the go compiler here!
RUN go build main.go
CMD [ "/app/main" ]
