package id.sch.smktelkom_mlg.privateassignment.xirpl635.tugassaya;

import java.io.Serializable;

/**
 * Created by Moklet on 5/14/2017.
 */

public class News_list implements Serializable {
    private String foto;
    private String judul;
    private String popular;

    public News_list(String image, String judul, String popular) {
        this.foto = image;
        this.judul = judul;
        this.popular = popular;
    }

    public String getImage() {
        return foto;
    }

    public String getJudul() {
        return judul;
    }

    public String getPopular() {
        return popular;
    }

}
