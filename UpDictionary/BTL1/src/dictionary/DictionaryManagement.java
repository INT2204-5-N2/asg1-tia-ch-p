/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author Tu vs Tung
 */
public class DictionaryManagement {
        
        protected static LinkedList<Word> arr ;
	public static Scanner sr = new Scanner(System.in);
	public DictionaryManagement() {
		super();
		arr = new LinkedList<>();
                insertFromFile();
	}
	public void insertFromCommandline() {
		System.out.print("nhap so luong tu ");
		int n = sr.nextInt(); sr.nextLine();
		for (int i=0;i<n;i++) {
			System.out.print("nhap tu tieng anh: ");
			String en = sr.nextLine();
			System.out.print("nhap nghia tieng viet: ");
			String vi = sr.nextLine();
			Word  obj = new Word(en, vi);
			arr.add(obj);
		}
	}
        private final File f = new File("data/DictEV.dic");
        public final void insertFromFile() {
            try{
		Scanner sc = new Scanner(f);
                    try
			{
                            while(sc.hasNextLine()){
				String[] str = sc.nextLine().split("=");
                                if(!"".equals(str[0]) && !"".equals(str[1])){
                                    Word obj;
                                    obj = new Word(str[0],str[1]);
                                    arr.add(obj);
                                    }
				else System.out.println("");
				}
			}
			catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
			finally
			{
				if(sc!= null) sc.close();
			}
		}
		catch(FileNotFoundException ex)
		{
			System.out.println(ex.getMessage());
		}
            
	}
        public String JMean1(String word){
            for (Word i: arr) {
			if (i.getWord().equals(word)) {
                            return i.getMean();
			}
		}
            return "a";
        }
        public boolean dictionaryLookup(String word){
		for (Word i: arr) {
			if (i.getWord().equals(word)) {
                            return true;
			}
		}
                return false;
        }
        public boolean dictionaryDelete(String word){
                int k=0;
		for (Word i: arr) {
			if (i.getWord().equals(word)) {
                                k++;
				arr.remove(i);
                                return true;
			}
		}
                if(k==0){
                return false;
                }
            return false;
        }
        public boolean dictionaryReplace(String word,String mean){
            int k=0;
                for (Word i: arr) {
			if (i.getWord().trim().equals(word)) {
                            arr.remove(i);
                            arr.add(new Word(word, mean));
                            return true;
			}
		}
                return false;
        }
        public boolean dicionaryAdd(String word,String mean){
            for (Word i: arr) {
			if (i.getWord().equals(word)) {
                                return false;
			}
		}
            Word obj = new Word(word,mean);
            arr.add(obj);
            return true;
        }
        public void save(){
                try(PrintWriter pw=new PrintWriter(f)){
                    arr.forEach((i) -> {
                        pw.println(i.getWord()+"="+i.getMean());
                    });
                } catch (Exception e) {
                }
        }
        public LinkedList<Word> filterWord(String subs){
          LinkedList<Word> ar = new LinkedList<>();
            if (subs.equals("")){
                for (int i =0;i<200;i++){
                   ar.add(arr.get(i));
                   }
            } else { 
                int k = 0;       
                for (int i =0;i<arr.size();i++){
                           if (subs.length()<=arr.get(i).getWord().length()&& arr.get(i).getWord().substring(0, subs.length()).equals(subs))
                           { ar.add(arr.get(i)); 
                               k++;
                              if (k==20) break;}
                        } 
                 }
            return ar;
        }
}
