package br.com.menuruenf.menuruenf.adapter;

import java.util.ArrayList;
import java.util.List;

import br.com.menuruenf.menuruenf.R;

/**
 * Created by Rodolfo on 31/08/2015.
 */
public class NavDrawerMenuItem {
    //Título R.string.xxx
    public int title;
    //Figura: R.drawable.xxx
    public int img;
    // Para colocar um fundo cinza quando a linha está selecionada
    public boolean selected;
    public NavDrawerMenuItem(int title, int img){
        this.title = title;
        this.img   = img;
    }

    //Cria a lista com os itemns de menu
    public static List<NavDrawerMenuItem> getList(){
        List<NavDrawerMenuItem> list = new ArrayList<NavDrawerMenuItem>();
        list.add(new NavDrawerMenuItem(R.string.menu_info, R.drawable.ic_drawer_info));
        list.add(new NavDrawerMenuItem(R.string.menu_lunch, R.drawable.ic_drawer_hour));
        list.add(new NavDrawerMenuItem(R.string.menu_dinner, R.drawable.ic_drawer_hour));
        list.add(new NavDrawerMenuItem(R.string.menu_about, R.drawable.ic_drawer_about));
        return list;
    }
}