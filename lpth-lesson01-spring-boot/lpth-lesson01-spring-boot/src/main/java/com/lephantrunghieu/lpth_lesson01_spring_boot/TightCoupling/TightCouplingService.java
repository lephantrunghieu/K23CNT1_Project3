package com.lephantrunghieu.lpth_lesson01_spring_boot.TightCoupling;

import java.util.Arrays;

public class TightCouplingService {
    private BubbleSortAlgorithm bubbleSortAlgorithm = new BubbleSortAlgorithm();

    public TightCouplingService() {}

    public TightCouplingService(BubbleSortAlgorithm bubbleSortAlgorithm) {
        this.bubbleSortAlgorithm = bubbleSortAlgorithm;
    }

    public void complexBussinessSort(int[] arr){
        bubbleSortAlgorithm.sort(arr);
        Arrays.stream(arr).forEach(System.out::println);
    }

    public static void main(String[] args) {
        TightCouplingService tCouplingService = new TightCouplingService();
        tCouplingService.complexBussinessSort(new int[]{11,21,13,42,15});
    }
}
