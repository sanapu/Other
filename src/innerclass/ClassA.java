package innerclass;

/*
 * CONFIDENTIAL
 *
 * Copyright (c) 2018-2019 International Lottery & Totalizator Systems, Inc.
 * All Rights Reserved www.ilts.com
 *
 * File: MayBankFunctions.java
 * Description: Performs various functions related to MayBank File
 */



import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author mdmonty
 */
public class ClassA {

    /**
     * Pre-Defined Fillers
     **/
    private static final String PIPE_DELIMITER= "|";
    private static final String IGNORED_FIELD= "";
    /**
     * MAX allowed LENGTHS for various fields
     */
    private static final int HEADER_FILLER_LEN = 25;
    private static final int FOOTER_FILLER_LEN = 25;

    /**
     * Pre-Defined CODES
     **/
    private static final String HEADER_RECORDTYPE = "00";
    private static final String RECORD_RECORDTYPE = "01";
    private static final String PAYMENT_RECORDTYPE = "02";
    private static final String FOOTER_RECORDTYPE = "99";

    private static final String ADVICE_TYPE = "PA";
    private static final String CHARGES_BORNE = "01";
    private static final String TRANS_CURRENCY = "MYR";
    private static final String RESIDENT_INDICATOR = "Y";
    private static final String CORPORATE_ID = "MYSPTOTO";
    private static final String INDEBIT_ACC_CURRENCY = "Y";
    private static final String DEBIT_ACCOUNT_NUM = "514011538261";
    private static final String DEBIT_DESC = "Being Payment for eTOTO Withdrawal";

    /**
     * Function : generateHeader
     * @param batchID
     * @return Header Map
     */
    public static Map<Integer, String> generateHeader(String batchID) {
        Map<Integer,String> headMap = new HashMap<>();

        // #1 Header Record Type - Length : 2
        headMap.put(0, HEADER_RECORDTYPE + PIPE_DELIMITER);

        // #2 Corporate ID - Length 30
        headMap.put(1, CORPORATE_ID + PIPE_DELIMITER);

        // #3 Batch ID - Length : 30
        headMap.put(2, batchID + PIPE_DELIMITER);

        // #4-28,29 Filler - Length : 100 but default to 25 Filler Pipes.
        headMap.put(3, HEADER_FILLER_LEN + PIPE_DELIMITER);

        return headMap;
    }

    /**
     * Function : generateFooter
     * @param batchID
     * @return Footer Map
     */
    public static Map<Integer, String> generateFooter(String[] args) {
        Map<Integer,String> footMap = new HashMap<>();

        // #1 Trailer Record Type - Length : 2
        footMap.put(0, FOOTER_RECORDTYPE + PIPE_DELIMITER);

        // #2 Total Count - Length 6
        footMap.put(1, args[0] + PIPE_DELIMITER);

        // #3 Total Debiting Amount - Length : 13/2
        footMap.put(2, args[1] + PIPE_DELIMITER);

        // #4 Hashing Value - Length : 15
        footMap.put(3, args[2] + PIPE_DELIMITER);

        // #5 Filler - Length : 100 but default to 25 Filler Pipes.
        footMap.put(4, FOOTER_FILLER_LEN+ PIPE_DELIMITER);

        return footMap;
    }

