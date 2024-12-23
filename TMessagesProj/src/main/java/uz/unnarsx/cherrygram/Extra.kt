package uz.unnarsx.cherrygram

import android.app.Activity
import org.telegram.ui.ActionBar.BaseFragment

object Extra {
    // https://core.telegram.org/api/obtaining_api_id
    const val APP_ID = 19560145
    const val APP_HASH = "5a971651c567a0af91ba8fb1b51f617d"

    // https://developers.google.com/identity/sms-retriever/verify#computing_your_apps_hash_string
    const val SMS_HASH = "Dd66ek0Lb27"

    const val ENDPOINT_FOR_DATE = ""
    const val ENDPOINT_FOR_DATE_SECRET = ""

    fun getRegistrationDate(fragment: BaseFragment, parentActivity: Activity, userId: Long) {

    }

    fun addBirthdayToCalendar(parentActivity: Activity, userId: Long) {

    }

}
