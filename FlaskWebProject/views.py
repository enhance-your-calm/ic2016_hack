from FlaskWebProject import app
from subprocess import Popen, PIPE, STDOUT
from flask import render_template, jsonify, request


@app.route("/")
@app.route("/index")
def index():
    return render_template("index_tpl.html")

@app.route("/resp")
def resp():
    tag = request.args.get("tag")
    start_date = request.args.get("start_date")
    result = tag + "\n"
    result += start_date + "\n"

    parser_machine = Popen(["java", "-jar", "parse.jar", tag, start_date],
            stdout=PIPE, stderr=PIPE, shell=True)
    stdout = parser_machine.communicate()[0]
    stdout = stdout.decode().strip()
    result+=stdout
    return result
    
    #return "Hello world!"
    items = [
        ['2014-06-12', 10, 1],
        ['2014-06-12', -25, 2],
        ['2014-06-13', 30, 1],
        ['2014-06-13', -10, 2],
        ['2014-06-15', 15, 1],
        ['2014-06-15', -15, 2],
        ['2014-06-16', 30, 1]
    ]
    return render_template(
            "resp_tpl.html",
            cur_tag="ИГИЛ",
            start_date='2014-06-10',
            end_date='2014-06-18',
            items=items
            )
