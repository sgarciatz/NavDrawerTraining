package es.unex.navdrawertraining.ui.hacerreserva;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import es.unex.navdrawertraining.R;
import es.unex.navdrawertraining.databinding.FragmentCategoriasBinding;
import es.unex.navdrawertraining.databinding.FragmentHacerReservaBinding;


public class HacerReservaFragment extends Fragment {

    private FragmentHacerReservaBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {


        binding = FragmentHacerReservaBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textHacerReserva;
        textView.setText("This is categorias Fragment");

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}