package br.com.barrsoft.guestlist.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioGroup;

import br.com.barrsoft.guestlist.R;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnCheckedChanged;
import butterknife.OnClick;

public class FormActivity extends AppCompatActivity {

    @BindView(R.id.radioGroup)
    RadioGroup radioGroup;
    @BindView(R.id.editText)
    EditText editText;
    @BindView(R.id.button)
    Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);

        ButterKnife.bind(this);


        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                switch (checkedId){
                    case R.id.radioButton1:
                        break;
                    case R.id.radioButton2:
                        break;
                    case R.id.radioButton3:
                        break;
                }
            }
        });


    }

    @OnClick(R.id.button)
    public void submit(View view){

        validaForm();
    }

    private void validaForm() {
        String nome = editText.getText().toString();
        if(nome == "" || nome.isEmpty() || nome.length() == 0){
            editText.setError("Preencha o nome");
        }
    }
}
