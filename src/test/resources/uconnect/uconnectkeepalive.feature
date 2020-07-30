

Feature: Uconnect Keep Alive Message.  KeepAliveMessage provides a lightweight alternative to the base MQTT keep alive provided in the client library.  The message will be used in the scenario where the client manages the keep alive instead of letting the MQTT client manage the keep alive.
Scenario: I am using application level Keep Alive Messages instead of native mqtt in a region outside of China

#Clients must publish a keep alive message to stay on the network
    Given A Properly formed KeepAlive Message has Uconnect Header content and a timestamp in the keepAlive Message