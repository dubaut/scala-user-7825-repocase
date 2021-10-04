import javafx.application.Application
import javafx.stage.Stage

final class Main extends Application {
  private var applicationController: ApplicationController = _

  override def start(primaryStage: Stage): Unit = {
    applicationController = new ApplicationController(primaryStage)
    applicationController.initializeApplication()
  }
}

object Main {
  def main(args: Array[String]): Unit = Application.launch(classOf[Main], args: _*)
}
