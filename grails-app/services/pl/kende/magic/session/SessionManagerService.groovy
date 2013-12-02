package pl.kende.magic.session

import grails.transaction.Transactional

@Transactional
class SessionManagerService {

	/**
	 * @param oldSessionId session remembered by client
	 * @return new session id (if changed) or old one
	 */
    String registerOldSession(String oldSessionId) {
		if (oldSessionId) {
			return oldSessionId
		}
		return generateNewSessionId()
    }

	private generateNewSessionId() {
		return UUID.randomUUID().toString()
	}
}
