import akka.event.{ActorEventBus, LookupClassification}

class LookUpBusImp extends ActorEventBus with LookupClassification{

  type Event = MessageEvent

  type Classifier = String

  def mapSize() = 2

  def classify(event: Event): Classifier = event.channel

  def publish(event: Event, subscriber: Subscriber): Unit = subscriber ! event

}
