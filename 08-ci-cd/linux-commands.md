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
pwd # Which directory you are currently in
```

## Others

1. Redirection Operator (`>`)

Take the stdout previous command and stick it in a file

Eg: `echo "hello" > hello.txt`

2. Exit Code

> If your exit code is non-zero -> process had failed
> If your exit code is zero -> process was successful

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
