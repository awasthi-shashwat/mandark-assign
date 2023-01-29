import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.io.FileWriter;

class ProblemTwo {
	public static void main(String[] args){
		String file = "./employees.csv";
        BufferedReader reader;
        String line;
        List<String[]> data = new ArrayList<>();
        try {
            reader = new BufferedReader(new FileReader(file));
            while((line = reader.readLine()) != null){
                String[] row = line.split(",");
                data.add(row);
            }
        } catch (Exception e){
            e.printStackTrace();
        }

        try {
        	FileWriter manager = new FileWriter("manager.csv");
        	for(String[] row : data){
        		if(row[1].equals("Manager") && row[2].equals("R&D")){
        			manager.append(row[0]);
        			manager.append(",");
        			manager.append(row[1]);
        			manager.append(",");
        			manager.append(row[2]);
        			manager.append("\n");
        		}
        	}
        	manager.flush();
        	manager.close();
        } catch (Exception e){
        	e.printStackTrace();
        }

        try {
        	FileWriter singleName = new FileWriter("single_name_employees.csv");
        	for(int i=1;i<data.size();i++){
        		String[] row = data.get(i);
        		System.out.println(row[0].split(" ").length);
        		if(row[0].split(" ").length == 1){
        			singleName.append(row[0]);
        			singleName.append(",");
        			singleName.append(row[1]);
        			singleName.append(",");
        			singleName.append(row[2]);
        			singleName.append("\n");
        		}
        	}
        	singleName.flush();
        	singleName.close();
        } catch (Exception e) {
        	e.printStackTrace();
        }

	}
}