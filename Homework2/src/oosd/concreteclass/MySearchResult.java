package oosd.concreteclass;
import oosd.abstractclass.SearchResult;
import java.io.File;

public class MySearchResult extends SearchResult {
    MySearchResult(){
        this.size=0;
        this.max=5;
        this.files=new File[max];
    }

    @Override
    public int getSize() {
        return this.size;
    }

    @Override
    public File[] getFiles() {
        File[] file=new File[this.size];
        for(int i=0;i<this.size;i++){
            file[i]=this.files[i];
        }
        return file;
    }

    @Override
    public boolean isMax() {
        if(this.size<this.max){
            return false;

        }else{
            return true;
        }
    }

    @Override
    public void addFile(File file) {
        this.files[this.size]=file;
        this.size+=1;
    }

    @Override
    public SearchResult copy() {
        MySearchResult a= new MySearchResult();
        a.files=this.getFiles();
        return a;
    }
}