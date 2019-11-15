package com.example.fincare;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CardOneActivity extends AppCompatActivity {

    Button close,btn;
    DragtoClose drag_to_close;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card_one);

        drag_to_close = (DragtoClose) findViewById(R.id.drag_to_close);
        btn = (Button) findViewById(R.id.btn);
        drag_to_close.setDragListener(new DragListener() {
            @Override
            public void onStartDraggingView() {

            }

            @Override
            public void onDragging(float var1) {

            }

            @Override
            public void onViewCosed() {

            }
        });

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                drag_to_close.closeDraggableContainer();
            }
        });
    }
}
