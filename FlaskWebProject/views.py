from FlaskWebProject import app
from flask import render_template
from subprocess import Popen, PIPE, STDOUT
#string = "java -jar FlaskWebProject\hello.jar"
string = "pwd"

@app.route("/")
@app.route("/index")
def index():
    process = Popen(string, shell=True, stdout=PIPE, stderr=PIPE)
    stdout, stderr = process.communicate()
    return stdout.strip()
    print stdout
    #return stdout
