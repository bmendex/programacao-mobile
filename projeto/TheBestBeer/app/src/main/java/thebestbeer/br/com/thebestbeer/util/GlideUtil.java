package thebestbeer.br.com.thebestbeer.util;

import android.content.Context;
import android.databinding.BindingAdapter;
import android.net.Uri;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;

import thebestbeer.br.com.thebestbeer.R;

public class GlideUtil {

    private GlideUtil() {
        // vazio
    }

    @BindingAdapter("imageUrl")
    public static void setImageUrl(ImageView imageView, String url){
        Context context = imageView.getContext();
        Glide.with(context).load(url).into(imageView);
    }

    public static void load(String url, ImageView view) {
        Glide.with(view.getContext())
                .load(url)
                .centerCrop()
//                .placeholder(R.drawable.ic_user_placeholder)
//                .error(R.drawable.ic_user_placeholder)
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .into(view);
    }

    public static void load(Uri url, ImageView view) {
        Glide.with(view.getContext())
                .load(url)
                .centerCrop()
                //.fitCenter()
//                .placeholder(R.drawable.ic_user_placeholder)
//                .error(R.drawable.ic_user_placeholder)
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .into(view);
    }


}