    /**
     * Function : generateRecord
     * @param args
     * @return Record Map
     */
    public static Map<Integer, String> generateRecord(String[] args) {
        Map<Integer,String> recordMap = new HashMap<>();

        int mapIndex = 0;

        // #1 Record Record Type - Length : 2
        recordMap.put(mapIndex++, RECORD_RECORDTYPE + PIPE_DELIMITER);
        System.out.println("map index "+mapIndex +" get Key "+ recordMap.get(mapIndex-1));

        //  #2 Payment Mode - Length 2
        recordMap.put(mapIndex++, args[0] + PIPE_DELIMITER);
        System.out.println("map index "+mapIndex +" get Key "+ recordMap.get(mapIndex-1));
        //  #3 Provider Product Group Name - Length : 50
        recordMap.put(mapIndex++, args[1] + PIPE_DELIMITER);
        System.out.println("map index "+mapIndex +" get Key "+ recordMap.get(mapIndex-1));
        //  #4 Destination Country - Length : 2
        recordMap.put(mapIndex++, IGNORED_FIELD + PIPE_DELIMITER);
        System.out.println("map index "+mapIndex +" get Key "+ recordMap.get(mapIndex-1));
        //  #5 Value Date(DDMMYYYY - IMPORTANT to remember: +2 days from Batch generation) - Length : 8
        recordMap.put(mapIndex++, args[2] + PIPE_DELIMITER);
        System.out.println("map index "+mapIndex +" get Key "+ recordMap.get(mapIndex-1));
        //  #6 Cheque Date(DDMMYYYY) - Length : 8
        recordMap.put(mapIndex++, IGNORED_FIELD + PIPE_DELIMITER);
        System.out.println("map index "+mapIndex +" get Key "+ recordMap.get(mapIndex-1));
        //  #7 By Order By - Length : 50
        recordMap.put(mapIndex++, args[3] + PIPE_DELIMITER);
        System.out.println("map index "+mapIndex +" get Key "+ recordMap.get(mapIndex-1));
        //  #8 Customer Reference Number(EBS Batch ID + Customer Account ID) - Length : 30
        recordMap.put(mapIndex++, args[4] + PIPE_DELIMITER);
        System.out.println("map index "+mapIndex +" get Key "+ args[4]+"---------"  + recordMap.get(mapIndex-1));
        //  #9 Debit Reference - Length : 55
        recordMap.put(mapIndex++, IGNORED_FIELD + PIPE_DELIMITER);
        System.out.println("map index "+mapIndex +" get Key "+ recordMap.get(mapIndex-1));
        //  #10 Debit Description - Length : 55
        recordMap.put(mapIndex++, DEBIT_DESC + PIPE_DELIMITER);
        System.out.println("map index "+mapIndex +" get Key "+ recordMap.get(mapIndex-1));
        //  #11 Transaction Currency - Length : 3
        recordMap.put(mapIndex++, TRANS_CURRENCY + PIPE_DELIMITER);
        System.out.println("map index "+mapIndex +" get Key "+ recordMap.get(mapIndex-1));
        //  #12 Transaction Amount - Length : 13/2
        recordMap.put(mapIndex++, args[5] + PIPE_DELIMITER);
        System.out.println("map index "+mapIndex +" get Key "+ recordMap.get(mapIndex-1));
        //  #13 InDebit Account Currency - Length : 1
        recordMap.put(mapIndex++, INDEBIT_ACC_CURRENCY + PIPE_DELIMITER);
        System.out.println("map index "+mapIndex +" get Key "+ recordMap.get(mapIndex-1));
        //  #14 Debiting Currency(Same as Transaction Currency) - Length : 3
        recordMap.put(mapIndex++, TRANS_CURRENCY + PIPE_DELIMITER);
        System.out.println("map index "+mapIndex +" get Key "+ recordMap.get(mapIndex-1));
        //  #15 Debiting Account Number - Length : 20
        recordMap.put(mapIndex++, DEBIT_ACCOUNT_NUM + PIPE_DELIMITER);
        System.out.println("map index "+mapIndex +" get Key "+ recordMap.get(mapIndex-1));
        //  #16 Credit Account Number - Length 35
        recordMap.put(mapIndex++, args[6] + PIPE_DELIMITER);
        System.out.println("map index "+mapIndex +" get Key "+ recordMap.get(mapIndex-1));
        //  #17 Fav Benefeciary / Biller Code - Length : 15
        recordMap.put(mapIndex++, IGNORED_FIELD + PIPE_DELIMITER);
        System.out.println("map index "+mapIndex +" get Key "+ recordMap.get(mapIndex-1));
        //  #18 Biller Organization - Length : 10
        recordMap.put(mapIndex++, IGNORED_FIELD + PIPE_DELIMITER);
        System.out.println("map index "+mapIndex +" get Key "+ recordMap.get(mapIndex-1));
        //  #19 Resident Indicator - Length : 1
        recordMap.put(mapIndex++, RESIDENT_INDICATOR + PIPE_DELIMITER);
        System.out.println("map index "+mapIndex +" get Key "+ recordMap.get(mapIndex-1));
        //  #20 Beneficiary Name 1 - Length : 40
        recordMap.put(mapIndex++, args[7] + PIPE_DELIMITER);
        System.out.println("map index "+mapIndex +" get Key "+ recordMap.get(mapIndex-1));
        //  #21 Benefeciary Name 2 - Length : 40
        recordMap.put(mapIndex++, IGNORED_FIELD + PIPE_DELIMITER);
        System.out.println("map index "+mapIndex +" get Key "+ recordMap.get(mapIndex-1));
        //  #22 Benefeciary Name 3 - Length : 40
        recordMap.put(mapIndex++, IGNORED_FIELD + PIPE_DELIMITER);
        System.out.println("map index "+mapIndex +" get Key "+ recordMap.get(mapIndex-1));
        //  #23 Benefeciary Contact Number - Length : 14
        recordMap.put(mapIndex++, IGNORED_FIELD + PIPE_DELIMITER);
        System.out.println("map index "+mapIndex +" get Key "+ recordMap.get(mapIndex-1));
        //  #24 BENEFECIARY ID - Length : 20
        recordMap.put(mapIndex++, IGNORED_FIELD + PIPE_DELIMITER);
        System.out.println("map index "+mapIndex +" get Key "+ recordMap.get(mapIndex-1));
        //  #25 NEW ID No - Length : 20
        recordMap.put(mapIndex++, args[8] + PIPE_DELIMITER);
        System.out.println("map index "+mapIndex +" get Key "+ recordMap.get(mapIndex-1));
        //  #26 OLD ID No - Length : 20
        recordMap.put(mapIndex++, IGNORED_FIELD + PIPE_DELIMITER);
        System.out.println("map index "+mapIndex +" get Key "+ recordMap.get(mapIndex-1));
        //  #27 Business Registration No - Length : 20
        recordMap.put(mapIndex++, IGNORED_FIELD + PIPE_DELIMITER);
        System.out.println("map index "+mapIndex +" get Key "+ recordMap.get(mapIndex-1));
        //  #28 Passport No - Length : 20
        recordMap.put(mapIndex++, args[9] + PIPE_DELIMITER);
        System.out.println("map index "+mapIndex +" get Key "+ recordMap.get(mapIndex-1));
        //  #29 - 109 (Can be Ignored)
        for(int i = mapIndex; i<109; i++)
            recordMap.put(mapIndex++, IGNORED_FIELD + PIPE_DELIMITER);
        System.out.println("map index "+mapIndex +" get Key "+ recordMap.get(mapIndex-1));
        //  #110 Charges Borne By - Length : 2
        recordMap.put(mapIndex++, CHARGES_BORNE + PIPE_DELIMITER);
        System.out.println("map index "+mapIndex +" get Key "+ recordMap.get(mapIndex-1));
        //  #111 Purpose Of Transfer - Length : 5
        recordMap.put(mapIndex++, IGNORED_FIELD + PIPE_DELIMITER);
        System.out.println("map index "+mapIndex +" get Key "+ recordMap.get(mapIndex-1));
        //  #112 - 336 (Can be Ignored)
        for (int i = mapIndex; i<337; i++)
            recordMap.put(mapIndex++, IGNORED_FIELD + PIPE_DELIMITER);
        System.out.println("map index "+mapIndex +" get Key "+ recordMap.get(mapIndex-1));
       System.out.println(String.format("MayBankFunctions::generateRecord() : Num of map items [" + mapIndex +"],"
                + "  Num of retrieved Values ["+args.length+"]"));

        return recordMap;
    }

