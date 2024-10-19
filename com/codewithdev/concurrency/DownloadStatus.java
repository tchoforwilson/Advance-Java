package com.codewithdev.concurrency;

import java.util.concurrent.atomic.LongAdder;

public class DownloadStatus {
    private boolean isDone;
    private LongAdder totalBytes = new LongAdder();
    private int totalFiles;

    public void incrementTotalBytes() {
        totalBytes.increment();
    }

    public synchronized void incrementTotalFiles() {
        totalFiles++;
    }

    public boolean isDone() {
        return isDone;
    }

    public void done() {
        this.isDone = true;
    }

    public int getTotalFiles() {
        return totalFiles;
    }

    public int getTotalBytes() {
        return totalBytes.intValue();
    }
}
