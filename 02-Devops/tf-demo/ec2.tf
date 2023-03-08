resource "aws_instance" "foo" {
  count         = 2
  ami           = "ami-006dcf34c09e50022" # us-east-1
  instance_type = "t2.micro"

  credit_specification {
    cpu_credits = "unlimited"
  }
}
