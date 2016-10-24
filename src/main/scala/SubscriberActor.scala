import akka.actor.Actor

class SubscriberActor extends Actor {
  override def receive: Receive = {
    case messageEvent: MessageEvent =>
      println("Channel name is >>>>>>" + messageEvent.channel)
  }
}
