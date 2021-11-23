package com.kript;

public class programmForRasshif6 {
    public static void main(String[] args){
        String inputText="Pbatenghyngvbaf! Vg'f n Pnrfne pvcure!";
        byte[] input=inputText.getBytes();
        char[] output=new char[input.length];
        int key;
        for(key=1;key<27;key++){
            for(int i=0;i<input.length;i++) {
                char c = (char)input[i];
                char first = 0;
                if(c >= 'a' && c <= 'z') first = 'a';
                else if(c >= 'A' && c <= 'Z') first = 'A';
                if(first == 'a'|| first=='A')
                    c = (char)( first + (c - first - key + 26) % 26) ;
                output[i] = c;
            }
            System.out.print("key= "+key+"\t");
            System.out.println(output);
        }
    }
}
