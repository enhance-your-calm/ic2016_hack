from FlaskWebProject import app
from flask import render_template


@app.route("/")
@app.route("/index")
def index():
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
