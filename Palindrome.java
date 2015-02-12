
public class Palindrome{
    public static boolean isPalindrome(char[]c,int startIndex,int endIndex){
        int mid=startIndex+endIndex>>1;
        for(int i=endIndex,j=0;i>mid;i--,j++)
            if(c[i]!=c[startIndex+j])
                return false;
        return true;
    }
    public static void main(String[] args){
        char[]c="anynontrivialpropertyofrecursivelyenumerablelanguagesisundecidable".toCharArray();
        int[][]s=new int[c.length][c.length];
        for(int i=0;i<c.length;i++){
            for(int j=i;j>=0;j--){
                if(i==j)
                    s[i][j]=1;
                else{
                    s[j][i]=1+s[j][i-1];
                    int r=-1;
                    for(int k=i-1;k>=j;k--)
                        if(c[k]==c[i]){
                            r=k;
                            break;
                        }
                    int l=-1;
                    for(int k=j;k<i;k++)
                        if(c[k]==c[i]){
                           l=k;
                           break;
                        }
                    
                    if(r!=-1)
                        s[j][i]+=s[l][r];
                    
                    
                }
                    //s[j][i]=s[j][i-1]+s[j+1][i]+(c[i]==c[j]?1:0)-(i-j==1?0:s[j+1][i-1])+(i-j==1?0:isPalindrome(c,j,i)?1:0);
                    
//                System.out.println("s["+j+"]["+i+"] = "+s[j][i]);
            }
        }
        System.out.println(s[0][c.length-1]);
    }
}