    /**
     * Function : generatePaymentAdvice
     * @param args
     * @return Payment Advice Map
     */
    public static Map<Integer, String> generatePaymentAdvice(String[] args) {
        Map<Integer,String> payAdviceMap = new HashMap<>();

        int mapIndex = 0;
        System.out.println("map index "+mapIndex +" get Key "+ payAdviceMap.get(mapIndex));
        // #1 Payment Record Type - Length : 2
        payAdviceMap.put(mapIndex++, PAYMENT_RECORDTYPE + PIPE_DELIMITER);


        System.out.println("map index "+mapIndex +" get Key "+ payAdviceMap.get(mapIndex-1));
        //  #2 Advice Type - Length 2
        payAdviceMap.put(mapIndex++, ADVICE_TYPE + PIPE_DELIMITER);

        //  #3 Customer Reference Number(EBS Batch ID + Customer Account ID) - Length : 30
        System.out.println("map index "+mapIndex +" get Key "+ payAdviceMap.get(mapIndex-1));
        payAdviceMap.put(mapIndex++, args[0] + PIPE_DELIMITER);

        //  #4 Email - Length : 80
        System.out.println("map index "+mapIndex +" get Key "+ payAdviceMap.get(mapIndex-1));
        payAdviceMap.put(mapIndex++, args[1] + PIPE_DELIMITER);

        System.out.println("map index "+mapIndex +" get Key "+ payAdviceMap.get(mapIndex-1));
        //  #5 - 40 (Can be Ignored) except for #7 and #14
        for (int i = mapIndex; i<40; i++) {

            if (mapIndex == 6) {
                payAdviceMap.put(mapIndex++, args[2] + PIPE_DELIMITER);
                System.out.println("map index "+mapIndex +" get Key "+ payAdviceMap.get(mapIndex-1));
            }
            else if (mapIndex == 13) {
                payAdviceMap.put(mapIndex++, args[3] + PIPE_DELIMITER);
                System.out.println("map index "+mapIndex +" get Key "+ payAdviceMap.get(mapIndex-1));
            }
            else {
                payAdviceMap.put(mapIndex++, IGNORED_FIELD + PIPE_DELIMITER);
                System.out.println("map index "+mapIndex +" get Key "+ payAdviceMap.get(mapIndex-1));
            }
        }
        System.out.println("map index "+mapIndex +" get Key "+ payAdviceMap.get(mapIndex-1));
        return payAdviceMap;
    }
}
