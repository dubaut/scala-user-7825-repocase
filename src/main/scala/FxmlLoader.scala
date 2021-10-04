import javafx.fxml.FXMLLoader
import javafx.scene.Node

object FxmlLoader {
  def apply[A <: Node](name: String, controller: Option[AnyRef] = None)
                      (implicit `class`: Class[_]): A = {
    require(!name.isBlank)

    val resource = `class`.getResource(name)

    val loader = new FXMLLoader(resource)
    controller.foreach(loader.setController)

    loader.load()
  }
}