package com.xdt.apis;

import org.apache.beam.sdk.Pipeline;
import org.apache.beam.sdk.values.KV;
import org.apache.beam.sdk.values.PCollection;

public abstract class BaseFilter implements Plugin {


    public abstract PCollection<KV<String, String>> process(Pipeline pipeline, PCollection<KV<String, String>> input);

}
