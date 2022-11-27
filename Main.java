public class Main {

    public static void main(String[] args) {

        String[][] tab = new String[8][2];
        tab[0] = new String[]{"|"};
        tab[1] = new String[]{"_________"};
        tab[2] = new String[]{"         "};
        tab[3] = new String[]{"         ", "    |    "};
        tab[4] = new String[]{"  " + '\134' + "  /   ", "  |   |  "};
        tab[5] = new String[]{"   " + '\134' + "/    ", " |     | "};
        tab[6] = new String[]{"   /" + '\134' + "    ", "  |   |  "};
        tab[7] = new String[]{"  /  " + '\134' + "   ", "    |    "};
        //random number picking whos starting
        int kz = (int) (Math.random() * 2);
        int xi1 = 0, xi2 = 0, xi3 = 0, xi4 = 0, xi5 = 0, xi6 = 0, xi7 = 0, xi8 = 0, xi9 = 0;
        int yi1 = 0, yi2 = 0, yi3 = 0, yi4 = 0, yi5 = 0, yi6 = 0, yi7 = 0, yi8 = 0, yi9 = 0;
        int yt = 0;

        for (int g=0; g < 9; g++) {
            int x = 0;
            int y = 0;
            int cw = 0;
            if (g % 2 == kz) {
                if(g<1)
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 5; j++) {
                        System.out.print(tab[2][0] + "" + tab[0][0] + "" + tab[2][0] + "" + tab[0][0] + "" + tab[2][0] + "\n");
                    }
                    if (i < 2) {
                        System.out.println(tab[1][0] + "" + tab[1][0] + "" + tab[1][0]);
                    }
                }
                System.out.println("Grasz krzyzykami podaj gdzie numer 1-9 odpowiadajacy polu gdzie wstawic x");
                java.util.Scanner scanner = new java.util.Scanner(System.in);
                x = scanner.nextInt();
            } else if(g==0) { //if computer starting hes picking corner
                yt = (int) (Math.random() * 4);
                if (yt==0){
                    y = 1;
                }
                else if(yt==1){
                    y=3;
                }
                else if(yt==2){
                    y=7;
                }
                else if(yt==3){
                    y=9;
                }
            }
            else if(g==1){ // what filed to pick if human is starting
               if(xi5==1) {
                   yt = (int) (Math.random() * 4);
                   if (yt == 0) {
                       y = 3;
                   } else if (yt == 1) {
                       y = 7;
                   } else if (yt == 2) {
                       y = 9;
                   } else {
                       y = 1;
                   }
               }
                else{
                    y=5;
               }
            }
            else if(g==2){ //2nd filed to pick if computer starting
                if(xi2==1||xi4==1||xi6==1||xi8==1){
                    y=5;
                }
                else if(xi1==1||xi3==1||xi7==1||xi9==1){
                    if(yi1==1){
                        if(xi3==1){
                            y = 7;
                        }
                        else if(xi7==1){
                            y=3;
                        }
                        else if(xi5==1){
                            y = 9;
                        }
                        else{
                            yt = (int)(Math.random()*2);
                            if(yt==0){
                                y=7;
                            }
                            else{
                                y=3;
                            }
                        }
                    }
                    else if(yi3==1){
                        if(xi1==1){
                            y = 9;
                        }
                        else if(xi9==1){
                            y=1;
                        }
                        else if(xi5==1){
                            y = 7;
                        }
                        else{
                            yt = (int)(Math.random()*2);
                            if(yt==0){
                                y=1;
                            }
                            else{
                                y=1;
                            }
                        }
                    }
                    else if(yi7==1){
                        if(xi1==1){
                            y = 9;
                        }
                        else if(xi9==1){
                            y=1;
                        }
                        else if(xi5==1){
                            y = 3;
                        }
                        else{
                            yt = (int)(Math.random()*2);
                            if(yt==0){
                                y=1;
                            }
                            else{
                                y=9;
                            }
                        }
                    }
                    else if(yi9==1){
                        if(xi7==1){
                            y = 3;
                        }
                        else if(xi3==1){
                            y=7;
                        }
                        else if(xi5==1){
                            y = 1;
                        }
                        else{
                            yt = (int)(Math.random()*2);
                            if(yt==0){
                                y=3;
                            }
                            else{
                                y=7;
                            }
                        }
                    }
                }
                else{
                    if(yi1==1){
                        y=9;
                    }
                    else if(yi3==1){
                        y=7;
                    }
                    else if(yi7==1){
                        y=3;
                    }
                    else if(yi9==1){
                        y=1;
                    }
                }

            }
            else if(yi5==1&&g==4){ //3 move by computer if he picked corner and middle(when its starting)
                if(yi1==1){
                    if(xi9==0){ //checks for possible win
                        y=9;
                    }
                    else if(xi2==1){
                        y=7;
                    }
                    else if(xi4==1){
                        y=3;
                    }
                    else if(xi9==1){
                        yt = (int)(Math.random()*2);
                        if(yt==0){
                            y=3;
                        }
                        else{
                            y=7;
                        }
                    }
                }
                else if(yi3==1){
                    if(xi7==0){
                        y=7;
                    }
                    else if(xi2==1){
                        y=9;
                    }
                    else if(xi6==1){
                        y=1;
                    }
                    else if(xi7==1){
                        yt = (int)(Math.random()*2);
                        if(yt==0){
                            y=1;
                        }
                        else{
                            y=9;
                        }
                    }
                }
                else if(yi7==1){
                    if(xi3==0){
                        y=3;
                    }
                    else if(xi4==1){
                        y=9;
                    }
                    else if(xi8==1){
                        y=1;
                    }
                    else if(xi3==1){
                        yt = (int)(Math.random()*2);
                        if(yt==0){
                            y=1;
                        }
                        else{
                            y=9;
                        }
                    }
                }
                else if(yi9==1){
                    if(xi1==0){
                        y=1;
                    }
                    else if(xi6==1){
                        y=7;
                    }
                    else if(xi8==1){
                        y=3;
                    }
                    else if(xi1==1){
                        yt = (int)(Math.random()*2);
                        if(yt==0){
                            y=3;
                        }
                        else{
                            y=7;
                        }
                    }
                }
            }
            else if(g==4){
                if(xi5==1){
                    if(xi2==1){
                        y=8;
                    }
                    else if(xi4==1){
                        y=6;
                    }
                    else if(xi6==1){
                        y=4;
                    }
                    else if(xi8==1){
                        y=2;
                    }
                    else if(xi1==1){
                        y=9;
                    }
                    else if(xi3==1){
                        y=7;
                    }
                    else if(xi7==1){
                        y=3;
                    }
                    else if(xi9==1){
                        y=1;
                    }
                }
                else if(yi1==1) {
                    if (yi3 == 1) {
                        if(xi2==0){
                            y=2;
                        }
                        else if (xi9 == 1) {
                            y = 7;
                        } else {
                            y = 9;
                        }
                    } else if (yi7 == 1) {
                        if(xi4==0){
                            y=4;
                        }
                        else if (xi9 == 1) {
                            y = 3;
                        } else {
                            y = 9;
                        }
                    } else if (yi9 == 1) {
                        if (xi7 == 1) {
                            y = 3;
                        } else {
                            y = 7;
                        }
                    }
                }
                else if(yi9==1) {
                    if (yi3 == 1) {
                        if (xi6 == 0) {
                            y = 6;
                        } else if (xi1 == 1) {
                            y = 7;
                        } else {
                            y = 1;
                        }
                    } else if (yi7 == 1) {
                        if (xi8 == 0) {
                            y = 8;
                        } else if (xi3 == 1) {
                            y = 1;
                        } else {
                            y = 3;
                        }
                    } else if (yi1 == 1) {
                        if (xi7 == 1) {
                            y = 3;
                        } else {
                            y = 7;
                        }
                    }
                }
                else if(yi3==1) {
                    if (yi1 == 1) {
                        if (xi2 == 0) {
                            y = 2;
                        } else if (xi7 == 1) {
                            y = 9;
                        } else {
                            y = 7;
                        }
                    } else if (yi9 == 1) {
                        if (xi6 == 0) {
                            y = 6;
                        } else if (xi7 == 1) {
                            y = 1;
                        } else {
                            y = 7;
                        }
                    } else if (yi7 == 1) {
                        if (xi9 == 1) {
                            y = 1;
                        } else {
                            y = 9;
                        }
                    }
                }
                else if(yi7==1) {
                    if (yi1 == 1) {
                        if (xi4 == 0) {
                            y = 4;
                        } else if (xi9 == 1) {
                            y = 3;
                        } else {
                            y = 9;
                        }
                    } else if (yi9 == 1) {
                        if (xi8 == 0) {
                            y = 8;
                        } else if (xi3 == 1) {
                            y = 1;
                        } else {
                            y = 3;
                        }
                    } else if (yi3 == 1) {
                        if (xi1 == 1) {
                            y = 9;
                        } else {
                            y = 1;
                        }
                    }
                }
            }
            else if(g==6) {//4th computer move
                if (yi5 == 1) {
                    if (yi1 == 1) {
                        if (yi3 == 1) {
                            if (xi2 == 0) {
                                y = 2;
                            } else if (xi7 == 0) {
                                y = 7;
                            } else if(xi9==0){
                                y = 9;
                            }
                        } else if (yi7 == 1) {
                            if (xi4 == 0) {
                                y = 4;
                            } else if (xi3 == 0) {
                                y = 3;
                            } else if(xi9==0){
                                y = 9;
                            }
                        }
                    } else if (yi3 == 1) {
                        if (yi1 == 1) {
                            if (xi2 == 0) {
                                y = 2;
                            } else if (xi9 == 0) {
                                y = 9;
                            } else if(xi7==0){
                                y = 7;
                            }
                        } else if (yi9 == 1) {
                            if (xi6 == 0) {
                                y = 6;
                            } else if (xi1 == 0) {
                                y = 1;
                            } else if(xi7==0){
                                y = 7;
                            }
                        }
                    } else if (yi7 == 1) {
                        if (yi9 == 1) {
                            if (xi8 == 0) {
                                y = 8;
                            } else if (xi3 == 0) {
                                y = 3;
                            } else if(xi1==0){
                                y = 1;
                            }
                        } else if (yi1 == 1) {
                            if (xi4 == 0) {
                                y = 4;
                            } else if (xi3 == 0) {
                                y = 3;
                            } else if(xi9==0){
                                y = 9;
                            }
                        }
                    }
                 else if (yi9 == 1) {
                    if (yi7 == 1) {
                        if (xi8 == 0) {
                            y = 8;
                        } else if (xi7 == 0) {
                            y = 7;
                        } else if(xi1==0){
                            y = 1;
                        }
                    } else if (yi3 == 1) {
                        if (xi6 == 0) {
                            y = 6;
                        } else if (xi1 == 0) {
                            y = 1;
                        } else if(xi7==0){
                            y = 7;
                        }
                    }
                }
            } else if(xi5!=1){
                    if(yi1==1){
                        if(xi5==0){
                            y=5;
                        }
                        else if(yi3==1){
                            if(xi2==0){
                                y=2;
                            }
                            else if(yi9==1){
                                if(xi6==0){
                                    y=6;
                                }
                            }
                        }
                        else if(yi7==1){
                            if(xi4==0){
                                y=4;
                            }
                            else if(yi9==1){
                                if(xi8==0){
                                    y=8;
                                }
                            }
                        }
                    }
                    else if(yi3==1){
                        if(xi5==0){
                            y=5;
                        }
                        else if(yi9==1){
                            if(xi6==0){
                                y=6;
                            }
                        }
                    }
                    else if(yi7==1){
                        if(xi5==0){
                            y=5;
                        }
                        else if(yi1==1){
                            if(xi4==0){
                                y=4;
                            }
                        }
                        else if(yi9==1){
                            if(xi8==0){
                                y=8;
                            }
                        }
                    }
                    else if(yi9==1){
                        if(xi5==0){
                            y=5;
                        }
                        else if(yi3==1){
                            if(xi6==0){
                                y=6;
                            }
                        }
                        else if(yi7==1){
                            if(xi8==0){
                                y=8;
                            }
                        }
                    }
                    else{
                        y = (int)((Math.random()*9)+1);
                    }
                }
                else{
                    if(xi9==1&&yi1==0){
                        y=1;
                    }
                    else if(xi7==1&&yi3==0){
                        y=3;
                    }
                    else if(xi3==1&&yi7==0){
                        y=7;
                    }
                    else if(xi1==1&&yi9==0){
                        y=9;
                    }
                    else if(yi1==1&&yi3==1&&xi2==0) {
                        y = 2;
                    }else if(yi1==1&&yi7==1&&xi4==0){
                        y=4;
                    }
                    else if(yi9==1&&yi3==1&&xi6==0) {
                        y = 6;
                    }
                    else if(yi9==1&&yi7==1&&xi8==0){
                        y=8;
                    }
                    else{
                        y = (int)((Math.random()*9)+1);
                        System.out.println(y);
                    }
                }

            }else if(g==8){
                y = (int)((Math.random()*9)+1);
            }
            else if(g==3){
                if(yi5==1){
                    if(xi1==1){
                        if(xi2==1){
                            y=3;
                        }
                        else if(xi3==1){
                            y=2;
                        }
                        else if(xi4==1){
                            y=7;
                        }
                        else if(xi7==1){
                            y=4;
                        }
                        else{
                            y=(int)((Math.random()*9)+1);
                        }
                    }
                    else if(xi9==1){
                        if(xi8==1){
                            y=7;
                        }
                        else if(xi7==1){
                            y=8;
                        }
                        else if(xi3==1){
                            y=6;
                        }
                        else if(xi6==1){
                            y=3;
                        }
                        else{
                            y=(int)((Math.random()*9)+1);
                        }
                    }
                    else if(xi3==1){
                        if(xi6==1){
                            y=9;
                        }
                        else if(xi2==1){
                            y=1;
                        }
                        else{
                            y=(int)((Math.random()*9)+1);
                        }
                    }
                    else if(xi7==1){
                        if(xi4==1){
                            y=1;
                        }
                        else if(xi8==1){
                            y=9;
                        }
                        else{
                            y=(int)((Math.random()*9)+1);
                        }
                    }
                    else{
                        y=(int)((Math.random()*9)+1);
                    }
                }
                else{
                    if(xi1==1){
                        y=9;
                    }
                    else if(xi2==1){
                        y=8;
                    }
                    else if(xi3==1){
                        y=7;
                    }
                    else if(xi4==1){
                        y=6;
                    }
                    else if(xi6==1){
                        y=4;
                    }
                    else if(xi7==1){
                        y=3;
                    }
                    else if(xi8==1){
                        y=2;
                    }
                    else if(xi9==1){
                        y=1;
                    }
                }
            }
            else if(g==5||g==7){
                if(yi5==1){
                    if(yi1==1&&xi9==0){
                        y=9;
                    }
                    else if(yi2==1&&xi8==0){
                        y=8;
                    }
                    else if(yi3==1&&xi7==0){
                        y=7;
                    }
                    else if(yi4==1&&xi6==0){
                        y=6;
                    }
                    else if(yi6==1&&xi4==0){
                        y=4;
                    }
                    else if(yi7==1&&xi3==0){
                        y=3;
                    }
                    else if(yi8==1&&xi2==0){
                        y=2;
                    }
                    else if(yi9==1&&xi1==0){
                        y=1;
                    }
                    else if(xi1==1&&xi2==1&&yi3==0){
                        y=3;
                    }
                    else if(xi1==1&&xi3==1&&yi2==0){
                        y=2;
                    }
                    else if(xi1==1&&xi7==1&&yi4==0){
                        y=4;
                    }
                    else if(xi1==1&&xi4==1&&yi7==0){
                        y=7;
                    }
                    else if(xi3==1&&xi8==1&&yi9==0){
                        y=9;
                    }
                    else if(xi3==1&&xi9==1&&yi8==0){
                        y=8;
                    }
                    else if(xi7==1&&xi8==1&&yi9==0){
                        y=9;
                    }
                    else if(xi7==1&&xi9==1&&yi8==0){
                        y=8;
                    }
                    else{
                        y=(int)((Math.random()*9)+1);
                    }
                }
                else{
                    if(yi1==1&&yi2==1&&xi3==0){
                        y=3;
                    }
                    else if(yi1==1&&yi3==1&&xi2==0){
                        y=2;
                    }
                    else if(yi7==1&&yi8==1&&xi9==0){
                        y=9;
                    }
                    else if(yi7==1&&yi9==1&&xi8==0){
                        y=8;
                    }
                    else if(xi1==1 && yi9==0) {
                        y = 9;
                    }
                    else if(xi1==1 &&xi2==1&&yi3==0){
                        y=3;
                    }
                    else if(xi1==1 &&xi3==1&&yi2==0){
                        y=2;
                    }
                    else if(xi1==1 &&xi7==1&&yi4==0){
                        y=4;
                    }
                    else if(xi1==1 &&xi4==1&&yi7==0){
                        y=7;
                    }
                    else if(xi2==1&& yi8==0){
                        y = 8;
                    }
                    else if(xi3==1 &&yi7==0) {

                        y = 7;
                    }
                    else if(xi3==1 &&xi2==1&&yi1==0){
                        y=1;
                    }
                    else if(xi3==1 &&xi6==1&&yi9==0){
                        y=9;
                    }
                    else if(xi3==1 &&xi9==1&&yi6==0){
                        y=6;
                    }
                    else if(xi4==1&&yi6==0){
                        y=6;
                    }
                    else if(xi6==1&&yi4==0){
                        y=4;
                    }
                    else if(xi7==1 && yi3==0){
                        y = 3;
                    }
                    else if(xi7==1 &&xi4==1&&yi1==0){
                        y=1;
                    }
                    else if(xi7==1 &&xi8==1&&yi9==0){
                        y=9;
                    }
                    else if(xi7==1 &&xi9==1&&yi8==0){
                        y=8;
                    }
                    else if(xi8==1&&yi2==0){
                        y=2;
                    }
                    else if(xi9==1){
                        if(yi1==0) {
                            y = 1;
                        }
                        else if(xi8==1&&yi7==0){
                            y=7;
                        }
                    }
                }
            }

            //placing and checking if its not used
            switch (x) {
                case 1:
                    if (yi1 != 1 && xi1 != 1 && y != 1) {
                        xi1 = 1;
                    } else {
                        System.out.println("Zajete pole");
                        g = g - 1;
                        cw = 1;
                    }
                    break;
                case 2:
                    if (yi2 != 1 && xi2 != 1 && y != 2) {
                        xi2 = 1;
                    } else {
                        System.out.println("Zajete pole");
                        g = g - 1;
                        cw = 1;
                    }
                    break;
                case 3:
                    if (yi3 != 1 && xi3 != 1 && y != 3) {
                        xi3 = 1;
                        cw = 1;
                    } else {
                        System.out.println("Zajete pole");
                        g = g - 1;
                        cw = 1;
                    }
                    break;
                case 4:
                    if (yi4 != 1 && xi4 != 1 && y != 4) {
                        xi4 = 1;
                    } else {
                        System.out.println("Zajete pole");
                        g = g - 1;
                        cw = 1;
                    }
                    break;
                case 5:
                    if (yi5 != 1 && xi5 != 1 && y != 5) {
                        xi5 = 1;
                    } else {
                        System.out.println("Zajete pole");
                        g = g - 1;
                        cw = 1;
                    }
                    break;
                case 6:
                    if (yi6 != 1 && xi6 != 1 && y != 6) {
                        xi6 = 1;
                    } else {
                        System.out.println("Zajete pole");
                        g = g - 1;
                        cw = 1;
                    }
                    break;
                case 7:
                    if (yi7 != 1 && xi7 != 1 && y != 7) {
                        xi7 = 1;
                    } else {
                        System.out.println("Zajete pole");
                        g = g - 1;
                        cw = 1;
                    }
                    break;
                case 8:
                    if (yi8 != 1 && xi8 != 1 && y != 8) {
                        xi8 = 1;
                    } else {
                        System.out.println("Zajete pole");
                        g = g - 1;
                        cw = 1;
                    }
                    break;
                case 9:
                    if (yi9 != 1 && xi9 != 1 && y != 9) {
                        xi9 = 1;
                    } else {
                        System.out.println("Zajete pole");
                        g = g - 1;
                        cw = 1;
                    }
                    break;
            }
            switch (y) {
                case 1:
                    if (yi1 != 1 && xi1 != 1) {
                        yi1 = 1;
                    } else {
                        g = g - 1;
                        cw = 1;
                    }
                    break;
                case 2:
                    if (yi2 != 1 && xi2 != 1) {
                        yi2 = 1;
                    } else {
                        g = g - 1;
                        cw = 1;
                    }
                    break;
                case 3:
                    if (yi3 != 1 && xi3 != 1) {
                        yi3 = 1;
                    } else {
                        g = g - 1;
                        cw = 1;
                    }
                    break;
                case 4:
                    if (yi4 != 1 && xi4 != 1) {
                        yi4 = 1;
                    } else {
                        g = g - 1;
                        cw = 1;
                    }
                    break;
                case 5:
                    if (yi5 != 1 && xi5 != 1) {
                        yi5 = 1;
                    } else {
                        g = g - 1;
                        cw = 1;
                    }
                    break;
                case 6:
                    if (yi6 != 1 && xi6 != 1) {
                        yi6 = 1;
                    } else {
                        g = g - 1;
                        cw = 1;
                    }
                    break;
                case 7:
                    if (yi7 != 1 && xi7 != 1) {
                        yi7 = 1;
                    } else {
                        g = g - 1;
                        cw = 1;
                    }
                    break;
                case 8:
                    if (yi8 != 1 && xi8 != 1) {
                        yi8 = 1;
                    } else {
                        g = g - 1;
                        cw = 1;
                    }
                    break;
                case 9:
                    if (yi9 != 1 && xi9 != 1) {
                        yi9 = 1;
                    } else {
                        g = g - 1;
                        cw = 1;
                    }
                    break;
            }

            if (g % 2 != kz && cw == 0 || g==8 || (xi1 + xi2 + xi3) == 3 || (xi4 + xi5 + xi6) == 3 || (xi7 + xi8 + xi9) == 3 || (xi1 + xi5 + xi9) == 3 || (xi3 + xi5+xi7)==3 || (xi1+xi4+xi7)==3 || (xi2+xi5+xi8)==3 || (xi3+xi6+xi9)==3) {
                for (int i = 0; i < 3; i++) {
                    if (i == 0) {
                        for (int j = 0; j < 5; j++) {
                            //checks if field no 1 is taken and so on
                            if (xi1 == 1) {
                                System.out.print(tab[j + 3][0] + "" + tab[0][0]);
                                //checks also other fields
                                if (xi2 == 1) {
                                    System.out.print(tab[j + 3][0] + "" + tab[0][0]);
                                    if (xi3 == 1) {
                                        System.out.print(tab[j + 3][0] + '\n');
                                    } else if (yi3 == 1) {
                                        System.out.print(tab[j + 3][1] + '\n');
                                    } else {
                                        System.out.print(tab[2][0] + '\n');
                                    }
                                } else if (yi2 == 1) {
                                    System.out.print(tab[j + 3][1] + "" + tab[0][0]);
                                    if (xi3 == 1) {
                                        System.out.print(tab[j + 3][0] + '\n');
                                    } else if (yi3 == 1) {
                                        System.out.print(tab[j + 3][1] + '\n');
                                    } else {
                                        System.out.print(tab[2][0] + '\n');
                                    }
                                } else if (xi3 == 1) {
                                    System.out.print(tab[2][0] + "" + tab[0][0] + "" + tab[j + 3][0] + "\n");
                                } else if (yi3 == 1) {
                                    System.out.print(tab[2][0] + "" + tab[0][0] + "" + tab[j + 3][1] + "\n");
                                } else {
                                    System.out.print(tab[2][0] + "" + tab[0][0] + "" + tab[2][0] + '\n');
                                }
                            } else if (yi1 == 1) {
                                System.out.print(tab[j + 3][1] + "" + tab[0][0]);
                                if (xi2 == 1) {
                                    System.out.print(tab[j + 3][0] + "" + tab[0][0]);
                                    if (xi3 == 1) {
                                        System.out.print(tab[j + 3][0] + '\n');
                                    } else if (yi3 == 1) {
                                        System.out.print(tab[j + 3][1] + '\n');
                                    } else {
                                        System.out.print(tab[2][0] + '\n');
                                    }
                                } else if (yi2 == 1) {
                                    System.out.print(tab[j + 3][1] + "" + tab[0][0]);
                                    if (xi3 == 1) {
                                        System.out.print(tab[j + 3][0] + '\n');
                                    } else if (yi3 == 1) {
                                        System.out.print(tab[j + 3][1] + '\n');
                                    } else {
                                        System.out.print(tab[2][0] + '\n');
                                    }
                                } else if (xi3 == 1) {
                                    System.out.print(tab[2][0] + "" + tab[0][0] + "" + tab[j + 3][0] + "\n");
                                } else if (yi3 == 1) {
                                    System.out.print(tab[2][0] + "" + tab[0][0] + "" + tab[j + 3][1] + "\n");
                                } else {
                                    System.out.print(tab[2][0] + "" + tab[0][0] + "" + tab[2][0] + '\n');
                                }
                            } else if (xi2 == 1) {
                                System.out.print(tab[2][0] + "" + tab[0][0] + "" + tab[j + 3][0] + "" + tab[0][0]);
                                if (xi3 == 1) {
                                    System.out.print(tab[j + 3][0] + '\n');
                                } else if (yi3 == 1) {
                                    System.out.print(tab[j + 3][1] + '\n');
                                } else {
                                    System.out.print(tab[2][0] + '\n');
                                }

                            } else if (yi2 == 1) {
                                System.out.print(tab[2][0] + "" + tab[0][0] + "" + tab[j + 3][1] + "" + tab[0][0]);
                                if (xi3 == 1) {
                                    System.out.print(tab[j + 3][0] + '\n');
                                } else if (yi3 == 1) {
                                    System.out.print(tab[j + 3][1] + '\n');
                                } else {
                                    System.out.print(tab[2][0] + '\n');
                                }

                            } else if (xi3 == 1) {
                                System.out.print(tab[2][0] + "" + tab[0][0] + "" + tab[2][0] + "" + tab[0][0] + "" + tab[j + 3][0] + '\n');
                            } else if (yi3 == 1) {
                                System.out.print(tab[2][0] + "" + tab[0][0] + "" + tab[2][0] + "" + tab[0][0] + "" + tab[j + 3][1] + '\n');
                            } else {
                                System.out.print(tab[2][0] + "" + tab[0][0] + "" + tab[2][0] + "" + tab[0][0] + "" + tab[2][0] + '\n');
                            }
                        }
                    }
                    if (i == 1) {
                        System.out.println(tab[1][0] + "" + tab[1][0] + "" + tab[1][0]);
                        for (int j = 0; j < 5; j++) {
                            //checks if fields 4-6 are taken and so on
                            if (xi4 == 1) {
                                System.out.print(tab[j + 3][0] + "" + tab[0][0]);
                                //checks also other fields
                                if (xi5 == 1) {
                                    System.out.print(tab[j + 3][0] + "" + tab[0][0]);
                                    if (xi6 == 1) {
                                        System.out.print(tab[j + 3][0] + '\n');
                                    } else if (yi6 == 1) {
                                        System.out.print(tab[j + 3][1] + '\n');
                                    } else {
                                        System.out.print(tab[2][0] + '\n');
                                    }
                                } else if (yi5 == 1) {
                                    System.out.print(tab[j + 3][1] + "" + tab[0][0]);
                                    if (xi6 == 1) {
                                        System.out.print(tab[j + 3][0] + '\n');
                                    } else if (yi6 == 1) {
                                        System.out.print(tab[j + 3][1] + '\n');
                                    } else {
                                        System.out.print(tab[2][0] + '\n');
                                    }
                                } else if (xi6 == 1) {
                                    System.out.print(tab[2][0] + "" + tab[0][0] + "" + tab[j + 3][0] + "\n");
                                } else if (yi6 == 1) {
                                    System.out.print(tab[2][0] + "" + tab[0][0] + "" + tab[j + 3][1] + "\n");
                                } else {
                                    System.out.print(tab[2][0] + "" + tab[0][0] + "" + tab[2][0] + '\n');
                                }
                            } else if (yi4 == 1) {
                                System.out.print(tab[j + 3][1] + "" + tab[0][0]);
                                if (xi5 == 1) {
                                    System.out.print(tab[j + 3][0] + "" + tab[0][0]);
                                    if (xi6 == 1) {
                                        System.out.print(tab[j + 3][0] + '\n');
                                    } else if (yi6 == 1) {
                                        System.out.print(tab[j + 3][1] + '\n');
                                    } else {
                                        System.out.print(tab[2][0] + '\n');
                                    }
                                } else if (yi5 == 1) {
                                    System.out.print(tab[j + 3][1] + "" + tab[0][0]);
                                    if (xi6 == 1) {
                                        System.out.print(tab[j + 3][0] + '\n');
                                    } else if (yi6 == 1) {
                                        System.out.print(tab[j + 3][1] + '\n');
                                    } else {
                                        System.out.print(tab[2][0] + '\n');
                                    }
                                } else if (xi6 == 1) {
                                    System.out.print(tab[2][0] + "" + tab[0][0] + "" + tab[j + 3][0] + "\n");
                                } else if (yi6 == 1) {
                                    System.out.print(tab[2][0] + "" + tab[0][0] + "" + tab[j + 3][1] + "\n");
                                } else {
                                    System.out.print(tab[2][0] + "" + tab[0][0] + "" + tab[2][0] + '\n');
                                }
                            } else if (xi5 == 1) {
                                System.out.print(tab[2][0] + "" + tab[0][0] + "" + tab[j + 3][0] + "" + tab[0][0]);
                                if (xi6 == 1) {
                                    System.out.print(tab[j + 3][0] + '\n');
                                } else if (yi6 == 1) {
                                    System.out.print(tab[j + 3][1] + '\n');
                                } else {
                                    System.out.print(tab[2][0] + '\n');
                                }

                            } else if (yi5 == 1) {
                                System.out.print(tab[2][0] + "" + tab[0][0] + "" + tab[j + 3][1] + "" + tab[0][0]);
                                if (xi6 == 1) {
                                    System.out.print(tab[j + 3][0] + '\n');
                                } else if (yi6 == 1) {
                                    System.out.print(tab[j + 3][1] + '\n');
                                } else {
                                    System.out.print(tab[2][0] + '\n');
                                }

                            } else if (xi6 == 1) {
                                System.out.print(tab[2][0] + "" + tab[0][0] + "" + tab[2][0] + "" + tab[0][0] + "" + tab[j + 3][0] + '\n');
                            } else if (yi6 == 1) {
                                System.out.print(tab[2][0] + "" + tab[0][0] + "" + tab[2][0] + "" + tab[0][0] + "" + tab[j + 3][1] + '\n');
                            } else {
                                System.out.print(tab[2][0] + "" + tab[0][0] + "" + tab[2][0] + "" + tab[0][0] + "" + tab[2][0] + '\n');
                            }
                        }
                    }
                    if (i == 2) {
                        System.out.println(tab[1][0] + "" + tab[1][0] + "" + tab[1][0]);
                        for (int j = 0; j < 5; j++) {
                            //checks if fields 7-9 are taken and so on
                            if (xi7 == 1) {
                                System.out.print(tab[j + 3][0] + "" + tab[0][0]);
                                //checks also other fields
                                if (xi8 == 1) {
                                    System.out.print(tab[j + 3][0] + "" + tab[0][0]);
                                    if (xi9 == 1) {
                                        System.out.print(tab[j + 3][0] + '\n');
                                    } else if (yi9 == 1) {
                                        System.out.print(tab[j + 3][1] + '\n');
                                    } else {
                                        System.out.print(tab[2][0] + '\n');
                                    }
                                } else if (yi8 == 1) {
                                    System.out.print(tab[j + 3][1] + "" + tab[0][0]);
                                    if (xi9 == 1) {
                                        System.out.print(tab[j + 3][0] + '\n');
                                    } else if (yi9 == 1) {
                                        System.out.print(tab[j + 3][1] + '\n');
                                    } else {
                                        System.out.print(tab[2][0] + '\n');
                                    }
                                } else if (xi9 == 1) {
                                    System.out.print(tab[2][0] + "" + tab[0][0] + "" + tab[j + 3][0] + "\n");
                                } else if (yi9 == 1) {
                                    System.out.print(tab[2][0] + "" + tab[0][0] + "" + tab[j + 3][1] + "\n");
                                } else {
                                    System.out.print(tab[2][0] + "" + tab[0][0] + "" + tab[2][0] + '\n');
                                }
                            } else if (yi7 == 1) {
                                System.out.print(tab[j + 3][1] + "" + tab[0][0]);
                                if (xi8 == 1) {
                                    System.out.print(tab[j + 3][0] + "" + tab[0][0]);
                                    if (xi9 == 1) {
                                        System.out.print(tab[j + 3][0] + '\n');
                                    } else if (yi9 == 1) {
                                        System.out.print(tab[j + 3][1] + '\n');
                                    } else {
                                        System.out.print(tab[2][0] + '\n');
                                    }
                                } else if (yi8 == 1) {
                                    System.out.print(tab[j + 3][1] + "" + tab[0][0]);
                                    if (xi9 == 1) {
                                        System.out.print(tab[j + 3][0] + '\n');
                                    } else if (yi9 == 1) {
                                        System.out.print(tab[j + 3][1] + '\n');
                                    } else {
                                        System.out.print(tab[2][0] + '\n');
                                    }
                                } else if (xi9 == 1) {
                                    System.out.print(tab[2][0] + "" + tab[0][0] + "" + tab[j + 3][0] + "\n");
                                } else if (yi9 == 1) {
                                    System.out.print(tab[2][0] + "" + tab[0][0] + "" + tab[j + 3][1] + "\n");
                                } else {
                                    System.out.print(tab[2][0] + "" + tab[0][0] + "" + tab[2][0] + '\n');
                                }
                            } else if (xi8 == 1) {
                                System.out.print(tab[2][0] + "" + tab[0][0] + "" + tab[j + 3][0] + "" + tab[0][0]);
                                if (xi9 == 1) {
                                    System.out.print(tab[j + 3][0] + '\n');
                                } else if (yi9 == 1) {
                                    System.out.print(tab[j + 3][1] + '\n');
                                } else {
                                    System.out.print(tab[2][0] + '\n');
                                }

                            } else if (yi8 == 1) {
                                System.out.print(tab[2][0] + "" + tab[0][0] + "" + tab[j + 3][1] + "" + tab[0][0]);
                                if (xi9 == 1) {
                                    System.out.print(tab[j + 3][0] + '\n');
                                } else if (yi9 == 1) {
                                    System.out.print(tab[j + 3][1] + '\n');
                                } else {
                                    System.out.print(tab[2][0] + '\n');
                                }

                            } else if (xi9 == 1) {
                                System.out.print(tab[2][0] + "" + tab[0][0] + "" + tab[2][0] + "" + tab[0][0] + "" + tab[j + 3][0] + '\n');
                            } else if (yi9 == 1) {
                                System.out.print(tab[2][0] + "" + tab[0][0] + "" + tab[2][0] + "" + tab[0][0] + "" + tab[j + 3][1] + '\n');
                            } else {
                                System.out.print(tab[2][0] + "" + tab[0][0] + "" + tab[2][0] + "" + tab[0][0] + "" + tab[2][0] + '\n');
                            }
                        }
                    }
                }
            }
            if ((xi1 + xi2 + xi3) == 3 || (xi4 + xi5 + xi6) == 3 || (xi7 + xi8 + xi9) == 3 || (xi1 + xi5 + xi9) == 3 || (xi3 + xi5+xi7)==3 || (xi1+xi4+xi7)==3 || (xi2+xi5+xi8)==3 || (xi3+xi6+xi9)==3) {
                System.out.println("Wygrywasz!");
                g=9;
            }
            else if ((yi1 + yi2 + yi3) == 3 || (yi4 + yi5 + yi6) == 3 || (yi7 + yi8 + yi9) == 3 || (yi1 + yi5 + yi9) == 3 || (yi3 + yi5+yi7)==3 || (yi1+yi4+yi7)==3 || (yi2+yi5+yi8)==3 || (yi3+yi6+yi9)==3) {
                System.out.println("Przegrywasz!");
                g=9;
            }
            else if(g==8){
                System.out.println("Remis");
            }
        }
    }
}