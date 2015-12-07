import java.util.Date

import scala.actors.Actor

/**
  * Created by kamil on 07.12.15.
  */

abstract class AuctionMessage

case class Offer(bid: Int, client: Actor) extends AuctionMessage

case class Inquire(client: Actor) extends AuctionMessage


abstract class AuctionReply

case class Status(asked: Int, expire: Date) extends AuctionReply

case object BestOffer extends AuctionReply

case class BeatenOffer(maxBid: Int) extends AuctionReply

case class AuctionConcluded(seller: Actor, client: Actor) extends AuctionReply

case object AuctionFailed extends AuctionReply

case object AuctionOver extends AuctionReply