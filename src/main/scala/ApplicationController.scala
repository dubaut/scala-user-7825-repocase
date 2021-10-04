import javafx.fxml.FXML
import javafx.scene.layout.VBox
import javafx.stage.Stage

class ApplicationController(primaryStage: Stage) extends WindowController[VBox]("Application.fxml") {
  @FXML private def initialize(): Unit = {
    assert(this.root != null)
  }

  def initializeApplication(): Unit = {
    openWindow()
  }

}