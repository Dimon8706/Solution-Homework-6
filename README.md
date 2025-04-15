Behavioral Design Patterns: Tech Support Request Handler & Smart Home Remote Control
Part 1: Tech Support Request Handler (Chain of Responsibility)
In this part of the project, the Chain of Responsibility pattern is implemented to handle requests in a tech support system. Each request passes through a chain of handlers, where each handler decides whether it can handle the request or pass it to the next one.

How it works:
FAQBotHandler handles simple issues like "password_reset".

JuniorSupportHandler handles issues such as "refund_request" and "billing_issue".

SeniorSupportHandler handles more complex issues like "account_ban" and "data_loss".

Requests are passed through the chain until one of the handlers can handle them or escalate the request.

File Structure:
SupportHandler.java — abstract class for handling requests.

FAQBotHandler.java, JuniorSupportHandler.java, SeniorSupportHandler.java — concrete handlers for different types of issues.

TechSupportChain.java — test class to check the chain of responsibility.

Part 2: Smart Home Remote Control (Command Pattern)
In this part of the project, the Command pattern is used to control smart home devices. Each action (e.g., turning on the light or setting the temperature) is represented as a command object.

How it works:
Each command (such as TurnOnLightCommand or SetThermostatCommand) performs an action on a corresponding device (e.g., light or thermostat).

SmartHomeRemoteControl is the class that manages executing commands through the remote control.

File Structure:
Command.java — interface for commands.

Light.java, Thermostat.java — classes for managing devices.

TurnOnLightCommand.java, SetThermostatCommand.java — concrete commands to control devices.

SmartHomeRemoteControl.java — the remote control class to execute commands.
