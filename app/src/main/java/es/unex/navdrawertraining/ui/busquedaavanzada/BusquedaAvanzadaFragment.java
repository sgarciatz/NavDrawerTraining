package es.unex.navdrawertraining.ui.busquedaavanzada;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.SearchView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import es.unex.navdrawertraining.R;
import es.unex.navdrawertraining.databinding.FragmentBusquedaAvanzadaBinding;
import es.unex.navdrawertraining.databinding.FragmentCategoriasBinding;


public class BusquedaAvanzadaFragment extends Fragment {



    private FragmentBusquedaAvanzadaBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {


        binding = FragmentBusquedaAvanzadaBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        SearchView searchView =  binding.svBusquedaAvanzada;
        RecyclerView recyclerView = binding.rvBusquedaAvanzada;
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}