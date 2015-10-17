from subprocess import Popen, PIPE, STDOUT

args = ["java","-jar","hello.jar"]
string = "java -jar hello.jar"
#process = Popen(args, shell=True, stdout=PIPE, stderr=PIPE)
#stdout, stderr = process.communicate()
process = Popen(string, shell=True, stdout=PIPE, stderr=PIPE)
stdout, stderr = process.communicate()
