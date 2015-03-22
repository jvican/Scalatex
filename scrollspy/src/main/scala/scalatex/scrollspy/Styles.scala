package scalatex.scrollspy

import org.scalajs.dom
import org.scalajs.dom.css

import scalatags.JsDom.all._
import scalatags.JsDom.tags2
import scalatags.jsdom.AutoStyleSheet
import scalatags.stylesheet.{Sheet, StyleSheet}

object Styles extends Sheet[Styles]
trait Styles extends StyleSheet{
  def menuItem = cls(
    &hover(
      opacity := 0.9
    ),
    &active(
      opacity := 0.7
    ),
    display.block,
    textDecoration.none,
    paddingLeft := 15,
    height := 44,
    lineHeight := "44px",
    borderBottom := "1px solid #444"
  )
  def menuList = cls(
    paddingLeft := "15px",
    margin := 0,
    overflow.hidden,
    position.relative,
    display.block,
    left := 0,
    top := 0,
    "transition".style := "maxHeight 0.2s ease-out"
  )

  def selected = cls(
    backgroundColor := "#1f8dd6",
    color := "white"
  )

  def closed = cls(color := "#999")

  def pathed = cls(borderLeft := "2px solid white")

}