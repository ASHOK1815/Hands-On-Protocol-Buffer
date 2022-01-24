
import Schema.SearchRequestPackage.SearchRequest;

import java.util.ArrayList;

public class RequestMain {


    public static SearchRequest.Corpus setCORPUS(String value)
    {

        if (value.equals("video")) {
            return SearchRequest.Corpus.VIDEO;
        }
        else if(value.equals("web"))
        {
            return SearchRequest.Corpus.WEB;
        }
        else if(value.equals("images"))
        {
            return SearchRequest.Corpus.IMAGES;
        }
        else if(value.equals("local"))
        {
            return SearchRequest.Corpus.LOCAL;
        }
        else if(value.equals("news"))
        {
            return SearchRequest.Corpus.NEWS;
        }
        else if(value.equals("products"))
        {
            return SearchRequest.Corpus.PRODUCTS;
        }


        return SearchRequest.Corpus.UNIVERSAL;
    }

    public static void main(String[] args) {

        SearchRequest.Builder seBuilder = Schema.SearchRequestPackage.SearchRequest.newBuilder();
        System.out.println(seBuilder.isInitialized());
        seBuilder.setPageNumber(1);
        seBuilder.setQuery(String.valueOf(1));
        seBuilder.setResultPerPage(12);
        seBuilder.setCorpus(setCORPUS("web"));


        SearchRequest message  = seBuilder.build();
        System.out.println(message);


        ArrayList<SearchRequest> list = new ArrayList<>();
        list.add(message);


        System.out.println(list.toString());





    }
}
