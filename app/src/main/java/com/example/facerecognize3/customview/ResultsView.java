package com.example.facerecognize3.customview;

import com.example.facerecognize3.tflite.SimilarityClassifier;

import java.util.List;

public interface ResultsView
{
    public void setResults( final List<SimilarityClassifier.Recognition> results );
}
