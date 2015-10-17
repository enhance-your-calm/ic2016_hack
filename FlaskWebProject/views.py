from FlaskWebProject import app
from flask import render_template

@app.route("/")
@app.route("/index")
def index():
    from FlaskWebProject import test


    #return "Hello world!"
    return render_template(
            "index.html",
            test_line = test.stdout
            )
