/*
 * This Groovy source file was generated by the Gradle 'init' task.
 */
package cn.coderpig.plugins

import org.gradle.testfixtures.ProjectBuilder
import org.gradle.api.Project
import spock.lang.Specification

/**
 * A simple unit test for the 'cn.coderpig.plugins.greeting' plugin.
 */
public class CpPluginPluginTest extends Specification {
    def "plugin registers task"() {
        given:
        def project = ProjectBuilder.builder().build()

        when:
        project.plugins.apply("cn.coderpig.plugins.greeting")

        then:
        project.tasks.findByName("greeting") != null
    }
}
