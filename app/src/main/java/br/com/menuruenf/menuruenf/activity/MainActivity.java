package br.com.menuruenf.menuruenf.activity;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.widget.DrawerLayout;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;

import java.util.List;

import br.com.menuruenf.menuruenf.R;
import br.com.menuruenf.menuruenf.adapter.NavDrawerMenuAdapter;
import br.com.menuruenf.menuruenf.adapter.NavDrawerMenuItem;
import br.com.menuruenf.menuruenf.fragments.AboutFragment;
import br.com.menuruenf.menuruenf.fragments.DinnerFragment;
import br.com.menuruenf.menuruenf.fragments.InformationFragment;
import br.com.menuruenf.menuruenf.fragments.LunchFragment;
import livroandroid.lib.fragment.NavigationDrawerFragment;

/**
 * Created by Rodolfo on 31/08/2015.
 */
public class MainActivity extends BaseActivity implements NavigationDrawerFragment.NavigationDrawerCallbacks {

    private NavigationDrawerFragment mNavDrawerFragment;
    private NavDrawerMenuAdapter listAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setUpToolbar();

        //Nav Drawer
        mNavDrawerFragment = (NavigationDrawerFragment) getSupportFragmentManager().findFragmentById(R.id.nav_drawer_fragment);
        //Configura o drawer layout
        DrawerLayout drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        mNavDrawerFragment.setUp(drawerLayout);

        //Cor do fundo da barra de status
        drawerLayout.setStatusBarBackground(R.color.primary_dark);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_welcome, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();



        return super.onOptionsItemSelected(item);
    }

    @Override
    public NavigationDrawerFragment.NavDrawerListView
    getNavDrawerView(NavigationDrawerFragment navigationDrawerFragment, LayoutInflater layoutInflater, ViewGroup container){
        //Retorna a View e o Identificador
        View view = layoutInflater.inflate(R.layout.nav_drawer_listview, container, false);

        //Preenche o cabeçalho com a foto, nome e email
        navigationDrawerFragment.setHeaderValues(view, R.id.listViewContainer, R.drawable.nav_drawer_header, R.drawable.ic_drawer_perfil, R.string.nav_drawer_restaurant, R.string.nav_drawer_menu);

        return new NavigationDrawerFragment.NavDrawerListView(view,R.id.listView);
    }

    @Override
    public ListAdapter getNavDrawerListAdapter(NavigationDrawerFragment navigationDrawerFragment){
        // Retorna o adapter que vai preencher o ListView
        List<NavDrawerMenuItem> list = NavDrawerMenuItem.getList();
        //Deixa o primeiro item selecionado
        list.get(0).selected = true;
        this.listAdapter = new NavDrawerMenuAdapter(this, list);
        return listAdapter;
    }

    @Override
    public void onNavDrawerItemSelected(NavigationDrawerFragment navigationDrawerFragment, int position){
        //Método chamado ao selecionar um item do ListView
        List<NavDrawerMenuItem> list = NavDrawerMenuItem.getList();
        NavDrawerMenuItem selectedItem = list.get(position);
        //Seleciona a linha
        this.listAdapter.setSelected(position, true);
        if (position == 0){
            replaceFragment(new InformationFragment());
        }else if( position == 1){
            replaceFragment(new LunchFragment());
        }else if ( position == 2){
            replaceFragment(new DinnerFragment());
        }else if (position == 3){
            replaceFragment(new AboutFragment());
        } else if (position == 4 ){


        }
        else {
            Log.e("menuru", "Item de menu inválido");
        }
    }

    //Adiciona o Fragment no centro da tela
    private void replaceFragment(Fragment frag){
        getSupportFragmentManager().beginTransaction().replace(R.id.nav_drawer_container, frag, "TAG").commit();
    }
}
