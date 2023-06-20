package oosd.concreteclass;

import oosd.abstractclass.FileSearch;
import oosd.abstractclass.SearchResult;

import java.io.File;
import java.util.Objects;

public class MyFileSearch extends FileSearch {

    @Override
    public SearchResult searchForFile(File root, String queryText, int max) {
        SearchResult result = new MySearchResult();

        if (!root.isDirectory()) {
            return result;
        }
        if (root.listFiles() != null) {
            for (File folderItem : root.listFiles()) {
                if(folderItem.isDirectory()) {
                    if (folderItem.getName().contains(queryText)) {
                        result.addFile(folderItem);
                    }
                }else {
                    if (folderItem.getName().contains(queryText)) {
                        result.addFile(folderItem);
                    }
                }
            }
        }
            return result;
        }
    }

