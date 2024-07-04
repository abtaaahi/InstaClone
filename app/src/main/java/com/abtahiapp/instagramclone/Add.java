package com.abtahiapp.instagramclone;
import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridLayout;
import android.widget.ImageView;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.annotation.NonNull;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import com.bumptech.glide.Glide;
public class Add extends Fragment {
    private View root; private ImageView selectedImageView; private GridLayout gridLayout;
    private static final int PERMISSION_REQUEST_CODE = 123;
    private Uri currentSelectedImageUri;
    private final ActivityResultLauncher<Intent> galleryLauncher = registerForActivityResult(
            new ActivityResultContracts.StartActivityForResult(),
            result -> {
                if (result.getResultCode() == getActivity().RESULT_OK) {
                    Uri selectedImageUri = result.getData().getData();
                    if (selectedImageUri != null) {
                        Glide.with(this)
                                .load(selectedImageUri)
                                .into(selectedImageView);
                    }
                }
            });
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        root = inflater.inflate(R.layout.fragment_add, container, false);
        selectedImageView = root.findViewById(R.id.selectedImage);
        gridLayout = root.findViewById(R.id.gridLayout);
        Log.d("AddFragment", "Before loading gallery images");
        loadGalleryImages();
        return root;
    }
    private void loadGalleryImages() {
        String[] projection = {
                MediaStore.Images.Media._ID,
                MediaStore.Images.Media.DISPLAY_NAME
        };
        Cursor cursor = requireActivity().getContentResolver().query(
                MediaStore.Images.Media.EXTERNAL_CONTENT_URI,
                projection,
                null,
                null,
                null
        );
        if (cursor != null) {
            int idColumn = cursor.getColumnIndexOrThrow(MediaStore.Images.Media._ID);
            while (cursor.moveToNext()) {
                long id = cursor.getLong(idColumn);
                Uri contentUri = Uri.withAppendedPath(
                        MediaStore.Images.Media.EXTERNAL_CONTENT_URI,
                        String.valueOf(id)
                );
                addImageToGridLayout(contentUri);
            }
            cursor.close();
        }
    }
    private void addImageToGridLayout(Uri imageUri) {
        ImageView imageView = new ImageView(requireActivity());
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        Glide.with(this)
                .load(imageUri)
                .into(imageView);
        int screenWidth = getResources().getDisplayMetrics().widthPixels;
        int columnCount = 4;
        int itemWidth = screenWidth / columnCount;
        int itemHeight = 180;
        GridLayout.LayoutParams layoutParams = new GridLayout.LayoutParams();
        layoutParams.width = itemWidth;
        layoutParams.height = itemHeight;
        layoutParams.setGravity(Gravity.CENTER);
        imageView.setLayoutParams(layoutParams);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Glide.with(requireActivity())
                        .load(imageUri)
                        .into(selectedImageView);
                currentSelectedImageUri = imageUri;
            }
        });
        gridLayout.addView(imageView);
        if (currentSelectedImageUri == null) {
            currentSelectedImageUri = imageUri;
            // Load the first image into selectedImageView
            Glide.with(requireActivity())
                    .load(imageUri)
                    .into(selectedImageView);
        }
    }

    @Override
    public void onResume() {
        super.onResume();
        if (!hasReadExternalStoragePermission()) {
            requestReadExternalStoragePermission();
        }
    }
    private boolean hasReadExternalStoragePermission() {
        return ContextCompat.checkSelfPermission(
                requireActivity(),
                Manifest.permission.READ_EXTERNAL_STORAGE
        ) == PackageManager.PERMISSION_GRANTED;
    }
    private void requestReadExternalStoragePermission() {
        ActivityCompat.requestPermissions(
                requireActivity(),
                new String[]{Manifest.permission.READ_EXTERNAL_STORAGE},
                PERMISSION_REQUEST_CODE
        );
    }
    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if (requestCode == PERMISSION_REQUEST_CODE) {
            if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                loadGalleryImages();
            } else {
            }
        }
    }
}