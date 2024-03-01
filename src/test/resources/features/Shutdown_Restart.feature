@Shutdown_Restart
Feature: Mac Control with Timer
  @Shutdown
  Scenario: Shutdown
    Given Shutdown

  @Restart
  Scenario: Restart
    Given  Restart

  @ShutdownTimer
  Scenario: ShutdownTimer
    Given ShutdownTimer 10 seconds

  @RestartTimer
  Scenario: RestartTimer
    Given  RestartTimer 100 seconds






