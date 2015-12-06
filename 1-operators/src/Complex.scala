/**
  * Created by kamil on 06.12.15.
  */
case class Complex(val re: Double, val im: Double) {

  def +(other: Complex): Complex = new Complex(this.re + other.re, this.im + other.im)

}
