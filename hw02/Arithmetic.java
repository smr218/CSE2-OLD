/*
-Stephan Reyes
-Arithmetic Java Program
-You go shopping at Walmart’s and want to compute the cost 
of the items you bought, including the PA sales tax of 6%.
-Calculate:
a) Total cost of each kind of item; sales tax for that total cost
b) Total cost of purchases (before tax)
c) Total actually paid for this transaction, including sales tax. 
*/
public class Arithmetic
{
    public static void main(String[] args)
    {
        //Number of pairs of socks
        int nSocks = 3;
        //Cost per pair of socks
        //(‘$’ is part of the variable name)
        double sockCost$ = 2.58;
        //Number of drinking glasses
        int nGlasses = 6;
        //Cost per glass
        double glassCost$ = 2.29;
        //Number of boxes of envelopes
        int nEnvelopes = 1;
        //cost per box of envelopes
        double envelopeCost$ = 3.25;
        double taxPercent = 0.06;
        double totalSockCost$ = (nSocks * sockCost$);   //total cost of socks
        double totalGlassCost$ = (nGlasses * glassCost$);  //total cost of glasses
        double totalEnvelopeCost$ = (nEnvelopes * envelopeCost$); //total cost of envelopes
        double taxSockCost$ = (totalSockCost$ + (totalSockCost$ * taxPercent)); // total cost of socks with tax
        double taxGlassCost$ = (totalGlassCost$ + (totalGlassCost$ * taxPercent));// total cost of glasses with tax
        double taxEnvelopeCost$ = (totalEnvelopeCost$ + (totalEnvelopeCost$ * taxPercent));// total cost of envelopes with tax
        System.out.println("Socks");
        System.out.println("-Number of socks: " + nSocks );
        System.out.println("-Cost of socks: $"+ sockCost$ );
        System.out.println("Glasses");
        System.out.println("-Number of glasses: " + nGlasses );
        System.out.println("-Cost of glasses: $" + glassCost$ );
        System.out.println("Envelopes");
        System.out.println("-Number of envelopes: " + nEnvelopes );
        System.out.println("-Cost of envelopes: $" + envelopeCost$ );
        System.out.println("Sales tax for all items is 6%" );
        System.out.println("Total cost of socks without tax: $"+ totalSockCost$);
        System.out.println("Total cost of glasses without tax: $"+ totalGlassCost$);
        System.out.println("Total cost of envelopes without tax: $"+ totalEnvelopeCost$);
        System.out.println("Total cost of socks with tax: $" +(int) (taxSockCost$ * 100) / 100.0);
        System.out.println("Total cost of glasses with tax: $" +(int) (taxGlassCost$ * 100) / 100.0);
        System.out.println("Total cost of envelopes with tax: $" +(int) (taxEnvelopeCost$ * 100) / 100.0);
        System.out.println("Total cost of all items without tax: $"+(int) (totalSockCost$ * 100 + totalGlassCost$ * 100 + totalEnvelopeCost$ *100) /100.0);
        System.out.println("Total cost of all items with tax: $"+(int) (taxSockCost$ * 100 + taxGlassCost$ * 100 + taxEnvelopeCost$ * 100) /100.0);
        System.out.println("Total sales tax: $"+(int) (taxSockCost$ * 100 + taxGlassCost$ * 100 + taxEnvelopeCost$ * 100 - totalSockCost$ * 100 - totalGlassCost$ * 100 - totalEnvelopeCost$ *100) /100.0 );
    }
}