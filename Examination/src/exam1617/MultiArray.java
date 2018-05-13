package exam1617;

/**
 * Created by Daveola on 08-Apr-17.
 */
public class MultiArray {


    //C.	Write a program that uses a for loop to print
    // out the names, matric numbers and ages of 25 students
    // of UNIOSUN stored in a multi-dimensional array.

    public static void main(String args[]){



        String[] arrayNames = {"Ade","Mike","Wale","Ogun","Funke","Ali","Bako","Olaolu","Michael","Nicky","Mikey","Soji","Kola","Kayode","Bayo","Chuks","Nancy","idowu","Kanyin","Lami","Toun","Ladeji","Yemi","Oyin","Damola"};
        String[] arrayMatrics = {"CSC/12/0010","CSC/12/0011","CSC/12/0012","CSC/13/0010","CSC/12/0013","CSC/12/0014","CSC/12/0015","CSC/12/0016","CSC/12/0017","CSC/12/0018","CSC/12/0019","CSC/12/0020","CSC/12/0021","CSC/12/0022","CSC/12/0023","CSC/12/0024","CSC/12/0025","CSC/12/0026","CSC/12/0027","CSC/12/0028","CSC/12/0029","CSC/12/0030","CSC/12/0031","CSC/12/0032","CSC/12/0033"};
        String[] arrayAges = {"16","17","16","18","19","20","20","21","21","18","19","19","19","24","16","17","19","20","20","21","22","22","22","25","30"};

        String[][][] arrayData = new String[25][25][25];

        //arrayData = {{arrayNames},{arrayMatrics},{arrayAges}};

        System.out.println("arrayNames.length: "+ arrayNames.length);
        System.out.println("arrayMatrics.length: "+ arrayMatrics.length);
        System.out.println("arrayAges.length: "+ arrayAges.length);

        int cnta=0, cntb=0, cntc = 0;
        for (cnta = 0; cnta < arrayNames.length; cnta++) {
            arrayData[cnta][cntb][cntc] = arrayNames[cnta];
          //  System.out.println("Name for student at " + (cnta)+":"+(cntb)+":"+(cntc) + ": Name:  "+arrayData[cnta][cntb][cntc]);

        }

        for (cntb = 0; cntb < arrayMatrics.length; cntb++) {
            for (cntc = 0; cntc < arrayAges.length; cntc++) {
                for (cnta = 0; cnta < arrayNames.length; cnta++) {
                    arrayData[cnta][cntb][cntc] = arrayMatrics[cntb];
                   // System.out.println("Name for student at " + (cnta) + ":" + (cntb) + ":" + (cntc) + ": Name:  " + arrayData[cnta][cntb][cntc]);

                }
            }
        }
        for (cntc = 0; cntc < arrayAges.length; cntc++) {
            for (cntb = 0; cntb < arrayMatrics.length; cntb++) {
                for (cnta = 0; cnta < arrayNames.length; cnta++) {
                    arrayData[cnta][cntb][cntc] = arrayAges[cntc];
                    //System.out.println("Name for student at " + (cnta)+":"+(cntb)+":"+(cntc) + ": Name:  "+arrayData[cnta][cntb][cntc]);
                }
            }


        }





        for (cntc = 0; cntc < arrayAges.length; cntc++){
            for ( cntb = 0; cntb < arrayMatrics.length; cntb++){
                for ( cnta = 0; cnta < arrayNames.length; cnta++){
                  // System.out.println("Data for student " + (cnta)+":"+(cntb)+":"+(cntc));

                    System.out.println("Data for student " + (cnta)+":"+(cntb)+":"+(cntc) + ": Name:  "+arrayData[cnta][cntb][cntc]);
                }
            }

        }


    }
}
