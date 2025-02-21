package com.devmaster.lesson02.tight_loosely_coupling;

public class LooselyCoupleService {
    private SortAlgorithm sortAlgorithm;
    public LooselyCoupleService() {}
    public LooselyCoupleService(SortAlgorithm sortAlgorithm) {
        this.sortAlgorithm = sortAlgorithm;
    }
    public void complexBusiness(int [] array) {
        sortAlgorithm.sort(array);
    }
    public static void main(String[] args) {
        LooselyCoupleService sortAlgorithm = new LooselyCoupleService(new LooselyBubbbleSortAlgorithm());
        sortAlgorithm.complexBusiness(new int[] {11,21,13,42,15});
    }
}
