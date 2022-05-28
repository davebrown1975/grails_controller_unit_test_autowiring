package test

import grails.gorm.transactions.Transactional

@Transactional
class ProjectService {

    def someMethod() {
        return 100
    }
}
