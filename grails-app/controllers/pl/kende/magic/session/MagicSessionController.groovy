package pl.kende.magic.session

import javax.servlet.http.HttpServletResponse;

class MagicSessionController {

	def sessionManagerService

	def index() {
		render view: 'site'
	}

	def session() {
		def oldSessionId = request.getHeader('If-None-Match')
		def newSessionId = sessionManagerService.registerOldSession(oldSessionId)
		if (oldSessionId == newSessionId) {
			render status: HttpServletResponse.SC_NOT_MODIFIED
		} else {
			render text: "\$.ajaxSetup({headers:{\"Kende-Session-Id\": \"${newSessionId}\"}})", contentType: "application/javascript"
		}
	}
}
