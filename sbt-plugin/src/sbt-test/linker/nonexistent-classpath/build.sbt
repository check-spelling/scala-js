version := scalaJSVersion
scalaVersion := "2.12.16"

enablePlugins(ScalaJSPlugin)

// Test that nonexistent classpath entries are allowed - #2198
fullClasspath in Compile += baseDirectory.value /
  "nonexistent-directory-please-dont-ever-create-this"

scalaJSUseMainModuleInitializer := true
