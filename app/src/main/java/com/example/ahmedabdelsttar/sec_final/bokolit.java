package com.example.ahmedabdelsttar.sec_final;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.github.barteksc.pdfviewer.PDFView;
import com.github.barteksc.pdfviewer.listener.OnLoadCompleteListener;
import com.github.barteksc.pdfviewer.listener.OnPageChangeListener;
import com.github.barteksc.pdfviewer.scroll.DefaultScrollHandle;
import com.shockwave.pdfium.PdfDocument;

import java.util.ArrayList;
import java.util.List;


public class bokolit extends Activity implements OnPageChangeListener,OnLoadCompleteListener {
    //private static final String TAG = MainActivity.class.getSimpleName();

    public  String SAMPLE_FILE ;

    PDFView pdfView;
    Integer pageNumber = 0;
    String pdfFileName;

    int num;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bokolit);

        Intent intent = getIntent();
        num = intent.getExtras().getInt("number");


        if(num==1) {


            final Spinner biology_spinner = (Spinner) findViewById(R.id.boklit_spinner);

            biology_spinner.setVisibility(View.VISIBLE);

            final List<String> spinnerArray = new ArrayList<String>();

            spinnerArray.add("امتحان رقم 1 ");
            spinnerArray.add("امتحان رقم 2 ");
            spinnerArray.add("اجابة امتحان رقم 1");
            spinnerArray.add("اجابة امتحان رقم 2");


            ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, spinnerArray);


            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

            biology_spinner.setAdapter(adapter);
            biology_spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                    if (i == 0)
                        SAMPLE_FILE = "biolgy_q_3.pdf";
                    else if (i == 1)
                        SAMPLE_FILE = "biolgy_q_4.pdf";
                    else if (i == 2)
                        SAMPLE_FILE = "biolgy_a_3.pdf";
                    else if (i == 3)
                        SAMPLE_FILE = "biolgy_a_4.pdf";


                    pdfView = (PDFView) findViewById(R.id.pdfView);
                    displayFromAsset(SAMPLE_FILE);
                    setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_SENSOR);


                }

                @Override
                public void onNothingSelected(AdapterView<?> adapterView) {

                }
            });

        }
        else if(num==2)
        {

            final Spinner geology_spinner = (Spinner) findViewById(R.id.boklit_spinner);
            geology_spinner.setVisibility(View.VISIBLE);

            final List<String> spinnerArray = new ArrayList<String>();

            spinnerArray.add("امتحان رقم 1 ");
            spinnerArray.add("اجابة امتحان رقم 1");


            ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, spinnerArray);
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

            geology_spinner.setAdapter(adapter);
            geology_spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                    if (i == 0)
                        SAMPLE_FILE = "gel_2_q.pdf";
                    else if (i == 1)
                        SAMPLE_FILE = "gel_2_a.pdf";


                    pdfView = (PDFView) findViewById(R.id.pdfView);
                    displayFromAsset(SAMPLE_FILE);
                    setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_SENSOR);


                }

                @Override
                public void onNothingSelected(AdapterView<?> adapterView) {

                }
            });

        }

        else if(num==3)
        {

            final Spinner chimstry_spinner = (Spinner) findViewById(R.id.boklit_spinner);
            chimstry_spinner.setVisibility(View.VISIBLE);

            final List<String> spinnerArray = new ArrayList<String>();

            spinnerArray.add("امتحان رقم 1 ");
            spinnerArray.add("امتحان رقم 2 ");
            spinnerArray.add("اجابة امتحان رقم 1");
            spinnerArray.add("اجابة امتحان رقم 2");


            ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, spinnerArray);
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

            chimstry_spinner.setAdapter(adapter);
            chimstry_spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                    if (i == 0)
                        SAMPLE_FILE = "chimstry_2_q.pdf";
                    else if (i == 1)
                        SAMPLE_FILE = "chimstry_5_q.pdf";
                    else if (i == 2)
                        SAMPLE_FILE = "chimstry_2_a.pdf";
                    else if (i == 3)
                        SAMPLE_FILE = "chimstry_5_a.pdf";


                    pdfView = (PDFView) findViewById(R.id.pdfView);
                    displayFromAsset(SAMPLE_FILE);
                    setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_SENSOR);


                }

                @Override
                public void onNothingSelected(AdapterView<?> adapterView) {

                }
            });

        }

        else if(num==4)
        {

            final Spinner arabic_spinner = (Spinner) findViewById(R.id.boklit_spinner);
            arabic_spinner.setVisibility(View.VISIBLE);

            final List<String> spinnerArray = new ArrayList<String>();

            spinnerArray.add("امتحان رقم 1 ");
            spinnerArray.add("امتحان رقم 2 ");
            spinnerArray.add("امتحان رقم 3 ");
            spinnerArray.add("امتحان رقم 4 ");
            spinnerArray.add("اجابة امتحان رقم 1");
            spinnerArray.add("اجابة امتحان رقم 2");
            spinnerArray.add("اجابه امتحان رقم 3");
            spinnerArray.add("اجابه امتحان رقم 4");


            ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, spinnerArray);
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

            arabic_spinner.setAdapter(adapter);
            arabic_spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                    if (i == 0)
                        SAMPLE_FILE = "Arabic_q1.pdf";
                    else if (i == 1)
                        SAMPLE_FILE = "Arabic_q2.pdf";
                    else if (i == 2)
                        SAMPLE_FILE = "Arabic_q3.pdf";
                    else if (i == 3)
                        SAMPLE_FILE = "Arabic_q4.pdf";
                    else if (i == 4)
                        SAMPLE_FILE = "Arabic_a1.pdf";
                    else if (i == 5)
                        SAMPLE_FILE = "Arabic_a2.pdf";
                    else if (i == 6)
                        SAMPLE_FILE = "Arabic_a3.pdf";
                    else if (i == 7)
                        SAMPLE_FILE = "Arabic_a4.pdf";


                    pdfView = (PDFView) findViewById(R.id.pdfView);
                    displayFromAsset(SAMPLE_FILE);
                    setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_SENSOR);


                }

                @Override
                public void onNothingSelected(AdapterView<?> adapterView) {

                }
            });

        }



        else if(num==5)
        {

            final Spinner french_spinner = (Spinner) findViewById(R.id.boklit_spinner);
            french_spinner.setVisibility(View.VISIBLE);

            final List<String> spinnerArray = new ArrayList<String>();

            spinnerArray.add("امتحان رقم 1 ");
            spinnerArray.add("امتحان رقم 2 ");
            spinnerArray.add("امتحان رقم 3 ");
            spinnerArray.add("اجابه امتحان رقم 1 ");
            spinnerArray.add("اجابه امتحان رقم 2 ");
            spinnerArray.add("اجابه امتحان رقم 3 ");



            ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, spinnerArray);
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

            french_spinner.setAdapter(adapter);
            french_spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                    if (i == 0)
                        SAMPLE_FILE = "french_2017_q1.pdf";
                    else if (i == 1)
                        SAMPLE_FILE = "french_2017_q2.pdf";
                    else if (i == 2)
                        SAMPLE_FILE = "french_2017_q3.pdf";
                    else if (i == 3)
                        SAMPLE_FILE = "french_2017_a1.pdf";
                    else if (i == 4)
                        SAMPLE_FILE = "french_2017_a2.pdf";
                    else if (i == 5)
                        SAMPLE_FILE = "french_2017_a3.pdf";


                    pdfView = (PDFView) findViewById(R.id.pdfView);
                    displayFromAsset(SAMPLE_FILE);
                    setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_SENSOR);


                }

                @Override
                public void onNothingSelected(AdapterView<?> adapterView) {

                }
            });

        }

        else if(num==6)
        {

            SAMPLE_FILE="english_1.pdf";
            pdfView = (PDFView) findViewById(R.id.pdfView);
            displayFromAsset(SAMPLE_FILE);
            setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_SENSOR);




        }


        else if(num==7)
        {

            final Spinner geography_spinner = (Spinner) findViewById(R.id.boklit_spinner);
            geography_spinner.setVisibility(View.VISIBLE);

            final List<String> spinnerArray = new ArrayList<String>();

            spinnerArray.add("امتحان رقم 1 ");
            spinnerArray.add("امتحان رقم 2 ");
            spinnerArray.add("اجابه امتحان رقم 1 ");
            spinnerArray.add("اجابه امتحان رقم 2 ");



            ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, spinnerArray);
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

            geography_spinner.setAdapter(adapter);
            geography_spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                    if (i == 0)
                        SAMPLE_FILE = "geography_q1.pdf";
                    else if (i == 1)
                        SAMPLE_FILE = "geography_q2.pdf";
                    else if (i == 2)
                        SAMPLE_FILE = "geography_a1.pdf";
                    else if (i == 3)
                        SAMPLE_FILE = "geography_a2.pdf";



                    pdfView = (PDFView) findViewById(R.id.pdfView);
                    displayFromAsset(SAMPLE_FILE);
                    setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_SENSOR);


                }

                @Override
                public void onNothingSelected(AdapterView<?> adapterView) {

                }
            });

        }

        else if(num==8)
        {

            SAMPLE_FILE="history_3sec.pdf";
            pdfView = (PDFView) findViewById(R.id.pdfView);
            displayFromAsset(SAMPLE_FILE);
            setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_SENSOR);

        }


        else if(num==9)
        {

            final Spinner math1_spinner = (Spinner) findViewById(R.id.boklit_spinner);
            math1_spinner.setVisibility(View.VISIBLE);

            final List<String> spinnerArray = new ArrayList<String>();

            spinnerArray.add("امتحان جبر ");
            spinnerArray.add("امتحان تفاضل ");
            spinnerArray.add("اسئله واجابات البوكليت ");



            ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, spinnerArray);
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

            math1_spinner.setAdapter(adapter);
            math1_spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                    if (i == 0)
                        SAMPLE_FILE = "gabr_q1.pdf";
                    else if (i == 1)
                        SAMPLE_FILE = "tafadl_q1.pdf";
                    else if (i == 2)
                        SAMPLE_FILE = "gabr_tafadl_q_a.pdf";


                    pdfView = (PDFView) findViewById(R.id.pdfView);
                    displayFromAsset(SAMPLE_FILE);
                    setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_SENSOR);


                }

                @Override
                public void onNothingSelected(AdapterView<?> adapterView) {

                }
            });

        }


        else if(num==10)
        {

            final Spinner math2_spinner = (Spinner) findViewById(R.id.boklit_spinner);
            math2_spinner.setVisibility(View.VISIBLE);

            final List<String> spinnerArray = new ArrayList<String>();

            spinnerArray.add("اسئله بوكليت واجابتها ديناميكا");
            spinnerArray.add("اسئله بوكليت واجابتها استاتيكا");




            ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, spinnerArray);
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

            math2_spinner.setAdapter(adapter);
            math2_spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                     if (i == 0)
                        SAMPLE_FILE = "dynamics_q_a.pdf";
                    else if (i == 1)
                        SAMPLE_FILE = "static_q_a.pdf";



                    pdfView = (PDFView) findViewById(R.id.pdfView);
                    displayFromAsset(SAMPLE_FILE);
                    setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_SENSOR);


                }

                @Override
                public void onNothingSelected(AdapterView<?> adapterView) {

                }
            });

        }




        else if(num==11)
        {

            final Spinner physics_spinner = (Spinner) findViewById(R.id.boklit_spinner);
            physics_spinner.setVisibility(View.VISIBLE);

            final List<String> spinnerArray = new ArrayList<String>();

            spinnerArray.add("نموذج امتحان رقم 1 ");
            spinnerArray.add("نموذج اجابه امتحان رقم 1 ");
            spinnerArray.add("نموذج امتحان باجابته");




            ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, spinnerArray);
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

            physics_spinner.setAdapter(adapter);
            physics_spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                    if (i == 0)
                        SAMPLE_FILE = "physics_q1.pdf";
                    else if (i == 1)
                        SAMPLE_FILE = "physics_a1.pdf";
                    else if (i == 2)
                        SAMPLE_FILE = "physics_a_q.pdf";



                    pdfView = (PDFView) findViewById(R.id.pdfView);
                    displayFromAsset(SAMPLE_FILE);
                    setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_SENSOR);


                }

                @Override
                public void onNothingSelected(AdapterView<?> adapterView) {

                }
            });

        }

        else if(num==12)
        {

            SAMPLE_FILE="philoso_exp.pdf";
            pdfView = (PDFView) findViewById(R.id.pdfView);
            displayFromAsset(SAMPLE_FILE);
            setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_SENSOR);

        }

        else if(num==13)
        {

            SAMPLE_FILE="psycho_bokolit.pdf";
            pdfView = (PDFView) findViewById(R.id.pdfView);
            displayFromAsset(SAMPLE_FILE);
            setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_SENSOR);

        }




    }

    private void displayFromAsset(String assetFileName) {
        pdfFileName = assetFileName;
        pdfView.fromAsset(SAMPLE_FILE)
                .defaultPage(pageNumber)
                .enableSwipe(true)
                .swipeHorizontal(false)
                .onPageChange(this)
                .enableAnnotationRendering(true)
                .onLoad(this)
                .scrollHandle(new DefaultScrollHandle(this))
                .load();
    }

    @Override
    public void onPageChanged(int page, int pageCount) {
        pageNumber = page;
        setTitle(String.format("%s %s / %s", pdfFileName, page + 1, pageCount));
    }

    @Override
    public void loadComplete(int nbPages) {
        PdfDocument.Meta meta = pdfView.getDocumentMeta();
        printBookmarksTree(pdfView.getTableOfContents(), "-");
    }

    public void printBookmarksTree(List<PdfDocument.Bookmark> tree, String sep) {
        for (PdfDocument.Bookmark b : tree) {
            // Log.e(TAG, String.format("%s %s, p %d", sep, b.getTitle(), b.getPageIdx()));
            if (b.hasChildren()) {
                printBookmarksTree(b.getChildren(), sep + "-");
            }
        }
    }







}
