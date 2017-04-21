 package com.example.med.accueil;

        import android.app.Fragment;
        import android.app.ProgressDialog;
        import android.content.ContentResolver;
        import android.content.Context;
        import android.content.Intent;
        import android.graphics.Bitmap;
        import android.net.Uri;
        import android.provider.MediaStore;
        import android.support.annotation.NonNull;
        import android.support.annotation.Nullable;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.LayoutInflater;
        import android.view.View;
        import android.view.ViewGroup;
        import android.webkit.MimeTypeMap;
        import android.widget.Button;
        import android.widget.EditText;
        import android.widget.ImageView;
        import android.widget.Toast;

        import com.google.android.gms.tasks.OnFailureListener;
        import com.google.android.gms.tasks.OnSuccessListener;
        import com.google.firebase.database.DatabaseReference;
        import com.google.firebase.database.FirebaseDatabase;
        import com.google.firebase.storage.FirebaseStorage;
        import com.google.firebase.storage.OnProgressListener;
        import com.google.firebase.storage.StorageReference;
        import com.google.firebase.storage.StreamDownloadTask;
        import com.google.firebase.storage.UploadTask;

        import java.io.FileNotFoundException;
        import java.io.IOException;


public class Addpic extends Fragment {
    private static final int RESULT_OK = 1234;
    View myView;
    private Button button1;
    private Button button2;
    private Button button3;
    private StorageReference mStorageRef;
    private DatabaseReference mDatabaseRef;
    private ImageView imageView;
    private EditText txtImageName;
    private Uri imgUri;
    public static final String FB_STORAGE_PATH = "image/*";
    public static final String FB_DATABASE_PATH = "image/*";
    public static final int REQUEST_CODE = 1234;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        final View myView = inflater.inflate(R.layout.activity_addpic, container, false);
        return myView;
    }
}
      /*  mStorageRef = FirebaseStorage.getInstance().getReference();
        mDatabaseRef = FirebaseDatabase.getInstance().getReference(FB_DATABASE_PATH);
        imageView = (ImageView) myView.findViewById(R.id.GalerieText);
        txtImageName = (EditText) myView.findViewById(R.id.txtImageName);
        button2 = (Button) myView.findViewById(R.id.button2);
        button3 = (Button) myView.findViewById(R.id.btnbrowse);

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setType("image/*");
                intent.setAction(Intent.ACTION_GET_CONTENT);
                startActivityForResult(Intent.createChooser(intent, "select image"), REQUEST_CODE);
            }
        });



 /*   @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode==REQUEST_CODE && resultCode==RESULT_OK && data != null && data.getData() != null);
        imgUri= data.getData();
        try{
            Bitmap bm = MediaStore.Images.Media.getBitmap(getContentResolver(),imgUri);
            imageView.setImageBitmap(bm);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public  String getImageExt(Uri uri){
        ContentResolver contentResolver=getContentResolver();
        MimeTypeMap mimeTypeMap=MimeTypeMap.getSingleton();
        return  mimeTypeMap.getExtensionFromMimeType(contentResolver.getType(uri));

    }

    @SuppressWarnings("VisibleForTests")
    public  void btnUpload_Click(View v){
        if(imgUri!=null){
            final ProgressDialog dialog =new ProgressDialog(this);
            dialog.setTitle("Uploading Image ");
            dialog.show();
            //Get The Storage References
            StorageReference ref =mStorageRef.child(FB_STORAGE_PATH + System.currentTimeMillis() +"."+getImageExt(imgUri));
            //Add File To Reference
            ref.putFile(imgUri).addOnSuccessListener(new OnSuccessListener<UploadTask.TaskSnapshot>() {
                @Override
                public void onSuccess(UploadTask.TaskSnapshot taskSnapshot) {
                    //Dimis Dialog When Success
                    dialog.dismiss();
                    //Display Success Toast Msg
                    Toast.makeText(getApplicationContext(),"Image Uploaded", Toast.LENGTH_SHORT).show();
                    ImageUpload imageUpload=new ImageUpload((txtImageName.getText().toString()),taskSnapshot.getDownloadUrl().toString());
                    //Save Image Info in To FireBase DataBase
                    String uploadId=mDatabaseRef.push().getKey();
                    mDatabaseRef.child(uploadId).setValue(imageUpload);
                }

            })
                    .addOnFailureListener(new OnFailureListener() {
                        @Override
                        public void onFailure(@NonNull Exception e) {

                            //Dimis Dialog When Error
                            dialog.dismiss();
                            //Display Error Toast Msg
                            Toast.makeText(getApplicationContext(),e.getMessage(), Toast.LENGTH_SHORT).show();

                        }
                    })
                    .addOnProgressListener(new OnProgressListener<UploadTask.TaskSnapshot>() {
                        @Override
                        public void onProgress(UploadTask.TaskSnapshot taskSnapshot) {
                            //Show Upload Progress
                            double progress = (100 * taskSnapshot.getBytesTransferred())/taskSnapshot.getTotalByteCount();
                            dialog.setMessage("Uploaded" + (int)progress+"%");
                        }

                    });
        }
        else {
            Toast.makeText(getApplicationContext(),"Please Select Image ", Toast.LENGTH_SHORT).show();

        }
    }

    private Context getApplicationContext() {
    }


        button1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                button1= (Button) myView.findViewById(R.id.addpic);
                // TODO Auto-generated method stub
                Addpic nextFrag = new Addpic();
                getActivity().getFragmentManager().beginTransaction()
                        .replace(R.id.content_frame, nextFrag, "TAG_FRAGMENT")
                        .addToBackStack(null)
                        .commit();
            
        });
   
}

*/