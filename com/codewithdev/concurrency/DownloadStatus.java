package com.codewithdev.concurrency;

import java.util.concurrent.atomic.AtomicInteger;

public class DownloadStatus {
    private volatile boolean isDone;
    private AtomicInteger totalBytes = new AtomicInteger();
    private int totalFiles;
    private Object totalBytesLock = new Object();
    private Object totalFilesLock = new Object();

    public void incrementTotalBytes() {
        totalBytes.incrementAndGet();
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
        return totalBytes.get();
    }
}
