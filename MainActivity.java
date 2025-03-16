public class MainActivity extends AppCompatActivity {
    private ImageView profileImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        profileImage = findViewById(R.id.profileImage);
        // Set click listeners for buttons
        findViewById(R.id.btnPersonalDetails).setOnClickListener(v -> {
            startActivity(new Intent(MainActivity.this, PersonalDetailsActivity.class));
        });
        // Repeat for other buttons
    }

    // Handle profile image selection (see next step)
}
