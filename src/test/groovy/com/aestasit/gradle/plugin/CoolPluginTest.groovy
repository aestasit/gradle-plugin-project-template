package com.aestasit.gradle.plugin

import org.gradle.api.Project
import org.gradle.testfixtures.ProjectBuilder
import org.junit.BeforeClass
import org.junit.Test

/**
 * 
 * Test for cool plugin.
 * 
 * @author Aestas/IT
 *
 */
class SlideryTest {

  static Project project

  @BeforeClass
  def static void buildProject() {
    project = ProjectBuilder.builder().build()
    project.with {
      apply plugin: 'cool'
    }
  }

  @Test
  public void testSetup() {
    assert project != null
  }
  
}
