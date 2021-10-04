import javafx.application.Platform

object Jfx {
  final def jfx(f: => Any): Any = if (!Platform.isFxApplicationThread) Platform.runLater(() => f) else f
}