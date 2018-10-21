/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;

/**
 *
 * @author Tu vs Tung

 */
public class DictionaryCommandline extends DictionaryManagement{
    public static DictionaryManagement DM=new DictionaryManagement();
    public void  showAllWords(){
        String k = "Word";
        String l = "Mean";
	System.out.printf("%-15s%s \n",k,l);
        arr.forEach((obj) -> {
            System.out.printf("%-15s%s \n",obj.getWord(),obj.getMean());
        });
    }
    public void dictionaryBasic(){
        DM.insertFromCommandline();
        showAllWords();
    }
    public void dictionaryAdvanced(){
        DM.insertFromFile();
        showAllWords();
        //DM.dictionaryLookup();
        
    }
}
