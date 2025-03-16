Intent shareIntent = new Intent(Intent.ACTION_SEND);
shareIntent.setType("text/plain");
shareIntent.putExtra(Intent.EXTRA_TEXT, "CV Data: ...");
startActivity(Intent.createChooser(shareIntent, "Share CV"));
