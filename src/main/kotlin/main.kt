import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import de.mpmediasoft.polyspiral.gui.PolySpiralApp

@Composable
@Preview
fun App() {
    MaterialTheme {
        PolySpiralApp()
    }
}

fun main() = application {
    Window(title = "PolySpiralDesktop 1.0", onCloseRequest = ::exitApplication) {
        App()
    }
}
