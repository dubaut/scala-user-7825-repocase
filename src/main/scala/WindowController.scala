import Jfx.jfx
import javafx.scene.Parent
import javafx.stage.Stage

abstract class WindowController[A <: Parent](viewName: String, protected val stage: Stage = new Stage()) extends ViewController[A](viewName) {


  def openWindow(): Unit = {

    jfx {
      stage.show()
      stage.toFront()
    }
  }
}