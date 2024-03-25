package id.stefanusdany.image_preview

import android.view.View
import android.widget.ImageView
import com.bumptech.glide.Glide


/**
 * @author Stefanus Dany (stefanus.dany@dana.id)
 * @version ImagePreviewHelper, v 0.1 25/03/24 11.14 by Stefanus Dany
 */
object ImagePreviewHelper {

    fun ImageView.loadAvatar(itemView: View, avatarUrl: String?) {
        Glide.with(itemView)
            .load(avatarUrl)
            .placeholder(android.R.drawable.ic_menu_report_image)
            .into(this)
    }

}