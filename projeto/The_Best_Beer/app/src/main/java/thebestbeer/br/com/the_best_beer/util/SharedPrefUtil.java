package thebestbeer.br.com.the_best_beer.util;

import android.content.Context;
import android.content.SharedPreferences;

public class SharedPrefUtil {
    private static final String ARQUIVO = "thebestbeer_files";

    private SharedPrefUtil() {
        //vazio
    }

    public static void setEfetuouLogin(Context context, boolean login) {
        SharedPreferences.Editor editor =
                context.getSharedPreferences(ARQUIVO, Context.MODE_PRIVATE).edit();
        editor.putBoolean("login", login);
        editor.apply();
    }

    public  static boolean getEfetuouLogin(Context context) {
        SharedPreferences preferences =
                context.getSharedPreferences(ARQUIVO, Context.MODE_PRIVATE);
        return preferences.getBoolean("login", false);
    }
}
