public class PersonalDetailsActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal_details);

        EditText etName = findViewById(R.id.etName);
        Button btnSave = findViewById(R.id.btnSave);

        btnSave.setOnClickListener(v -> {
            String name = etName.getText().toString();
            // Save data using SharedPreferences or Intent extras
            finish();
        });

        findViewById(R.id.btnCancel).setOnClickListener(v -> finish());
    }
}
