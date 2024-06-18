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
    Given ShutdownTimer 100 seconds

  @RestartTimer
  Scenario: RestartTimer
    Given  RestartTimer 100 seconds

  @ShutdownTimerMinute
  Scenario: ShutdownTimer
    Given ShutdownTimer 100 Minutes

  @RestartTimerMinute
  Scenario: RestartTimer
    Given  RestartTimer 100 Minutes





