import javafx.scene.Parent

abstract class ViewController[A <: Parent](private val viewName: String) {
  require(!viewName.isBlank)

  val root: A = FxmlLoader[A](viewName, Some(this))(getClass)
}
