from FlaskWebProject import app
import subprocess
import json
from flask import render_template, jsonify, request
import os


@app.route("/")
@app.route("/index")
def index():
    return render_template("index_tpl.html")

@app.route("/resp")
def resp():
    tag = '"'+request.args.get("tag")+'"'
    start_date = '"'+request.args.get("start_date")+'"'


#    result = tag + "\n"
#    result += start_date + "\n"
#    result += os.getcwd() + "\n"

    jar_path = os.getcwd()+"/FlaskWebProject/parser.jar"
#    result += jar_path + "\n"
    cmd = "java -jar {j} {t} {d}".format(j=jar_path, t=tag, d=start_date)
#    result += cmd + "\n"
    cmd = ["java","-jar",jar_path,tag,start_date]
    #parser_machine = Popen(["java", "-jar", "parse.jar", tag, start_date],            stdout=PIPE, stderr=PIPE, shell=True)
    #parser_machine = Popen(cmd, stdout=PIPE, stderr=PIPE, shell=True)
    #stdout = parser_machine.communicate()[0]
    try:
        stdout = subprocess.check_output(cmd)
        stdout = stdout.decode().strip()
#        result+=stdout
    except subprocess.CalledProcessError:
        result += "ERROR"
        return result
    stdout = json.loads(stdout)
    
    #return "Hello world!"
    items = []
    for item in stdout:
       
        year,mon,day = item["period"].split("-")
        if len(mon)<2:
            mon = "0"+mon
        if len(day)<2:
            day = "0"+day
        items.append([year+"-"+mon+"-"+day,item["scorePos"],"1"])
        items.append([year+"-"+mon+"-"+day,item["scoreNeg"],"2"])
        
    '''
    items = [
        ['2014-06-12', 10, 1],
        ['2014-06-12', -25, 2],
        ['2014-06-13', 30, 1],
        ['2014-06-13', -10, 2],
        ['2014-06-15', 15, 1],
        ['2014-06-15', -15, 2],
        ['2014-06-16', 30, 1]
    ]
    '''
    return render_template(
            "resp_tpl.html",
            cur_tag=tag,
            start_date=start_date.strip('"'),
            end_date='2016-10-17',
            items=items
            )
