package com.typesafe.sbtrc

import xsbti.AppConfiguration
import xsbti.ApplicationID
import java.io.File
import properties.SbtRcProperties._
import scala.util.control.NonFatal

/**
 * A trait which can create the SBT child process
 * arguments.   Note:  Since we need access to the launcher, for
 * distributed SNAP, we make this something that can be passed in and extended
 * so that we can have a stub implementation.
 */
trait SbtProcessLauncher {
  /**
   * Creates a process which can launch sbt.
   *
   * @param cwd
   *     The directory in which to start sbt (a project directory).
   * @param port
   *     The port with which the sbt process should listen for changes.
   */
  def apply(cwd: File, port: Int): ProcessBuilder
}