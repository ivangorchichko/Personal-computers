import Entity.Company;
import Entity.Types.NetBook;
import Service.INoteBook;

public class Main {
    public static void main(String[] args) throws Exception {
        Company company = new Company("Mi","Japan", (float) 9.8);
        company.getCompany();
        NetBook netBook = new NetBook(company.getName(),company.getCountry(),company.getRating(),12.3,11112.3,12.5,"blue");
        netBook.toString(company.getName(),company.getCountry(),company.getRating(),netBook.getCost(), netBook.getWeight(), netBook.getDiagonal(), netBook.getColor());
    }
}
