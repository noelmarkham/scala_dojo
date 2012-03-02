package dojo

class MailBox {

  def handleMsg(msg: PingPongMessage) = msg match{
    case Ping => Pong
    case Pong => Ping
    case _ => None
  }

  def receive(msg: Any) = msg match {
    case "stop" => "stopped"
    case ("echo", value) => value
    case pp: PingPongMessage => handleMsg(pp  )
  }

}
