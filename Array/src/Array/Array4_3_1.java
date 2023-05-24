package Array;

import java.util.Scanner;

public class Array4_3_1 {public static void main(String args[])
{
    int i,j,k;
    int img[][][]={{{ 18,172,127},{ 89,133,136},{175,  8, 43}},
                   {{234,224,113},{128,151, 40},{ 34, 48, 75}},
                   {{141, 28,192},{127, 40,234},{131,228, 98}}};

    System.out.println("3x3畫素之三維矩陣表示圖");
    for(i=0;i<img.length;i++)     // 印出img的內容
       for(j=0;j<img[i].length;j++)
       {
          for(k=0;k<img[i][j].length;k++) {
             System.out.print(img[i][j][k]+"\t");
          }
          System.out.println();
       }

    System.out.println("\n將每一畫素中的r值加30");
    for(i=0;i<img.length;i++)
       for(j=0;j<img[i].length;j++)
       {
          img[i][j][0]+=30;       // r值+30
          if(img[i][j][0]>255)
             img[i][j][0]=255;
       }

    for(i=0;i<img.length;i++)     // 印出img的內容
       for(j=0;j<img[i].length;j++)
       {
          for(k=0;k<img[i][j].length;k++)
             System.out.print(img[i][j][k]+"\t");
          System.out.println();
       }

    System.out.println("\n將每一畫素中的g值減30");
    for(i=0;i<img.length;i++)
       for(j=0;j<img[i].length;j++)
       {
          img[i][j][1]-=30;       // g值-30
          if(img[i][j][1]<0)
             img[i][j][1]=0;
       }

    for(i=0;i<img.length;i++)     // 印出img的內容
       for(j=0;j<img[i].length;j++)
       {
          for(k=0;k<img[i][j].length;k++)
             System.out.print(img[i][j][k]+"\t");
          System.out.println();
       }
 }
}

/* output------------------
3x3畫素之三維矩陣表示圖
18      172     127
89      133     136
175     8       43
234     224     113
128     151     40
34      48      75
141     28      192
127     40      234
131     228     98

將每一畫素中的r值加30
48      172     127
119     133     136
205     8       43
255     224     113
158     151     40
64      48      75
171     28      192
157     40      234
161     228     98

將每一畫素中的g值減30
48      142     127
119     103     136
205     0       43
255     194     113
158     121     40
64      18      75
171     0       192
157     10      234
161     198     98
-------------------------*/
