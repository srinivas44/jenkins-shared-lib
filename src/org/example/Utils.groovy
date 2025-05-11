package org.example

class Utils implements Serializable {
    def steps

    Utils(steps) {
        this.steps = steps
    }

    def shout(String message) {
        steps.echo "📣 ${message.toUpperCase()}"
    }
}