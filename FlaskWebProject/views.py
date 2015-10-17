from FlaskWebProject import app
from flask import render_template
from subprocess import Popen, PIPE, STDOUT
#java_path = "D:\\Program Files (x86)\\Java\\jdk1.8.0_25\\bin\\java"
#jar_path = "D:\\home\\site\\wwwroot\\FlaskWebProject\\hello.jar"
#string = "java -jar ~/dev/ic2016_hack/FlaskWebProject/hello.jar"
string = "dir"
#string = java_path+" -jar "+jar_path
#string = "ls"


@app.route("/")
@app.route("/index")
def index():
    process = Popen(string, shell=True, stdout=PIPE, stderr=PIPE)
    stdout, stderr = process.communicate()
    return stdout.strip()
    #print stdout
    #return stdout
