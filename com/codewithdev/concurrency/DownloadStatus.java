package com.codewithdev.concurrency;

public class DownloadStatus {
    private volatile boolean isDone;
    private int totalBytes;
    private int totalFiles;
    private Object totalBytesLock = new Object();
    private Object totalFilesLock = new Object();

    public void incrementTotalBytes() {
        synchronized (totalBytesLock) {
            totalBytes++;
        }
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
        return totalBytes;
    }
}
