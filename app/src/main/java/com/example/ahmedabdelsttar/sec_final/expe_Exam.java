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
 * Created by Ahmed Abdelsttar on 16/04/2017.
 */
public class expe_Exam extends Activity implements OnPageChangeListener,OnLoadCompleteListener {
    //private static final String TAG = MainActivity.class.getSimpleName();

    public String SAMPLE_FILE;

    PDFView pdfView;
    Integer pageNumber = 0;
    String pdfFileName;

    int num;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.expe_exam);

        Intent intent = getIntent();
        num = intent.getExtras().getInt("number");


        if (num == 1) {

            final Spinner biology_spinner = (Spinner) findViewById(R.id.expe_spinner);
            biology_spinner.setVisibility(View.VISIBLE);

            final List<String> spinnerArray = new ArrayList<String>();

            spinnerArray.add("نموذج امتحان رقم 1 ");
            spinnerArray.add("نموذج اجابه امتحان رقم 1");
            spinnerArray.add("نموذج امتحان رقم 2 واجابته ");


            ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, spinnerArray);
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

            biology_spinner.setAdapter(adapter);
            biology_spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                    if (i == 0)
                        SAMPLE_FILE = "Biology_exp_q1.pdf";
                    else if (i == 1)
                        SAMPLE_FILE = "Biology_exp_a1.pdf";
                    else if (i == 2)
                        SAMPLE_FILE = "Biology_exp_a_q.pdf";

                    pdfView = (PDFView) findViewById(R.id.pdfView);
                    displayFromAsset(SAMPLE_FILE);
                    setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_SENSOR);


                }

                @Override
                public void onNothingSelected(AdapterView<?> adapterView) {

                }
            });

        }

        if (num == 2) {

            final Spinner geology_spinner = (Spinner) findViewById(R.id.expe_spinner);
            geology_spinner.setVisibility(View.VISIBLE);

            final List<String> spinnerArray = new ArrayList<String>();

            spinnerArray.add("امتحان رقم 1 ");
            spinnerArray.add("امتحان رقم 2 ");


            ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, spinnerArray);
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

            geology_spinner.setAdapter(adapter);
            geology_spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                    if (i == 0)
                        SAMPLE_FILE = "Geology_exp_1.pdf";
                    else if (i == 1)
                        SAMPLE_FILE = "Geology_exp_2.pdf";


                    pdfView = (PDFView) findViewById(R.id.pdfView);
                    displayFromAsset(SAMPLE_FILE);
                    setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_SENSOR);


                }

                @Override
                public void onNothingSelected(AdapterView<?> adapterView) {

                }
            });

        } else if (num == 3) {

            final Spinner chimstry_spinner = (Spinner) findViewById(R.id.expe_spinner);
            chimstry_spinner.setVisibility(View.VISIBLE);

            final List<String> spinnerArray = new ArrayList<String>();

            spinnerArray.add("نموذج امتحان رقم 1");
            spinnerArray.add("نموذج امتحان رقم 2");


            ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, spinnerArray);
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

            chimstry_spinner.setAdapter(adapter);
            chimstry_spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                    if (i == 0)
                        SAMPLE_FILE = "Chemistry_exp_1.pdf";
                    else if (i == 1)
                        SAMPLE_FILE = "Chemistry_exp_2.pdf";


                    pdfView = (PDFView) findViewById(R.id.pdfView);
                    displayFromAsset(SAMPLE_FILE);
                    setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_SENSOR);


                }

                @Override
                public void onNothingSelected(AdapterView<?> adapterView) {

                }
            });
        } else if (num == 4) {

            final Spinner arabic_spinner = (Spinner) findViewById(R.id.expe_spinner);
            arabic_spinner.setVisibility(View.VISIBLE);

            final List<String> spinnerArray = new ArrayList<String>();

            spinnerArray.add("نموذج امتحان رقم 1");
            spinnerArray.add("نموذج امتحان رقم 2");


            ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, spinnerArray);
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

            arabic_spinner.setAdapter(adapter);
            arabic_spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                    if (i == 0)
                        SAMPLE_FILE = "Arabic_exp_1.pdf";
                    else if (i == 1)
                        SAMPLE_FILE = "Arabic_exp_2.pdf";


                    pdfView = (PDFView) findViewById(R.id.pdfView);
                    displayFromAsset(SAMPLE_FILE);
                    setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_SENSOR);


                }

                @Override
                public void onNothingSelected(AdapterView<?> adapterView) {

                }
            });
        } else if (num == 5) {

            final Spinner french_spinner = (Spinner) findViewById(R.id.expe_spinner);
            french_spinner.setVisibility(View.VISIBLE);

            final List<String> spinnerArray = new ArrayList<String>();

            spinnerArray.add("نموذج امتحان رقم 1");
            spinnerArray.add("نموذج امتحان رقم 2");


            ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, spinnerArray);
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

            french_spinner.setAdapter(adapter);
            french_spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                    if (i == 0)
                        SAMPLE_FILE = "France_exp_1.pdf";
                    else if (i == 1)
                        SAMPLE_FILE = "France_exp_2.pdf";


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

                SAMPLE_FILE = "english_exp.pdf";
            pdfView = (PDFView) findViewById(R.id.pdfView);
            displayFromAsset(SAMPLE_FILE);
            setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_SENSOR);


        }

        else if (num == 7) {

            final Spinner geograrhy_spinner = (Spinner) findViewById(R.id.expe_spinner);
            geograrhy_spinner.setVisibility(View.VISIBLE);

            final List<String> spinnerArray = new ArrayList<String>();

            spinnerArray.add("نموذج امتحان رقم 1");
            spinnerArray.add("نموذج امتحان رقم 2");


            ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, spinnerArray);
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

            geograrhy_spinner.setAdapter(adapter);
            geograrhy_spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                    if (i == 0)
                        SAMPLE_FILE = "Geography_1_exp.pdf";
                    else if (i == 1)
                        SAMPLE_FILE = "Geography_2_exp.pdf";


                    pdfView = (PDFView) findViewById(R.id.pdfView);
                    displayFromAsset(SAMPLE_FILE);
                    setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_SENSOR);


                }

                @Override
                public void onNothingSelected(AdapterView<?> adapterView) {

                }
            });


        }

        else if (num == 8) {

            SAMPLE_FILE = "History_exp.pdf";
            pdfView = (PDFView) findViewById(R.id.pdfView);
            displayFromAsset(SAMPLE_FILE);
            setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_SENSOR);

        }


        else if (num == 9) {

            final Spinner math1_spinner = (Spinner) findViewById(R.id.expe_spinner);
            math1_spinner.setVisibility(View.VISIBLE);

            final List<String> spinnerArray = new ArrayList<String>();


            spinnerArray.add("نموذج رقم 1 جبر ");
            spinnerArray.add("نموذج رقم 2 تفاضل ");
            spinnerArray.add("اجابه نموذج رقم 1 جبر ");
            spinnerArray.add("اجابه نموذج رقم 1 تفاضل ");


            ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, spinnerArray);
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

            math1_spinner.setAdapter(adapter);
            math1_spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                    if (i == 0)
                        SAMPLE_FILE = "Algebra_exp_q1.pdf";
                    else if (i == 1)
                        SAMPLE_FILE = "diff_exp_q1.pdf";
                    if (i == 2)
                        SAMPLE_FILE = "Algebra_exp_a1.pdf";
                    else if (i == 3)
                        SAMPLE_FILE = "diff_exp_a1.pdf";


                    pdfView = (PDFView) findViewById(R.id.pdfView);
                    displayFromAsset(SAMPLE_FILE);
                    setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_SENSOR);


                }

                @Override
                public void onNothingSelected(AdapterView<?> adapterView) {

                }
            });
        }


        else if (num == 10) {

            final Spinner math2_spinner = (Spinner) findViewById(R.id.expe_spinner);
            math2_spinner.setVisibility(View.VISIBLE);

            final List<String> spinnerArray = new ArrayList<String>();


            spinnerArray.add("نموذج رقم 1 ديناميكا");
            spinnerArray.add("اجابه نموذج رقم 1 ديناميكا");
            spinnerArray.add("نموذج اسئله واجابه استاتيكا");


            ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, spinnerArray);
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

            math2_spinner.setAdapter(adapter);
            math2_spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                    if (i == 0)
                        SAMPLE_FILE = "dynamics_q1_exp.pdf";
                    else if (i == 1)
                        SAMPLE_FILE = "dynamics_a1_exp.pdf";
                    if (i == 2)
                        SAMPLE_FILE = "Statics_q_a_exp.pdf";



                    pdfView = (PDFView) findViewById(R.id.pdfView);
                    displayFromAsset(SAMPLE_FILE);
                    setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_SENSOR);


                }

                @Override
                public void onNothingSelected(AdapterView<?> adapterView) {

                }
            });
        }

        else if (num == 11) {


            final Spinner physics_spinner = (Spinner) findViewById(R.id.expe_spinner);
            physics_spinner.setVisibility(View.VISIBLE);

            final List<String> spinnerArray = new ArrayList<String>();

            spinnerArray.add("نموذج امتحان رقم 1");
            spinnerArray.add("نموذج امتحان رقم 2");
            spinnerArray.add("اجابه نموذج رقم 1");
            spinnerArray.add("اجابه نموذج رقم 2");



            ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, spinnerArray);
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

            physics_spinner.setAdapter(adapter);
            physics_spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                    if (i == 0)
                        SAMPLE_FILE = "Physics_q1_exp.pdf";
                    else if (i == 1)
                        SAMPLE_FILE = "Physics_q2_exp.pdf";
                    else if (i == 2)
                        SAMPLE_FILE = "Physics_a1_exp.pdf";
                    else if (i == 3)
                        SAMPLE_FILE = "Physics_a2_exp.pdf";



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


            final Spinner philos_spinner = (Spinner) findViewById(R.id.expe_spinner);
            philos_spinner.setVisibility(View.VISIBLE);

            final List<String> spinnerArray = new ArrayList<String>();

            spinnerArray.add("نموذج امتحان رقم 1");
            spinnerArray.add("اجابه نموذج رقم 1");


            ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, spinnerArray);
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

            philos_spinner.setAdapter(adapter);
            philos_spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                    if (i == 0)
                        SAMPLE_FILE = "Philosophy_exp_q1.pdf";
                    else if (i == 1)
                        SAMPLE_FILE = "Philosophy_exp_a1.pdf";


                    pdfView = (PDFView) findViewById(R.id.pdfView);
                    displayFromAsset(SAMPLE_FILE);
                    setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_SENSOR);


                }

                @Override
                public void onNothingSelected(AdapterView<?> adapterView) {

                }
            });



        }

        else if (num == 13) {

            final Spinner psych_spinner = (Spinner) findViewById(R.id.expe_spinner);
            psych_spinner.setVisibility(View.VISIBLE);

            final List<String> spinnerArray = new ArrayList<String>();

            spinnerArray.add("نموذج امتحان رقم 1");
            spinnerArray.add("اجابه نموذج رقم 1");


            ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, spinnerArray);
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

            psych_spinner.setAdapter(adapter);
            psych_spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                    if (i == 0)
                        SAMPLE_FILE = "Psycho_exp_q1.pdf";
                    else if (i == 1)
                        SAMPLE_FILE = "Psycho_exp_a1.pdf";


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
