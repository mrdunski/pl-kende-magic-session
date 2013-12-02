package pl.kende.magic.session

class ExampleController {

    def index() {
		render text: "Your session id is: ${request.getHeader('Kende-Session-Id')}"
	}
}
