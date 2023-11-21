package com.example.bottomnavigationdemo;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.Toast;

public class SubscriptionFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_subscription, container, false);

        CalendarView calendarView = rootView.findViewById(R.id.calendarView);
        Button bookButton = rootView.findViewById(R.id.bookButton);

        // Обработка события нажатия на кнопку
        bookButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Здесь добавьте код для обработки нажатия на кнопку "Забронировать"
                // Например, показать диалоговое окно с подтверждением бронирования
                Toast.makeText(getContext(), "Бронирование не доступно в данной версии приложения", Toast.LENGTH_SHORT).show();
            }
        });

        return rootView;
    }

}