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
public class pastExam extends Activity implements OnPageChangeListener,OnLoadCompleteListener {
    //private static final String TAG = MainActivity.class.getSimpleName();

    public String SAMPLE_FILE;

    PDFView pdfView;
    Integer pageNumber = 0;
    String pdfFileName;

    int num;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.past_exam);

        Intent intent = getIntent();
        num = intent.getExtras().getInt("number");


        if (num == 1) {


            final Spinner biology_spinner = (Spinner) findViewById(R.id.course_spinner);

            biology_spinner.setVisibility(View.VISIBLE);

            final List<String> spinnerArray = new ArrayList<String>();

            spinnerArray.add("امتحان 2016 واجابته");
            spinnerArray.add("امتحان 2015 واجابته");
            spinnerArray.add("امتحان 2014 واجابته");


            ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, spinnerArray);


            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

            biology_spinner.setAdapter(adapter);
            biology_spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                    if (i == 0)
                        SAMPLE_FILE = "Biology_A_past_1_2016.pdf";
                    else if (i == 1)
                        SAMPLE_FILE = "Biology_A_past_1_2015.pdf";
                    else if (i == 2)
                        SAMPLE_FILE = "Biology_A_past_1_2014.pdf";


                    pdfView = (PDFView) findViewById(R.id.pdfView);
                    displayFromAsset(SAMPLE_FILE);
                    setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_SENSOR);


                }

                @Override
                public void onNothingSelected(AdapterView<?> adapterView) {

                }
            });

        } else if (num == 2) {

            final Spinner geology_spinner = (Spinner) findViewById(R.id.course_spinner);
            geology_spinner.setVisibility(View.VISIBLE);

            final List<String> spinnerArray = new ArrayList<String>();

            spinnerArray.add("امتحان 2105 واجابته");
            spinnerArray.add("امتحان 2014 واجابته");
            spinnerArray.add("امتحان 2012");
            spinnerArray.add("اجابه امتحان 2012");


            ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, spinnerArray);
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

            geology_spinner.setAdapter(adapter);
            geology_spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                    if (i == 0)
                        SAMPLE_FILE = "Geology_1_past_2015.pdf";
                    else if (i == 2)
                        SAMPLE_FILE = "Geology_1_past_2014.pdf";
                    else if (i == 3)
                        SAMPLE_FILE = "Geology_q_past_2012.pdf";
                    else if (i == 4)
                        SAMPLE_FILE = "Geology_a_past_2012.pdf";


                    pdfView = (PDFView) findViewById(R.id.pdfView);
                    displayFromAsset(SAMPLE_FILE);
                    setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_SENSOR);


                }

                @Override
                public void onNothingSelected(AdapterView<?> adapterView) {

                }
            });

        } else if (num == 3) {

            final Spinner chimstry_spinner = (Spinner) findViewById(R.id.course_spinner);
            chimstry_spinner.setVisibility(View.VISIBLE);

            final List<String> spinnerArray = new ArrayList<String>();

            spinnerArray.add("امتحان 2105 واجابته");
            spinnerArray.add("امتحان 2014 واجابته");


            ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, spinnerArray);
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

            chimstry_spinner.setAdapter(adapter);
            chimstry_spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                    if (i == 0)
                        SAMPLE_FILE = "Chemistry_1_past_2015.pdf";
                    else if (i == 1)
                        SAMPLE_FILE = "Chemistry_1_past_2014.pdf";


                    pdfView = (PDFView) findViewById(R.id.pdfView);
                    displayFromAsset(SAMPLE_FILE);
                    setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_SENSOR);


                }

                @Override
                public void onNothingSelected(AdapterView<?> adapterView) {

                }
            });
        }

        else if (num == 4) {

            final Spinner arabi_spinner = (Spinner) findViewById(R.id.course_spinner);
            arabi_spinner.setVisibility(View.VISIBLE);

            final List<String> spinnerArray = new ArrayList<String>();

            spinnerArray.add("امتحان 2015 دور اول واجابته");
            spinnerArray.add("امتحان 2015 دور تاني واجابته");
            spinnerArray.add("امتحان 2014 دور اول واجابته");


            ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, spinnerArray);
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

            arabi_spinner.setAdapter(adapter);
            arabi_spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                    if (i == 0)
                        SAMPLE_FILE = "Arabic_1_past_2015.pdf";
                    else if (i == 1)
                        SAMPLE_FILE = "Arabic_2_past_2015.pdf";
                    else if (i == 2)
                        SAMPLE_FILE = "Arabic_1_past_2014.pdf";


                    pdfView = (PDFView) findViewById(R.id.pdfView);
                    displayFromAsset(SAMPLE_FILE);
                    setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_SENSOR);


                }

                @Override
                public void onNothingSelected(AdapterView<?> adapterView) {

                }
            });
        }

        else if (num == 5) {

            final Spinner french_spinner = (Spinner) findViewById(R.id.course_spinner);
            french_spinner.setVisibility(View.VISIBLE);

            final List<String> spinnerArray = new ArrayList<String>();

            spinnerArray.add("امتحان 2015 دور اول واجابته");
            spinnerArray.add("امتحان 2015 دور تاني واجابته");
            spinnerArray.add("امتحان 2014 دور اول واجابته");


            ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, spinnerArray);
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

            french_spinner.setAdapter(adapter);
            french_spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                    if (i == 0)
                        SAMPLE_FILE = "France_1_past_2015.pdf";
                    else if (i == 1)
                        SAMPLE_FILE = "France_2_past_2015.pdf";
                    else if (i == 2)
                        SAMPLE_FILE = "France_1_past_2014.pdf";


                    pdfView = (PDFView) findViewById(R.id.pdfView);
                    displayFromAsset(SAMPLE_FILE);
                    setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_SENSOR);


                }

                @Override
                public void onNothingSelected(AdapterView<?> adapterView) {

                }
            });
        }

        else if (num == 6) {

            final Spinner french_spinner = (Spinner) findViewById(R.id.course_spinner);
            french_spinner.setVisibility(View.VISIBLE);

            final List<String> spinnerArray = new ArrayList<String>();

            spinnerArray.add("امتحان 2015 دور اول واجابته");
            spinnerArray.add("امتحان 2014 دور اول واجابته");
            spinnerArray.add("2011-2013 مصر-سودان+workbook+longman");


            ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, spinnerArray);
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

            french_spinner.setAdapter(adapter);
            french_spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                    if (i == 0)
                        SAMPLE_FILE = "English_past_1_2015.pdf";
                    else if (i == 1)
                        SAMPLE_FILE = "English_past_1_2014.pdf";
                    else if (i == 2)
                        SAMPLE_FILE = "English_past_q_a.pdf";


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

            final Spinner physics_spinner = (Spinner) findViewById(R.id.course_spinner);
            physics_spinner.setVisibility(View.VISIBLE);

            final List<String> spinnerArray = new ArrayList<String>();


            spinnerArray.add("امتحان 2016 واجابته");
            spinnerArray.add("امتحان 2105 واجابته");



            ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, spinnerArray);
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

            physics_spinner.setAdapter(adapter);
            physics_spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                    if (i == 0)
                        SAMPLE_FILE = "physics_past_1_2016.pdf";
                    else if (i == 1)
                        SAMPLE_FILE = "physics_past_1_2015.pdf";


                    pdfView = (PDFView) findViewById(R.id.pdfView);
                    displayFromAsset(SAMPLE_FILE);
                    setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_SENSOR);


                }

                @Override
                public void onNothingSelected(AdapterView<?> adapterView) {

                }
            });



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