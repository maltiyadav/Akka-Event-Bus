import akka.actor.Props
import akka.actor.ActorSystem

object LookUpBusApp extends  App{
  val system = ActorSystem("mySystem")
  val subscriberActor = system.actorOf(Props[SubscriberActor], "subscriberActor")

  val lookUpBusEvent = new LookUpBusImp
  lookUpBusEvent.subscribe(subscriberActor, "colors")
  lookUpBusEvent.publish(MessageEvent("colors", "Greetings"))

}
