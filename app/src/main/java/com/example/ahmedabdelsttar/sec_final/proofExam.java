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

/**
 * Created by Ahmed Abdelsttar on 15/04/2017.
 */
public class proofExam extends Activity implements OnPageChangeListener,OnLoadCompleteListener {
    //private static final String TAG = MainActivity.class.getSimpleName();

    public  String SAMPLE_FILE ;

    PDFView pdfView;
    Integer pageNumber = 0;
    String pdfFileName;


    int num;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.proof_exam);

        Intent intent = getIntent();
        num = intent.getExtras().getInt("number");


        if(num==1) {




        }

        else if(num==2)
        {



        }
        else if(num==3)
        {



        }
        else if (num == 4) {

                    SAMPLE_FILE="arabic_dlil_3sec.pdf";
                    pdfView = (PDFView) findViewById(R.id.pdfView);
                    displayFromAsset(SAMPLE_FILE);
                    setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_SENSOR);

        }

        else if (num == 5) {

            SAMPLE_FILE="french_dlil_3sec_2.pdf";
            pdfView = (PDFView) findViewById(R.id.pdfView);
            displayFromAsset(SAMPLE_FILE);
            setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_SENSOR);

        }

        else if (num == 6) {

            SAMPLE_FILE="english_dlil_3sec.pdf";
            pdfView = (PDFView) findViewById(R.id.pdfView);
            displayFromAsset(SAMPLE_FILE);
            setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_SENSOR);

        }

        else if (num == 7) {

            SAMPLE_FILE="geography_dlil_3sec.pdf";
            pdfView = (PDFView) findViewById(R.id.pdfView);
            displayFromAsset(SAMPLE_FILE);
            setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_SENSOR);

        }

        else if (num == 8) {

            SAMPLE_FILE="history_dlil_3sec.pdf";
            pdfView = (PDFView) findViewById(R.id.pdfView);
            displayFromAsset(SAMPLE_FILE);
            setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_SENSOR);

        }


        else if(num==9)
        {

            final Spinner math1_spinner = (Spinner) findViewById(R.id.proof_spinner);
            math1_spinner.setVisibility(View.VISIBLE);

            final List<String> spinnerArray = new ArrayList<String>();

            spinnerArray.add("اسئله واجابات دليل تقويم جبر");
            spinnerArray.add("اسئله واجابات دليل التقويم تفاضل");



            ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, spinnerArray);
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

            math1_spinner.setAdapter(adapter);
            math1_spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                    if (i == 0)
                        SAMPLE_FILE = "gebra_dlil.pdf";
                    else if (i == 1)
                        SAMPLE_FILE = "diff_dlil.pdf";


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

            final Spinner math2_spinner = (Spinner) findViewById(R.id.proof_spinner);
            math2_spinner.setVisibility(View.VISIBLE);

            final List<String> spinnerArray = new ArrayList<String>();

            spinnerArray.add("اسئله واجابات دليل ديناميكا");
            spinnerArray.add("اسئله واجابات دليل استاتيكا");




            ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, spinnerArray);
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

            math2_spinner.setAdapter(adapter);
            math2_spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                    if (i == 0)
                        SAMPLE_FILE = "dynamic_dlil.pdf";
                    else if (i == 1)
                        SAMPLE_FILE = "static_dlil.pdf";



                    pdfView = (PDFView) findViewById(R.id.pdfView);
                    displayFromAsset(SAMPLE_FILE);
                    setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_SENSOR);


                }

                @Override
                public void onNothingSelected(AdapterView<?> adapterView) {

                }
            });

        }

        else if (num == 12) {



        }

        else if (num == 13) {



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
