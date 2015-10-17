from FlaskWebProject import app
from flask import render_template

@app.route("/")
@app.route("/index")
def index():
    #return "Hello world!"
    return render_template(
            "index.html"
            )
