package rmeneghelo.com.br.motionlayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.constraintlayout.motion.widget.MotionLayout
import androidx.constraintlayout.motion.widget.MotionScene
import androidx.core.view.isVisible
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var isFinished: Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        motionLayout.setTransitionListener(object : MotionLayout.TransitionListener {
            override fun allowsTransition(p0: MotionScene.Transition?): Boolean {
                return true
            }

            override fun onTransitionTrigger(p0: MotionLayout?, p1: Int, p2: Boolean, p3: Float) {

            }

            override fun onTransitionStarted(p0: MotionLayout?, p1: Int, p2: Int) {

            }

            override fun onTransitionChange(p0: MotionLayout?, p1: Int, p2: Int, p3: Float) {
                txtPay.alpha = 1 - p3
                if(isFinished) {
                    motionLayout.setTransition(R.id.start, R.id.start)
                    image.setImageResource(R.drawable.ic_airplanemode_inactive_black_24dp)
                    txtPay.isVisible = false
                }
            }

            override fun onTransitionCompleted(p0: MotionLayout?, p1: Int) {
                motionLayout.transitionToStart()
                isFinished = true
            }
        })
    }
}
