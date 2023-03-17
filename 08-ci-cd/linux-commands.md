# Linux Commands

```bash
cat `filename` # To see the contents of a file
ls # Display the items in a folder/directory
ls -lrth # Displays all items, sorted recent most on top, with sizes showing
ls -a # Displays the hidden files as well
cd `directory-name` # Change directory
cd .. # One level up
cd # Take me to $HOME directory
echo "<message>" # Prints the message within quotes
echo $? # Prints the exit code of previous command
touch `filename` # Creates an empty file
mkdir `directory-name` # Creates a new directory
rmdir `directory-name` # Removes a directory
rm -rf `directory-name` # Removes a non-empty directory
pwd # Which directory you are currently in
```

## Docker commands

```bash
docker run `image-name` [`command`] # To start a container; -it = interactive + teletype; --rm = Remove when stopped; -d = run in the background
docker ps # To display running containers; -a = shows all including stopped containers
docker rm # To remove a stopped container

docker images # To display all the images in local cache
docker rmi # To remove a image

docker commit `container-id` `image-name` # To create a image from a docker container
docker build -t `image-name` . # To build a docker image from the `Dockerfile` in the current director

docker logs -f `container-id` # Get logs from the container running in background.
```

## Others

1. Redirection Operator (`>`)

Take the stdout previous command and stick it in a file

Eg: `echo "hello" > hello.txt`

2. Exit Code

```
If your exit code is non-zero -> process had failed
If your exit code is zero -> process was successful
```

---

## Scenarios

1. imagine your on your computer and you made a folder called `2019pics` and you put in a bunch of pictures in it and you double click it to see all the things in that folder

```bash
mkdir 2019pics
cd 2019pics
ls

(or)

mkdir 2019pics
ls 2019pics
```
