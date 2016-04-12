package org.gradle

import org.gradle.api.Project
import org.gradle.api.Plugin

class TestPlugin implements Plugin<Project> {
    void apply(Project project) {
        project.task('hello')  {
        	description = 'This task says hello'
        	group = 'Test'

        	doLast {
				println 'Hello inside TestPlugin'
        	}
        }

        project.task('goodbye') {
        	description = 'This task says goodbye'
        	group = 'Test'

        	dependsOn(project.tasks.hello)

        	doLast {
        		println 'Goodbye inside TestPlugin'
        	}
        }
    }
}