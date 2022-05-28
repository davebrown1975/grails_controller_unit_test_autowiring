package test

import grails.testing.gorm.DataTest
import grails.testing.web.controllers.ControllerUnitTest
import spock.lang.Specification

class ProjectControllerSpec extends Specification implements ControllerUnitTest<ProjectController>, DataTest {

    class MockProjectService extends ProjectService {
        @Override
        def someMethod() {
            return 999
        }
    }

    MockProjectService mockProjectService

    def setup() {
        mockProjectService =  new MockProjectService()
        controller.projectService = mockProjectService
    }

    def cleanup() {
    }

    void "test injected service is called"() {
        when:
            controller.index()
        then:"should be overridden value and not original value of 100"
            response.contentAsString == "999"
    }
}
