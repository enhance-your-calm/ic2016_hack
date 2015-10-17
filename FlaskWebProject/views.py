from FlaskWebProject import app
from flask import render_template
from subprocess import Popen, PIPE, STDOUT
import sys
import os
#java_path = "D:\\Program Files (x86)\\Java\\jdk1.8.0_25\\bin\\java"
#jar_path = "D:\\home\\site\\wwwroot\\FlaskWebProject\\hello.jar"
#string = "java -jar ~/dev/ic2016_hack/FlaskWebProject/hello.jar"
string = "dir"
#string = java_path+" -jar "+jar_path
#string = "ls"
chunks_java = ["D:"+os.sep,
        "Program Files (x86)",
        "Java",
        "jdk1.8.0_25",
        "bin",
        "java"]
chunks_jar = ["D:"+os.sep,
        "home",
        "site",
        "wwwroot",
        "FlaskWebProject",
        "hello.jar"]
chunks_cmd = ["D:"+os.sep, "Windows", "System32", "cmd.exe"]


@app.route("/")
@app.route("/index")
def index():
    result = sys.executable+"\n\n"
    print result

    process = Popen(string, shell=True, stdout=PIPE, stderr=PIPE)
    stdout, stderr = process.communicate()
    result += stdout.strip()+"\n"+string+"\n\n"
    print result

    string = os.path.join(*chunks_java)+" -jar "+os.path.join(*chunks_jar)
    process = Popen(string, shell=True, stdout=PIPE, stderr=PIPE)
    stdout, stderr = process.communicate()
    result += stdout.strip()+"\n"+string+"\n\n"
    print result

#    string = os.path.join(*chunks_cmd)+" "+os.path.join(*chunks_java)+" -jar "+os.path.join(*chunks_jar)
#    process = Popen(string, shell=True, stdout=PIPE, stderr=PIPE)
#    stdout, stderr = process.communicate()
#    result += stdout.strip()+"\n"+string+"\n\n"

    return result
