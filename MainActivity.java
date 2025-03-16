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
// Add this method to open gallery
private void openGallery() {
    Intent intent = new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
    startActivityForResult(intent, 1);
}

@Override
protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
    super.onActivityResult(requestCode, resultCode, data);
    if (requestCode == 1 && resultCode == RESULT_OK && data != null) {
        Uri imageUri = data.getData();
        profileImage.setImageURI(imageUri);
    }
}
