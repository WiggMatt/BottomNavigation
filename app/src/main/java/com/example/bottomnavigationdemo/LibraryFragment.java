package com.example.bottomnavigationdemo;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;


public class LibraryFragment extends Fragment {

    private ListView listViewCart;
    private ArrayAdapter<String> adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_library, container, false);

        // Получаем ссылку на ListView
        listViewCart = rootView.findViewById(R.id.listViewCart);

        // Создаем адаптер и устанавливаем его для ListView
        adapter = new ArrayAdapter<>(requireContext(), android.R.layout.simple_list_item_1, getDishesForCountry("china"));
        listViewCart.setAdapter(adapter);

        // Остальной код...

        return rootView;
    }

    // Метод для получения массива блюд по стране
    private String[] getDishesForCountry(String country) {
        int arrayResourceId = getResources().getIdentifier("dishes_" + country, "array", requireContext().getPackageName());
        return getResources().getStringArray(arrayResourceId);
    }

    public void onOrderButtonClick(View view) {
        Toast.makeText(requireContext(), "Кнопка 'Заказать' недоступна в этой версии приложения", Toast.LENGTH_SHORT).show();
    }
}