package test

class ProjectController {

    ProjectService projectService

    def index() {
        render projectService.someMethod()
    }
}
